package com.hbsd.rjxy.miaomiao.ych.subscription.service;


import com.hbsd.rjxy.miaomiao.entity.SubscriptionRecord;
import com.hbsd.rjxy.miaomiao.ych.subscription.dao.SubDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SubService {
    @Autowired
    private SubDao subDao;
    public List<SubscriptionRecord> findall(){
        return subDao.findAll();
    }
    public List<SubscriptionRecord> findAllByUid(int uid){
        for (SubscriptionRecord record:subDao.findAllByUserId(uid)){
            System.out.println("1"+record.toString());
        }
        return subDao.findAllByUserId(uid);
    }
    public List<SubscriptionRecord> findAllByCid(int cid){
        return subDao.findAllByCatId(cid);
    }
    public List<SubscriptionRecord> findOneByUidAndCid(int uid,int cid){
        return subDao.findAllByUserIdAndCatId(uid,cid);
    }
    public List<SubscriptionRecord> follow(int uid, int cid){
        if(findOneByUidAndCid(uid, cid).size()!=0){
            subDao.follow(uid,cid);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return findAllByUid(uid);
        }else {
            Date date=new Date();
            SubscriptionRecord subscription_record=new SubscriptionRecord();
            subscription_record.setCatId(cid);
            subscription_record.setUserId(uid);
            //subscription_record.setSubscription_status(1);//设置状态部分未定（ljt更改）
            Date sqlDate = new java.sql.Date(new Date().getTime());
            subscription_record.setCreateTime((java.sql.Date) sqlDate);//ljt更改
            System.out.println(sqlDate);
            System.out.println(subscription_record.getCreateTime());
            subDao.save(subscription_record);
            return findAllByUid(uid);
        }
    };
    public int unfollow(int uid,int cid){return subDao.unfollow(uid,cid);};
}

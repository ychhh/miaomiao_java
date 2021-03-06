package com.hbsd.rjxy.miaomiao.zlc.video.service;


import com.hbsd.rjxy.miaomiao.entity.MultiInfor;
import com.hbsd.rjxy.miaomiao.zlc.utils.QiniuUtils;
import com.hbsd.rjxy.miaomiao.zlc.video.dao.VideoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.hbsd.rjxy.miaomiao.zlc.constant.VideoConstant.PAGING_STEP;

@Service
public class VideoService {

    @Autowired
    VideoDao videoDao;

    public List<MultiInfor> findAll(){
        return videoDao.findAll();
    }


    /**
     * 点击小鱼干
     * @param
     * @return
     */
    public int addHotByFish(int miid){
        return videoDao.feedFish(miid);
    }

    /**
     * 分页查询
     * @param page  当前页
     *
     *              PAGING_STEP是每次分页查询的数量
     * @return
     */
    public List<MultiInfor> findVideoPaging(int page){
        System.out.println("page"+page);
        return videoDao.findVideoPaging((page-1)*PAGING_STEP,PAGING_STEP);
    }


    /**
     *
     * 获取token
     * @return
     */
    public String getToken(){
        return new QiniuUtils().getUpToken();
    }


    /*
        发布
    
     */
    public int publishMulti(MultiInfor multi_info){
        //return videoDao.publishMulti(multi_info.getType(),multi_info.getCid(),multi_info.getUid(),multi_info.getMpath(),multi_info.getMupload_time(),multi_info.getMcontent(),multi_info.getMformat(),multi_info.getMcover());
        return videoDao.publishMulti(multi_info.getType(),multi_info.getCatId(),multi_info.getUserId(),multi_info.getContentPath(),multi_info.getCreateTime().toString(),multi_info.getContentPath(),multi_info.getMultiInforFormat(),multi_info.getMultiInforCover());
    }


    public List<MultiInfor> getAllByCid(int cid){
        return videoDao.getAllByCatId(cid);
    }


}

package com.hbsd.rjxy.miaomiao.ych.subscription.dao;

import com.hbsd.rjxy.miaomiao.entity.SubscriptionRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SubDao extends JpaRepository<SubscriptionRecord,Integer>{
    @Query( value = "SELECT * FROM subscription_record WHERE user_id=?",nativeQuery = true)
    List<SubscriptionRecord> findAllByUserId(int uid);
    @Query( value = "SELECT * FROM subscription_record WHERE cat_id=?",nativeQuery = true)
    List<SubscriptionRecord> findAllByCatId(int cid);
    @Query( value = "SELECT * FROM subscription_record WHERE user_id=? and cat_id=?",nativeQuery = true)
    List<SubscriptionRecord> findAllByUserIdAndCatId(int uid,int cid);
    @Modifying
    @Transactional(readOnly = false)
    @Query( value = "UPDATE subscription_record set deleted=0 where user_id=? and cat_id=?",nativeQuery = true)
    int unfollow(int uid,int cid);
    @Modifying
    @Transactional(readOnly = false)
    @Query( value = "UPDATE subscription_record set deleted=1 where user_id=? and cat_id=?",nativeQuery = true)
    int follow(int uid,int cid);
}

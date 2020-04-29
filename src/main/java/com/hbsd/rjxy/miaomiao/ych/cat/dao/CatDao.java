package com.hbsd.rjxy.miaomiao.ych.cat.dao;

import com.hbsd.rjxy.miaomiao.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CatDao extends JpaRepository<Cat,Integer>, JpaSpecificationExecutor<Cat> {
    @Query( value = "SELECT * FROM cat WHERE user_id=?",nativeQuery = true)
    List<Cat> findAllByUserId(int uid);
    @Query( value = "SELECT * FROM cat WHERE id=?",nativeQuery = true)
    Cat findAllById(int cid);
}

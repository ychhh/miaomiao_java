package com.hbsd.rjxy.miaomiao.ych.cat.service;

import com.hbsd.rjxy.miaomiao.entity.Cat;
import com.hbsd.rjxy.miaomiao.ych.cat.dao.CatDao;
import com.hbsd.rjxy.miaomiao.zlc.utils.QiniuUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatService {
    @Autowired
    private CatDao catDao;
    public List<Cat> findAll(){
        return catDao.findAll();
    }
    public List<Cat> findAllByUid(int uid){
        return catDao.findAllByUserId(uid);
    }
    public Cat findAllByCid(int cid){ return catDao.findAllById(cid); }
    public Cat saveCat(Cat cat){
        return catDao.save(cat);
    }
    public String getToken(){
        return new QiniuUtils().getUpToken();
    }
}

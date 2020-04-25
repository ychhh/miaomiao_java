package com.hbsd.rjxy.miaomiao.ljt.Login.dao;

import com.hbsd.rjxy.miaomiao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface LoginDao extends JpaRepository<User,Integer> {

    /**
     * 根据手机号查询User
     * @param userPhone
     * @return
     */
    @Query
    User findUserByUserPhone(String userPhone);

    /**
     * 根据uid查询user
     */
    @Query
    User findUserById(Integer uid);

    /**
     * 根据id修改上一次登陆时间
     * @param time
     * @param uid
     */
    @Modifying
    @Query(value = "update user set last_login=:time where id=:uid",nativeQuery = true)
    void updateUserLastLoginById(@Param("time") Date time,@Param("uid")Integer uid);
}

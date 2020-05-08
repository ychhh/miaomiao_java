package com.hbsd.rjxy.miaomiao.zsh.self.test;
import com.hbsd.rjxy.miaomiao.zsh.self.service.SelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/self/test")
public class SelfTest {
    @Autowired
    private SelfService selfService;
    @RequestMapping("/update")
    @ResponseBody
    public void updateUser(Integer uid,String pwd){

        String name="zsh";
        String intro="helllooooooooo";
        String sex="nannannan";
        /*测试根据uid修改姓名*/
        //selfService.updateUserNameById(name,uid);
        /*根据uid修改性别*/
        //selfService.updateUserSexById(sex,uid);
        /*根据uid修改简介*/
//        selfService.updateUserIntroById(intro,uid);
        /*根据id设置密码*/
        selfService.updatePwdById(pwd,uid);
    }





}

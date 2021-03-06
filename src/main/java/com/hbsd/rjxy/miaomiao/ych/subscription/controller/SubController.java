package com.hbsd.rjxy.miaomiao.ych.subscription.controller;

import com.google.gson.Gson;
import com.hbsd.rjxy.miaomiao.entity.Cat;
import com.hbsd.rjxy.miaomiao.entity.SubscriptionRecord;
import com.hbsd.rjxy.miaomiao.ych.cat.service.CatService;
import com.hbsd.rjxy.miaomiao.ych.subscription.service.SubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/sub")
@Controller
public class SubController {
    @Autowired
    private SubService subService;
    @Autowired
    private CatService catService;
    Gson gson = new Gson();
    @RequestMapping("/all")
    @ResponseBody
    public String find(){
        return gson.toJson(subService.findall());
    }
    @RequestMapping("/findbyuid")
    @ResponseBody
    public String getSubByUid(int uid){
        return gson.toJson(subService.findAllByUid(uid));
    }
    @RequestMapping("/findbycid")
    @ResponseBody
    public String getSubByCid(int cid){
        return gson.toJson(subService.findAllByCid(cid));
    }
    @RequestMapping("/findbyuidandcid")
    @ResponseBody
    public String getSubByUidAndCid(int uid,int cid){
        return gson.toJson(subService.findOneByUidAndCid(uid,cid));
    }
    @RequestMapping("/follow")
    @ResponseBody
    public String follow(int uid,int cid){
        return  gson.toJson(subService.follow(uid,cid));
    }
    @RequestMapping("/unfollow")
    @ResponseBody
    public int unfollow(int uid,int cid){
        return subService.unfollow(uid,cid);
    }
    @RequestMapping("/findsubcatbyuid")
    @ResponseBody
    public String getSubCatByUid(int uid){
        List<Cat> cats=new ArrayList<>();
        List<SubscriptionRecord> records=subService.findAllByUid(uid);
        for (SubscriptionRecord record :records){
            System.out.println(record.toString());

            //todo 待验证
            if (record.getDeleted()==1) {
                int cid = record.getCatId();
                System.out.println(cid+"kljaskdlks");
                cats.add(catService.findAllByCid(cid));
            }
        }
        System.out.println(cats);
        return gson.toJson(cats);
    }
}

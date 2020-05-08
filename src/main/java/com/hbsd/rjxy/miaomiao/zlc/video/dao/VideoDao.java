package com.hbsd.rjxy.miaomiao.zlc.video.dao;

import com.hbsd.rjxy.miaomiao.entity.MultiInfor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface VideoDao extends JpaRepository<MultiInfor,Integer> {

    /**
     * 查询所有视频信息
     */
    @Query( value = "SELECT * FROM multi_infor WHERE type=0",nativeQuery = true)
    List<MultiInfor> findAll();

    /**
     * 赠送小鱼干
     * 需要传一个miid
     *
     */
    @Modifying
    @Transactional(readOnly = false)
    @Query( value = "UPDATE multi_infor set multi_infor_hot=multi_infor_hot+1 where id=? ",nativeQuery = true)
    int feedFish(int miid);


    /**
     * 分页查询视频
     *
     * @param start 开始的位置
     * @param step 每页显示的数量
     * @return
     */
    @Query(value = "SELECT * FROM multi_infor where type=0 limit ?,?",nativeQuery = true)
    List<MultiInfor> findVideoPaging(int start,int step);


    /**
     * 添加视频评论个数
     * @param miid
     * @return
     */
    @Modifying
    @Query(value = "UPDATE multi_infor SET multi_infor_comment_count=multi_infor_comment_count+1 WHERE id=?",nativeQuery = true)
    int addVideoCommentAccount(int miid);


    @Modifying
    @Transactional(readOnly = false)
    @Query(value = "INSERT INTO multi_infor(type,cat_id,user_id,content_path,create_time,multi_infor_content,multi_infor_visited,deleted," +
            "multi_infor_comment_count,multi_infor_format,multi_infor_hot,multi_infor_address,multi_infor_cover,multi_infor_recommended,multi_infor_tag)" +
            " VALUES(?,?,?,?,?,?,0,0,0,?,0,1,?,0.1,1)",nativeQuery =true)
  /*  @Query(value = "INSERT INTO multi_info(type,cid,uid,mpath,mupload_time,mcontent,mvisited,mstatus,mcomment_count,mformat,mhot,maddress,mcover,mrecommended,mtag)" +
            " VALUES(?,?,?,?,?,?,0,0,0,?,0,1,?,0.1,1)",nativeQuery =true)*/
    int publishMulti(int type, int cid, int uid, String mpath, String mupload_time,String mcontent,String mformat,String cover);



    @Query(value = "SELECT * from multi_infor where cat_id=? order by create_time desc",nativeQuery = true)
    //@Query(value = "SELECT * from multi_info where cid=? order by mupload_time desc",nativeQuery = true)
    List<MultiInfor> getAllByCatId(int cid);



}

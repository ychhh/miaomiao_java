package com.hbsd.rjxy.miaomiao.zlc.video.dao;

import com.hbsd.rjxy.miaomiao.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CommentDao extends JpaRepository<Comment,Integer> {


    /**
     * 根据视频的miid查询所有评论
     * @param miid
     * @return
     */
    @Query(value = "SELECT * FROM comment WHERE multi_info_id=? AND deleted=0",nativeQuery = true)
    List<Comment> findCommentsByMultiInfoId(int miid);


    /**
     * 根据视频的miid分页查询评论
     *
     */
    @Query(value = "SELECT * FROM comment WHERE multi_info_id=? AND deleted=0 ORDER BY create_time desc , user_id asc limit ?,?",nativeQuery = true)
    List<Comment> findCommentsByMultiInfoIdAndPage(int miid,int start,int step);


    /**
     * 添加评论
     */
    @Modifying
    @Transactional(readOnly = false)
    @Query(value = "INSERT INTO comment(multi_info_id,comment_like,deleted,user_id,comment_content,create_time,head_id,user_name) VALUES(?,?,?,?,?,?,?,?)",nativeQuery = true)
    //@Query(value = "INSERT INTO comment(miid,colike,costatus,uid,cocontent,publish_time,uhead,uname) VALUES(?,?,?,?,?,?,?,?)",nativeQuery = true)
    int addComment(int miid,int colike,int costatus,int uid,String cocontent,String publishTime,String uhead,String uname);


    @Transactional(readOnly = false)
    @Query(value = "SELECT id FROM comment WHERE user_id=? AND create_time=?",nativeQuery = true)
    int findId(int uid,String publishTime);


    /**
     * 点赞评论
     */
    @Modifying
    @Transactional(readOnly = false)
    @Query(value = "UPDATE comment SET comment_like=comment_like+1 WHERE id=?",nativeQuery = true)
    int likeComment(int coid);

    /**
     * 取消点赞评论
     */
    @Modifying
    @Transactional(readOnly = false)
    @Query(value = "UPDATE comment SET comment_like=comment_like-1 WHERE id=?",nativeQuery = true)
    int dislikeComment(int coid);


    /**
     *
     * 删除评论
     */
    @Modifying
    @Transactional(readOnly = false)
    @Query(value = "UPDATE comment SET deleted=1 WHERE id=?",nativeQuery = true)
    int deleteCommentByCoid(int coid);


    /**
     *
     *
     */




}

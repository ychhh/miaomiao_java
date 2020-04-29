package com.hbsd.rjxy.miaomiao.zlc.video.service;


import com.hbsd.rjxy.miaomiao.entity.Comment;
import com.hbsd.rjxy.miaomiao.entity.MultiInfor;
import com.hbsd.rjxy.miaomiao.entity.User;
import com.hbsd.rjxy.miaomiao.zlc.video.dao.CommentDao;
import com.hbsd.rjxy.miaomiao.zlc.video.dao.UserDao;
import com.hbsd.rjxy.miaomiao.zlc.video.dao.VideoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.hbsd.rjxy.miaomiao.zlc.constant.VideoConstant.COMMENT_PAGING_STEP;

@Service
public class CommentService {
    @Autowired
    CommentDao commentDao;
    @Autowired
    VideoDao videoDao;
    @Autowired
    UserDao userDao;

    public List<Comment> findCommentsByMiid(MultiInfor multi_info){
        return commentDao.findCommentsByMultiInfoId(multi_info.getId());//ljt 更改
    }


    /**
     * 根据视频的miid分页查询评论
     * Multi_info 视频对象
     * page 当前页数
     *
     */
    public List<Comment> findCommentsByMiidAndPage(int miid,int page){
        return commentDao.findCommentsByMultiInfoIdAndPage(miid,(page-1)*COMMENT_PAGING_STEP,COMMENT_PAGING_STEP);
    }



    public List<Comment> findCommentsByMiidAndPageForLogin(int miid,int page){
        return commentDao.findCommentsByMultiInfoIdAndPage(miid,(page-1)*COMMENT_PAGING_STEP,COMMENT_PAGING_STEP);
    }


    /**
     * 添加评论，修改视频的评论数量(事务控制)
     * Multi_info 视频对象
     * Comment 评论对象
     *
     *
     */
    @Transactional(rollbackFor = Exception.class)
    public int addComment(Comment comment){
        //增加视频评论数
        videoDao.addVideoCommentAccount(comment.getId());
        //查询uid的upath和uname
        User user = userDao.findUserById(comment.getUserId());
//        //插入评论
        commentDao.addComment(comment.getMultiInfoId()
                ,comment.getCommentLike()
                ,comment.getDeleted()
                ,comment.getUserId()
                ,comment.getCommentContent()
                ,comment.getCreateTime().toString()
                ,user.getHeadId()
                ,user.getUserName());
        //return commentDao.findId(comment.getUserId(),comment.getPublishTime());
        return commentDao.findId(comment.getUserId(),comment.getCreateTime().toString());//ljt 更改后
    }


    /**
     *
     * 删除评论
     * Comment 评论对象
     *
     */
    public int deleteCommentByCoid(Comment comment){
        //return commentDao.deleteCommentByCoid(comment.getCoid());
        return commentDao.deleteCommentByCoid(comment.getId());//更改后
    }


    /**
     * 点赞评论
     * @param coid
     * @return
     */
    public int likeComment(int coid){
        return commentDao.likeComment(coid);
    }


    /**
     * 取消点赞
     * @param coid
     * @return
     */
    public int dislikeComment(int coid){
        return commentDao.dislikeComment(coid);
    }








}

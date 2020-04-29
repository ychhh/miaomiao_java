package com.hbsd.rjxy.miaomiao.entity;

import javax.persistence.*;
import lombok.Data;
import java.util.Date;

/**
 * @Description  
 * @Author  
 * @Date 2020-04-22 
 */

@Data
@Entity
@Table ( name ="comment" )
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private Integer id;

   	@Column(name = "multi_info_id" )
	private Integer multiInfoId;

   	@Column(name = "comment_like" )
	private Integer commentLike;

   	@Column(name = "user_id" )
	private Integer userId;

   	@Column(name = "version" )
	private Integer version;

   	@Column(name = "deleted" )
	private Integer deleted;

   	@Column(name = "create_time" )
	private Date createTime;

   	@Column(name = "update_time" )
	private Date updateTime;

   	@Column(name = "comment_content")
   	private String commentContent;

   	@Column(name="user_head")
	private String userHead;

   	@Column(name="user_name")
	private String userName;

   	public void setCreateTime(String creatTime){
   		this.createTime=createTime;
	}
}

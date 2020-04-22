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
	private int id;

   	@Column(name = "multi_info_id" )
	private int multiInfoId;

   	@Column(name = "comment_like" )
	private int commentLike;

   	@Column(name = "user_id" )
	private int userId;

   	@Column(name = "version" )
	private int version;

   	@Column(name = "deleted" )
	private int deleted;

   	@Column(name = "create_time" )
	private Date createTime;

   	@Column(name = "update_time" )
	private Date updateTime;

}

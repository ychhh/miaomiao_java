package com.hbsd.rjxy.miaomiao.entity;

import javax.persistence.*;
import lombok.Data;
import java.util.Date;

/**
 * @Description  
 * @Author  
 * @Date 2020-04-20 
 */

@Data
@Entity
@Table ( name ="comment" )
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private Long id;

   	@Column(name = "multi_info_id" )
	private Long multiInfoId;

   	@Column(name = "comment_like" )
	private Long commentLike;

   	@Column(name = "user_id" )
	private Long userId;

   	@Column(name = "version" )
	private Long version;

   	@Column(name = "deleted" )
	private Long deleted;

   	@Column(name = "create_time" )
	private Date createTime;

   	@Column(name = "update_time" )
	private Date updateTime;

}

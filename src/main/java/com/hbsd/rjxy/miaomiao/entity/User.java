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
@Table ( name ="user" )
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private Long id;

   	@Column(name = "user_phone" )
	private String userPhone;

   	@Column(name = "user_sex" )
	private String userSex;

   	@Column(name = "user_pwd" )
	private String userPwd;

   	@Column(name = "user_name" )
	private String userName;

   	@Column(name = "user_intro" )
	private String userIntro;

   	@Column(name = "head_id" )
	private Long headId;

   	@Column(name = "is_vip" )
	private Long isVip;

   	@Column(name = "is_admin" )
	private Long isAdmin;

   	@Column(name = "banned_id" )
	private Long bannedId;

   	@Column(name = "cat_count" )
	private Long catCount;

   	@Column(name = "version" )
	private Long version;

   	@Column(name = "deleted" )
	private Long deleted;

   	@Column(name = "last_login" )
	private Date lastLogin;

   	@Column(name = "create_time" )
	private Date createTime;

}

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
	private int headId;

   	@Column(name = "is_vip" )
	private int isVip;

   	@Column(name = "is_admin" )
	private int isAdmin;

   	@Column(name = "banned_id" )
	private int bannedId;

   	@Column(name = "cat_count" )
	private int catCount;

   	@Column(name = "version" )
	private int version;

   	@Column(name = "deleted" )
	private int deleted;

   	@Column(name = "last_login" )
	private Date lastLogin;

   	@Column(name = "create_time" )
	private Date createTime;

}

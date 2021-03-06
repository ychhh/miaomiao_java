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
	private Integer id;

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
	private String headId;//此字段暂时存储头像位置

   	@Column(name = "is_vip" )
	private Integer isVip;

   	@Column(name = "is_admin" )
	private Integer isAdmin;

   	@Column(name = "banned_id" )
	private Integer bannedId;

   	@Column(name = "cat_count" )
	private Integer catCount;

   	@Column(name = "version" )
	private Integer version;

   	@Column(name = "deleted" )
	private Integer deleted;

   	@Column(name = "last_login" )
	private Date lastLogin;

   	@Column(name = "create_time" )
	private Date createTime;

   	@Column(name="qq_openid")
   	private String qqOpenid;

}

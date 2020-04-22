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
@Table ( name ="cat" )
public class Cat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private int id;

   	@Column(name = "user_id" )
	private int userId;

   	@Column(name = "city_id" )
	private int cityId;

   	@Column(name = "cat_name" )
	private String catName;

   	@Column(name = "cat_birthday" )
	private Date catBirthday;

   	@Column(name = "cat_sex" )
	private String catSex;

   	@Column(name = "breed_id" )
	private String breedId;

   	@Column(name = "cat_weight" )
	private Double catWeight;

   	@Column(name = "cat_toy" )
	private String catToy;

   	@Column(name = "cat_head" )
	private int catHead;

   	@Column(name = "cat_hot" )
	private int catHot;

   	@Column(name = "cat_intro" )
	private String catIntro;

   	@Column(name = "cat_source" )
	private String catSource;

   	@Column(name = "cat_food" )
	private String catFood;

   	@Column(name = "is_ste" )
	private int isSte;

   	@Column(name = "version" )
	private int version;

   	@Column(name = "deleted" )
	private int deleted;

   	@Column(name = "create_time" )
	private Date createTime;

   	@Column(name = "update_time" )
	private Date updateTime;

}

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
@Table ( name ="cat" )
public class Cat {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private Long id;

   	@Column(name = "user_id" )
	private Long userId;

   	@Column(name = "city_id" )
	private Long cityId;

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
	private Long catHead;

   	@Column(name = "cat_hot" )
	private Long catHot;

   	@Column(name = "cat_intro" )
	private String catIntro;

   	@Column(name = "cat_source" )
	private String catSource;

   	@Column(name = "cat_food" )
	private String catFood;

   	@Column(name = "is_ste" )
	private Long isSte;

   	@Column(name = "version" )
	private Long version;

   	@Column(name = "deleted" )
	private Long deleted;

   	@Column(name = "create_time" )
	private Date createTime;

   	@Column(name = "update_time" )
	private Date updateTime;

}

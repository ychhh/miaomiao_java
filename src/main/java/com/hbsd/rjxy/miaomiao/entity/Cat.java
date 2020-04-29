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
	private Integer id;

   	@Column(name = "user_id" )
	private Integer userId;

   	@Column(name = "city_id" )
	private Integer cityId;

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
	private String catHead;

   	@Column(name = "cat_hot" )
	private int catHot;

   	@Column(name = "cat_intro" )
	private String catIntro;

   	@Column(name = "cat_source" )
	private String catSource;

   	@Column(name = "cat_food" )
	private String catFood;

   	@Column(name = "is_ste" )
	private Integer isSte;

   	@Column(name = "version" )
	private Integer version;

   	@Column(name = "deleted" )
	private Integer deleted;

   	@Column(name = "create_time" )
	private Date createTime;

   	@Column(name = "update_time" )
	private Date updateTime;

}

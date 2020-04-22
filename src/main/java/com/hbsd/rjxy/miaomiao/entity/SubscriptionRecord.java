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
@Table ( name ="subscription_record" )
public class SubscriptionRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private int id;

   	@Column(name = "cat_id" )
	private int catId;

   	@Column(name = "user_id" )
	private int userId;

   	@Column(name = "deleted" )
	private int deleted;

   	@Column(name = "version" )
	private int version;

   	@Column(name = "create_time" )
	private Date createTime;

}

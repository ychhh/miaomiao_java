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
@Table ( name ="subscription_record" )
public class SubscriptionRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private Long id;

   	@Column(name = "cat_id" )
	private Long catId;

   	@Column(name = "user_id" )
	private Long userId;

   	@Column(name = "deleted" )
	private Long deleted;

   	@Column(name = "version" )
	private Long version;

   	@Column(name = "create_time" )
	private Date createTime;

}

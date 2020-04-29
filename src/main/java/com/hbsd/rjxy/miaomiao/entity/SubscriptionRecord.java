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
	private Integer id;

   	@Column(name = "cat_id" )
	private Integer catId;

   	@Column(name = "user_id" )
	private Integer userId;

   	@Column(name = "deleted" )
	private Integer deleted;//0 表示不关注 1表示关注

   	@Column(name = "version" )
	private Integer version;

   	@Column(name = "create_time" )
	private Date createTime;

}

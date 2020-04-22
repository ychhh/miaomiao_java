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
@Table ( name ="multi_infor" )
public class MultiInfor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private int id;

   	@Column(name = "type" )
	private int type;

   	@Column(name = "cat_id" )
	private int catId;

   	@Column(name = "user_id" )
	private int userId;

   	@Column(name = "content_path" )
	private String contentPath;

   	@Column(name = "multi_infor_content" )
	private String multiInforContent;

   	@Column(name = "multi_infor_visited" )
	private int multiInforVisited;

   	@Column(name = "deleted" )
	private int deleted;

   	@Column(name = "multi_infor_comment_count" )
	private String multiInforCommentCount;

   	@Column(name = "multi_infor_format" )
	private String multiInforFormat;

   	@Column(name = "multi_infor_hot" )
	private int multiInforHot;

   	@Column(name = "multi_infor_address" )
	private String multiInforAddress;

   	@Column(name = "multi_infor_cover" )
	private String multiInforCover;

   	@Column(name = "multi_infor_recommended" )
	private Double multiInforRecommended;

   	@Column(name = "multi_infor_tag" )
	private String multiInforTag;

   	@Column(name = "update_time" )
	private Date updateTime;

   	@Column(name = "create_time" )
	private Date createTime;

}

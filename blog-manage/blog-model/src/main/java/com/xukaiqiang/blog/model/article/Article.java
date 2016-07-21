package com.xukaiqiang.blog.model.article;

import java.util.Date;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import com.xukaiqiang.blog.util.ShortDateSerializer;

import com.xukaiqiang.blog.common.BaseEntity;

/**
 * POJO:Article
 * 
 * @author xukaiqiang
 * @date 2016-7-18
 */
@SuppressWarnings("serial")
public class Article extends BaseEntity {
	
	
	private String	title;		/*标题*/
	private String	content;	/*内容*/	
	private Date	createTime;	/*创建时间*/	
	private Integer	userId;	/*作者*/	
	private Integer	status;	/*状态*/
	private Integer typeId; /*分类*/
	private Integer type;  /*文章类型  1原创  2 转载*/
	
	

	/**
	 * @return the type
	 */
	public Integer getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(Integer type) {
		this.type = type;
	}


	// Constructor
	public Article() {
	}
	

	// getter && setter
	// 在setter方法最后加上"return this;"并把返回参数改为Article可以实现连缀设置属性
	
	public String getTitle() {
		return title;
	}

	public Article setTitle(String title) {
		this.title = title;
		return this;
	}
	
	
	public String getContent() {
		return content;
	}

	public Article setContent(String content) {
		this.content = content;
		return this;
	}
	
	@JsonSerialize(using = ShortDateSerializer.class)
	public Date getCreateTime() {
		return createTime;
	}

	public Article setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}
	
	
	public Integer getUserId() {
		return userId;
	}

	public Article setUserId(Integer userId) {
		this.userId = userId;
		return this;
	}
	
	
	public Integer getStatus() {
		return status;
	}

	public Article setStatus(Integer status) {
		this.status = status;
		return this;
	}


	public Integer getTypeId() {
		return typeId;
	}


	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	
}

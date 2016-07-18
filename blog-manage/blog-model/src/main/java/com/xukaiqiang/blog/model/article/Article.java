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
	
	
	private String	title;		
	private String	content;		
	private Date	createTime;		
	private Integer	userId;		
	private Integer	status;		

	// Constructor
	public Article() {
	}
	
	/**
	 * full Constructor
	 */
	public Article(Integer id, String title, String content, Date createTime, Integer userId, Integer status) {
		setId(id);
		this.title = title;
		this.content = content;
		this.createTime = createTime;
		this.userId = userId;
		this.status = status;
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
	
	@Override
	public String toString() {
		return "Article [" + "id=" + getId() + ", title=" + title + ", content=" + content + ", createTime=" + createTime + ", userId=" + userId + ", status=" + status +  "]";
	}
}

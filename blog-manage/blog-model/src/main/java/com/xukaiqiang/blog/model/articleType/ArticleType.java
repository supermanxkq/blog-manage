package com.xukaiqiang.blog.model.articleType;


import com.xukaiqiang.blog.common.BaseEntity;

/**
 * POJO:ArticleType
 * 
 * @author xukaiqiang
 * @date 2016-7-18
 */
@SuppressWarnings("serial")
public class ArticleType extends BaseEntity {
	
	
	private String	name;		
	private Integer	status;		

	// Constructor
	public ArticleType() {
	}
	
	/**
	 * full Constructor
	 */
	public ArticleType(Integer id, String name, Integer status) {
		setId(id);
		this.name = name;
		this.status = status;
	}

	// getter && setter
	// 在setter方法最后加上"return this;"并把返回参数改为ArticleType可以实现连缀设置属性
	
	public String getName() {
		return name;
	}

	public ArticleType setName(String name) {
		this.name = name;
		return this;
	}
	
	
	public Integer getStatus() {
		return status;
	}

	public ArticleType setStatus(Integer status) {
		this.status = status;
		return this;
	}
	
	@Override
	public String toString() {
		return "ArticleType [" + "id=" + getId() + ", name=" + name + ", status=" + status +  "]";
	}
}

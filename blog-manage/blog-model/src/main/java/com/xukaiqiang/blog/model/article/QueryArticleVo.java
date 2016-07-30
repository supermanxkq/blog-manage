package com.xukaiqiang.blog.model.article;

/**
 * @author Administrator
 *
 */
public class QueryArticleVo {
	private String name;//分类名称
	private Integer count;//分类下的数量
	private String  dateCount;//根据日期进行分类查询返回
	

	/**
	 * @return the dateCount
	 */
	public String getDateCount() {
		return dateCount;
	}

	/**
	 * @param dateCount the dateCount to set
	 */
	public void setDateCount(String dateCount) {
		this.dateCount = dateCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}

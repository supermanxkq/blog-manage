package com.xukaiqiang.blog.artileTags.mapper;

import java.util.Map;

import com.xukaiqiang.blog.common.BaseMapper;
import com.xukaiqiang.blog.model.artileTags.ArtileTags;

/**
 * Service Interface:ArtileTags
 * @author xukaiqiang
 * @date 2016-7-22
 */
public interface ArtileTagsMapper extends BaseMapper<ArtileTags> {

	
	/**
	 * Class Name: ArtileTagsMapper.java
	 * @Description: 批量添加map
	 * @author Administrator
	 * @date 2016年7月23日 上午8:42:31
	 * @modifier
	 * @modify-date 2016年7月23日 上午8:42:31
	 * @version 1.0
	 * @param map
	*/
		
	void batchInsertMap(Map<String, Object> map);
	
	
}
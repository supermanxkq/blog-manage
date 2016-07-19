package com.xukaiqiang.blog.article.mapper;

import java.util.List;

import com.xukaiqiang.blog.common.BaseMapper;
import com.xukaiqiang.blog.model.article.Article;
import com.xukaiqiang.blog.model.article.TypeCountVo;

/**
 * Service Interface:Users
 * @author xukaiqiang
 * @date 2015-3-12
 */
public interface ArticleMapper extends BaseMapper<Article> {

	List<TypeCountVo> queryTypeCount();

}
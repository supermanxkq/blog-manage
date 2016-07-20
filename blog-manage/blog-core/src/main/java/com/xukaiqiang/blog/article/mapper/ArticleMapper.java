package com.xukaiqiang.blog.article.mapper;

import java.util.List;

import com.xukaiqiang.blog.common.BaseMapper;
import com.xukaiqiang.blog.model.article.Article;
import com.xukaiqiang.blog.model.article.TypeCountVo;
import com.xukaiqiang.blog.vo.article.QueryArticleListVo;

/**
 * Service Interface:Users
 * 
 * @author xukaiqiang
 * @date 2015-3-12
 */
public interface ArticleMapper extends BaseMapper<Article> {

	List<TypeCountVo> queryTypeCount();

	List<QueryArticleListVo> queryArticleList(QueryArticleListVo param);

	int pageCountArticle(QueryArticleListVo search);

}
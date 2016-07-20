package com.xukaiqiang.blog.article;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xukaiqiang.blog.api.article.IArticleService;
import com.xukaiqiang.blog.common.PageFinder;
import com.xukaiqiang.blog.model.article.Article;
import com.xukaiqiang.blog.model.article.TypeCountVo;
import com.xukaiqiang.blog.vo.article.QueryArticleListVo;

/**
 * Controller of Article
 * 
 * @author xukaiqiang
 * @date 2016-7-18
 */
@Controller
@RequestMapping("/article")
public class ArticleController {
	@Autowired
	private IArticleService articleServiceImpl;

	@RequestMapping(method = RequestMethod.GET)
	public String list(Model model, Article search) {
		if (search == null) {
			search = new Article();
			// search.setPageSize(20);
		}
		model.addAttribute("list", articleServiceImpl.findArticleByPage(search));
		return "article/list";
	}

	@ResponseBody
	@RequestMapping(value = "/add")
	public String add(Article article) {
		Article article1 = new Article();
		article1.setContent("xukaiqiangcontent");
		article1.setCreateTime(new Date());
		article1.setStatus(1);
		article1.setUserId(1);
		articleServiceImpl.insert(article1);
		return "ok";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Article Article) {
		articleServiceImpl.update(Article);
		return "redirect:/article";
	}

	@ResponseBody
	@RequestMapping(value = "/del/{id}", method = RequestMethod.GET)
	public String del(Model model, @PathVariable Integer id) {
		articleServiceImpl.deleteArticleById(id);
		return "1";
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Article getJson(Model model, @PathVariable Integer id) {
		return articleServiceImpl.findArticleById(id);
	}

	/**
	 * 后台接收Date转换
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	/**
	 * Class Name: ArticleController.java
	 * 
	 * @Description: 查询博客列表
	 * @author Administrator
	 * @date 2016年7月19日 上午12:51:03
	 * @modifier
	 * @modify-date 2016年7月19日 上午12:51:03
	 * @version 1.0
	 * @param model
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/queryArticleList")
	public PageFinder<QueryArticleListVo> queryArticleList(Model model, QueryArticleListVo search) {
		PageFinder<QueryArticleListVo> pageFinder = articleServiceImpl
				.queryArticleList(search);
		return pageFinder;
	}

	/**
	 * Class Name: ArticleController.java
	 * 
	 * @Description: 查询类别下的数量
	 * @author Administrator
	 * @date 2016年7月19日 上午12:51:03
	 * @modifier
	 * @modify-date 2016年7月19日 上午12:51:03
	 * @version 1.0
	 * @param model
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/queryTypeCount")
	public List<TypeCountVo> queryTypeCount() {
		List<TypeCountVo> list = articleServiceImpl.queryTypeCount();
		return list;
	}

	@RequestMapping("/toArticle")
	public String toArticle() {
		return "article/article";
	}

	@RequestMapping("/toIndex")
	public String toIndex() {
		return "index/index";
	}
}

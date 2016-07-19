$(function() {
	var Article = {};

	Article.init = function() {
		var $this = this;
		$this.queryList();
		$this.queryTypeCount();
	}
	//查询列表集合
	Article.queryList = function() {
		var article={};
		$.ajax({
			url : rootPath+ "/article/queryArticleList",
			data : article,
			type : 'post',
			success:function(jsonData){
				$.each(jsonData, function(i, obj) {
					$(".articleList ul").append(
							'<li style="margin-bottom: 30px">'+
						  	'<span class="date"><a href="/blog/articles/147.html">2016年07月16日</a></span>'+
						  	'<span class="title"><a href="/blog/articles/147.html">'+obj.title+'</a></span>'+
						  	'<span class="summary">摘要: 首先把九九乘法表给大大看看，以免有些逗逼没见过；我们可以看到 有9行，9列 这里我们肯定知道要用循环嵌套实现；我们这里给下参考答案：public class Test {	public static void main(String[] args) {		for(int i=1;i<=9;i++){			fo...</span>'+
						  	'<span class="img">'+
		 					  		'<a href="/blog/articles/147.html"><img src="" title="1468660471743072486.jpg" alt="QQ鎴浘20160716171307.jpg"></a>'+
						  	'</span>'+
						  	'<span class="info">发表于'+obj.createTime+' 阅读(111) 评论(2) </span>'+
						  '</li>'+
						  '<hr style="height:5px;border:none;border-top:1px dashed gray;padding-bottom:  10px;" />'	
					);
				})
			}
		});
	}
	//查询分类下的数量
	Article.queryTypeCount=function(){
		$.ajax({
			url : rootPath+ "/article/queryTypeCount",
			data : "",
			type : 'post',
			success:function(jsonData){
				$.each(jsonData, function(i, obj) {
					$(".typeCount ul").append(
							'<li><span><a href="/index.html?typeId=1">'+obj.name+'('+obj.count+')</a></span></li>'
					);
				});
			}
		});
	}
	// 声明
	window.Article = Article;
	$(document).ready(function() {
		Article.init();
	});
})
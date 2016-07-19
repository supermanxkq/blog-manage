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
					$(".articleList").append(
							'<tr class="odd">'+
							'<td class="center  sorting_1">'+
								'<label>'+
									'<input type="checkbox" class="ace">'+
									'<span class="lbl"></span>'+
								'</label>'+
							'</td>'+
							'<td class=" ">'+
							'<a href="#">'+obj.title+'</a>'+
							'</td>'+
							'<td class="hidden-480 ">'+obj.createTime+'</td>'+
							'<td class=" ">'+obj.userId+'</td>'+
							'<td class=" ">'+obj.status+'</td>'+
							'<td class="hidden-480 ">'+obj.typeId+
							'</td>'+
							'<td class=" ">'+
								'<div class="visible-md visible-lg hidden-sm hidden-xs action-buttons">'+
									'<a class="blue" href="#">'+
										'<i class="icon-zoom-in bigger-130"></i>'+
									'</a>'+
									'<a class="green" href="#">'+
										'<i class="icon-pencil bigger-130"></i>'+
									'</a>'+
									'<a class="red" href="#">'+
										'<i class="icon-trash bigger-130"></i>'+
									'</a>'+
								'</div>'+
							'</td>'+
						'</tr>'
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
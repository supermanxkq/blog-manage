$(function() {
	Date.prototype.Format = function(fmt) { // author: meizz
		  var o = {   
		    "M+" : this.getMonth()+1,                 // 月份
		    "d+" : this.getDate(),                    // 日
		    "h+" : this.getHours(),                   // 小时
		    "m+" : this.getMinutes(),                 // 分
		    "s+" : this.getSeconds(),                 // 秒
		    "q+" : Math.floor((this.getMonth()+3)/3), // 季度
		    "S"  : this.getMilliseconds()             // 毫秒
		  };   
		  if(/(y+)/.test(fmt))   
		    fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));   
		  for(var k in o)   
		    if(new RegExp("("+ k +")").test(fmt))   
		  fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));   
		  return fmt;   
		}
	
	var Article = {};
	Article.init = function() {
		var $this = this;
		$this.queryList();
		$this.event();
		
	}
	//查询列表集合
	Article.queryList = function(page) {
		var article={};
		article.page = page ? page : 1;
		$.ajax({
			url : rootPath+ "/article/queryArticleList",
			data : article,
			type : 'post',
			success:function(jsonData){
				// 清空table中的数据
				$(".articleList").find("tr").remove();
				 if (jsonData.data.length == 0) {
                     $(".articleList").append( '<tr><td colspan="9">没有查找到数据。</td></tr>');
                 }
				$.each(jsonData.data, function(i, obj) {
					$(".articleList").append(
							'<tr class="odd">'+
							'<td class="center  sorting_1">'+
								'<label>'+
									'<input type="checkbox" class="ace">'+
									'<span class="lbl"></span>'+
								'</label>'+
							'</td>'+
							'<td class=" ">'+
							'<a href="#">'+obj.id+'~'+obj.title+'</a>'+
							'</td>'+
							'<td class="hidden-480 ">'+new Date(obj.createTime).Format("yyyy-MM-dd hh:mm:ss")+'</td>'+
							'<td class=" ">'+obj.userName+'</td>'+
							'<td class=" ">'+(obj.status==1?'发表':'未发表')+'</td>'+
							'<td class="hidden-480 ">'+obj.typeName+
							'</td>'+
							'<td class=" ">'+
								'<div class="visible-md visible-lg hidden-sm hidden-xs action-buttons">'+
									'<a class="blue" href="#">'+
										'<i class="icon-zoom-in bigger-130"></i>'+
									'</a>'+
									'<a class="green" href="#">'+
										'<i class="icon-pencil bigger-130"></i>'+
									'</a>'+
									'<a class="red delete" href="javascript:;" onclick="deleteArticle('+obj.id+',this)">'+
										'<i class="icon-trash bigger-130"></i>'+
									'</a>'+
								'</div>'+
							'</td>'+
						'</tr>'
					);
				});
				   if (jsonData.rowCount >jsonData.pageSize) {
                       $(".pagination").pagination(jsonData.rowCount,
                           {
                               next_text: "下一页",
                               prev_text: "上一页",
                               current_page: jsonData.pageNo - 1,
                               link_to: "javascript:void(0)",
                               num_display_entries: 8,
                               items_per_page: jsonData.pageSize,
                               num_edge_entries: 1,
                               callback: function (page, jq) {
                                   var pageNo = page + 1;
                                   Article.queryList(pageNo);
                               }
                           });
                   } else {
                       $(".pagination").html('');
                   }
				   if (this.page <= 1) {
						return 1;
					}
			}
		});
	}
	//事件
	Article.event=function(){
		//显示提示信息
		$('#gritter-center').on(ace.click_event, function(){
			$.gritter.add({
				title: 'This is a centered notification',
				text: 'Just add a "gritter-center" class_name to your $.gritter.add or globally to $.gritter.options.class_name',
				class_name: ''
			});
			return false;
		});
		//写文章
		$('.writeArticle').on('click', function(){
			window.location.href=rootPath+"/article/toAdd";
		});
		
		
	}
	// 声明
	window.Article = Article;
	$(document).ready(function() {
		Article.init();
	});
})



//删除文章
function deleteArticle(id, obj) {
			var url = rootPath + "/article/del/" + id;
			$.ajax({
				url : url,
				data : "",
				type : "get",
				 beforeSend:function(XMLHttpRequest){
			          },
				success : function() {
					$(obj).parent().parent().parent().remove();
				},
				 error : function(){
		 		  },
				  complete:function(XMLHttpRequest,textStatus){
			      }
			});
}

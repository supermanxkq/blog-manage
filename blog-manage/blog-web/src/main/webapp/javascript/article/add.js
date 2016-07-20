$(function(){
	var ArticleAdd={};
	ArticleAdd.init=function(){
		var $this = this;
		$this.queryAll();
		$this.event();
	}
	//查询所有分类
	ArticleAdd.queryAll=function(){
		$.ajax({
			url:rootPath+"/articleType/queryAll",
			data:"",
			type:'post',
			success:function(jsonData){
				$.each(jsonData,function(i,obj){
					$(".articleType").append('<div class="radio">'+
							'<label><input name="form-field-radio" type="radio" class="ace" value="'+obj.id+'">'+
							'<span class="lbl"> '+obj.name+'</span>'+
						'</label>'+
					'</div>');
				});
			}
			
		});
	}
	//事件
	ArticleAdd.event=function(){
		//写文章
		$('.cancel').on('click', function(){
			window.location.href=rootPath+"/article/toArticle";
		});
		
		$('.publish').on('click',function(){
			if (!UE.getEditor('editor').hasContents()) {
				alert('请先填写内容!');
			} else {
				$(".contentHidden").val(UE.getEditor('editor').getContent());
			}
			
			var article={};
			article.title=$(".title").val();
			article.typeId=$('.articleType input[name="form-field-radio"]:checked ').val();
			article.content=$(".contentHidden").val();
			article.status=0;
			article.userId=1;
//			article.summary=;
			$.ajax({
				url:rootPath+"/article/add",
				data:article,
				type:'post',
				success:function(jsonData){
					window.location.href=rootPath+"/article/toArticle";
				}
			});
		});
	}
	// 声明
	window.ArticleAdd = ArticleAdd;
	$(document).ready(function() {
		ArticleAdd.init();
	});
})
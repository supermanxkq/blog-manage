$(function() {
	
	var ArticleType = {};
	ArticleType.init = function() {
		var $this = this;
		$this.queryList();
		$this.event();
		
	}
	//查询列表集合
	ArticleType.queryList = function() {
		$.ajax({
			async:false,
			url : rootPath+ "/articleType/queryAll",
			data : "",
			type : 'post',
			success:function(jsonData){
				$(".typeList").find(".articleType").remove();
				var  colorArray=['item-red','item-orange','item-green','item-default','item-blue','item-pink','item-grey'];
				$.each(jsonData,function(i,obj){
					$(".typeList").append(
							'<li class="'+colorArray[parseInt(Math.random()*7)]+' clearfix  articleType" data-id="'+obj.id+'" style="position: relative; opacity: 1; z-index: auto;">'+
							'<label class="inline">'+
								'<input type="checkbox" class="ace">'+
								'<span class="lbl">'+obj.name+'</span>'+
							'</label>'+
							'<div class="pull-right action-buttons">'+
								'<a href="#" class="blue">'+
									'<i class="icon-pencil bigger-130"></i>'+
								'</a>'+
								'<span class="vbar"></span>'+
								'<a href="javascript:;" onclick="ArticleType.del('+obj.id+')" class="red">'+
									'<i class="icon-trash bigger-130"></i>'+
								'</a>'+
								'<span class="vbar"></span>'+
								'<a href="#" class="green">'+
									'<i class="icon-flag bigger-130"></i>'+
								'</a>'+
							'</div>'+
						'</li>'
					);
				});
			}
		});
	}
	
	//删除
	ArticleType.del=function(id){
		$.ajax({
			async:false,
			url:rootPath+"/articleType/del/"+id,
			data:'',
			type:'get',
			success:function(jsonData){
				//重新查询所有的分类
				ArticleType.queryList();
				//更新一下列表索引
				ArticleType.updateIndex();
			}
		});
	}
	//更新列表的索引
	ArticleType.updateIndex=function(){
		var sortMap = [];
		$(".typeList").find(".articleType").each(function(i){
			var oneItem={};
			oneItem.id=$(this).data("id");
			oneItem.sequence=$(this).index()+1;
			sortMap.push(oneItem);
		});
		 $.ajax({
	 		  type: "post", 
	 		  url : rootPath+"/articleType/orderList", 
	 		  data: "list="+JSON.stringify(sortMap),
			  beforeSend:function(XMLHttpRequest){
	          },
	 		  success: function(data){
			  },
	 		  error : function(){
	 		  },
	 		  complete:function(XMLHttpRequest,textStatus){
		      }
	 	 });
	}
	//事件
	ArticleType.event=function(){
		//添加类别
		$('.addType').on('click', function(){
			var url=rootPath+"/articleType/add";
			var data={};
			data.name=$(".typeName").val();
			data.status=1;
			data.sequence=$(".typeList").find(".articleType").length+1;
			$.ajax({
				url:url,
				data:data,
				type:'post',
				success:function(jsonData){
					ArticleType.queryList();
				}
			});
		});
		
		$('#tasks').sortable({
			opacity:0.8,
			revert:true,
			forceHelperSize:true,
			placeholder: 'draggable-placeholder',
			forcePlaceholderSize:true,
			tolerance:'pointer',
			stop: function( event, ui ) {//just for Chrome!!!! so that dropdowns on items don't appear below other items after being moved
				$(ui.item).css('z-index', 'auto');
				ArticleType.updateIndex();
			},
		delay: 100,
			}
		).disableSelection();
	}
	// 声明
	window.ArticleType = ArticleType;
	$(document).ready(function() {
		ArticleType.init();
	});
})

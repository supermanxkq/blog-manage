<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String rootPath = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
		var rootPath='<%=rootPath%>';
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Java开源博客系统-Powered by java1234</title>

<link rel="stylesheet" href="<%=rootPath %>/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="<%=rootPath %>/bootstrap/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="<%=rootPath %>/stylesheets/blog.css">
<link href="http://blog.java1234.com/favicon.ico" rel="SHORTCUT ICON">
<script src="<%=rootPath %>/javascript/jquery/jquery.min-1.11.3.js"></script>
<script src="<%=rootPath %>/bootstrap/js/bootstrap.min.js"></script>
<style type="text/css">
	  body {
        padding-top: 10px;
        padding-bottom: 40px;
      }
</style>
</head>
<body>
<div class="container">
	
<div class="row">
	<div class="col-md-4">
		<img alt="java1234开源博客系统" src="/static/images/logo.png">
	</div>
	<div class="col-md-8">
		<iframe style="float: right;" width="420" scrolling="no" height="60" frameborder="0" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=12&icon=1&num=5"></iframe>
	</div>
</div>
	
	
<script type="text/javascript">
	function checkData(){
		var q=document.getElementById("q").value.trim();
		if(q==null || q==""){
			alert("请输入您要查询的关键字！");
			return false;
		}else{
			return true;
		}
	}
</script>
<div class="row">
	<div class="col-md-12" style="padding-top: 10px">
		<nav class="navbar navbar-default">
		  <div class="container-fluid">
		    <!-- Brand and toggle get grouped for better mobile display -->
		    <div class="navbar-header">
		      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
		        <span class="sr-only">Toggle navigation</span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		      </button>
		      <a class="navbar-brand" href="/index.html"><font color="black"><strong>首页</strong></font></a>
		    </div>

		    <!-- Collect the nav links, forms, and other content for toggling -->
		    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" >
		      <ul class="nav navbar-nav">
		        <!-- <li><a href="#"><font color="black"><strong>Java1234官网</strong></font></a></li> -->
		        <!-- <li><a href="#"><font color="black"><strong>Java学习路线图</strong></font></a></li> -->
		        <!-- <li><a href="#"><font color="red"><strong>Java1234 VIP项目</strong></font></a></li> -->
		        <li><a href="/blogger/aboutMe.html"><font color="black"><strong>关于博主</strong></font></a></li>
		        <li><a href="/download.html"><font color="black"><strong>本站源码下载</strong></font></a></li>
		      </ul>
		      <form action="/blog/q.html" class="navbar-form navbar-right" role="search" method="post" onsubmit="return checkData()">
		        <div class="form-group" >
		          <input type="text" id="q" name="q" value="" class="form-control" placeholder="请输入要查询的关键字...">
		        </div>
		        <button type="submit" class="btn btn-default">搜索</button>
		      </form>
		    </div><!-- /.navbar-collapse -->
		  </div><!-- /.container-fluid -->
		</nav>
	</div>
</div>
	
	<div class="row">
		<div class="col-md-9">
<div class="data_list">
		<div class="data_list_title">
		<img src="/static/images/list_icon.png"/>
		最新博客</div>
		<div class="datas">
			<ul>
			  
			  	  <li style="margin-bottom: 30px">
				  	<span class="date"><a href="/blog/articles/147.html">2016年07月16日</a></span>
				  	<span class="title"><a href="/blog/articles/147.html">第二章作业-java实现九九乘法表</a></span>
				  	<span class="summary">摘要: 首先把九九乘法表给大大看看，以免有些逗逼没见过；我们可以看到 有9行，9列 这里我们肯定知道要用循环嵌套实现；我们这里给下参考答案：public class Test {	public static void main(String[] args) {		for(int i=1;i<=9;i++){			fo...</span>
				  	<span class="img">
				  		
					  		<a href="/blog/articles/147.html"><img src="/static/userImages/20160716/1468660471743072486.jpg" title="1468660471743072486.jpg" alt="QQ鎴浘20160716171307.jpg"></a>
					  		&nbsp;&nbsp;
				  		
				  	</span>
				  	<span class="info">发表于 2016-07-16 17:16 阅读(111) 评论(2) </span>
				  </li>
				  <hr style="height:5px;border:none;border-top:1px dashed gray;padding-bottom:  10px;" />
			  
			  	  <li style="margin-bottom: 30px">
				  	<span class="date"><a href="/blog/articles/146.html">2016年07月16日</a></span>
				  	<span class="title"><a href="/blog/articles/146.html">Java实例-求水仙花数</a></span>
				  	<span class="summary">摘要: 求水仙花数打印出所有的”水仙花数“，所谓”水仙花数“是指一个三位数，其各位数字立方和等于该本身。比如 153   1的三次方+5的三次方+3的三次方=1+125+27=153 所以153就是水仙花数；我们来分析下 求解三位数水仙花数，范围是100到999我们最主要的问题是要把三位数的百位，十位，个位的数字求到...</span>
				  	<span class="img">
				  		
				  	</span>
				  	<span class="info">发表于 2016-07-16 17:04 阅读(57) 评论(0) </span>
				  </li>
				  <hr style="height:5px;border:none;border-top:1px dashed gray;padding-bottom:  10px;" />
			  
			  	  <li style="margin-bottom: 30px">
				  	<span class="date"><a href="/blog/articles/145.html">2016年07月16日</a></span>
				  	<span class="title"><a href="/blog/articles/145.html">Java for循环语句</a></span>
				  	<span class="summary">摘要: 前面我们讲了while和do...while循环语句。接下来还有一个for循环语句；for(int k=1;k<=10;k++){	System.out.print(k+" ");}for循环有点类似while循环语句；int k=1;定义一个变量；k<=10是条件语句 ，满足条件就执行循环体，不满足就结束循...</span>
				  	<span class="img">
				  		
				  	</span>
				  	<span class="info">发表于 2016-07-16 15:47 阅读(38) 评论(0) </span>
				  </li>
				  <hr style="height:5px;border:none;border-top:1px dashed gray;padding-bottom:  10px;" />
			  
			  	  <li style="margin-bottom: 30px">
				  	<span class="date"><a href="/blog/articles/144.html">2016年07月16日</a></span>
				  	<span class="title"><a href="/blog/articles/144.html">Java while 和 do while循环语句</a></span>
				  	<span class="summary">摘要: 在java中 我们可以用 while或者do...while循环语句来实现，后面我们还会讲到for循环语句；首先是while循环语句；我们来用while来实现下在控制台输出1到10；int i=1;while(i<=10){	System.out.print(i+" ");	i++;}这里我们先定义i变量，w...</span>
				  	<span class="img">
				  		
				  	</span>
				  	<span class="info">发表于 2016-07-16 15:31 阅读(33) 评论(1) </span>
				  </li>
				  <hr style="height:5px;border:none;border-top:1px dashed gray;padding-bottom:  10px;" />
			  
			  	  <li style="margin-bottom: 30px">
				  	<span class="date"><a href="/blog/articles/143.html">2016年07月01日</a></span>
				  	<span class="title"><a href="/blog/articles/143.html">百度云搜索升级 查询速度提高5倍</a></span>
				  	<span class="summary">摘要: http://pan.java1234.com/  上线以来，一直备受粉丝喜爱，访问量居高不下，日IP 3万++；高并发 大流量 带来了一些问题，经常查询搜索不到结果，一直在那边转。今天花个20分钟 优化了下 提速了5倍，应该足够目前的流畅搜索服务了。当然提升50倍也行 无非就是投入钱 性能继续调优。当然有不...</span>
				  	<span class="img">
				  		
					  		<a href="/blog/articles/143.html"><img src="/static/userImages/20160701/1467356594058078647.jpg" title="1467356594058078647.jpg" alt="QQ鎴浘20160701150322.jpg"></a>
					  		&nbsp;&nbsp;
				  		
				  	</span>
				  	<span class="info">发表于 2016-07-01 15:08 阅读(723) 评论(36) </span>
				  </li>
				  <hr style="height:5px;border:none;border-top:1px dashed gray;padding-bottom:  10px;" />
			  
			  	  <li style="margin-bottom: 30px">
				  	<span class="date"><a href="/blog/articles/142.html">2016年06月30日</a></span>
				  	<span class="title"><a href="/blog/articles/142.html">Activiti历史活动查询</a></span>
				  	<span class="summary">摘要: 在流程系统开发中，我们有这样一种需求，当流程实例完成后，我们要查下流程活动具体的执行情况，比如这个流程实例什么时候开始的，什么时候结束的，以及中间具体的执行步骤，这时候，我们需要查询历史流程活动执行表，act_hi_actinst比如上面这个流程；Activiti提供了丰富的接口让我们查询历史活动，上代码：/...</span>
				  	<span class="img">
				  		
					  		<a href="/blog/articles/142.html"><img src="/static/userImages/20160630/1467253979761097286.jpg" title="1467253979761097286.jpg" alt="QQ鎴浘20160630103307.jpg"></a>
					  		&nbsp;&nbsp;
				  		
				  	</span>
				  	<span class="info">发表于 2016-06-30 10:36 阅读(274) 评论(4) </span>
				  </li>
				  <hr style="height:5px;border:none;border-top:1px dashed gray;padding-bottom:  10px;" />
			  
			  	  <li style="margin-bottom: 30px">
				  	<span class="date"><a href="/blog/articles/141.html">2016年06月24日</a></span>
				  	<span class="title"><a href="/blog/articles/141.html">第二章作业-Java选择语句输出月份</a></span>
				  	<span class="summary">摘要: 用if...else 语句和switch语句分别实现如下功能 在控制台输入一个月数字，如11 ，程序对应的输出信息，是“现在是十一月份”参考答案：用if实现：import java.util.Scanner;public class Test {	public static void main(String[...</span>
				  	<span class="img">
				  		
				  	</span>
				  	<span class="info">发表于 2016-06-24 16:46 阅读(402) 评论(6) </span>
				  </li>
				  <hr style="height:5px;border:none;border-top:1px dashed gray;padding-bottom:  10px;" />
			  
			  	  <li style="margin-bottom: 30px">
				  	<span class="date"><a href="/blog/articles/140.html">2016年06月24日</a></span>
				  	<span class="title"><a href="/blog/articles/140.html">Java选择语句</a></span>
				  	<span class="summary">摘要: 在Java中 选中语句可以用if else 和switch来实现；首先来说下if elseif else可以直接用 条件满足执行里面的代码；或者多条件 可以用if else... else if ... else；我们直接上代码：package com.java1234.chap02;public class...</span>
				  	<span class="img">
				  		
				  	</span>
				  	<span class="info">发表于 2016-06-24 16:37 阅读(192) 评论(0) </span>
				  </li>
				  <hr style="height:5px;border:none;border-top:1px dashed gray;padding-bottom:  10px;" />
			  
			  	  <li style="margin-bottom: 30px">
				  	<span class="date"><a href="/blog/articles/139.html">2016年06月18日</a></span>
				  	<span class="title"><a href="/blog/articles/139.html">Tomcat多域名配置</a></span>
				  	<span class="summary">摘要: 在前面博客的基础上：http://blog.java1234.com/blog/articles/59.html 我们来讲解下如何在Tomcat服务器上进行多域名配置；也就是一个Tomcat跑多网站，这里用真实案例举例，比如我这个云主机需要运行两个网站；pan.java1234.com 和 blog.java...</span>
				  	<span class="img">
				  		
					  		<a href="/blog/articles/139.html"><img src="/static/userImages/20160618/1466217432889087570.jpg" title="1466217432889087570.jpg" alt="QQ鎴浘20160618103440.jpg" width="823" height="489" style="width: 823px; height: 489px;"></a>
					  		&nbsp;&nbsp;
				  		
				  	</span>
				  	<span class="info">发表于 2016-06-18 10:39 阅读(645) 评论(9) </span>
				  </li>
				  <hr style="height:5px;border:none;border-top:1px dashed gray;padding-bottom:  10px;" />
			  
			  	  <li style="margin-bottom: 30px">
				  	<span class="date"><a href="/blog/articles/138.html">2016年06月16日</a></span>
				  	<span class="title"><a href="/blog/articles/138.html">Java三目运算符</a></span>
				  	<span class="summary">摘要: java三目运算符格式：  (表达式)?表达式为true返回值:表达式为false返回值实例代码：package com.java1234.chap02;public class Demo11 {	public static void main(String[] args) {		// 三目运算符		Stri...</span>
				  	<span class="img">
				  		
				  	</span>
				  	<span class="info">发表于 2016-06-16 15:49 阅读(319) 评论(1) </span>
				  </li>
				  <hr style="height:5px;border:none;border-top:1px dashed gray;padding-bottom:  10px;" />
			  
			</ul>
		</div>
   </div>

<div>
	<nav>
	  <ul class="pagination pagination-sm">
	    <li><a href='/index.html?page=1&'>首页</a></li><li class='disabled'><a href='#'>上一页</a></li><li class='active'><a href='/index.html?page=1&'>1</a></li><li><a href='/index.html?page=2&'>2</a></li><li><a href='/index.html?page=3&'>3</a></li><li><a href='/index.html?page=2&'>下一页</a></li><li><a href='/index.html?page=11&'>尾页</a></li>
	  </ul>
	</nav>
 </div>
		</div>
		<div class="col-md-3">
			<div class="data_list">
				<div class="data_list_title">
					<img src="/static/images/user_icon.png"/>
					博主信息
				</div>
				<div class="user_image">
					<img src="/static/userImages/20160202095456.jpg"/>
				</div>
				<div class="nickName">Java1234_小锋</div>
				<div class="userSign">(知识改变命运，技术改变世界)</div>
			</div>
			
			<div class="data_list">
				<div class="data_list_title">
					<img src="/static/images/byType_icon.png"/>
					按日志类别
				</div>
				<div class="datas">
					<ul>
						
							<li><span><a href="/index.html?typeId=1">Java核心基础(37)</a></span></li>
						
							<li><span><a href="/index.html?typeId=2">Mysql(1)</a></span></li>
						
							<li><span><a href="/index.html?typeId=3">Tomcat(5)</a></span></li>
						
							<li><span><a href="/index.html?typeId=10">jsoup(1)</a></span></li>
						
							<li><span><a href="/index.html?typeId=7">shiro(1)</a></span></li>
						
							<li><span><a href="/index.html?typeId=11">hibernate(1)</a></span></li>
						
							<li><span><a href="/index.html?typeId=9">webservice(10)</a></span></li>
						
							<li><span><a href="/index.html?typeId=12">maven(1)</a></span></li>
						
							<li><span><a href="/index.html?typeId=4">IT之路(12)</a></span></li>
						
							<li><span><a href="/index.html?typeId=13">activiti(19)</a></span></li>
						
							<li><span><a href="/index.html?typeId=5">随心生活(9)</a></span></li>
						
							<li><span><a href="/index.html?typeId=14">java爬虫技术(11)</a></span></li>
						
					</ul>
				</div>
			</div>
			
			<div class="data_list">
				<div class="data_list_title">
					<img src="/static/images/byDate_icon.png"/>
					按日志日期
				</div>
				<div class="datas">
					<ul>
						
							<li><span><a href="/index.html?releaseDateStr=2016年07月">2016年07月(5)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2016年06月">2016年06月(36)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2016年05月">2016年05月(10)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2016年04月">2016年04月(19)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2016年03月">2016年03月(14)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2016年02月">2016年02月(23)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2016年01月">2016年01月(1)</a></span></li>
						
					</ul>
				</div>
			</div>
			
			<div class="data_list">
				<div class="data_list_title">
					<img src="/static/images/link_icon.png"/>
					友情链接
				</div>
				<div class="datas">
					<ul>
							<li><span><a href="http://www.java1234.com/" target="_blank">Java知识分享网</a></span></li>
							<li><span><a href="http://pan.java1234.com/" target="_blank">百度云搜索引擎</a></span></li>
							<li><span><a href="http://www.easyicon.net/" target="_blank">小图标下载</a></span></li>
							<li><span><a href="http://tieba.baidu.com/f?kw=java" target="_blank">Java贴吧</a></span></li>
							<li><span><a href="http://www.uugai.com/" target="_blank">免费logo在线制作</a></span></li>
					</ul>
				</div>
			</div>
			
		</div>
		
		
	</div>
	
	
<div class="row">
	<div class="col-md-12" >
		<div align="center" style="padding-top: 120px" >
			<span style="float: left;">Powered by <a  href="http://blog.java1234.com" target="_blank">Java1234</a> V3.0</span>
			  Copyright © 2012-2016 Java知识分享网 版权所有
		</div>
	</div>
</div>
</div>
</body>
</html>
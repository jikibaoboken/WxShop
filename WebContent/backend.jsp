<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
	<title>商城首页</title>

	<!-- Bootstrap -->
	<link href="../../bootstrap/css/bootstrap.css" rel="stylesheet">

	<!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
	<!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
	<!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
	<script src="../../bootstrap/js/jquery-1.11.3.min.js"></script>
	<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
	<script src="../../bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<!--
    	作者：offline
    	时间：2018-07-29
    	描述：
   
	<h1>你好，世界！</h1>
	<button type="button" class="btn btn-default" aria-label="Left Align">
  		<span class="glyphicon glyphicon-align-left" aria-hidden="true"></span>
	</button>

	<button type="button" class="btn btn-default btn-lg">
  		<span class="glyphicon glyphicon-star" aria-hidden="true"></span> Star
	</button> -->
	<!--
          	作者：Maugham
          	时间：2018-07-26
          	描述：logo部分
          -->
	<div class="container">
		<div class="row">
			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-4" style="padding-left:30px;">
				<img src="../img/logo2.png" />
			</div>
			<div class="col-lg-5 col-md-5 col-sm-6 hidden-xs">
				<img src="../img/header.png" />
			</div>
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-3" style="padding-top: 15px;">
				<a href="#">登陆</a>
				<a href="#">注册</a>
				<a href="#">购物车</a>
			</div>
		</div>
	</div>
	<!--
    	作者：offline
    	时间：2018-07-26
    	描述：导航条
    -->
	<div class="container" style="margin-top:10px;">
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
				        <span class="sr-only">Toggle navigation</span>
				        <span class="icon-bar"></span>
				        <span class="icon-bar"></span>
				        <span class="icon-bar"></span>
				      </button>
					<a class="navbar-brand" href="#">首页</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active">
							<a href="#">手机数码 <span class="sr-only">(current)</span></a>
						</li>
						<li>
							<a href="#">家用电器</a>
						</li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">所有分类 <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li>
									<a href="#">手机数码</a>
								</li>
								<li>
									<a href="#">家用电器</a>
								</li>
								<li>
									<a href="#">鞋靴箱包</a>
								</li>
								<li role="separator" class="divider"></li>
								<li>
									<a href="#">孕婴保健</a>
								</li>
								<li role="separator" class="divider"></li>
								<li>
									<a href="#">电脑办公</a>
								</li>
							</ul>
						</li>
					</ul>
					<form class="navbar-form navbar-right">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Search">
						</div>
						<button type="submit" class="btn btn-default">Submit</button>
					</form>
					<!--<ul class="nav navbar-nav navbar-right">
						<li>
							<a href="#">Link</a>
						</li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li>
									<a href="#">Action</a>
								</li>
								<li>
									<a href="#">Another action</a>
								</li>
								<li>
									<a href="#">Something else here</a>
								</li>
								<li role="separator" class="divider"></li>
								<li>
									<a href="#">Separated link</a>
								</li>
							</ul>
						</li>
					</ul>-->
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>
	</div>
	<!--
    	作者：offline
    	时间：2018-07-29
    	描述：轮播图
    -->
    <div class="container">
    	<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
			<li data-target="#carousel-example-generic" data-slide-to="1"></li>
			<li data-target="#carousel-example-generic" data-slide-to="2"></li>
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img src="../img/1.jpg" alt="...">
				<div class="carousel-caption">
				</div>
			</div>
			<div class="item">
				<img src="../img/2.jpg" alt="...">
				<div class="carousel-caption">
				</div>
			</div>
			<div class="item">
				<img src="../img/3.jpg" alt="...">
				<div class="carousel-caption">
				</div>
			</div>
			
		</div>

		<!-- Controls -->
		<a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
			<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
			<span class="sr-only">Previous</span>
		</a>
		<a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
			<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>
    </div>
	<!--热门商品-->
	<div class="container" style="margin-top:10px;">
		<!--文字内容-->
		<div class="row" style="padding-left: 20px;">
			<span id="" style="font-size: 30px;">
				&nbsp;热门商品&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="../../img/title2.jpg"/>
			</span>
		</div>
		<!--图片内容-->
		<div class="row">
			<div class="col-md-2 col-sm-2 hidden-xs hidden-sm" style="height:400px ;">
				<img src="../img/big01.jpg" height="100%"/>
			</div>
			<div class="col-md-10 col-sm-10" style="padding-left:10px;">
				<div class="row">
					<div class="col-md-6 hidden-xs hidden-sm" style="height: 200px;width:490px;">
						<a href="#"><img src="../img/middle01.jpg" height="100%" width="100%"/></a>
					</div>
					<div class="col-md-2 col-sm-4" align="center">
						<a href="#"><img src="../img/small03.jpg"/></a>
						<p><a href="#"><font color="gray">电炖锅</font></a></p>
						<p><font color="red">¥399</font></p>
					</div>
					<div class="col-md-2 col-sm-4" align="center">
						<a href="#"><img src="../img/small03.jpg"/></a>
						<p><a href="#"><font color="gray">电炖锅</font></a></p>
						<p><font color="red">¥399</font></p>
					</div>
					<div class="col-md-2 col-sm-4" align="center">
						<a href="#"><img src="../img/small03.jpg"/></a>
						<p><a href="#"><font color="gray">电炖锅</font></a></p>
						<p><font color="red">¥399</font></p>
					</div>
				</div>
				<div class="row">
					<div class="col-md-2 col-sm-4" align="center">
						<a href="#"><img src="../img/small03.jpg"/></a>
						<p><a href="#"><font color="gray">电炖锅</font></a></p>
						<p><font color="red">¥399</font></p>
					</div>
					<div class="col-md-2 col-sm-4" align="center">
						<a href="#"><img src="../img/small03.jpg"/></a>
						<p><a href="#"><font color="gray">电炖锅</font></a></p>
						<p><font color="red">¥399</font></p>
					</div>
					<div class="col-md-2 col-sm-4" align="center">
						<a href="#"><img src="../img/small03.jpg"/></a>
						<p><a href="#"><font color="gray">电炖锅</font></a></p>
						<p><font color="red">¥399</font></p>
					</div>
					<div class="col-md-2 col-sm-4" align="center">
						<a href="#"><img src="../../img/small03.jpg"/></a>
						<p><a href="#"><font color="gray">电炖锅</font></a></p>
						<p><font color="red">¥399</font></p>
					</div>
					<div class="col-md-2 col-sm-4" align="center">
						<a href="#"><img src="../img/small03.jpg"/></a>
						<p><a href="#"><font color="gray">电炖锅</font></a></p>
						<p><font color="red">¥399</font></p>
					</div>
					<div class="col-md-2 col-sm-4" align="center">
						<a href="#"><img src="../img/small03.jpg"/></a>
						<p><a href="#"><font color="gray">电炖锅</font></a></p>
						<p><font color="red">¥399</font></p>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--图片内容-->
	<div class="container" style="margin-top: 10px;">
		<div class="row" >
			<div class="col-lg-12 hidden-md hidden-sm hidden-xs" style="padding-left:14px;">
				<img src="../img/ad.jpg" style="width: 98%;"/>
			</div>
		</div>
	</div>
</body>
</html>
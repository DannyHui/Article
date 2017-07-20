<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="common/taglib.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<script src="${basePath}/static/js/jQuery.js"></script>
<link rel="stylesheet" type="text/css"
	href="${basePath}/static/css/public.css" />
<link rel="stylesheet" type="text/css"
	href="${basePath}/static/css/index.css" />
<style>
.category {
	margin-top: 10px;
	margin-bottom: 20px;
}

.category .title {
	margin-bottom: 10px;
	border-bottom: 1px solid #cac5c5;
	height: 30px;
	text-indent: 1em;
	font-size: 18px;
	color: #666;
}

.category .items {
	margin-left: 10px;
}

.category .items .item {
	width: 230px;
	height: 320px;
	background: #ccc;
	margin: 20px;
	float: left;
	margin-right: 20px;
	cursor: pointer;
}

.category .items .item div {
	text-align: center;
}

.item-banner {
	background: #666;
	color: #FFF;
}

.item-header {
	font-size: 12px;
	line-height: 52px;
}

.item-name {
	font-size: 22px;
	line-height: 74px;
	white-space: nowrap;
	overflow: hidden;
	text-overflow: ellipsis;
}

.item-author {
	font-size: 14px;
	text-indent: 7em;
	padding-bottom: 70px;
}

.item-description {
	background: #eee;
	height: 104px;
	line-height: 76px;
	text-indent: 3em;
	font-size: 12px;
}
</style>

</head>
<body>

	<!-- 头部页面 -->
	<%@include file="common/header.jsp"%>

	<!-- banner区 -->
	<div class="banner">
		<div class='content'>
			<!-- 轮播图  -->
			<ul>
				<li class='fl'><a href="javascript:void(0)"> <img
						src="${basePath}/static/img/5.png " />
				</a></li>
				<li class='fl'><a href="javascript:void(0)"> <img
						src="${basePath}/static/img/1.png " />
				</a></li>
				<li class='fl'><a href="javascript:void(0)"> <img
						src="${basePath}/static/img/2.png " />
				</a></li>
				<li class='fl'><a href="javascript:void(0)"> <img
						src="${basePath}/static/img/3.png " />
				</a></li>
				<li class='fl'><a href="javascript:void(0)"> <img
						src="${basePath}/static/img/4.png " />
				</a></li>
				<li class='fl'><a href="javascript:void(0)"> <img
						src="${basePath}/static/img/5.png " />
				</a></li>
				<li class='fl'><a href="javascript:void(0)"> <img
						src="${basePath}/static/img/1.png " />
				</a></li>
			</ul>
			<!-- 按钮区 -->
			<span class='banner_left'><i class='btn_left'></i></span> <span
				class='banner_right'><i class='btn_right'></i></span>
		</div>

	</div>

	<!-- 内容区域（待做） -->
	<div style='border: 1px solid #ccc'>
		<br /> <br />
		<div class='category'>
			<div class='title'>连载小说</div>
			<ul class='items'>

				<li class='item'>
					<div class='item-banner'>
						<div class='item-header'>生活中总是充满了乐趣</div>
						<div class='item-name'>聊聊我的大学室友</div>
						<div class='item-author'>@张三 著</div>
					</div>
					<div class='item-description'>那些回忆，那些事。。。</div>
				</li>

				<li class='item'></li>
				<li class='item'></li>
				<div style='clear: both'></div>
			</ul>
		</div>
		<div class='category'>
			<div class='title'>干货分享</div>
			<ul class='items'>
				<li class='item'></li>
				<li class='item'></li>
				<li class='item'></li>
				<div style='clear: both'></div>
			</ul>
		</div>

	</div>

	<!-- 底部页面 -->
	<%@include file="common/footer.jsp"%>

	<script>
		var leftBtn = $('.btn_left').eq(0); //左按钮
		var rightBtn = $('.btn_right').eq(0);//右按钮

		var ul = $('.banner .content ul').eq(0);

		var index = 0;
		var timer = null;

		var imgwidth = $('.banner .content ul li').width(); //获取轮播图片的宽度
		var len = $('.banner .content ul li').length - 2//获取总共的图片数量

		//下一张
		rightBtn.on('click', function() {
			clearTimeout(timer); //定时器清零
			timer = setTimeout(function() {
				index++;
				movePicture();
			}, 500);

		});

		//上一张
		leftBtn.on('click', function() {
			clearTimeout(timer); //定时器清零
			timer = setTimeout(function() {
				index--;
				movePicture();
			}, 500);
		});

		//移动图片
		function movePicture() {
			$('.banner .content ul').animate({
				'margin-left' : -imgwidth * (index + 1)
			}, 1000, function() {
				if (index == len) {
					$(this).css('margin-left', -imgwidth);
					index = 0;
				}
				if (index == -1) {
					$(this).css('margin-left', -imgwidth * len);
					index = len - 1;
				}
			});
		}
	</script>

</body>
</html>
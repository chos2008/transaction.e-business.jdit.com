<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<title>我的帐户</title>
<link rel="stylesheet" type="text/css" href="../css/common-style.css"/>
<link rel="stylesheet" type="text/css" href="../css/item.css"/>

<script type="text/javascript" src="../js/zepto/zepto.min.js"></script>
<script type="text/javascript" src="../js/zepto/event.js"></script>
<script type="text/javascript" src="../js/zepto/fx.js"></script>
<script type="text/javascript" src="../js/account.js"></script>
</head>
<body style="margin: 0px 0px;">
<div class="list-item">
	<ul class="list-item list-item-t" style="position: relative;">
		<li class="list-item-t-item"><p><a href="../item.shtml">我的订单</a></p></li>
		<li class="list-item-t-item-right list-item-t-item-img"></li>
		<li class="list-item-t-item-right">查看所有订单</li>
	</ul>
	<div id="nav" class="nav-bar tool_bar">
		<div class="nav-bar-box">
			<div class="nav-bar-box-item" style="font-size: 12px; font-family: Arial, 'Microsoft YaHei';">
				<p id="nav-back" style="width: 70px; height: 36px; line-height: 36px; margin: 0px 0px; text-align: center;">
					<label title="paypal" class="icon-paypal" style="width: 100%; display: block;"></label>
					<label style="width: 100%; display: block;"><a href="javascript: void(0);" style="">待付款</a></label>
				</p>
			</div>
			<div class="nav-bar-box-item nav-bar-box-center-item" style="font-size: 12px; font-family: Arial, 'Microsoft YaHei';">
				<a href="investment.jsp">待发货</a>
			</div>
			<div class="nav-bar-box-item nav-bar-box-center-item" style="font-size: 12px; font-family: Arial, 'Microsoft YaHei';">
				<a href="investment.jsp">待收货</a>
			</div>
			<div class="nav-bar-box-item nav-bar-box-center-item" style="font-size: 12px; font-family: Arial, 'Microsoft YaHei';">
				<a href="investment.jsp">待评价</a>
			</div>
			<div class="nav-bar-box-item nav-bar-box-end-item" style="font-size: 12px; font-family: Arial, 'Microsoft YaHei';">
				<p style="width: 70px; height: 36px; line-height: 36px; margin: 0px 0px; text-align: center;">
					<label title="google wallet" class="icon-google-wallet" style="width: 100%; display: block;"></label>
					<label style="width: 100%; display: block;"><a href="investment.jsp"style="">退款/售后</a></label>
				</p>
			</div>
		</div>
	</div>
	
	<div style="height: 160px; margin: 2px 5px 3px; padding: 3px 5px; border: 0px solid silver; background-color: white; background-image: url('../images/qapp_center_loading.png'); background-position: center center; background-repeat: no-repeat; opacity: 0.6;">
		
	</div>
</div>

<div class="list-item">
	<ul class="list-item-t">
		<li class="list-item-t-item"><p>我的帐户</p></li>
		<li class="list-item-t-item-right list-item-t-item-img"></li>
	</ul>
</div>

<div class="list-item">
	<ul class="list-item-t list-item-item" style="position: relative;">
		<li class="list-item-t-item"><p><a href="../item.shtml">我的需求</a></p></li>
		<li class="list-item-t-item-right list-item-t-item-img"></li>
		<li class="list-item-t-item-right">查看所有发布的需求</li>
	</ul>
	<div class="list-item-body" style="width: 100%; position: relative; display: inline-block;">
		<div class="item-not-issue" style="height: 160px; margin: 2px 5px 3px; padding: 3px 5px; border: 0px solid silver; position: relative; background-color: white; background-image: url('../images/qapp_center_loading.png'); background-position: center center; background-repeat: no-repeat; opacity: 0.6;">
			<p style="width: 100%; margin: 0px 0px; padding: 0px 0px; position: absolute; bottom: 0px; text-align: center;">
				<a style="font-size: 12px; font-family: Arial, 'Microsoft YaHei';" href="../issue.jsp">你还没有发布需求, 在这里发布下试试</a>
			</p>
		</div>
		
		<ul class="item-list" style="list-style: none; margin: 0px 0px; padding: 0px 0px; float: left; width: 100%; font-size: 12px; font-family: Arial, 'Microsoft YaHei';">
			
		</ul>			
	</div>
</div>

<div class="list-item">
	<ul class="list-item-t" style="position: relative;">
		<li class="list-item-t-item"><p><a href="../bid/list.shtml">我发布的标书</a></p></li>
		<li class="list-item-t-item-right list-item-t-item-img"></li>
		<li class="list-item-t-item-right">查看所有标书</li>
	</ul>
	<div style="height: 160px; margin: 2px 5px 3px; padding: 3px 5px; border: 0px solid silver; background-color: white; background-image: url('../images/qapp_center_loading.png'); background-position: center center; background-repeat: no-repeat; opacity: 0.6;">
		
	</div>
	<div style="height: 160px; margin: 2px 5px 3px; padding: 3px 5px; border: 0px solid silver; background-color: white; background-image: url('../images/qapp_center_loading.png'); background-position: center center; background-repeat: no-repeat; opacity: 0.6;">
		
	</div>
	<div style="height: 160px; margin: 2px 5px 3px; padding: 3px 5px; border: 0px solid silver; background-color: white; background-image: url('../images/qapp_center_loading.png'); background-position: center center; background-repeat: no-repeat; opacity: 0.6;">
		
	</div>
	<div style="height: 160px; margin: 2px 5px 3px; padding: 3px 5px; border: 0px solid silver; background-color: white; background-image: url('../images/qapp_center_loading.png'); background-position: center center; background-repeat: no-repeat; opacity: 0.6;">
		
	</div>
</div>

<div class="copyright" style="width: 100%; bottom: 0px; text-align: center;">
	<div style="padding: .9rem .4rem 4rem; background-color: #4e525e;">
		<div style="width: 100%; display: -moz-box; display: -webkit-box; display: box; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;">
			<!--  -moz-box-flex:3; -webkit-box-flex:3; box-flex:3; -->
			<p style="width: 160px; margin: 0px 0px; text-align: center;">
				<a href="../login.shtml" style="border-radius: 6px; font-size: 14px; display: block; height: 1.5rem; line-height: 1.5rem; color: #c3c6ca; border: 2px solid #42454d; background-color: #555965; padding: 0 .75rem; text-decoration: none;">退出当前帐号</a>
			</p>
		</div>
		<div style="width: 100%; display: -moz-box; display: -webkit-box; display: box; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;">
			<!--  -moz-box-flex:3; -webkit-box-flex:3; box-flex:3; -->
			<p style="width: 70px; height: 36px; line-height: 36px; margin: 0px 0px; text-align: center;">
				<a href="../login.jsp" style="text-decoration: none;">触屏版</a>
			</p>
			<p style="width: 70px; height: 36px; line-height: 36px; margin: 0px 0px; text-align: center;">
				<a href="../register.jsp" style="text-decoration: none;">极速版</a>
			</p>
			<p style="width: 70px; height: 36px; line-height: 36px; margin: 0px 0px; text-align: center;">
				<a href="../register.jsp" style="text-decoration: none;">电脑版</a>
			</p>
		</div>
		<div style="width: 100%; margin-top: .9rem; height: .9rem; line-height: .9rem; box-sizing: border-box; background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACEAAAAhCAMAAABgOjJdAAAAGXRFW…v7MdDuE3a/JRrCmqwFQ2yV8gmvg/d+aPCMH0GLvB//AgwAo1MTpxsaxVoAAAAASUVORK5CYII=) no-repeat 3.7rem center; background-size: .85rem .85rem; color: #c3c6ca; font-size: 12px;">
			上海正旅网络科技有限公司版权所有 2008-2014 <a href="#" target="_blank" seed="copyright-link" smartracker="on"></a>
		</div>
	</div>
</div>

	
</body>
</html>
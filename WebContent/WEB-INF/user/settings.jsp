<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<title>帐号设置</title>
<link rel="stylesheet" type="text/css" href="../../css/common-style.css"/>
<link rel="stylesheet" type="text/css" href="../../css/item.css"/>

<script type="text/javascript" src="../../js/zepto/zepto.min.js"></script>
<script type="text/javascript" src="../../js/zepto/event.js"></script>
<script type="text/javascript" src="../../js/zepto/fx.js"></script>
<script type="text/javascript" src="../../js/account.js"></script>
</head>
<body style="margin: 0px 0px;">

<div class="list-item">
	<ul class="list-item-t">
		<li class="list-item-t-item"><p><a href="/user/logout.shtml">切换账号</a></p></li>
		<li class="list-item-t-item-right list-item-t-item-img"></li>
	</ul>
</div>

<c:if test="${empty merchant}">
<div class="list-item">
	<ul class="list-item-t" style="position: relative;">
		<li class="list-item-t-item"><p><a href="../../business/register.shtml">继续注册成为商家</a></p></li>
		<li class="list-item-t-item-right list-item-t-item-img"></li>
	</ul>
</div>
</c:if>


<c:if test="${! empty user}">
	<c:if test="${empty user.alapayAccount}">
	<div class="list-item">
		<ul class="list-item-t" style="position: relative;">
			<li class="list-item-t-item"><p><a href="/user/bindAlaPayAccount.shtml">绑定支付账户</a></p></li>
			<li class="list-item-t-item-right list-item-t-item-img"></li>
		</ul>
	</div>
	</c:if>
</c:if>

<div class="list-item">
	<ul class="list-item-t" style="position: relative;">
		<li class="list-item-t-item"><p><a href="javascript: void(0);">切换到买家版</a></p></li>
	</ul>
</div>

<div class="copyright" style="width: 100%; bottom: 0px; text-align: center;">
	<div style="padding: .9rem .4rem 4rem; background-color: #4e525e;">
		<div style="width: 100%; display: -moz-box; display: -webkit-box; display: box; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;">
			<!--  -moz-box-flex:3; -webkit-box-flex:3; box-flex:3; -->
			<p style="width: 70px; height: 36px; line-height: 36px; margin: 0px 0px; text-align: center;">
				<a href="javascript: void(0);" style="text-decoration: none;">触屏版</a>
			</p>
			<p style="width: 70px; height: 36px; line-height: 36px; margin: 0px 0px; text-align: center;">
				<a href="javascript: void(0);" style="text-decoration: none;">极速版</a>
			</p>
			<p style="width: 70px; height: 36px; line-height: 36px; margin: 0px 0px; text-align: center;">
				<a href="javascript: void(0);" style="text-decoration: none;">电脑版</a>
			</p>
		</div>
		<div style="width: 100%; margin-top: .9rem; height: .9rem; line-height: .9rem; box-sizing: border-box; background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACEAAAAhCAMAAABgOjJdAAAAGXRFW…v7MdDuE3a/JRrCmqwFQ2yV8gmvg/d+aPCMH0GLvB//AgwAo1MTpxsaxVoAAAAASUVORK5CYII=) no-repeat 3.7rem center; background-size: .85rem .85rem; color: #c3c6ca; font-size: 12px;">
			上海正旅网络科技有限公司版权所有 2008-2014 <a href="#" target="_blank" seed="copyright-link" smartracker="on"></a>
		</div>
	</div>
</div>

	
</body>
</html>
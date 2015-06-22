<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<title>添加收货地址</title>
<link rel="stylesheet" type="text/css" href="../../css/common-style.css"/>
<link rel="stylesheet" type="text/css" href="../../css/item.css"/>
<link rel="stylesheet" type="text/css" href="../../css/user.css"/>

<script type="text/javascript" src="../../js/zepto/zepto.min.js"></script>
<script type="text/javascript" src="../../js/tips.js"></script>
<script type="text/javascript" src="../../js/account.js"></script>
<script type="text/javascript" src="../../js/add-user-address.js"></script>
</head>
<body style="margin: 0px 0px;">



<ul class="list-item" style="height: 60px; border-bottom-width: 0px;">
	<li class="list-item-t-item-normal" style="width: 100%; padding: 0px 0px;">
		<div style="width: 100%;" onclick="location.href='/merchant.shtml';">
			<div style="">
			<c:choose>
				<c:when test="${empty user}">
				<div style="width: 40px; height: 40px; margin: 0px auto; border-radius: 20px 20px 20px 20px; background: url('../../images/m_logo_j_40x40.jpg'); background-position: center center; background-repeat: no-repeat; background-size: 100% 100%;"></div>
				<p style="margin: 0px 0px; padding: 0px 0px; text-align: center;"></p>
				</c:when>
				
				<c:otherwise>
					<c:choose>
						<c:when test="${empty user.head}">
				<div style="width: 40px; height: 40px; margin: 0px auto; border-radius: 20px 20px 20px 20px; background: url('../../images/m_logo_j_40x40.jpg'); background-position: center center; background-repeat: no-repeat; background-size: 100% 100%;"></div>
						</c:when>
						
						<c:otherwise>
				<div style="width: 40px; height: 40px; margin: 0px auto; border-radius: 20px 20px 20px 20px; background: url('../../${user.head}'); background-position: center center; background-repeat: no-repeat; background-size: 100% 100%;"></div>
						</c:otherwise>
					</c:choose>
					
					<c:choose>
						<c:when test="${empty user.username}">
				<p style="margin: 0px 0px; padding: 0px 0px; text-align: center;"></p>
						</c:when>
						
						<c:otherwise>
				<p style="margin: 0px 0px; padding: 0px 0px; text-align: center;">${user.username}</p>
						</c:otherwise>
					</c:choose>
				</c:otherwise>
			</c:choose>
			</div>
		</div>
	</li>
	<li class="list-item-t-item-right" style="padding: 8px 0px; position: absolute; top: 0px; right: 0px;">
		<span class="list-item-t-item-preview-cart-img-ok add-user-address" style="cursor: pointer;"></span>
	</li>
</ul>

<div class="list-item">
	<ul class="list-item-t" style="position: relative;">
		<li class="list-item-t-item">
			<input id="username" type="text" maxlength="32" name="username" placeholder="请输入收货人姓名" style="width: 100%; height: 35px; line-height: 35px; border: 0px solid red; background: transparent; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; outline: none; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only;"/>
		</li>
		<li class="list-item-t-item-right list-item-t-item-img"></li>
	</ul>
</div>

<div class="list-item">
	<ul class="list-item-t" style="position: relative;">
		<li class="list-item-t-item">
			<input id="contact" type="text" maxlength="32" name="contact" placeholder="请输入收货人联系电话" style="width: 100%; height: 35px; line-height: 35px; border: 0px solid red; background: transparent; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; outline: none; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only;"/>
		</li>
		<li class="list-item-t-item-right list-item-t-item-img"></li>
	</ul>
</div>

<div class="list-item">
	<ul class="list-item-t" style="position: relative;">
		<li class="list-item-t-item">
			<input id="region" type="text" maxlength="32" name="region" placeholder="请输入所在地区" style="width: 100%; height: 35px; line-height: 35px; border: 0px solid red; background: transparent; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; outline: none; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only;"/>
		</li>
		<li class="list-item-t-item-right list-item-t-item-img"></li>
	</ul>
</div>

<div class="list-item">
	<ul class="list-item-t" style="position: relative;">
		<li class="list-item-t-item">
			<input id="address" type="text" name="address" placeholder="请输入详细地址" style="width: 100%; height: 35px; line-height: 35px; border: 0px solid red; background: transparent; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; outline: none; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only;"/>
		</li>
		<li class="list-item-t-item-right list-item-t-item-img"></li>
	</ul>
</div>

<div class="list-item">
	<ul class="list-item-t" style="position: relative;">
		<li class="list-item-t-item">
			<input id="postcode" type="text" maxlength="32" name="postcode" placeholder="请输入邮编" style="width: 100%; height: 35px; line-height: 35px; border: 0px solid red; background: transparent; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; outline: none; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only;"/>
		</li>
		<li class="list-item-t-item-right list-item-t-item-img"></li>
	</ul>
</div>
<script type="text/javascript" src="../../js/chos/template-engine/TEngine.js" ></script>
<script type="text/javascript" src="../../js/zepto/event.js"></script>
<script type="text/javascript" src="../../js/zepto/fx.js"></script>
</body>
</html>
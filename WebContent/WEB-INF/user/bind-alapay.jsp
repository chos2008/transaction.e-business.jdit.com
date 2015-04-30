<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<title>绑定支付账号</title>
<link rel="stylesheet" type="text/css" href="../css/common-style.css"/>
<link rel="stylesheet" type="text/css" href="../css/style.css"/>

<script type="text/javascript" src="../js/zepto/zepto.min.js"></script>
<script type="text/javascript" src="../js/login.js"></script>

</head>
<body topmargin="0" rightmargin="0" bottommargin="0" leftmargin="0" marginheight="0" marginwidth="0" style="margin: 0px 0px; padding: 0px 0px;">
<div style="width: 100%; height: 32px; line-height: 32px; text-align: center; border: 0px solid silver; border-bottom: 1px solid silver;">
	<ul class="list-item-t list-item-item" style="position: relative;">
		<li class="list-item-t-item" style="width: 33.3%"></li>
		<li class="list-item-t-item" style="width: 33.3%"><label>绑定支付账号</label></li>
		<li class="list-item-t-item-right" style="width: 33.3%; text-align: right;">
			<p style="font-size: 12px; color: black;"></p>
		</li>
	</ul>
</div>
<div style="  margin: 6px 0px 0px 0px;">
	<form action="">
		<input type="hidden" class="ipt-return" value="${returnUrl}"/>
		<div style="width: 300px; margin: 0px auto; padding: 0px 10px;">
			<div style="height: 44px; border: 1px solid #e5e5e5; border-radius: 6px 6px 0px 0px; box-shadow: -0px -1px 1px 0px #e5e5e5; -webkit-box-shadow: -0px -1px 1px 0px #e5e5e5; -moz-box-shadow: -0px -1px 1px 0px #e5e5e5; margin: 0px auto; display: -webkit-box; display: -webkit-flex; display: -ms-flexbox; display: flex;">
				<label for="" class="icon-user2" style="display: block; width: 42px; height: 44px; line-height: 44px; text-align: center; font-size: 1.6rem; color: #666;"></label>
				<div style="height: 43px; -webkit-box-flex: 1; -webkit-flex: 1; -ms-flex: 1; flex: 1;">
					<input id="username" type="text" style="width: 100%; border: 0px solid #e5e5e5; padding: 12px 30px 11px 0; outline: none;" placeholder="手机号码/邮箱/用户名"/>
				</div>
			</div>
			<div style="height: 44px; border: 1px solid #e5e5e5; border-top-width: 0px; border-radius: 0px 0px 6px 6px; margin: 0px auto; display: -webkit-box; display: -webkit-flex; display: -ms-flexbox; display: flex;">
				<label for="" class="icon-unlock-alt" style="display: block; width: 42px; height: 44px; line-height: 44px; text-align: center; font-size: 1.6rem; color: #666;"></label>
				<div style="height: 43px; -webkit-box-flex: 1; -webkit-flex: 1; -ms-flex: 1; flex: 1;">
					<input id="password" type="password" style="width: 100%; border: 0px solid #e5e5e5; padding: 12px 30px 11px 0; outline: none;" placeholder="请输入密码"/>
				</div>
			</div>
			<p style="width: 100%; float: right; font-size: 12px; color: black; text-align: right;"><a href="register2.shtml">注册新用户</a></p>
			<div style="width: 100%; margin: 0px auto; padding: 15px 0px 10px 0px; display: -webkit-box; display: -webkit-flex; display: -ms-flexbox; display: flex;">
				<a id="bind" href="javascript: void(0);" style="width: 100%; margin: 0px auto; height: 36px; line-height: 36px; display: block; color: #fff; background-color: #ff3c3c; border-radius: 5px; -webkit-border-radius: 5px;text-align: center; font-size: 1.4rem;">绑定</a>
			</div>
		</div>
	</form>
</div>
<script type="text/javascript" src="../js/chos/template-engine/TEngine.js" ></script>
</body>
</html>
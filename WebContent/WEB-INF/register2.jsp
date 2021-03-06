<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<title>注册</title>
<link rel="stylesheet" type="text/css" href="css/common-style.css"/>
<link rel="stylesheet" type="text/css" href="css/register.css"/>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<script type="text/javascript" src="js/zepto/zepto.min.js"></script>
<script type="text/javascript" src="js/register.js" ></script>
<!-- 
<script type="text/viewscript" src="_tips.tmpl" ></script>
 -->
</head>
<body id="body" topmargin="0" rightmargin="0" bottommargin="0" leftmargin="0" marginheight="0" marginwidth="0">
<div style="width: 100%; min-height: 200px; height: 100%;">
	<div style="width: 100%; height: 35px; line-height: 35px; text-align: center; border: 0px solid silver; border-bottom: 1px solid silver;">
	    <label>注册</label>
	</div>

	<div style="width: 100%;">
		<div id="div-reg-mobile" style="width: 320px; margin: 0px auto; display: none;">
			<form action="">
				<div class="form-item" style="margin-top: 2px; margin-bottom: 5px;">
					<label for="" class="form-item-label icon-mobile2 icon-mobile2-win" style=""></label>
					<div class="form-item-content-box" style="">
						<input type="tel" style="width: 100%; height: 43px; border: 0px solid #e5e5e5; padding: 12px 30px 11px 0; outline: none;" placeholder="请输入手机号码"/>
					</div>
				</div>
				<div class="form-item" style=" margin-top: 2px; margin-bottom: 5px;">
					<a href="javascript: void(0);" style="width: 100%; height: 44px; line-height: 44px; display: block; color: #fff; background-color: #ff3c3c; border-radius: 5px; -webkit-border-radius: 5px;text-align: center; font-size: 1.4rem;">下一步</a>
				</div>
			</form>
		</div>
		
		<div id="div-reg-username" style="width: 320px; margin: 0px auto;">
			<form action="">
				<div style="width: 300px; margin: 0px auto; padding: 0px 10px;">
					<div class="form-item" style="margin-top: 2px; margin-bottom: 5px;">
						<label for="" class="icon-mobile2 icon-mobile2-win form-item-label" style="line-height: 44px;"></label>
						<div class="form-item-content-box" style="">
							<input id="username" type="text" name="username" style="height: 43px; border: 0px solid #e5e5e5; padding: 12px 30px 11px 0; outline: none;" placeholder="请输入用户名"/>
						</div>
					</div>
					<div class="form-item" style="margin-top: 2px; margin-bottom: 5px;">
						<label for="" class="form-item-label icon-unlock-alt icon-mobile2-win" style="font-size: 20px; line-height: 44px;"></label>
						<div class="form-item-content-box" style="">
							<input id="password" type="password" name="password" style="height: 43px; border: 0px solid #e5e5e5; padding: 12px 30px 11px 0; outline: none;" placeholder="请输入密码"/>
						</div>
					</div>
					<div class="form-item" style="margin-top: 2px; margin-bottom: 5px;">
						<label for="" class="form-item-label icon-envelope-o icon-mobile2-win" style="font-size: 15px; line-height: 44px;"></label>
						<div class="form-item-content-box" style="">
							<input id="captcha" type="text" name="captcha" style="width: 120px; height: 43px; border: 0px solid #e5e5e5; padding: 12px 30px 11px 0; outline: none;" placeholder="请输入验证码"/>
							<img alt="" src="/captcha.shtml"/>
						</div>
					</div>
					<div class="form-item" style=" margin-top: 2px; margin-bottom: 5px;">
						<a id="submit" href="javascript: void(0);" name="submit" style="width: 100%; height: 36px; line-height: 36px; display: block; color: #fff; background-color: #ff3c3c; border-radius: 5px; -webkit-border-radius: 5px;text-align: center; font-size: 1.4rem;">注册</a>
					</div>
				</div>
			</form>
		</div>
	</div>

	<div style="width: 100%; position: absolute; bottom: 0px;">
		<div style="width: 320px; margin: 0px auto;">
			<a id="bt-reg" href="javascript: void(0);">手机注册</a>
		</div>
	</div>
</div>

<script type="text/javascript" src="js/chos/template-engine/TEngine.js" ></script>
</body>
</html>
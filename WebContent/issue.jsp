<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta name="mobile-web-app-capable" content="yes" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0" />
<meta name="MobileOptimized" content="320" />
<title>发布需求</title>
<link rel="stylesheet" type="text/css" href="css/common-style.css"/>

<script type="text/javascript" src="js/zepto/zepto.min.js"></script>
<script type="text/javascript" src="js/issue.js"></script>
</head>
<body style="margin: 0px 0px; padding: 0px 0px;">
<div class="full-screen">
	<div id="nav" class="nav-bar">
		<!--  -moz-box-flex:3; -webkit-box-flex:3; box-flex:3; -->
		<div class="nav-bar-box">
			<div class="nav-bar-box-item">
				<p id="nav-back" style="width: 70px; height: 36px; line-height: 36px; margin: 0px 0px; text-align: center;">
					<label title="paypal" class="icon-paypal" style="width: 100%; display: block;"></label>
					<label style="width: 100%; display: block;"><a href="javascript: void(0);" style=" color: #ffffff;">返回</a></label>
				</p>
			</div>
			<div class="nav-bar-box-item nav-bar-box-center-item">
				<label class="text-location" style="width: 100%; height: 40px; line-height: 40px; display: inline-block; white-space:nowrap; color: #ffffff;">31.123456,121.123456</label>
			</div>
			<div class="nav-bar-box-item nav-bar-box-end-item">
				<p style="width: 70px; height: 36px; line-height: 36px; margin: 0px 0px; text-align: center;">
					<label title="google wallet" class="icon-google-wallet" style="width: 100%; display: block;"></label>
					<label style="width: 100%; display: block;"><a id="issue" href="javascript: void(0);" style="color: #ffffff;">发布</a></label>
				</p>
			</div>
		</div>
	</div>
	<div style="width: 100%; position: absolute; top: 70px; bottom: 0px;">
		<div>
			<div style="position: relative;">
				<i id="icon-location" class="icon-location" style="width: 13px; height: 20px; margin: 2px 3px; display: block; background: url('images/fah.png'); float: left;"></i>
				<div style="position: relative; margin: 2px 5px 3px 20px; border: 0px solid silver;">
					<input id="title" type="text" maxlength="32" name="title" placeholder="请描述您的需求" style="width: 100%; height: 35px; line-height: 35px; border: 0px solid red; background: transparent; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; outline: none; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only;"/>
				</div>
			</div>
		</div>
	
		<div id="sole" style="position: relative; display: block; margin-bottom: 5px;">
			<div style="width: 100%; position: relative;">
				<div style="margin: 2px 5px 3px; padding: 3px 5px; border: 1px solid silver; background-color: white;">
					<input id="contact" type="text" name="contact" placeholder="手机/电子邮箱" style="width: 100%; height: 35px; line-height: 35px; border: 0px solid red;font-size: 14px; font-family: Arial, 'Microsoft YaHei'; outline: none; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only;"/>
				</div>
				
				<div style="margin: 2px 5px 3px; padding: 3px 5px; border: 1px solid silver; background-color: white; background-image: url('images/qapp_center_loading.png'); background-position: center center; background-repeat: no-repeat; opacity: 0.6;">
					<textarea id="content" name="content" rows="20" spellcheck="true" contenteditable="true" placeholder="请填写您的具体要求" style="width: 100%; border: 0px solid red; margin: 0px 0px; padding: 0px 0px; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; resize: none; outline: none; opacity: 0.6; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only;"></textarea>
				</div>
				<!-- 
				<div style="margin: 2px 5px 3px; border: 1px solid silver; text-align: center;">
					<input id="sole_submit" type="submit" value="发布" style="width: 100%; height: 35px; border: 1px solid red;"/>
				</div>
				 -->
			</div>
		</div>
	</div>
</div>
<script type="text/javascript" src="js/chos/template-engine/TEngine.js" ></script>
</body>
</html>
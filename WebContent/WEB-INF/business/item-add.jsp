<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<title>添加商品</title>
<link rel="stylesheet" type="text/css" href="../../css/common-style.css"/>

<script type="text/javascript" src="../../js/zepto/zepto.min.js"></script>
<script type="text/javascript" src="../../js/item-add.js"></script>
<script type="text/javascript" src="../../js/tips.js"></script>
</head>
<body style="margin: 0px 0px; padding: 0px 0px;">
	<div class="nav-bar nav-bar-2_0" style="height: 40px; ">
		<a href="javascript: void(0);" class="item-add">完成</a>
	</div>
	
	<div style="width: 100%; position: absolute; top: 70px; bottom: 0px;">
		<div style="position: relative; margin: 2px 5px 3px 20px; border: 0px solid silver;">
			<input id="name" type="text" maxlength="32" name="title" placeholder="请填写商品名称" style="width: 100%; height: 35px; line-height: 35px; border: 0px solid red; background: transparent; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; outline: none; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only;"/>
		</div>
		
		<div style="position: relative; margin: 2px 5px 3px 20px; border: 0px solid silver;">
			<span style="width: 100%; display: block; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; color: initial;  -webkit-appearance: textfield;-webkit-appearance: textfield; padding: 1px; background-color: white; border: 0px inset; border-image-source: initial; border-image-slice: initial; border-image-width: initial; border-image-outset: initial; border-image-repeat: initial; -webkit-rtl-ordering: logical; -webkit-user-select: text; cursor: auto; color: darkgrey;">商品图片</span>
			<span style="width: 72px; height: 72px; display: block; background: url('../../images/rate_cross_480.png'); background-position: center center; background-repeat: no-repeat; background-size: 100% 100%;"></span>
			
		</div>
		
		<div style="margin: 2px 5px 3px; padding: 3px 5px 3px 15px; border: 0px solid silver; background-color: white; background-image: url('images/qapp_center_loading.png'); background-position: center center; background-repeat: no-repeat; opacity: 0.6;">
			<textarea id="content" name="content" rows="10" spellcheck="true" contenteditable="true" placeholder="请输入商品描述" style="width: 100%; border: 0px solid red; margin: 0px 0px; padding: 0px 0px; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; resize: none; outline: none; opacity: 0.6; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only;"></textarea>
		</div>
		
		<div style="position: relative; margin: 2px 5px 3px 20px; border: 0px solid silver;">
			<input id="price" type="number" maxlength="32" name="title" placeholder="请输入商品价格" style="width: 100%; height: 35px; line-height: 35px; border: 0px solid red; background: transparent; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; outline: none; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only; margin: 0; -moz-appearance: textfield;"/>
		</div>
		
		<div style="position: relative; margin: 2px 5px 3px 20px; border: 0px solid silver;">
			<input id="stock" type="number" maxlength="32" name="title" placeholder="请输入商品库存" style="width: 100%; height: 35px; line-height: 35px; border: 0px solid red; background: transparent; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; outline: none; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only; margin: 0; -moz-appearance: textfield;"/>
		</div>
	</div>
	
	<script type="text/javascript" src="../../js/chos/template-engine/TEngine.js" ></script>
</body>
</html>
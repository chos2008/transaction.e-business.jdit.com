<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<title>发布招标项目</title>
<script type="text/javascript" src="js/zepto/zepto.min.js"></script>
<script type="text/javascript" src="js/bid.js"></script>
</head>
<body>
<div style="width: 100%;">
	<div style="margin: 2px 5px 3px; border: 1px solid silver;">
		<input id="title" type="text" name="title" placeholder="请填写招标项目名称" style="width: 100%; height: 35px; border: 0px solid red; margin: 0px 0px; padding: 0px 0px;"/>
	</div>
	
	<div style="margin: 2px 5px 3px; border: 1px solid silver;">
		<input id="contact" type="text" name="contact" placeholder="手机/电子邮箱" style="width: 100%; height: 35px; border: 0px solid red; margin: 0px 0px; padding: 0px 0px;"/>
	</div>
	
	<div style="margin: 2px 5px 3px; border: 1px solid silver;">
		<input id="amount" type="text" name="amount" placeholder="请填写招标项目金额" style="width: 100%; height: 35px; border: 0px solid red; margin: 0px 0px; padding: 0px 0px;"/>
	</div>
	
	<div style="margin: 2px 5px 3px; border: 1px solid silver;">
		<textarea id="content" rows="20" spellcheck="true" contenteditable="true" placeholder="请填写招标项目具体要求" style="width: 100%; border: 0px solid red; margin: 0px 0px; padding: 0px 0px; resize: none;"></textarea>
	</div>
	
	<div style="margin: 2px 5px 3px; border: 1px solid silver;">
		<input id="end-time" type="text" name="end-time" placeholder="请填写招标项目结束时间" style="width: 100%; height: 35px; border: 0px solid red; margin: 0px 0px; padding: 0px 0px;"/>
	</div>
	
	<div style="margin: 2px 5px 3px; border: 1px solid silver; text-align: center;">
		<input id="issue" type="submit" value="发布招标项目" style="width: 100%; height: 35px; border: 1px solid red; margin: 0px 0px; padding: 0px 0px;"/>
	</div>
</div>
<script type="text/javascript" src="js/chos/template-engine/TEngine.js" ></script>
</body>
</html>
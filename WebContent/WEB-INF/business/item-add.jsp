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
<link rel="stylesheet" type="text/css" href="../../css/add-item.css"/>

<script type="text/javascript" src="../../js/zepto/zepto.min.js"></script>
<script type="text/javascript" src="../../js/item-add.js"></script>
<script type="text/javascript" src="../../js/tips.js"></script>
</head>
<body style="margin: 0px 0px; padding: 0px 0px;">
	<div class="nav-bar nav-bar-2_0" style="height: 40px; ">
		<a href="javascript: void(0);" class="item-add">完成</a>
	</div>
	
	<div style="width: 100%; position: absolute; top: 70px; bottom: 0px;">
		<c:import url="../business/tmpl-item-add.jsp"></c:import>
	</div>
	
	<script type="text/javascript" src="../../js/chos/template-engine/TEngine.js" ></script>
</body>
</html>
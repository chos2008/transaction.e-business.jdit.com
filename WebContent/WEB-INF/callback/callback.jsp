<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<%@ taglib prefix="fn" uri="/WEB-INF/fn.tld" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<title>回调...</title>
<link rel="stylesheet" type="text/css" href="../../css/common-style.css"/>
<link rel="stylesheet" type="text/css" href="../../css/order.css"/>
<script type="text/javascript" src="../../js/zepto/zepto.min.js"></script>
</head>
<body>
<script type="text/javascript">
	var resp = ${code};
	if (resp == 0) {
		var tips = new window.parent.Tips('tmpl-tips', "上传商品成功");
		tips.show();
		var productId = ${productId};
		window.parent.getProductCallback(productId);
	} else {
		var tips = new window.parent.Tips('tmpl-tips', "上传商品失败");
		tips.show();
	}
</script>
</body>
</html>
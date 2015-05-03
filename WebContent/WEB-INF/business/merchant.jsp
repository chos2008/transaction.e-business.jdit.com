<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<title>
<c:choose>
	<c:when test="${empty merchant}">
	</c:when>
	
	<c:otherwise>
	${merchant.name}
	</c:otherwise>
</c:choose>
</title>
<link rel="stylesheet" type="text/css" href="../css/common-style.css"/>

<script type="text/javascript" src="../js/zepto/zepto.min.js"></script>
<script type="text/javascript" src="../js/merchant.js"></script>
</head>
<body style="margin: 0px 0px; padding: 0px 0px;">
<div class="full-screen">
	<div class="nav-bar nav-bar-2_0" style="height: 40px; ">
		
	</div>
	
	<div style="width: 100%; position: absolute; top: 70px; bottom: 0px;">
		<div>
			<div>
				<img alt="" src="../images/logo-caibei.png">
			</div>
			<div style="position: relative;">
				<i id="icon-location" class="icon-location" style="width: 13px; height: 20px; margin: 2px 3px; display: block; background: url('../images/fah.png'); float: left;"></i>
				<div style="position: relative; margin: 2px 5px 3px 20px; border: 0px solid silver; font-size: 14px; font-family: Arial, 'Microsoft YaHei';">
					<c:choose>
						<c:when test="${empty merchant}">
						</c:when>
						
						<c:otherwise>
						${merchant.name} 
						</c:otherwise>
					</c:choose>
					<span class="details" style="margin: 0px 0px 0px 20px; padding: 0px 0px 0px 5px; border-left: 3px solid orange; cursor: pointer;">商家信息</span>
				</div>
			</div>
		</div>
	
		<div class="merchant-ab-item" style="display: block; margin-bottom: 5px;">
			<c:import url="tmpl-merchant-item.jsp">
				
			</c:import>
		</div>
	</div>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<link rel="stylesheet" type="text/css" href="css/common-style.css"/>
<title>
<c:choose>
	<c:when test="${empty from}">
				继续
	</c:when>
	<c:otherwise>
				注册成功
	</c:otherwise>
</c:choose>
</title>

<link rel="stylesheet" type="text/css" href="css/style.css"/>
</head>
<body topmargin="0" rightmargin="0" bottommargin="0" leftmargin="0" marginheight="0" marginwidth="0">
<div style="width: 100%; height: 35px; line-height: 35px; text-align: center; border: 0px solid silver; border-bottom: 1px solid silver;">
    <label>
    	<c:choose>
			<c:when test="${empty from}">
						继续
			</c:when>
			<c:otherwise>
						注册成功
			</c:otherwise>
		</c:choose>
	</label>
</div>
<div>
	<div style="width: 100%;">
		<form action="">
			<div style="width: 300px; margin: 0px auto; padding: 0px 10px;">
			<c:choose>
				<c:when test="${empty from}">
				</c:when>
				<c:otherwise>
				<div style="margin: 0px auto; margin-top: 2px; margin-bottom: 5px; display: -webkit-box; display: -webkit-flex; display: -ms-flexbox; display: flex;">
					<a href="mindex.htm" style="width: 100%; height: 36px; line-height: 36px; display: block; color: #fff; background-color: #ff3c3c; border-radius: 5px; -webkit-border-radius: 5px;text-align: center; font-size: 1.4rem;">完成</a>
				</div>
				</c:otherwise>
			</c:choose>
				
				<div style="margin: 0px auto; margin-top: 2px; margin-bottom: 5px; display: -webkit-box; display: -webkit-flex; display: -ms-flexbox; display: flex;">
					<a href="/business/register.shtml" style="width: 100%; height: 36px; line-height: 36px; display: block; color: #fff; background-color: #ff3c3c; border-radius: 5px; -webkit-border-radius: 5px;text-align: center; font-size: 1.4rem;">继续注册成为商家</a>
				</div>
			</div>
		</form>
	</div>
</div>

<div>
	
</div>
</body>
</html>
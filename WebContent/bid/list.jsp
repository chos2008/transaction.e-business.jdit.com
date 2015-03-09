<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<title>谁是谁的菜</title>
</head>
<body style="margin: 0px 0px;">
<div style="width: 100%;">
	<c:forEach items="${bids}" var="variable">
	<div style="margin: 2px 3px 5px 3px; border-top: 1px solid silver; border-bottom: 1px solid silver;">
		<span style="width: 100%; display: inline-block;"><a href="">${variable.projectName}-标号${variable.no}</a></span>
		<span style="width: 100%; display: inline-block;">招标项目金额：${variable.amount}元</span>
		<div style="width: 100%; height: 20px; line-height: 20px; text-align: center; font-size: 10px">
			${variable.projectBidContent}
		</div>
		<span style="width: 100%; display: inline-block;">招标时间：${variable.creation}</span>
	</div>
	</c:forEach>
</div>


<div class="copyright" style="text-align: center;">
	上海正旅网络科技有限公司版权所有 2008-2014 <a href="#" target="_blank" seed="copyright-link" smartracker="on"></a>
</div>
</body>
</html>
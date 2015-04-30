<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<title>我的订单</title>
<link rel="stylesheet" type="text/css" href="css/common-style.css"/>
<link rel="stylesheet" type="text/css" href="css/order.css"/>
</head>
<body>

<c:choose>
	<c:when test="${empty orders}">
		<div class="item-not-issue" style="height: 160px; margin: 2px 5px 3px; padding: 3px 5px; border: 0px solid silver; position: relative; background-color: white; background-image: url('../images/qapp_center_loading.png'); background-position: center center; background-repeat: no-repeat; opacity: 0.6;">
			<p style="width: 100%; margin: 0px 0px; padding: 0px 0px; position: absolute; bottom: 0px; text-align: center;">
				<a style="font-size: 12px; font-family: Arial, 'Microsoft YaHei';" href="issue.jsp">你还没有订单</a>
			</p>
		</div>
	</c:when>
	<c:otherwise>
	<ul class="list-item" style="background-color: silver;">
		<li class="list-item-t-item-default">
			<div style="margin: 5px 0px; background-color: white;">
				<ul class="list-item">
					<li class="list-item-t-item" style="font-family: Arial;"><p>商家</p></li>
					<li class="list-item-t-item-right" style="font-family: Arial;"><p>状态</p></li>
				</ul>
				<ul class="list-item">
					<li class="list-item-t-item-normal order-item" style="line-height: 24px;"><p><a href="../item.shtml">商品</a></p></li>
					<li class="list-item-t-item-normal order-item" style="line-height: 24px; width: 33%;"><p><a href="../item.shtml">商品名称</a></p></li>
					<li class="list-item-t-item-normal order-item" style="line-height: 24px;"><p><a href="../item.shtml">单价/数量</a></p></li>
				</ul>
				<ul class="list-item">
					<li class="list-item-t-item-right" style="font-family: Arial;"><p>共x件商品 实付：&yen;7.78</p></li>
				</ul>
				<ul class="list-item">
					<li class="list-item-t-item-right" style="font-family: Arial;">
						<a href="javascript: void(0);">延长收货</a>
						<a href="javascript: void(0);">查看物流</a>
						<a href="javascript: void(0);">确认收货</a>
					</li>
				</ul>
			</div>
		</li>
		<c:forEach items="${orders}" var="variable">
		<li class="list-item-t-item-default">
			<div style="margin: 5px 0px; background-color: white;">
				<ul class="list-item">
					<li class="list-item-t-item" style="font-family: Arial;">
						<p>
			<c:set value="${userMap[variable.merchandiseId]}" var="user" />
			<c:choose>
				<c:when test="${empty user}">
							${variable.merchandiseId}
				</c:when>
				<c:otherwise>
							${user.username}
				</c:otherwise>
			</c:choose>
						</p>
					</li>
					<li class="list-item-t-item-right" style="font-family: Arial;"><p>${variable.state}</p></li>
				</ul>
				<ul class="list-item">
					<li class="list-item-t-item-normal order-item" style="line-height: 24px;">
						<p>
							<a href="../item/${variable.merchandiseId}.shtml">
			<c:set value="${itemMap[variable.merchandiseId]}" var="item" />
			<c:choose>
				<c:when test="${empty item}">
							<img src="images/logo-caibei-t_64x64.png"/>
				</c:when>
				<c:otherwise>
					<c:choose>
						<c:when test="${empty item.smallImage}">
							<img src="images/logo-caibei-t_64x64.png"/>
						</c:when>
						<c:otherwise>
							<img src="${item.smallImage}"/>
						</c:otherwise>
					</c:choose>
				</c:otherwise>
			</c:choose>
							</a>
						</p>
					</li>
					<li class="list-item-t-item-normal order-item" style="line-height: 24px; width: 50%;">
						<p>
							<a href="../item/${variable.merchandiseId}.shtml">
			<c:set value="${itemMap[variable.merchandiseId]}" var="item" />
			<c:choose>
				<c:when test="${empty item}">
								${variable.no}
				</c:when>
				<c:otherwise>
								${item.title}
				</c:otherwise>
			</c:choose>
							</a>
						</p>
					</li>
					<li class="list-item-t-item-normal order-item" style="line-height: 24px;"><p>${variable.amount}</p></li>
				</ul>
				<ul class="list-item">
					<li class="list-item-t-item-right" style="font-family: Arial;"><p>共${variable.quantity}件商品 实付：&yen;${variable.amount}</p></li>
				</ul>
				<ul class="list-item">
					<li class="list-item-t-item-right" style="font-family: Arial;">
						<a href="javascript: void(0);">延长收货</a>
						<a href="javascript: void(0);">查看物流</a>
						<a href="javascript: void(0);">确认收货</a>
					</li>
				</ul>
			</div>
		</li>
		</c:forEach>
	</ul>
	</c:otherwise>
</c:choose>
</body>
</html>
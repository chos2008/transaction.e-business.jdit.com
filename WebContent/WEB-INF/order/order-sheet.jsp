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
<title>立即接单</title>
<link rel="stylesheet" type="text/css" href="css/common-style.css"/>
<link rel="stylesheet" type="text/css" href="css/order.css"/>
<script type="text/javascript" src="js/zepto/zepto.min.js"></script>
<script type="text/javascript" src="js/order-sheet.js"></script>
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
	<c:set value="0" var="amount" />
	<ul class="list-item" style="background-color: silver;">
		<c:forEach items="${orders}" var="variable">
		<c:set value="${amount + variable.amount}" var="amount" />
		<li class="list-item-t-item-default order-sheet-item">
			<div class="order-sheet-touch" bind-data-id=${variable.merchandiseId} style="margin: 5px 0px; background-color: white;">
				<ul class="list-item">
					<li class="list-item-t-item" style="font-family: Arial;">
						<p>
			<c:set value="${userMap[variable.itemId]}" var="user" />
			<c:choose>
				<c:when test="${empty user}">
							${variable.itemId}
				</c:when>
				<c:otherwise>
							${user.username}
				</c:otherwise>
			</c:choose>
						</p>
					</li>
				</ul>
				<ul class="list-item">
					<li class="list-item-t-item-normal order-item" style="line-height: 24px;">
						<p>
							<a href="../item/${variable.itemId}.shtml">
			<c:set value="${itemMap[variable.itemId]}" var="item" />
			<c:choose>
				<c:when test="${empty item}">
							<img class="order-item-small-image" src="images/logo-caibei-t_64x64.png" orgin-src="images/logo-caibei-t_64x64.png"/>
				</c:when>
				<c:otherwise>
					<c:choose>
						<c:when test="${empty item.smallImage}">
							<img class="order-item-small-image" src="images/logo-caibei-t_64x64.png" orgin-src="images/logo-caibei-t_64x64.png"/>
						</c:when>
						<c:otherwise>
							<img class="order-item-small-image" src="${item.smallImage}" orgin-src="${item.smallImage}"/>
						</c:otherwise>
					</c:choose>
				</c:otherwise>
			</c:choose>
							</a>
						</p>
					</li>
					<li class="list-item-t-item-normal order-item" style="line-height: 24px; width: 50%;">
						<p>
							<a href="../item/${variable.itemId}.shtml">
			<c:set value="${itemMap[variable.itemId]}" var="item" />
			<c:choose>
				<c:when test="${empty item}">
								${variable.amount}
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
				
				
			</div>
			<ul class="list-item list-item-ctl" style="background-color: transparent; display: none;">
				<li class="list-item-t-item-right" style="height: 16px; line-height: 16px; font-family: Arial; text-align: center;">
					<p>
						<a class="list-item-ctl-rm-${variable.id}" href="javascript: deleteOrderSheet(${variable.id}, '.list-item-ctl-rm-${variable.id}');">删除</a>
					</p>
				</li>
			</ul>
		</li>
		</c:forEach>
	</ul>
	
	
	<ul class="list-item" style="height: 60px;">
		<li class="list-item-t-item-normal-right" style="font-family: Arial;">
			<a class="go-trade" href="javascript: void(0);" style="width: 60px; margin: 0px auto; height: 24px; line-height: 24px; display: block; color: #fff; background-color: #ff3c3c; border: 1px solid #BE4646; border-radius: 3px; -webkit-border-radius: 3px; text-align: center; font-size: 0.5rem;">确认交易</a>
		</li>
	
		<li class="list-item-t-item-normal-right" style="font-family: Arial;">
			<p style="height: 26px; line-height: 26px;">共${fn:length(orders)}笔交易 总金额：&yen;${amount}</p>
		</li>
	</ul>
	</c:otherwise>
</c:choose>
</body>
</html>
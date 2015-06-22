<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<title>添加收货地址</title>
<link rel="stylesheet" type="text/css" href="../../css/common-style.css"/>
<link rel="stylesheet" type="text/css" href="../../css/item.css"/>
<link rel="stylesheet" type="text/css" href="../../css/user.css"/>

<script type="text/javascript" src="../../js/zepto/zepto.min.js"></script>
<script type="text/javascript" src="../../js/tips.js"></script>
<script type="text/javascript" src="../../js/account.js"></script>
</head>
<body style="margin: 0px 0px;">

<c:choose>
	<c:when test="${empty addresses}">
		<ul class="list-item" style="height: 60px; border-bottom-width: 0px;">
			<li class="list-item-t-item-normal" style="width: 100%; padding: 14px 0px;">
						<p style="height: 32px; line-height: 20px; padding: 0px 5px;">
							<a href="../../address/add/view.shtml" target="_blank">添加收货地址</a>
						</p>
			</li>
			<li class="list-item-t-item-right" style="padding: 14px 0px; position: absolute; top: 0px; right: 0px;">
				<span class="list-item-t-item-preview-cart-img-go" style="cursor: pointer;"></span>
			</li>
		</ul>
	</c:when>
	<c:otherwise>
		<c:forEach items="${addresses}" var="variable">
			<ul class="list-item" style="height: 60px; border-bottom-width: 0px;">
				<li class="list-item-t-item-normal" style="width: 100%; padding: 14px 0px;">
							<p style="height: 32px; line-height: 20px; padding: 0px 5px;">
								收货人：${variable.username}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${variable.contact}<br>
								收货地址：${variable.address}<c:if test="${not empty variable.postCode}">(${variable.postCode})</c:if>
							</p>
				</li>
				<li class="list-item-t-item-right" style="padding: 14px 0px; position: absolute; top: 0px; right: 0px;">
					<span class="list-item-t-item-preview-cart-img-go" style="cursor: pointer;"></span>
				</li>
			</ul>
		</c:forEach>
		<ul class="list-item" style="height: 60px; border-bottom-width: 0px;">
			<li class="list-item-t-item-normal" style="width: 100%; padding: 14px 0px;">
						<p style="height: 32px; line-height: 20px; padding: 0px 5px;">
							<a href="../../address/add/view.shtml" target="_blank">添加收货地址</a>
						</p>
			</li>
			<li class="list-item-t-item-right" style="padding: 14px 0px; position: absolute; top: 0px; right: 0px;">
				<span class="list-item-t-item-preview-cart-img-go" style="cursor: pointer;"></span>
			</li>
		</ul>
	</c:otherwise>
</c:choose>
<script type="text/javascript" src="../../js/chos/template-engine/TEngine.js" ></script>
<script type="text/javascript" src="../../js/zepto/event.js"></script>
<script type="text/javascript" src="../../js/zepto/fx.js"></script>
</body>
</html>
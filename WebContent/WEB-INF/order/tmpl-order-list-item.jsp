<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
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
			<li class="list-item-t-item-right" style="font-family: Arial;">
				<p>
				<c:choose>
					<c:when test="${variable.state == 0}">
								待付款
					</c:when>
					<c:when test="${variable.state == 1}">
								待确认
					</c:when>
					<c:when test="${variable.state == 2}">
								待收货
					</c:when>
					<c:when test="${variable.state == 11}">
								待发货
					</c:when>
					<c:when test="${variable.state == 22}">
								待评价
					</c:when>
					<c:when test="${variable.state == -1}">
								完成交易
					</c:when>
					<c:otherwise>
								未知
					</c:otherwise>
				</c:choose>
				</p>
			</li>
		</ul>
		<ul class="list-item">
			<li class="list-item-t-item-normal order-item" style="line-height: 24px;">
				<p>
					<a href="../item/${variable.merchandiseId}.shtml">
	<c:set value="${itemMap[variable.merchandiseId]}" var="item" />
	<c:choose>
		<c:when test="${empty item}">
					<img src="../images/logo-caibei-t_64x64.png"/>
		</c:when>
		<c:otherwise>
			<c:choose>
				<c:when test="${empty item.smallImage}">
					<img src="../images/logo-caibei-t_64x64.png"/>
				</c:when>
				<c:otherwise>
					<img src="../${item.smallImage}"/>
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

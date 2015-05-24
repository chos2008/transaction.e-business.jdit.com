<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<ul class="list-item" style="background-color: silver;">
	<c:forEach items="${orders}" var="variable">
	<li class="list-item-t-item-default">
		<div style="margin: 5px 0px; background-color: white;">
			<c:set value="${userMap[variable.id]}" var="merchants" />
			<c:set value="0" var="orderMerchandiseQuantity" />
			<c:forEach items="${merchants}" var="merchant">
			<ul class="list-item">
				<li class="list-item-t-item" style="font-family: Arial;">
					<p>
						<a href="/merchant/${merchant.id}.shtml">${merchant.username}</a>
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
			
			<c:set value="${variable.id}_${merchant.id}" var="itemMapKey" />
			<c:set value="${itemMap[itemMapKey]}" var="items" />
			
			<c:forEach items="${items}" var="item">
			<c:set value="${orderItemMap[item.id]}" var="orderItem" />
			<c:set value="${orderMerchandiseQuantity + orderItem.quantity}" var="orderMerchandiseQuantity" />
			<ul class="list-item">
				<li class="list-item-t-item-normal order-item" style="line-height: 24px;">
					<p>
						<a href="../item/${item.id}.shtml">
							<c:choose>
								<c:when test="${empty item.smallImage}">
									<img src="../images/logo-caibei-t_64x64.png"/>
								</c:when>
								<c:otherwise>
									<img src="../${item.smallImage}"/>
								</c:otherwise>
							</c:choose>
						</a>
					</p>
				</li>
				<li class="list-item-t-item-normal order-item" style="line-height: 24px; width: 50%;">
					<p>
						<a href="../item/${item.id}.shtml">
							${item.title}
						</a>
					</p>
				</li>
				<li class="list-item-t-item-normal order-item" style="line-height: 24px;">
					<p>${item.amount}<br/>x${orderItem.quantity}</p>
				</li>
			</ul>
			</c:forEach>
			</c:forEach>
			<ul class="list-item">
				<li class="list-item-t-item-right" style="font-family: Arial;"><p>共${orderMerchandiseQuantity}件商品 实付：&yen;${variable.amount}</p></li>
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

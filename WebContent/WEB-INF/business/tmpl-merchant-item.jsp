<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<c:forEach items="${categories}" var="variable">
<div class="list-item" style="border: 0px;">
	<ul class="list-item-t">
		<li class="list-item-t-item" style="border-bottom-style: solid !important; border-bottom-color: silver !important; border-bottom-width: 1px !important;">
			<p><a href="#">${variable.name}</a></p>
		</li>
		<li class="list-item-t-item-right list-item-t-item-img"></li>
	</ul>
</div>
</c:forEach>

<c:set value="0" var="i" />
<c:forEach items="${products}" var="variable">
	<c:choose>
		<c:when test="${i % 2 == 0}">
			<div class="list-item" style="border: 0px;">
				<ul class="list-item-t-default">
					<li class="list-item-t-item-default" style="width: 250px; border-bottom-style: solid !important; border-bottom-color: silver !important; border-bottom-width: 1px !important;">
						<div style="width: 100%;">
							<img alt="" src="../images/${variable.smallImage}" style="width: 100%; max-width: 100%; min-height: 450px; max-height: 100%; border: 0px solid green;"/>
						</div>
						<p style="height: 32px; overflow: hidden;">
							<a href="#">${variable.name}</a> ${variable.price}  ${variable.stock}
						</p>
					</li>
		</c:when>
		
		<c:when test="${i % 2 == 1}">
					<li class="list-item-t-item-default" style="width: 250px; border-bottom-style: solid !important; border-bottom-color: silver !important; border-bottom-width: 1px !important;">
						<div style="width: 100%;">
							<img alt="" src="../images/${variable.smallImage}" style="width: 100%; max-width: 100%; min-height: 450px; max-height: 100%; border: 0px solid green;"/>
						</div>
						<p style="height: 32px; overflow: hidden;">
							<a href="#">${variable.name}</a> ${variable.price}  ${variable.stock}
						</p>
					</li>
				</ul>
			</div>
		</c:when>
		<c:otherwise>
					<li class="list-item-t-item-default" style="width: 250px; border-bottom-style: solid !important; border-bottom-color: silver !important; border-bottom-width: 1px !important;">
						<div style="width: 100%;">
							<img alt="" src="../images/${variable.smallImage}" style="width: 100%; max-width: 100%; max-height: 100%; border: 0px solid green;"/>
						</div>
						<p style="height: 32px; overflow: hidden;">
							<a href="#">${variable.name}</a> ${variable.price}  ${variable.stock}
						</p>
					</li>
		</c:otherwise>
	</c:choose>
	<c:set value="${i+1}" var="i" />
</c:forEach>

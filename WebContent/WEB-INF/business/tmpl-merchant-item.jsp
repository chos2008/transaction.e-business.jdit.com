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

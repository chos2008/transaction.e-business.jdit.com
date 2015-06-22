<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<%@ taglib prefix="fmt" uri="/WEB-INF/fmt.tld"%>
<c:forEach items="${requirements}" var="variable">
<li style="position: relative;" class="list-item-li" bind-data-id=${variable.id}>
	<div style="margin: 2px 3px 5px 3px; border-top: 0px solid silver; border-bottom: 0px solid silver;">
		<span style="width: 100%; display: inline-block;"><span style="width: 16px; height: 16px; margin: 12px 0px; float: left; display: block; background: url('images/logo-caibei-t_16x16.png'); background-size: 16px 16px; background-position: center; background-repeat: no-repeat;"></span><a href="item/${variable.id}.shtml">${variable.title}</a></span>
		<span style="width: 100%; display: inline-block;">金额：&yen;${variable.amount}</span>
		<div style="width: 100%; line-height: 20px; text-align: left; font-size: 10px">
			${variable.content}
		</div>
		<c:if test="${variable.creation != null}">
		<span style="width: 100%; display: inline-block; font-size: 10px; margin: 15px 0px 5px 0px; padding: 0px 0px 0px 0px; height: 10px; line-height: 10px;">发布时间：
			<fmt:formatDate value="${variable.creation}" pattern="yyyy-MM-dd  HH:mm:ss" />
		</span>
		</c:if>
	</div>
	<c:import url="tmpl-item-toolbox.jsp">
		<c:param name="category" value="2" />
		<c:param name="itemId" value="${variable.id}" />
	</c:import>
</li>
</c:forEach>
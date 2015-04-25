<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<%@ taglib prefix="fmt" uri="/WEB-INF/fmt.tld"%>
<c:forEach items="${requirements}" var="variable">
<li>
	<div style="margin: 2px 3px 5px 3px; border-top: 0px solid silver; border-bottom: 0px solid silver;">
		<span style="width: 100%; display: inline-block;"><a href="item/${variable.id}.shtml">${variable.title}</a></span>
		<span style="width: 100%; display: inline-block;">招标项目金额：${variable.amount}元</span>
		<div style="width: 100%; line-height: 20px; text-align: left; font-size: 10px">
			${variable.content}
		</div>
		<span style="width: 100%; display: inline-block;">招标时间：
			<c:choose>
				<c:when test="${variable.startTime != null}">
					<fmt:formatDate value="${variable.startTime}" pattern="yyyy-MM-dd  HH:mm:ss" />
				</c:when>
				
				<c:otherwise>
					未公布
				</c:otherwise>
			</c:choose>
		</span>
	</div>
</li>
</c:forEach>
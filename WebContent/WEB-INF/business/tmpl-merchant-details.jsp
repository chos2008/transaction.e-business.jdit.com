<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<c:forEach items="${document}" var="variable">
	<p>
		<c:choose>
			<c:when test="${variable.partType == 1}">
				<img src="../${variable.partContent}" style="position: relative; margin: 0px auto; display: block; width: 100%; max-width: 100%;"/>
			</c:when>
			<c:otherwise>
				${variable.partContent}
			</c:otherwise>
		</c:choose>
	</p>
</c:forEach>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<%@ taglib prefix="fmt" uri="/WEB-INF/fmt.tld"%>

<c:forEach items="${bids}" var="variable">
<li class="item" style=""><a href="/bid/${variable.id}.shtml">${variable.projectName}</a></li>
</c:forEach>
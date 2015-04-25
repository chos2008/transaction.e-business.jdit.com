<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<%@ taglib prefix="fmt" uri="/WEB-INF/fmt.tld"%>
<c:forEach items="${bids}" var="variable">
<li>
	<div style="margin: 2px 3px 5px 3px; border-top: 0px solid silver; border-bottom: 0px solid silver;">
		<div style="width: 100%; display: inline-block; margin-top: 0px; margin-bottom: 0px; padding-top: 0px; padding-bottom: 0px;">
			<ul class="list-item" style="border-bottom: 0px solid silver;  overflow-wrap: break-word; height: 32px; overflow: hidden;">
				<li class="list-item-t-item" style="border-bottom: 0px solid #ccc; padding: 0px 0px; font-family: Arial;">
					<a href="../bid/${variable.id}.shtml">${variable.projectName}</a>
				</li>
				<li class="list-item-t-item-right" style="border-bottom: 0px solid #ccc; padding: 0px 0px; font-family: Arial;">标&nbsp;${variable.no}</li>
			</ul>
		</div>
		<span style="width: 100%; display: inline-block;">招标项目金额：${variable.amount}元</span>
		<div style="width: 100%; line-height: 24px; font-size: 10px">
			${variable.projectBidContent}
		</div>
		<span style="width: 100%; display: inline-block;">招标时间：
			<fmt:formatDate value="${variable.creation}" pattern="yyyy年MM月dd日  HH时mm分ss秒" />
		</span>
	</div>
</li>
</c:forEach>
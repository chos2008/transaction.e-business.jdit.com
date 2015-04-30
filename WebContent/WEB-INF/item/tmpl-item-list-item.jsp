<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<%@ taglib prefix="fmt" uri="/WEB-INF/fmt.tld"%>
<c:forEach items="${requirements}" var="variable">
<li style="position: relative;">
	<div style="margin: 2px 3px 5px 3px; border-top: 0px solid silver; border-bottom: 0px solid silver;">
		<span style="width: 100%; display: inline-block;"><a href="item/${variable.id}.shtml">${variable.title}</a></span>
		<span style="width: 100%; display: inline-block;">招标项目金额：${variable.amount}元</span>
		<div style="width: 100%; line-height: 20px; text-align: left; font-size: 10px">
			${variable.content}
		</div>
		<span style="width: 100%; display: inline-block;">招标时间：
			
			<fmt:formatDate value="${variable.creation}" pattern="yyyy-MM-dd HH:mm:ss" />
		</span>
	</div>
	<div style="width: 120px; margin: 0px 0px; padding: 0px 0px; position: absolute; right: 0px; top: -1px; bottom: 0px; vertical-align: middle; color: blue; background-color: #ccc; display: inline-block;">
		<div style="position: relative; text-align: center; height: 100%; display: -moz-box; display: -webkit-box; display: box; box-orient: vertical; -moz-box-orient: vertical; -webkit-box-orient: vertical;">
			<div style="box-flex: 1; -moz-box-flex: 1; -webkit-box-flex: 1; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;">
			
			</div>
			<div style="height: 24px; line-height: 24px; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;">
			<a href="#">转标</a>&nbsp;&nbsp;<a href="#">编辑</a>
			</div>
			<div style="box-flex: 1; -moz-box-flex: 1; -webkit-box-flex: 1; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;">
			
			</div>
		</div>
	</div>
</li>
</c:forEach>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<%@ taglib prefix="fmt" uri="/WEB-INF/fmt.tld"%>
<div class="item-toolbox" style="width: 160px; margin: 0px 0px; padding: 0px 0px; position: absolute; right: 0px; top: -1px; bottom: 0px; vertical-align: middle; color: blue; background-color: #ccc; display: none;">
	<div style="position: relative; text-align: center; height: 100%; display: -moz-box; display: -webkit-box; display: box; box-orient: vertical; -moz-box-orient: vertical; -webkit-box-orient: vertical;">
		<div style="box-flex: 1; -moz-box-flex: 1; -webkit-box-flex: 1; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;">
		
		</div>
		<div style="height: 24px; line-height: 24px; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;">
			<c:choose>
				<c:when test="${param.category == 0}">
					<a href="/item/edit/view.shtml?item_id=${param.item_id}" target="_blank">编辑</a>
					<a href="/item/item/add/view.shtml?item_id=${param.item_id}" target="_blank">添加商品</a>
					<a href="javascript: void(0);" onclick="javascript: tobid(${param.item_id});">转标</a>&nbsp;&nbsp;
				</c:when>
				<c:when test="${param.category == 1}">
					<a href="#">编辑</a>
				</c:when>
				<c:when test="${param.category == 2}">
					<a href="javascript: void(0);" class="d_cart" bind-data="${param.itemId}">接单</a>
					<a href="/item/share.shtml?item_id=${param.itemId}" target="_blank">分享</a>
				</c:when>
				<c:when test="${param.category == 3}">
					<a href="javascript: void(0);" onclick="javascript: cart(${param.itemId})">竞标</a>
				</c:when>
				<c:otherwise>
					
				</c:otherwise>
			</c:choose>
		</div>
		<div style="box-flex: 1; -moz-box-flex: 1; -webkit-box-flex: 1; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;">
		
		</div>
	</div>
</div>
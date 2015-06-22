<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<ul class="list-item" style="height: 72px;">
	<li class="list-item-t-item-normal order-item" style="line-height: 24px;">
		<p>
			<a href="../item/${item.id}.shtml">
				<img class="order-item-small-image" src="http://localhost/images/${item.image}" orgin-src="http://localhost/images/${item.image}" style="width: 72px; height: 72px; display: block;"/>
			</a>
		</p>
	</li>
	<li class="list-item-t-item-normal order-item" style="line-height: 24px; width: 50%;">
		<p style="word-break: break-all;">
			<a href="../item/${item.id}.shtml">
				${item.name}
			</a>
		</p>
	</li>
	<li class="list-item-t-item-normal order-item" style="line-height: 24px;"><p>${item.price}</p></li>
</ul>
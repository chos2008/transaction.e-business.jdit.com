<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="data-spm" content="a222m"/>
<meta name="aplus-terminal" content="1">
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>为${item.title}添加商品</title>
<link rel="stylesheet" type="text/css" href="../../../css/common-style.css"/>
<link rel="stylesheet" type="text/css" href="../../../css/s-item.css"/>
<link rel="stylesheet" type="text/css" href="../../../css/add-item.css"/>

<script type="text/javascript" src="../../../js/zepto/zepto.min.js"></script>
<script type="text/javascript" src="../../../js/tips.js"></script>
<script type="text/javascript" src="../../../js/s-item.js"></script>
<script type="text/javascript" src="../../../js/item.js"></script>
<script type="text/javascript" src="../../../js/add-item.js"></script>
</head>
<body style="margin: 0px 0px; padding: 0px 0px;">
<div style="width: 100%; ">

	<c:choose>
		<c:when test="${empty item}">
	<div style="width: 100%; height: 120px; background-color: silver; background: url('../../../images/logo-caibei-t.png'); background-position: center center; background-repeat: no-repeat; background-size: 100% 100%;">
		
	</div>
		</c:when>
		<c:otherwise>
			<c:choose>
				<c:when test="${empty item.largeImage}">
	<div style="width: 100%; height: 120px; background-color: silver; background: url('../../../images/logo-caibei-t.png'); background-position: center center; background-repeat: no-repeat; background-size: 100% 100%;">
		
	</div>
				</c:when>
				<c:otherwise>
	<div style="width: 100%; height: 120px; background-color: silver; background: url('../../../${item.smallImage}'); background-position: center center; background-repeat: no-repeat; background-size: 100% 100%;">
		
	</div>
				</c:otherwise>
			</c:choose>
		</c:otherwise>
	</c:choose>
	
	<div style="width: 100%; border-top-color: silver; border-top-style: solid; border-top-width: 1px;">
		
	</div>
	
	<section id="s-price">
		<div class="item price-bar">
			<b class="ui-yen">￥${item.amount}</b>
		</div>
		<!-- 
		<div class="item">
			<em class="tag ">最后一天</em>
		</div>
		<div class="item">
			<del class="ui-label">一口价</del>
			<del class="price-origin">￥159.00</del>
		</div>
		 -->
	</section>
	
	<section id="s-title">
	    <div class="main">
	        <h1>${item.title}</h1>
	        <a class="fav j-mdv" href="../../../item/${item.id}.shtml" target="_blank">预览</a>
	    </div>
	    <div class="product-sellpoint"></div>
	</section>

	<ul class="list-item" style="border-bottom-width: 0px;">
		<li class="list-item-t-item-normal" style="">
			<c:import url="../business/tmpl-item-add.jsp">
				<c:param name="storeId" value="${item.id}" />
			</c:import>
		</li>
		<li class="list-item-t-item-normal add-item" style="width: 100%; padding: 14px 0px; cursor: pointer; background: url('../../../images/gwf_50x50.png'); background-position: 0px; background-repeat: no-repeat;">
			<p style="height: 32px; line-height: 32px; padding: 0px 50px;">添加商品</p>
		</li>
		<li class="list-item-t-item-right" style="padding: 14px 0px; position: absolute; top: 0px; right: 0px;">
			<span class="list-item-t-item-preview-cart-img-go address-mgr" style="cursor: pointer;"></span>
		</li>
	</ul>
	
	<div class="s-item-list">
	<!-- 
	<ul class="list-item" style="height: 72px;">
		<li class="list-item-t-item-normal order-item" style="line-height: 24px;">
			<p>
				<a href="../item/aaa.shtml">
					<img class="order-item-small-image" src="http://localhost/images/logo-caibei-t_64x64.png" orgin-src="http://localhost/images/logo-caibei-t_64x64.png"/>
				</a>
			</p>
		</li>
		<li class="list-item-t-item-normal order-item" style="line-height: 24px; width: 50%;">
			<p style="word-break: break-all;">
				<a href="../item/aaaa.shtml">
					aaaa
				</a>
			</p>
		</li>
		<li class="list-item-t-item-normal order-item" style="line-height: 24px;"><p>1234</p></li>
	</ul>
	 -->
	</div>
</div>
<script type="text/javascript" src="../../../js/chos/template-engine/TEngine.js" ></script>
<script type="text/javascript" src="../../../js/zepto/event.js"></script>
<script type="text/javascript" src="../../../js/zepto/fx.js"></script>
<script type="text/javascript" src="../../../js/zepto-extends.js"></script>
</body>
</html>
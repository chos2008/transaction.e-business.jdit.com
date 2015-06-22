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
<title>${item.title}</title>
<link rel="stylesheet" type="text/css" href="../css/common-style.css"/>
<link rel="stylesheet" type="text/css" href="../css/s-item.css"/>

<script type="text/javascript" src="../js/zepto/zepto.min.js"></script>
<script type="text/javascript" src="../js/tips.js"></script>
<script type="text/javascript" src="../js/s-item.js"></script>
<script type="text/javascript" src="../js/item.js"></script>
</head>
<body style="margin: 0px 0px; padding: 0px 0px;">
<div style="width: 100%; ">

	<c:choose>
		<c:when test="${empty item}">
	<div style="width: 100%; height: 120px; background-color: silver; background: url('../images/logo-caibei-t.png'); background-position: center center; background-repeat: no-repeat; background-size: 100% 100%;">
		
	</div>
		</c:when>
		<c:otherwise>
			<c:choose>
				<c:when test="${empty item.largeImage}">
	<div style="width: 100%; height: 120px; background-color: silver; background: url('../images/logo-caibei-t.png'); background-position: center center; background-repeat: no-repeat; background-size: 100% 100%;">
		
	</div>
				</c:when>
				<c:otherwise>
	<div style="width: 100%; height: 120px; background-color: silver; background: url('../${item.smallImage}'); background-position: center center; background-repeat: no-repeat; background-size: 100% 100%;">
		
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
	        <a class="fav j-mdv" href="#">收藏</a>
	    </div>
	    <div class="product-sellpoint"></div>
	</section>

	<div style="font-size: 14px; font-family: Arial, 'Microsoft YaHei';">
	<c:forEach items="${details}" var="variable">
		<p>
			<c:choose>
				<c:when test="${variable.partType == 1}">
					<img src="${variable.partContent}" style="position: relative; margin: 0px auto; display: block; width: 100%; max-width: 100%;"/>
				</c:when>
				<c:otherwise>
					${variable.partContent}
				</c:otherwise>
			</c:choose>
		</p>
	</c:forEach>
		
	</div>

</div>

<div id="nav" class="nav-bar" style="position: absolute; bottom: 0px;">
	<div class="nav-bar-box">
		<div class="nav-bar-box-item" style="font-size: 12px; font-family: Arial, 'Microsoft YaHei';">
			<label style="width: 100%; display: block; color: white;">金额：${item.amount}</label>
		</div>
		<div class="nav-bar-box-item nav-bar-box-center-item" style="font-size: 12px; font-family: Arial, 'Microsoft YaHei';">
			<a href="investment.jsp"></a>
		</div>
		<div class="nav-bar-box-item nav-bar-box-end-item" style="font-size: 12px; font-family: Arial, 'Microsoft YaHei';">
			<p style="height: 36px; line-height: 36px; margin: 0px 0px; text-align: right;">
				<label style="  position: relative; top: 8px; display: inline-block;">
				<a href="/item/share.shtml?item_id=${item.id}" style="width: 20px; height: 20px; display: block; background-repeat: no-repeat; background-image: url('../images/share_icon_mini.png');"></a>
				</label>
				<label style="display: inline-block;">
					<a href="javascript: void(0);" class="d_cart" bind-data="${item.id}" style="color: white; -webkit-user-select: none; -webkit-tap-highlight-color: rgba(0,0,0,0);">(<i class="order-sheet-stats">0</i>)立即接单</a>
				</label>
				<label style="display: inline-block;">
					<a href="../cart.shtml?item=${item.id}" style="color: white;">直接交易</a>
				</label>
			</p>
		</div>
	</div>
</div>
<script type="text/javascript" src="../js/chos/template-engine/TEngine.js" ></script>
</body>
</html>
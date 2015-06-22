<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<%@ taglib prefix="fmt" uri="/WEB-INF/fmt.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<title>谁是谁的菜</title>
<link rel="stylesheet" type="text/css" href="css/common-style.css"/>
<link rel="stylesheet" type="text/css" href="css/index.css"/>
<link rel="stylesheet" type="text/css" href="css/cart.css"/>

<script type="text/javascript" src="js/zepto/zepto.min.js"></script>
<script type="text/javascript" src="js/tips.js"></script>

<script type="text/javascript" src="js/iscroll/iscroll-4.2.5.js"></script>
<script type="text/javascript" src="js/s-item.js"></script>
<script type="text/javascript" src="js/index.js"></script>
<script type="text/javascript" src="js/list-item.js"></script>
</head>
<!-- 
<body style="padding: 0; min-width: 300px; max-width: 640px; margin: 0 auto;">
 -->
<body>
<div id="header" style="position: relative;">
	<div id="nav" class="nav-bar">
		<div class="nav-bar-box">
			<div class="nav-bar-box-item" style="width: 300px;">
				<p id="nav-back" style="width: 90px; height: 36px; line-height: 36px; margin: 0px 0px; text-align: left;">
					<!-- 
					<label title="paypal" class="icon-paypal" style="width: 100%; display: block;"></label>
					<label style="width: 100%; display: block;"><a href="/mindex.htm" style=" color: #ffffff;">我的帐户</a></label>
					 -->
					<a href="/mindex.htm" style="width: 30px; height: 30px; margin: 0px 0px 0px 4px; position: relative; top: 5px; -webkit-user-select: none; -webkit-tap-highlight-color: rgba(0,0,0,0); display: inline-block; border-radius: 15px 15px 15px 15px; background: url('images/m_logo_j_40x40.jpg'); background-position: center center; background-repeat: no-repeat; background-size: 100% 100%;"></a>
				</p>
			</div>
			<div class="nav-bar-box-item nav-bar-box-center-item" style="">
				<div style="height: 24px; line-height: 24px; position: relative; margin: 7px auto; border: 1px solid silver; border-radius: 5px 5px 5px 5px;">
					<ul class="list-item-default list-item-toolbar-box">
						<li class="list-item-t-item-normal item-normal item-selected" style="font-size: 12px; padding: 0px 3px;">
							<a style="-webkit-user-select: none; -webkit-tap-highlight-color: rgba(0,0,0,0);">需求</a>
						</li>
						<li class="list-item-t-item-normal" style="font-size: 12px; padding: 0px 3px;">
							<a href="investment.jsp" style="-webkit-user-select: none; -webkit-tap-highlight-color: rgba(0,0,0,0);">发布需求</a>
						</li>
						<li class="list-item-t-item-normal item-bid" style="font-size: 12px; padding: 0px 3px;">
							<a style="-webkit-user-select: none; -webkit-tap-highlight-color: rgba(0,0,0,0);">标书</a>
						</li>
					</ul>
				</div>
			</div>
			<div class="nav-bar-box-item nav-bar-box-end-item" style="width: 300px;">
				<p style="height: 36px; line-height: 36px; margin: 0px 0px; text-align: right;">
					<!-- 
					<label title="google wallet" class="icon-google-wallet" style="width: 100%; display: block;"></label>
					<label style="width: 100%; display: block;"><a id="order-sheet" style="color: #ffffff;">接单</a></label>
					 -->
					<a id="order-sheet" style="width: 30px; height: 30px; margin: 0px 4px 0px 0px; position: relative; top: 5px; -webkit-user-select: none; -webkit-tap-highlight-color: rgba(0,0,0,0); color: #ffffff; display: inline-block; border-radius: 2px 2px 2px 2px; background: url('images/ied.png'); background-position: center center; background-repeat: no-repeat; background-size: 100% 100%;"></a>
				</p>
			</div>
		</div>
		
		<div class="nav-bar-box nav-bar-box-cart-and-ordersheet" style="height: 240px; display: none;">
			<div class="nav-bar-box-item nav-bar-box-center-item" style="">
				<div style="height: 120px; line-height: 120px; position: relative; margin: 0px auto;">
					<ul class="list-item-default">
						<li class="list-item-t-item-normal" style="width: 120px; font-size: 12px; padding: 0px 3px; background: url('images/guide_cart_on.png'); background-position: center center; background-repeat: no-repeat;">
							<a href="javascript: void(0);">购物车</a>
						</li>
						<li class="list-item-t-item-normal" style="width: 120px;font-size: 12px; padding: 0px 3px; background: url('images/guide_discover_on.png'); background-position: center center; background-repeat: no-repeat;">
							<a href="/order-sheet.shtml">单子<i class="order-sheet-stats">0</i></a>
						</li>
					</ul>
				
				
					<div class="nav-bar-box" style="padding: 4px 0px;">
						<div style="width: 70px; text-align: center;">
							<div style="height: 80px; border: 0px solid silver;">
								<label title="stripe" class="icon-cc-stripe" style="height: 60px; width: 60px;  margin: 0px auto; line-height: 60px; display: block; background: url('../images/aa1_60x60.png'); background-size: 60px 60px; background-position: center; background-repeat: no-repeat;"></label>
								<label style="height: 14px; line-height: 14px; width: 100%; margin: 4px 0px; display: block; font-size: 12px;"><a href="../investment/splash.jsp">阿拉贷</a></label>
							</div>
						</div>
					</div>
				</div>
				
			</div>
		</div>
		
	</div>
</div>
<div id="wrapper">
	<div id="scroller">
		<div id="pullDown">
			<span class="pullDownIcon"></span><span class="pullDownLabel">向下拖动刷新...</span>
		</div>
		
		<div>
			<div style="height: 160px; width: 100%; background-image: url('images/merchants_749x240.jpg'); background-repeat: no-repeat; background-size: 100% 100%;">
			</div>
			<div class="menu-box" style="padding: 4px 0px; background-color: white;">
				<!--  -moz-box-flex:3; -webkit-box-flex:3; box-flex:3; -->
				<div style="width: 70px; text-align: center;">
					<div style="height: 80px; border: 0px solid silver;">
						<label title="stripe" class="icon-cc-stripe" style="height: 60px; width: 60px;  margin: 0px auto; line-height: 60px; border-radius: 3px 3px; display: block; background: url('../images/a_60x60.png'); background-size: 60px 60px; background-position: center; background-repeat: no-repeat;"></label>
						<label style="width: 100%; margin: 4px 0px; display: block;"><a href="../investment.jsp">发布需求</a></label>
					</div>
				</div>
				<!--  -->
				<div style="width: 70px; text-align: center;">
					<div style="height: 80px; border: 0px solid silver;">
						<label title="stripe" class="icon-cc-stripe" style="height: 60px; width: 60px;  margin: 0px auto; line-height: 60px; display: block; background: url('../images/aa1_60x60.png'); background-size: 60px 60px; background-position: center; background-repeat: no-repeat;"></label>
						<label style="width: 100%; margin: 4px 0px; display: block;"><a href="../investment/splash.jsp">项目</a></label>
					</div>
				</div>
				<div style="width: 70px; text-align: center;">
					<div style="height: 80px; border: 0px solid silver;">
						<label title="stripe" class="icon-cc-stripe" style="height: 60px; width: 60px;  margin: 0px auto; line-height: 60px; display: block; background: url('../images/aa1_60x60.png'); background-size: 60px 60px; background-position: center; background-repeat: no-repeat;"></label>
						<label style="width: 100%; margin: 4px 0px; display: block;"><a href="../tag/123456789.shtml">天使入驻</a></label>
					</div>
				</div>
				<div style="width: 70px; text-align: center;">
					<div style="height: 80px; border: 0px solid silver;">
						<label title="paypal" class="icon-paypal" style="height: 60px; width: 60px;  margin: 0px auto; line-height: 60px; border-radius: 3px 3px; display: block; background: url('../images/c_60x60.png'); background-size: 60px 60px; background-position: center; background-repeat: no-repeat;"></label>
						<label style="width: 100%; margin: 4px 0px; display: block;"><a href="../bid/list.shtml">附近</a></label>
					</div>
				</div>
				
			</div>
			<ul id="thelist" style="display: block;">
			<c:import url="tmpl-index-list-item.jsp">
					
			</c:import>
			</ul>
		</div>
		
		<div id="pullUp">
			<span class="pullUpIcon"></span><span class="pullUpLabel">向上拉动刷新...</span>
		</div>
	</div>
</div>
<div class="quicktocart">
				
</div>
<!-- 
<div id="footer"></div>
 -->

<script type="text/javascript" src="js/chos/template-engine/TEngine.js" ></script>
<script type="text/javascript" src="js/zepto/event.js"></script>
<script type="text/javascript" src="js/zepto/fx.js"></script>
<script type="text/javascript" src="js/zepto-extends.js"></script>
</body>
</html>
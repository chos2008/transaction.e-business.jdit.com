<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<title>完善信息，很快成为${category.name}</title>
<link rel="stylesheet" type="text/css" href="../css/common-style.css"/>
<link rel="stylesheet" type="text/css" href="../css/item.css"/>

<style type="text/css">
.list-item-t-item-tag-img {
	width: 90px; height: 90px;
	background-image: url("../images/gqa.png");
  	background-repeat: no-repeat;
  	background-position: center center;
}
</style>
<script type="text/javascript" src="../js/zepto/zepto.min.js"></script>
<script type="text/javascript" src="../js/zepto/event.js"></script>
<script type="text/javascript" src="../js/zepto/fx.js"></script>
<script type="text/javascript">
window.onload = function() {
	$(".list-item-tag").on("click", function() {
		var list = $(".list-item");
		for (var i = 0; i < list.length; i++) {
			var item = $(list[i]);
			$(".list-item-t-item-right", item).removeClass("list-item-t-item-tag-img");
		}
		
		$(".list-item-t-item-right", this).addClass("list-item-t-item-tag-img");
	});
};
</script>

</head>
<body style="margin: 0px 0px;">
<div id="nav" class="nav-bar" style="position: relative; background-color: transparent;">
	<div class="nav-bar-box">
		<div class="nav-bar-box-item" style="width: 300px;">
			
		</div>
		<div class="nav-bar-box-item nav-bar-box-center-item" style="">
			<div style="width: 100%;" onclick="location.href='/merchant.shtml';">
				<div style="">
				<c:choose>
					<c:when test="${empty user}">
					<div style="width: 40px; height: 40px; margin: 0px auto; border-radius: 20px 20px 20px 20px; background: url('../images/m_logo_j_40x40.jpg'); background-position: center center; background-repeat: no-repeat; background-size: 100% 100%;"></div>
					<p style="margin: 0px 0px; padding: 0px 0px; text-align: center;"></p>
					</c:when>
					
					<c:otherwise>
						<c:choose>
							<c:when test="${empty user.head}">
					<div style="width: 40px; height: 40px; margin: 0px auto; border-radius: 20px 20px 20px 20px; background: url('../images/m_logo_j_40x40.jpg'); background-position: center center; background-repeat: no-repeat; background-size: 100% 100%;"></div>
							</c:when>
							
							<c:otherwise>
					<div style="width: 40px; height: 40px; margin: 0px auto; border-radius: 20px 20px 20px 20px; background: url('../${user.head}'); background-position: center center; background-repeat: no-repeat; background-size: 100% 100%;"></div>
							</c:otherwise>
						</c:choose>
						
						<c:choose>
							<c:when test="${empty user.username}">
					<p style="margin: 0px 0px; padding: 0px 0px; text-align: center;"></p>
							</c:when>
							
							<c:otherwise>
					<p style="margin: 0px 0px; padding: 0px 0px; text-align: center;">${user.username}</p>
							</c:otherwise>
						</c:choose>
					</c:otherwise>
				</c:choose>
				</div>
			</div>
		</div>
		<div class="nav-bar-box-item nav-bar-box-end-item" style="width: 300px;">
			<a title="完成" style="width: 30px; height: 30px; margin: 0px 4px 0px 0px; position: relative; top: 5px; color: #ffffff; display: inline-block; border-radius: 2px 2px 2px 2px; background: url('../images/ied.png'); background-position: center center; background-repeat: no-repeat; background-size: 100% 100%;"></a>
		</div>
	</div>
</div>
	
	


<div style="position: relative; margin: 2px 5px 3px 20px; border: 0px solid silver;">
	<span style="width: 100%; display: block; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; color: initial;  -webkit-appearance: textfield;-webkit-appearance: textfield; padding: 1px; background-color: white; border: 0px inset; border-image-source: initial; border-image-slice: initial; border-image-width: initial; border-image-outset: initial; border-image-repeat: initial; -webkit-rtl-ordering: logical; -webkit-user-select: text; cursor: auto; color: darkgrey;">我的名片</span>
	<span style="width: 72px; height: 72px; display: block; background: url('../../images/rate_cross_480.png'); background-position: center center; background-repeat: no-repeat; background-size: 100% 100%;"></span>
	
</div>
		


<c:forEach items="${category.proximity}" var="variable">

<div class="list-item list-item-tag" style="margin: 2px 5px 3px 20px; width: auto; display: block; border: 0px solid silver;">
	<ul class="list-item list-item-t" style="height: 90px; line-height: 90px; position: relative; border: 0px solid silver;">
		<li class="list-item-t-item" style="height: 90px; line-height: 90px;"><p><a>${variable.name}</a></p></li>
		<li class="list-item-t-item-right" style=""></li>
	</ul>
</div>

</c:forEach>


	
</body>
</html>
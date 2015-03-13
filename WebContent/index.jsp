<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0" />
<meta name="apple-mobile-web-app-capable" content="yes" />

<title>谁是谁的菜</title>
<script type="text/javascript" src="js/iscroll/iscroll.js"></script>

<script type="text/javascript">

var myScroll;

function loaded () {
	myScroll = new IScroll('#wrapper', {
		scrollbars: true,
		mouseWheel: true,
		interactiveScrollbars: true,
		shrinkScrollbars: 'scale',
		fadeScrollbars: true
	});
}

document.addEventListener('touchmove', function (e) { e.preventDefault(); }, false);

</script>

<style type="text/css">
* {
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
}

html {
	-ms-touch-action: none;
}

body,ul,li {
	padding: 0;
	margin: 0;
	border: 0;
}

body {
	font-size: 12px;
	font-family: ubuntu, helvetica, arial;
	overflow: hidden; /* this is important to prevent the whole page to bounce */
}

#header {
	position: absolute;
	z-index: 2;
	top: 0;
	left: 0;
	width: 100%;
	height: 45px;
	line-height: 45px;
	background: #CD235C;
	padding: 0;
	color: #eee;
	font-size: 20px;
	text-align: center;
	font-weight: bold;
}

#footer {
	position: absolute;
	z-index: 2;
	bottom: 0;
	left: 0;
	width: 100%;
	height: 48px;
	background: #444;
	padding: 0;
	border-top: 1px solid #444;
}

#wrapper {
	position: absolute;
	z-index: 1;
	top: 45px;
	/*bottom: 48px;*/
	bottom: 0px;
	left: 0;
	width: 100%;
	background: #ccc;
	overflow: hidden;
}

#scroller {
	position: absolute;
	z-index: 1;
	-webkit-tap-highlight-color: rgba(0,0,0,0);
	width: 100%;
	-webkit-transform: translateZ(0);
	-moz-transform: translateZ(0);
	-ms-transform: translateZ(0);
	-o-transform: translateZ(0);
	transform: translateZ(0);
	-webkit-touch-callout: none;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
	-webkit-text-size-adjust: none;
	-moz-text-size-adjust: none;
	-ms-text-size-adjust: none;
	-o-text-size-adjust: none;
	text-size-adjust: none;
}

#scroller ul {
	list-style: none;
	padding: 0;
	margin: 0;
	width: 100%;
	text-align: left;
}

#scroller li {
	padding: 0 10px;
	/*height: 40px;*/
	line-height: 40px;
	border-bottom: 1px solid #ccc;
	border-top: 1px solid #fff;
	background-color: #fafafa;
	font-size: 14px;
}

</style>

</head>
<body onload="loaded()">
<div id="header"><a href="investment.jsp">发布需求</a></div>

<div id="wrapper">
	<div id="scroller">
		<ul>
			<c:forEach items="${requirements}" var="variable">
			<li>
				<div style="margin: 2px 3px 5px 3px; border-top: 0px solid silver; border-bottom: 0px solid silver;">
					<span style="width: 100%; display: inline-block;"><a href="">${variable.title}-标号${variable.id}</a></span>
					<span style="width: 100%; display: inline-block;">招标项目金额：${variable.amount}元</span>
					<div style="width: 100%; line-height: 20px; text-align: left; font-size: 10px">
						${variable.content}
					</div>
					<span style="width: 100%; display: inline-block;">招标时间：${variable.startTime}</span>
				</div>
			</li>
			</c:forEach>
		</ul>
	</div>
</div>
<!-- 
<div id="footer"></div>
 -->
</body>
</html>
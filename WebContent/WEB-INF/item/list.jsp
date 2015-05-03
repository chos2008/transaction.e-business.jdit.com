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
<title>我发布的需求</title>
<link rel="stylesheet" type="text/css" href="css/common-style.css"/>
<script type="text/javascript" src="js/zepto/zepto.min.js"></script>
<script type="text/javascript" src="js/iscroll/iscroll-4.2.5.js"></script>
<script type="text/javascript" src="js/item.js"></script>
<script type="text/javascript" src="js/list-item.js"></script>

<script type="text/javascript">
function dataformat(ms) {
	var date = new Date(ms);
	var y = date.getFullYear();
	var M = date.getMonth() + 1;
	M = M > 9 ? M : '0' + M;
	
	var d = date.getDate();
	d = d > 9 ? d : '0' + d;
	
	var h = date.getHours();
	h = h > 9 ? h : '0' + h;
	
	var m = date.getMinutes();
	m = m > 9 ? m : '0' + m;
	
	var s = date.getSeconds();
	s = s > 9 ? s : '0' + s;
	return y + "-" + M + "-" + d + " " + h + ":" + m + ":" + s;
	
}
var myScroll,
	pullDownEl, pullDownOffset,
	pullUpEl, pullUpOffset,
	generatedCount = 0;

function pullDownAction () {
	setTimeout(function () {	// <-- Simulate network congestion, remove setTimeout from production!
		var el, li, i;
		el = document.getElementById('thelist');

		/*
		for (i=0; i<3; i++) {
			li = document.createElement('li');
			li.innerText = 'Generated row ' + (++generatedCount);
			el.insertBefore(li, el.childNodes[0]);
		}
		*/
		$.ajax({
			type: "get",
			url: "/item.shtml?html&down",
			data: {
				
			}, 
			error: function() {
				var tips = new Tips('tmpl-tips', "与服务器通信失败，请检查网络是否稳定");
				tips.show();
				return;
			}, 
			success: function(response) {
				if(response) {
					var html = $(response);
					$("#thelist").prepend(html);
					/*
					if (response.data) {
						if (response.data.length > 0) {
							for (var i = 0; i < response.data.length; i++) {
								var item = response.data[i];
								
								var html = $("#tmpl-item-r").html();
								var reg = new RegExp("\{variable.id\}","g"); //创建正则RegExp对象  
								html = html.replace(reg, item.id);
								
								reg = new RegExp("\{variable.title\}","g"); //创建正则RegExp对象  
								html = html.replace(reg, item.title);
								
								reg = new RegExp("\{variable.amount\}","g"); //创建正则RegExp对象  
								html = html.replace(reg, item.amount);
								
								reg = new RegExp("\{variable.content\}","g"); //创建正则RegExp对象  
								html = html.replace(reg, item.content);
								
								reg = new RegExp("\{variable.creation\}","g"); //创建正则RegExp对象  
								html = html.replace(reg, dataformat(item.creation));
								var li = $(html);
								$("#thelist").prepend(li);
								
								//el.insertBefore(li, el.childNodes[0]);
							}
						}
					}
					*/
				}
			}
		});
		
		myScroll.refresh();		// Remember to refresh when contents are loaded (ie: on ajax completion)
	}, 1000);	// <-- Simulate network congestion, remove setTimeout from production!
}

function pullUpAction () {
	setTimeout(function () {	// <-- Simulate network congestion, remove setTimeout from production!
		var el, li, i;
		el = document.getElementById('thelist');

		/*
		for (i=0; i<3; i++) {
			li = document.createElement('li');
			li.innerText = 'Generated row ' + (++generatedCount);
			el.appendChild(li, el.childNodes[0]);
		}
		*/
		
		$.ajax({
			type: "get",
			url: "/item.shtml?html&up",
			data: {
				
			}, 
			error: function() {
				var tips = new Tips('tmpl-tips', "与服务器通信失败，请检查网络是否稳定");
				tips.show();
				return;
			}, 
			success: function(response) {
				if(response) {
					var html = $(response);
					$("#thelist").append(html);
				}
			}
		});
		
		myScroll.refresh();		// Remember to refresh when contents are loaded (ie: on ajax completion)
	}, 1000);	// <-- Simulate network congestion, remove setTimeout from production!
}

function loaded() {
	pullDownEl = document.getElementById('pullDown');
	pullDownOffset = pullDownEl.offsetHeight;
	pullUpEl = document.getElementById('pullUp');	
	pullUpOffset = pullUpEl.offsetHeight;
	
	myScroll = new iScroll('wrapper', {
		useTransition: true,
		topOffset: pullDownOffset,
		onRefresh: function () {
			if (pullDownEl.className.match('loading')) {
				pullDownEl.className = '';
				pullDownEl.querySelector('.pullDownLabel').innerHTML = '向下拖动刷新...';
			} else if (pullUpEl.className.match('loading')) {
				pullUpEl.className = '';
				pullUpEl.querySelector('.pullUpLabel').innerHTML = '向上拉动刷新...';
			}
		},
		onScrollMove: function () {
			if (this.y > 5 && !pullDownEl.className.match('flip')) {
				pullDownEl.className = 'flip';
				pullDownEl.querySelector('.pullDownLabel').innerHTML = '释放刷新...';
				this.minScrollY = 0;
			} else if (this.y < 5 && pullDownEl.className.match('flip')) {
				pullDownEl.className = '';
				pullDownEl.querySelector('.pullDownLabel').innerHTML = '向下拖动刷新...';
				this.minScrollY = -pullDownOffset;
			} else if (this.y < (this.maxScrollY - 5) && !pullUpEl.className.match('flip')) {
				pullUpEl.className = 'flip';
				pullUpEl.querySelector('.pullUpLabel').innerHTML = '释放刷新...';
				this.maxScrollY = this.maxScrollY;
			} else if (this.y > (this.maxScrollY + 5) && pullUpEl.className.match('flip')) {
				pullUpEl.className = '';
				pullUpEl.querySelector('.pullUpLabel').innerHTML = '向上拉动刷新...';
				this.maxScrollY = pullUpOffset;
			}
		},
		onScrollEnd: function () {
			if (pullDownEl.className.match('flip')) {
				pullDownEl.className = 'loading';
				pullDownEl.querySelector('.pullDownLabel').innerHTML = '正在加载...';				
				pullDownAction();	// Execute custom function (ajax call?)
			} else if (pullUpEl.className.match('flip')) {
				pullUpEl.className = 'loading';
				pullUpEl.querySelector('.pullUpLabel').innerHTML = '正在加载...';				
				pullUpAction();	// Execute custom function (ajax call?)
			}
		}
	});
	
	setTimeout(function () { document.getElementById('wrapper').style.left = '0'; }, 800);
}

document.addEventListener('touchmove', function (e) { e.preventDefault(); }, false);

document.addEventListener('DOMContentLoaded', function () { setTimeout(loaded, 200); }, false);

</script>

<style type="text/css">
body,ul,li {
	padding:0;
	margin:0;
	border:0;
}

body {
	font-size:12px;
	-webkit-user-select:none;
    -webkit-text-size-adjust:none;
	font-family:helvetica;
}

#header {
	position:absolute; z-index:2;
	top:0; left:0;
	width:100%;
	height:45px;
	line-height:45px;
	background: #CD235C;
	/*
	background-color:#d51875;
	background-image:-webkit-gradient(linear, 0 0, 0 100%, color-stop(0, #fe96c9), color-stop(0.05, #d51875), color-stop(1, #7b0a2e));
	background-image:-moz-linear-gradient(top, #fe96c9, #d51875 5%, #7b0a2e);
	background-image:-o-linear-gradient(top, #fe96c9, #d51875 5%, #7b0a2e);
	*/
	padding:0;
	color:#eee;
	font-size:20px;
	text-align:center;
}

#header a {
	color:#f3f3f3;
	text-decoration:none;
	font-weight:bold;
	text-shadow:0 -1px 0 rgba(0,0,0,0.5);
}

#footer {
	position:absolute; z-index:2;
	bottom:0; left:0;
	width:100%;
	height:48px;
	background-color:#222;
	background-image:-webkit-gradient(linear, 0 0, 0 100%, color-stop(0, #999), color-stop(0.02, #666), color-stop(1, #222));
	background-image:-moz-linear-gradient(top, #999, #666 2%, #222);
	background-image:-o-linear-gradient(top, #999, #666 2%, #222);
	padding:0;
	border-top:1px solid #444;
}

#wrapper {
	position:absolute; z-index:1;
	top:45px; 
	/*bottom:48px; */
	bottom: 0px;
	left:-9999px;
	width:100%;
	background:#aaa;
	overflow:auto;
}

#scroller {
	position:absolute; z-index:1;
/*	-webkit-touch-callout:none;*/
	-webkit-tap-highlight-color:rgba(0,0,0,0);
	width:100%;
	padding:0;
}

#scroller ul {
	list-style:none;
	padding:0;
	margin:0;
	width:100%;
	text-align:left;
}

#scroller li {
	padding:0 10px;
	/*height:40px;*/
	line-height:40px;
	border-bottom:1px solid #ccc;
	border-top:1px solid #fff;
	background-color:#fafafa;
	font-size:14px;
}

#myFrame {
	position:absolute;
	top:0; left:0;
}



/**
 *
 * Pull down styles
 *
 */
#pullDown, #pullUp {
	background:#fff;
	height:40px;
	line-height:40px;
	padding:5px 10px;
	border-bottom:1px solid #ccc;
	font-weight:bold;
	font-size:14px;
	color:#888;
}
#pullDown .pullDownIcon, #pullUp .pullUpIcon  {
	display:block; float:left;
	width:40px; height:40px;
	background:url(images/pull-icon@2x.png) 0 0 no-repeat;
	-webkit-background-size:40px 80px; background-size:40px 80px;
	-webkit-transition-property:-webkit-transform;
	-webkit-transition-duration:250ms;	
}
#pullDown .pullDownIcon {
	-webkit-transform:rotate(0deg) translateZ(0);
}
#pullUp .pullUpIcon  {
	-webkit-transform:rotate(-180deg) translateZ(0);
}

#pullDown.flip .pullDownIcon {
	-webkit-transform:rotate(-180deg) translateZ(0);
}

#pullUp.flip .pullUpIcon {
	-webkit-transform:rotate(0deg) translateZ(0);
}

#pullDown.loading .pullDownIcon, #pullUp.loading .pullUpIcon {
	background-position:0 100%;
	-webkit-transform:rotate(0deg) translateZ(0);
	-webkit-transition-duration:0ms;

	-webkit-animation-name:loading;
	-webkit-animation-duration:2s;
	-webkit-animation-iteration-count:infinite;
	-webkit-animation-timing-function:linear;
}

@-webkit-keyframes loading {
	from { -webkit-transform:rotate(0deg) translateZ(0); }
	to { -webkit-transform:rotate(360deg) translateZ(0); }
}

</style>

</head>
<body>
<div id="header">

<a href="investment.jsp">发布需求</a>
<div style="height: 45px; position: absolute; right: 0px; top: 0px;">
<a href="../user/index.jsp" style="right: 5px; position: relative; border-radius: 3px; moz-border-radius: 4px; webkit-border-radius: 4px; border: 1px solid #ddd; background-color: #f5f5f5; color: #333;">我的帐号</a>
</div>
</div>
<div id="wrapper">
	<div id="scroller">
		
		<div id="pullDown" style="position: relative;">
			<span class="pullDownIcon"></span><span class="pullDownLabel">向下拖动刷新...</span>
		</div>

		<ul id="thelist">
			<c:import url="tmpl-item-list-item.jsp">
				
			</c:import>
		</ul>
		<div id="pullUp">
			<span class="pullUpIcon"></span><span class="pullUpLabel">向上拉动刷新...</span>
			<div class="copyright" style="text-align: center;">
				上海正旅网络科技有限公司版权所有 2008-2014 <a href="#" target="_blank" seed="copyright-link" smartracker="on"></a>
			</div>
		</div>
		
	</div>
</div>
<!-- 
<div id="footer"></div>
 -->
<script type="text/javascript" src="js/chos/template-engine/TEngine.js" ></script>
</body>
</html>


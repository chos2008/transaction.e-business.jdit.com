<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	height: 40px;
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
			<li>Pretty row 1</li>
			<li>Pretty row 2</li>
			<li>Pretty row 3</li>
			<li>Pretty row 4</li>
			<li>Pretty row 5</li>
			<li>Pretty row 6</li>
			<li>Pretty row 7</li>
			<li>Pretty row 8</li>
			<li>Pretty row 9</li>
			<li>Pretty row 10</li>
			<li>Pretty row 11</li>
			<li>Pretty row 12</li>
			<li>Pretty row 13</li>
			<li>Pretty row 14</li>
			<li>Pretty row 15</li>
			<li>Pretty row 16</li>
			<li>Pretty row 17</li>
			<li>Pretty row 18</li>
			<li>Pretty row 19</li>
			<li>Pretty row 20</li>
			<li>Pretty row 21</li>
			<li>Pretty row 22</li>
			<li>Pretty row 23</li>
			<li>Pretty row 24</li>
			<li>Pretty row 25</li>
			<li>Pretty row 26</li>
			<li>Pretty row 27</li>
			<li>Pretty row 28</li>
			<li>Pretty row 29</li>
			<li>Pretty row 30</li>
			<li>Pretty row 31</li>
			<li>Pretty row 32</li>
			<li>Pretty row 33</li>
			<li>Pretty row 34</li>
			<li>Pretty row 35</li>
			<li>Pretty row 36</li>
			<li>Pretty row 37</li>
			<li>Pretty row 38</li>
			<li>Pretty row 39</li>
			<li>Pretty row 40</li>
			<li>Pretty row 41</li>
			<li>Pretty row 42</li>
			<li>Pretty row 43</li>
			<li>Pretty row 44</li>
			<li>Pretty row 45</li>
			<li>Pretty row 46</li>
			<li>Pretty row 47</li>
			<li>Pretty row 48</li>
			<li>Pretty row 49</li>
			<li>Pretty row 50</li>
		</ul>
	</div>
</div>
<!-- 
<div id="footer"></div>
 -->
</body>
</html>
function showPosition(position) {
	$(".text-location").html(position.coords.latitude + "," + position.coords.longitude);
}

function getPositionError(error) {
	switch (error.code) {
	case error.TIMEOUT:
		alert("连接超时，请重试");
		break;
	case error.PERMISSION_DENIED:
		alert("您拒绝了使用位置共享服务，查询已取消");
		break;
	case error.POSITION_UNAVAILABLE:
		alert("获取位置信息失败");
		break;
	}
}
(function() {

	var autoTextarea = function(elem, extra, maxHeight) {
		extra = extra || 0;
		var isFirefox = !!document.getBoxObjectFor || 'mozInnerScreenX' in window,
		isOpera = !!window.opera && !!window.opera.toString().indexOf('Opera'),
		addEvent = function (type, callback) {
			elem.addEventListener ?
					elem.addEventListener(type, callback, false) :
						elem.attachEvent('on' + type, callback);
		},
		getStyle = elem.currentStyle ? function (name) {
			var val = elem.currentStyle[name];

			if (name === 'height' && val.search(/px/i) !== 1) {
				var rect = elem.getBoundingClientRect();
				return rect.bottom - rect.top -
				parseFloat(getStyle('paddingTop')) -
				parseFloat(getStyle('paddingBottom')) + 'px';        
			};

			return val;
		} : function (name) {
			return getComputedStyle(elem, null)[name];
		},
		minHeight = parseFloat(getStyle('height'));

		elem.style.resize = 'none';

		var change = function () {
			var scrollTop, height,
			padding = 0,
			style = elem.style;

			if (elem._length === elem.value.length) return;
			elem._length = elem.value.length;

			if (!isFirefox && !isOpera) {
				padding = parseInt(getStyle('paddingTop')) + parseInt(getStyle('paddingBottom'));
			};
			scrollTop = document.body.scrollTop || document.documentElement.scrollTop;

			elem.style.height = minHeight + 'px';
			if (elem.scrollHeight > minHeight) {
				if (maxHeight && elem.scrollHeight > maxHeight) {
					height = maxHeight - padding;
					style.overflowY = 'auto';
				} else {
					height = elem.scrollHeight - padding;
					style.overflowY = 'hidden';
				};
				style.height = height + extra + 'px';
				scrollTop += parseInt(style.height) - elem.currHeight;
				document.body.scrollTop = scrollTop;
				document.documentElement.scrollTop = scrollTop;
				elem.currHeight = parseInt(style.height);
			};
		};

		addEvent('propertychange', change);
		addEvent('input', change);
		addEvent('focus', change);
		change();
	};

	window.onload = function() {

		var geo = navigator.geolocation;
		if (geo) {
			var position_option = {
					enableHighAccuracy: true, 
					maximumAge: 30000, 
					timeout: 120000
			};
			var p = geo.getCurrentPosition(showPosition, getPositionError, position_option);
		}
		
		var text = document.getElementById("content");
        autoTextarea(text);

		var submit = document.getElementById("submit");
		$('#issue').on('click', function() {
			var title = $("#title").val();
			var contact = $("#contact").val();
			var content = $("#content").val();
			if (title == "") {

				//t.show();
				var tip = new Tips("tmpl-tips", "请描述您的需求");
				tip.show();
				return;
			}

			if (contact == "") {
				var tip = new Tips("tmpl-tips", "请填写你的联系方式");
				tip.show();
				return;
			}

			if (content == "") {
				var tip = new Tips("tmpl-tips", "请填写您的具体要求");
				tip.show();
				return;
			}
			var loading = new Loading("tmpl-loading", "请输入...");
			loading.show();
			$.ajax({
				type:"post",
				url: "item/issue.shtml",
				data: {
					"title": title, 
					"contact": contact, 
					"content": content
				}, 
				error: function() {
					loading.hide();

					var tips = new Tips('tmpl-tips', "与服务器通信失败，请检查网络是否稳定");
					tips.show();
					return;
				}, 
				success:function(response) {
					loading.hide();

					if(response) {
						if(response.code == 0) {
							location.href="mindex.htm";
							return;
						}
						var tips = new Tips('tmpl-tips', "发布失败");
						tips.show();
						return;
					}
				}
			});
		});
	};

})();

function unbind(dom, type, listener) {
	if (dom.removeEventListener) {
		dom.removeEventListener(type, listener, false);
	} else {
		dom.detachEvent("on" + type, listener);
	}
}

function bind(dom, type, listener) {
	if (dom.addEventListener) {
		dom.addEventListener(type, listener, false);
	} else {
		dom.attachEvent("on" + type, listener);
	}
}

function back() {
	var i = document.getElementById('investment');
	var sp = document.getElementById('sp');
	var sole = document.getElementById("sole");

	sp.style.display = 'none';
	i.style.display = 'none';
	sole.style.display = 'none';

	var menuItem = document.getElementById('menu-item');
	menuItem.style.display = 'block';
}

function commit(investment) {
	var menuItem = document.getElementById('menu-item');
	menuItem.style.display = 'none';
	if (investment == 1) {
		var i = document.getElementById('investment');
		var sp = document.getElementById('sp');
		var sole = document.getElementById("sole");

		sp.style.display = 'block';
		i.style.display = 'none';
		sole.style.display = 'none';

		var b = document.getElementById('nav-back');
		unbind(b, "click", back);
		bind(b, "click", back);
	} else if(investment == 2) {
		var i = document.getElementById('investment');
		var sp = document.getElementById('sp');
		var sole = document.getElementById("sole");

		sp.style.display = 'none';
		i.style.display = 'block';
		sole.style.display = 'none';

		var b = document.getElementById('nav-back');
		unbind(b, "click", back);
		bind(b, "click", back);
	} else {
//		var i = document.getElementById('investment');
//		var sp = document.getElementById('sp');
//		var sole = document.getElementById("sole");

//		sp.style.display = 'none';
//		i.style.display = 'none';
//		sole.style.display = 'block';

//		var b = document.getElementById('nav-back');
//		unbind(b, "click", back);
//		bind(b, "click", back);
		location.href = "issue.jsp";
	}
}

function onsole() {
	var project = document.getElementById('project');
	project.placeholder = "请描述您的需求";

	var submit = document.getElementById('submit-investment');
	submit.value = "发布需求";
}

function oncompany() {
	var project = document.getElementById('project');
	project.placeholder = "请描述您要发布的生意";

	var submit = document.getElementById('submit-investment');
	submit.value = "发布生意";
}


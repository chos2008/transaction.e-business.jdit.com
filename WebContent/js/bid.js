Tips = function(context, title) {
	// 错误弹窗
    var _popTimer = true;
	function _show() {
		if(_popTimer){
            _popTimer = false;
            
            var html = $("#" + context).html();
			var t = $(html);
			$(document.body).append(t);
			
			t.html(title);
            t.css("display", "block");
            setTimeout(function(){
                _popTimer = true;
                t.css("display", "none");
                t.remove();
            },2000);
        }
	}
	
	return {
		show: _show
	};
};
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
		
		var submit = document.getElementById("submit");
		$('#issue').on('click', function() {
			var title = $("#title").val();
			var amount = $("#amount").val();
			var contact = $("#contact").val();
			var content = $("#content").val();
			if (title == "") {
				
				//t.show();
				var tip = new Tips("tmpl-tips", "请填写招标项目名称");
				tip.show();
				return;
			}
			
			if (amount == "") {
				
				//t.show();
				var tip = new Tips("tmpl-tips", "请填写招标金额");
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
			
			$.ajax({
				type:"post",
				url: "bid/issue.shtml",
				data: {
					"title": title, 
					"amount": amount, 
					"contact": contact, 
					"content": content
				}, 
				error: function() {
					var tips = new Tips('tmpl-tips', "与服务器通信失败，请检查网络是否稳定");
					tips.show();
					return;
				}, 
				success:function(resnponse) {
					if(resnponse) {
					    if(resnponse.code == 0) {
							location.href="user/index.jsp";
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
//		
//		sp.style.display = 'none';
//		i.style.display = 'none';
//		sole.style.display = 'block';
//		
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


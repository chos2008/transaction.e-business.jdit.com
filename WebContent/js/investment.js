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
(function() {
	window.onload = function() {
		
		
		
		var submit = document.getElementById("submit");
		$('#submit').on('click', function() {
			var username = $("#username").val();
			var password = $("#password").val();
			if (username == "") {
				
				//t.show();
				var tip = new Tips("tmpl-tips", "请输入用户名");
				tip.show();
				return;
			}
			
			if (password == "") {
				var tip = new Tips("tmpl-tips", "请输入密码");
				tip.show();
				return;
			}
			
			$.ajax({
				type:"post",
				url: "user/login.shtml",
				data: {
					"username": username, 
					"password": password
				}, 
				error: function() {
					var tips = new Tips('tmpl-tips', "与服务器通信失败，请检查网络是否稳定");
					tips.show();
					return;
				}, 
				success:function(resnponse) {
					if(resnponse){
					    if(resnponse.code == 0) {
							location.href="mindex.htm";
							return;
					    }
					    var tips = new Tips('tmpl-tips', "用户名或密码不正确");
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


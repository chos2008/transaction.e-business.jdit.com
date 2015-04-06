(function() {
	window.onload = function() {
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
		
		function reg_mobile() {
			var div_reg_mobile = document.getElementById("div-reg-mobile");
			var div_reg_username = document.getElementById("div-reg-username");
			div_reg_mobile.style.display = "block";
			div_reg_username.style.display = "none";
			bt_reg_un.innerHTML = "用户名注册";
			unbind(bt_reg_un, "click", reg_mobile);
			bind(bt_reg_un, "click", reg_username);
		}
		
		function reg_username() {
			var div_reg_mobile = document.getElementById("div-reg-mobile");
			var div_reg_username = document.getElementById("div-reg-username");
			div_reg_mobile.style.display = "none";
			div_reg_username.style.display = "block";
			var opacity = 0;
			var rotate = 0;
			div_reg_username.style.opacity= opacity;
			div_reg_username.style.transform = "none";
			var interval = setInterval(function(){
				if (opacity > 1) {
					clearInterval(interval);
					return;
				}
				//alert(div_reg_username.style.opacity);
				opacity += 0.1;
				div_reg_username.style.opacity = opacity;
				//alert(rotate + ", " + opacity);
            }, 100);
			var _interval = setInterval(function(){
				if (rotate > 360) {
					clearInterval(_interval);
					return;
				} else {
					//alert(div_reg_username.style.opacity);
					rotate += 36;
					rotate = rotate > 360 ? 360 : rotate;
					div_reg_username.style.transform = "rotate(" + rotate + "deg)";
//					alert(rotate);
				}
            }, 100);
			bt_reg_un.innerHTML = "手机注册";
			unbind(bt_reg_un, "click", reg_username);
			bind(bt_reg_un, "click", reg_mobile);
		}
		
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
		
		var bt_reg_un = document.getElementById("bt-reg");
		bind(bt_reg_un, "click", reg_mobile);
		
		var submit = document.getElementById("submit");
		$('#submit').on('click', function() {
			var username = $("#username").val();
			var password = $("#password").val();
			var confirm_password = $("#confirm_password").val();
			var captcha = $("#captcha").val();
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
			
			if (confirm_password == "") {
				var tip = new Tips("tmpl-tips", "请重新输入密码");
				tip.show();
				return;
			}
			
			if (password != confirm_password) {
				var tip = new Tips("tmpl-tips", "密码不一致");
				tip.show();
				return;
			}
			
			if (captcha == "") {
				var tip = new Tips("tmpl-tips", "请输入验证码");
				tip.show();
				return;
			}
			
			$.ajax({
				type:"post",
				url: "user/register.shtml",
				data: {
					"username": username, 
					"password": password, 
					"confirm_password": confirm_password, 
					"captcha": captcha
				}, 
				error: function() {
					var tips = new Tips('tmpl-tips', "与服务器通信失败，请检查网络是否稳定");
					tips.show();
					return;
				}, 
				success: function(response) {
					if(response){
					    if(response.code == 0) {
					    	var tips = new Tips('tmpl-tips', "注册成功");
							tips.show();
							location.href="register-success.jsp";
					    } else if (response.code == 1003) {
					    	var tips = new Tips('tmpl-tips', "该用户名已注册");
							tips.show();
					    }
					}
				}
			});
		});
	};
	
})();


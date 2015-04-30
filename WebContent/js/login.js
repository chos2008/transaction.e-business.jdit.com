(function() {
	window.onload = function() {
		
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
		
		$(".td-login").on("click", function() {
			var nav = $('#nav');
			var display = nav.css("display");
			nav.toggle();
		});
		
		$("input").on("focus", function() {
			var nav = $('#nav');
			nav.hide();
		});
		
		$('#bind').on('click', function() {
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
				url: "/user/bindAlaPayAccount/action.shtml",
				data: {
					"username": username, 
					"password": password
				}, 
				error: function() {
					var tips = new Tips('tmpl-tips', "与服务器通信失败，请检查网络是否稳定");
					tips.show();
					return;
				}, 
				success:function(response) {
					if(response){
					    if(response.code == 0) {
					    	var returnUrl = $('.ipt-return').val();
					    	if (returnUrl == "") {
					    		location.href = "/user/index.jsp";
					    	} else {
					    		location.href = returnUrl;
					    	}
							return;
					    }
					    var tips = new Tips('tmpl-tips', "用户名或密码不正确");
						tips.show();
						return;
					}
				}
			});
		});
		
		
		
		
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
				success:function(response) {
					if(response){
					    if(response.code == 0) {
					    	var returnUrl = $('.ipt-return').val();
					    	if (returnUrl == "") {
					    		location.href = "user/index.jsp";
					    	} else {
					    		location.href = returnUrl;
					    	}
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


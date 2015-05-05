(function() {
	window.onload = function() {
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
			var loading = new Loading("tmpl-loading", "请输入...");
			loading.show();
			$.ajax({
				type:"post",
				url: "/user/bindAlaPayAccount/action.shtml",
				data: {
					"username": username, 
					"password": password
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
			
			var loading = new Loading("tmpl-loading", "请输入...");
			loading.show();
			$.ajax({
				type:"post",
				url: "user/login.shtml",
				data: {
					"username": username, 
					"password": password
				}, 
				error: function() {
					loading.hide();
					
					var tips = new Tips('tmpl-tips', "与服务器通信失败，请检查网络是否稳定");
					tips.show();
					return;
				}, 
				success: function(response) {
					loading.hide();
					if(response) {
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


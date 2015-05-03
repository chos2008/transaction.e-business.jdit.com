
(function() {
	window.onscroll = function() {
		var scrolltop = document.documentElement.scrollTop || document.body.scrollTop;
		$(".nav-bar").css("top", scrolltop);
	};
	
	window.onmousewheel = function(e) {
		//e.preventDefault();
		window.onscroll(e);
	};
	
	window.onload = function() {
		var details = $(".details");
		details.on("click", function() {
			var _this = $(this);
			var css = _this.css("borderLeftColor");
			if (css == "orange") {
				_this.css("borderLeftColor", "silver");
				
				$.ajax({
					type: "get",
					url: "/merchant/1234/item.shtml", // "/order/x-normal/top.shtml?state=wait_pay"
					data: {
						
					}, 
					error: function() {
						var tips = new Tips('tmpl-tips', "与服务器通信失败，请检查网络是否稳定");
						tips.show();
						return;
					}, 
					success: function(response) {
						if(response) {
							response = response.trim();
							var html = $(response);
							$('.merchant-ab-item').html(html);
						}
					}
				});
			} else {
				_this.css("borderLeftColor", "orange");
				
				$.ajax({
					type: "get",
					url: "/merchant/1234/details.shtml", // "/order/x-normal/top.shtml?state=wait_pay"
					data: {
						
					}, 
					error: function() {
						var tips = new Tips('tmpl-tips', "与服务器通信失败，请检查网络是否稳定");
						tips.show();
						return;
					}, 
					success: function(response) {
						if(response) {
							response = response.trim();
							var html = $(response);
							$('.merchant-ab-item').html(html);
						}
					}
				});
			}
		});
	};
	
	
})();

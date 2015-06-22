
function tobid(itemId) {
	var loading = new Loading("tmpl-loading", "请输入...");
	loading.show();
	$.ajax({
		type:"post",
		url: "/item/tobid.shtml",
		data: {
			"item_id": itemId
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
			    	var list = $('.list-item-li');
			    	for (var i = 0; i < list.length; i++) {
			    		var item = $(list[i]);
			    		var bindItemId = item.attr("bind-data-id");
			    		if (bindItemId == itemId) {
			    			item.remove();
			    			break;
			    		}
			    	}
					var tips = new Tips('tmpl-tips', "转标成功");
					tips.show();
					return;
			    }
			    var tips = new Tips('tmpl-tips', "转标失败");
				tips.show();
				return;
			}
		}
	});
}

(function() {
	window.onload = function() {
		window.onscroll = function(e) {
			//var de = document.documentElement;
			var body = document.body;
			//var scrolltop = de.scrollHeight || body.scrollHeight;
			//var clientHeight = document.documentElement.clientHeight || document.body.clientHeight;
			//scrolltop -= 40;
			$(".nav-bar").css("bottom", 0 - body.scrollTop);
		};
		
		window.onmousewheel = function(e) {
			//e.preventDefault();
			window.onscroll(e);
		};
		
	//	$(document).on("mouseup", function(e) {
	//		alert("onmouseup");
	//		$(".nav-bar").show();
	//	});
		
		var touch = null; //ontouchstart 
	//	document.ontouchstart = function(e) {
	//		//e.presentDefault();
	//		//alert("ontouchstart");
	//		touch = e.touches[0];
	////		var x = touch.clientX;
	////		var y = touch.clientY;
	//	};
	//	
		_ontouchend = function(e) {
	//		e.preventDefault();
	//		alert("ontouchend");
	//		touch = null;
			var body = document.body;
			$(".nav-bar").css("bottom", 0 - body.scrollTop);
			$(".nav-bar").show();
		};
		//document.ontouchend =
		$(document).on("touchend", _ontouchend);
		
		var interval = null;
		_ontouchmove = function(e) {
	//		if(window.navigator.isAndroid_4) {
	//			e.preventDefault();
	//	    }
	//		//alert('ontouchmove...');
	//		//window.onscroll(e);
	//		
	//		var point = e.touches[0];
	//		var bottom = $(".nav-bar").css("bottom");
	//		bottom = bottom.replace("px", "");
	////		alert(bottom);
	////		alert("x:" + point.clientX + ", " + point.clientY);
	////		if (touch == null) {
	////			alert("null");
	////		} else {
	////			alert("x:" + (point.clientX - touch.clientX) + ", " + (point.clientY - touch.clientY));
	////		}
	//		bottom = bottom + (point.clientY - touch.clientY);
	//		$(".nav-bar").css("bottom", bottom);
			
			$(".nav-bar").hide();
			
			if (interval != null) {
				clearInterval(interval);
				$(".nav-bar").hide();
			}
			interval = setTimeout(function() {
				var body = document.body;
				$(".nav-bar").css("bottom", 0 - body.scrollTop);
				$(".nav-bar").show();
			}, 2000);
		};
		//document.ontouchmove = _ontouchmove;
		$(document).on("touchmove", _ontouchmove);
		
		$(".d_cart").live('click', function () {
			var _this = $(this);
			var itemId = _this.attr("bind-data");
			var quantity = 1;
			item_d_cart(itemId, quantity, function(response) {
				if(response) {
					if(response.code == 0) {
						refresh_sheet();
						var tips = new Tips('tmpl-tips', "添加成功");
						tips.show();
						return;
				    }
				}
			}, function() {
				var tips = new Tips('tmpl-tips', "与服务器通信失败，请检查网络是否稳定");
				tips.show();
				return;
			});
		});
	}
})();

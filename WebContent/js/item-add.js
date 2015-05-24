
(function() {
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
	
	window.onload = function() {
		$('.item-add').on('click', function() {
			var name = $("#name").val();
			if (name == "") {
				var tips = new Tips('tmpl-tips', "请填写商品名称");
				tips.show();
				return;
			}
			var price = $('#price').val();
			if (price == "") {
				var tips = new Tips('tmpl-tips', "请输入商品价格");
				tips.show();
				return;
			}
			var stock = $('#stock').val();
			if (stock == "") {
				var tips = new Tips('tmpl-tips', "请输入商品库存");
				tips.show();
				return;
			}
			var content = $('#content').val();
			$.ajax({
				type: "post", 
				url: "/item/add.shtml", 
				data: {
					"name": name, 
					"price": price, 
					"stock": stock, 
					"content": content
				}, 
				error: function() {
					var tips = new Tips('tmpl-tips', "与服务器通信失败，请检查网络是否稳定");
					tips.show();
					return;
				}, 
				success:function(response) {
					if(response){
					    if(response.code == 0) {
					    	location.href = "/mindex.htm";
							return;
					    }
					    var tips = new Tips('tmpl-tips', "商品添加失败");
						tips.show();
						return;
					}
				}
			});
		});
	};
})();

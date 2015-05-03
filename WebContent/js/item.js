
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
	
	
})();

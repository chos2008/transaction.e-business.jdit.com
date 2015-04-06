
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
	}
	
})();

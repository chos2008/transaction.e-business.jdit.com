
(function() {
	window.onscroll = function() {
		var scrolltop = document.documentElement.scrollTop || document.body.scrollTop;
		$(".nav-bar").css("top", scrolltop);
	};
	
})();

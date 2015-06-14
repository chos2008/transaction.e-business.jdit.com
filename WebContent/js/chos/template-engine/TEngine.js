(function() {
if (! ($.load)) { 
	$.load = function(url, fn) {
		var t = $("<div style='display: none'></div>");
		$(document.body).append(t);
		url = url + "?" + Math.random();
		$(t).load(url, fn);
	};
}
})();

$.load('/tips.tmpl');
$.load('/item-r.tmpl');
$.load('/loading.tmpl');
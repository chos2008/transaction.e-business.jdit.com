window.onload = function() {
	
//	$(".item-toolbox").live("click", function(e) {
//		e.stopPropagation();
//	});
	var list_item_li = $('.list-item-li');
	list_item_li.live('click', function(e) {
		var target = e.target;
		if (! target) {
			return;
		}
		var parent = target;
		while (parent) {
			if (parent.className == 'item-toolbox') {
				return;
			}
			parent = parent.parentNode;
		}
		
		
		var _this = $(this);
		var cur = _this.attr("bind-data-id");
		
		var oss = $('.list-item-li');
		for (var i = 0; i < oss.length; i++) {
			var b = $(oss[i]).attr("bind-data-id");
			if (b != cur) {
				$(oss[i]).find(".item-toolbox").hide();
			}
		}
		
		var oi = _this.find(".item-toolbox");
		oi.toggle();
//		e.stopPropagation();
	});
}
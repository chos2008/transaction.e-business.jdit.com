function cart(id) {
	$.ajax({
		type: "post",
		url: "/item/cart.shtml",
		data: {
			"itemId": id
		}, 
		error: function() {
			var tips = new Tips('tmpl-tips', "与服务器通信失败，请检查网络是否稳定");
			tips.show();
			return;
		}, 
		success: function(response) {
			if(response) {
				if(response.code == 0) {
					var stat = $("#order-sheet-stats").text();
					stat++;
					$("#order-sheet-stats").text(stat);
					return;
			    }
			}
		}
	});
}
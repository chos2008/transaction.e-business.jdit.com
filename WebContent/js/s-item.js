function item_d_cart(itemId, quantity, success, error) {
	var param = {
		"itemId": itemId
	};
	if (quantity) {
		param.quantity = quantity;
	}
	$.ajax({
		type: "post",
		url: "/item/cart.shtml",
		data: param, 
		error: error, 
		success: success
	});
}

function refresh_sheet() {
	var stats = $(".order-sheet-stats");
	var value = stats.text();
	value++;
	stats.text(value);
}
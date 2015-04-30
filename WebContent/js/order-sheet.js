function deleteOrderSheet(id, c) {
	var _this = $(c);
	var p = _this.parents('.order-sheet-item');
	var pp = p.parent();
	$.ajax({
		type:"post",
		url: "/order-sheet/" + id + "/delete.shtml",
		data: {
			
		}, 
		error: function() {
			var tips = new Tips('tmpl-tips', "与服务器通信失败，请检查网络是否稳定");
			tips.show();
			return;
		}, 
		success: function(response) {
			if(response) {
			    if(response.code == 0) {
					p.remove();
					return;
			    }
				return;
			}
		}
	});
}

function grayscale(src){ 
	var canvas = document.createElement('canvas'); 
	var ctx = canvas.getContext('2d'); 
	var imgObj = new Image(); 
	imgObj.src = src; 
	canvas.width = imgObj.width; 
	canvas.height = imgObj.height; 
	ctx.drawImage(imgObj, 0, 0); 
	var imgPixels = ctx.getImageData(0, 0, canvas.width, canvas.height); 
	for(var y = 0; y < imgPixels.height; y++) {
		for(var x = 0; x < imgPixels.width; x++){ 
			var i = (y * 4) * imgPixels.width + x * 4; 
			var avg = (imgPixels.data[i] + imgPixels.data[i + 1] + imgPixels.data[i + 2]) / 3; 
			imgPixels.data[i] = avg; 
			imgPixels.data[i + 1] = avg; 
			imgPixels.data[i + 2] = avg; 
		} 
	} 
	ctx.putImageData(imgPixels, 0, 0, 0, 0, imgPixels.width, imgPixels.height); 
	return canvas.toDataURL(); 
} 

(function() {
	window.onload = function() {
		var cur = null;
		var onselect = function(os) {
			var oi = os.find(".order-item-small-image");
			var src = oi.attr("src");
			
			var oss = $('.order-sheet-touch');
			for (var i = 0; i < oss.length; i++) {
				var b = $(oss[i]).attr("bind-data-id");
				if (b == cur) {
					$(oss[i]).css("backgroundColor", "white");
					//oi.attr("src", oi.attr("orgin-src"));
					var d = $(oss[i]).next(".list-item-ctl");
					d.hide();
				}
			}
			
//			var d = os.find(".list-item-ctl");
			var d = os.next(".list-item-ctl");
			var display = d.css("display");
			if (display == "none") {
				var c = os.attr("bind-data-id");
				//if (c != cur) {
					d.show();
					os.css("backgroundColor", "rgb(252, 247, 247)");
					//oi.attr("src", grayscale(src));
				//}
				cur = c;
			} else {
				d.hide();
				os.css("backgroundColor", "white");
				//oi.attr("src", oi.attr("orgin-src"));
				cur = null;
			}
		};
		var event = document.ontouchstart !== null ? 'click' : 'touchstart';
		$(".order-sheet-touch").on(event, function(e) {
			//alert(event);
			//e.preventDefault();
			var _this = $(this);
			onselect(_this);
		});
		
	};
	
})();

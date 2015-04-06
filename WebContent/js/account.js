function unbind(dom, type, listener) {
	if (dom.removeEventListener) {
		dom.removeEventListener(type, listener, false);
	} else {
		dom.detachEvent("on" + type, listener);
	}
}

function bind(dom, type, listener) {
	if (dom.addEventListener) {
		dom.addEventListener(type, listener, false);
	} else {
		dom.attachEvent("on" + type, listener);
	}
}


Tips = function(context, title) {
	// 错误弹窗
    var _popTimer = true;
	function _show() {
		if(_popTimer){
            _popTimer = false;
            
            var html = $("#" + context).html();
			var t = $(html);
			$(document.body).append(t);
			
			t.html(title);
            t.css("display", "block");
            setTimeout(function(){
                _popTimer = true;
                t.css("display", "none");
                t.remove();
            },2000);
        }
	}
	
	return {
		show: _show
	};
};
		
(function() {
	window.onload = function() {
		$(".list-item-item").on("click", function() {
			var e = $(".list-item-body");
			var display = e.css("display");
			if (display != "none") {
				e.animate({
					opacity: 0.25, 
					display: "none", 
					color: '#abcdef'//,
					//rotateZ: '45deg', 
					//translate3d: '0,10px,0'
				}, 
				1000, 
				'ease-out');
			} else {
				e.animate({
					opacity: 1, 
					display: "inline-block", 
					color: '#abcdef'//,
					//rotateZ: '45deg', 
					//translate3d: '0,10px,0'
				}, 
				1000, 
				'ease-out');
			}
		});
		
		$.ajax({
			type: "get",
			url: "../item_as_json.shtml",
			data: {
				
			}, 
			error: function() {
				var tips = new Tips('tmpl-tips', "与服务器通信失败，请检查网络是否稳定");
				tips.show();
				return;
			}, 
			success: function(response) {
				if(response) {
					if (response.data) {
						if (response.data.length > 0) {
							$(".item-not-issue").hide();
							$(".item-list").show();
							var e = $(".item-list");
							for (var i = 0; i < response.data.length; i++) {
								var item = response.data[i];
								e.append('<li class="item" style=""><a href="../item/' + item.id + '.shtml">' + item.title + '</a></li>');
							}
						}
					} else {
						$(".item-list").hide();
						$(".item-not-issue").show();
					}
				}
			}
		});
	}
})();


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

String.prototype.trim=function() {  
    return this.replace(/(^\s*)|(\s*$)/g,'');  
};  

(function() {
	window.onload = function() {
		$('.list-item-transaction').on("click", function() {
			var _this = $(this);
			_this.next().toggle();
			if (_this.next().css("display") == "none") {
				_this.css("borderBottomWidth", "0px");
			} else {
				_this.css("borderBottomWidth", "1px");
			}
		});
		
		$('.list-item-order').on("click", function() {
			var _this = $(this);
			_this.next().toggle();
			if (_this.next().css("display") == "none") {
				_this.css("borderBottomWidth", "0px");
			} else {
				_this.css("borderBottomWidth", "1px");
			}
		});
		
		
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
		
		$('.list-item-bid').on('click', function() {
			var _this = $(this);
			_this.next().toggle();
		});
		
		function getTopOrdersGroupByState(state) {
			$.ajax({
				type: "get",
				url: "/order/x-normal/top.shtml", // "/order/x-normal/top.shtml?state=wait_pay"
				data: {
					"state": state
				}, 
				error: function() {
					var tips = new Tips('tmpl-tips', "与服务器通信失败，请检查网络是否稳定");
					tips.show();
					return;
				}, 
				success: function(response) {
					if(response) {
						response = response.trim();
						if (response == "") {
							$('.order-list').hide();
						} else {
							$('.order-list').show();
							var html = $(response);
							$('.order-list').html(html);
						}
					}
				}
			});
		}
		
		function getTopNormalOrdersGroupByState(state) {
			$.ajax({
				type: "get",
				url: "/order/normal/top.shtml", // "/order/x-normal/top.shtml?state=wait_pay"
				data: {
					"state": state
				}, 
				error: function() {
					var tips = new Tips('tmpl-tips', "与服务器通信失败，请检查网络是否稳定");
					tips.show();
					return;
				}, 
				success: function(response) {
					if(response) {
						response = response.trim();
						if (response == "") {
							$('.normal-order-list').hide();
						} else {
							$('.normal-order-list').show();
							var html = $(response);
							$('.normal-order-list').html(html);
						}
					}
				}
			});
		}
		$("#order-wait-pay").on("click", function() {
			getTopNormalOrdersGroupByState("wait_pay");
		});
		$("#order-wait-delivery").on("click", function() {
			getTopNormalOrdersGroupByState("wait_delivery");
		});
		$("#order-wait-recv").on("click", function() {
			getTopNormalOrdersGroupByState("wait_recv");
		});
		$("#order-wait-evaluate").on("click", function() {
			getTopNormalOrdersGroupByState("wait_evaluate");
		});
		$("#order-completion").on("click", function() {
			getTopNormalOrdersGroupByState("completion");
		});
		
		
		
		
		
		
		
		
		$("#wait_pay").on("click", function() {
			getTopOrdersGroupByState("wait_pay");
		});
		$("#wait_ack").on("click", function() {
			getTopOrdersGroupByState("wait_ack");
		});
		$("#wait_recv").on("click", function() {
			getTopOrdersGroupByState("wait_recv");
		});
		$("#completion").on("click", function() {
			getTopOrdersGroupByState("completion");
		});
		getTopOrdersGroupByState("wait_pay");
		getTopNormalOrdersGroupByState("wait_pay");
		
		
		$.ajax({
			type: "get",
			url: "/bid/list/top.shtml",
			data: {
				
			}, 
			error: function() {
				var tips = new Tips('tmpl-tips', "与服务器通信失败，请检查网络是否稳定");
				tips.show();
				return;
			}, 
			success: function(response) {
				if(response) {
					response = response.trim();
					if (response == "") {
						$('.bid-not-issue').show();
						$('.bid-list').hide();
					} else {
						var html = $(response);
						$(".bid-list").prepend(html);
					}
				}
			}
		});
		
		$.ajax({
			type: "get",
			url: "../item_as_json.shtml?top",
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


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
					var stat = $(".order-sheet-stats").text();
					stat++;
					$(".order-sheet-stats").text(stat);
					return;
			    }
			}
		}
	});
}

function items(type, position, fn) {
	var url = "/index.shtml?" + type + "&" + position;
	$.ajax({
		type: "get",
		url: url,
		data: {
			
		}, 
		error: function() {
			var tips = new Tips('tmpl-tips', "与服务器通信失败，请检查网络是否稳定");
			tips.show();
			return;
		}, 
		success: fn
	});
}

function bids(type, position, fn) {
	var url = "/bid/index.shtml?" + type + "&" + position;
	$.ajax({
		type: "get",
		url: url,
		data: {
			
		}, 
		error: function() {
			var tips = new Tips('tmpl-tips', "与服务器通信失败，请检查网络是否稳定");
			tips.show();
			return;
		}, 
		success: fn
	});
}


var myScroll,
	pullDownEl, pullDownOffset,
	pullUpEl, pullUpOffset,
	generatedCount = 0;

function pullDownAction () {
	setTimeout(function () {	// <-- Simulate network congestion, remove setTimeout from production!
		var el, li, i;
		el = document.getElementById('thelist');

		/*
		for (i=0; i<3; i++) {
			li = document.createElement('li');
			li.innerText = 'Generated row ' + (++generatedCount);
			el.insertBefore(li, el.childNodes[0]);
		}
		*/
		var s = $('.item-normal');
		if (s.hasClass('item-selected')) {
			items('html', 'down', function(response) {
				if(response) {
					var html = $(response);
					$("#thelist").prepend(html);
					
					//el.insertBefore(li, el.childNodes[0]);
				}
			});
		} else {
			bids('html', 'down', function(response) {
				if(response) {
					var html = $(response);
					$("#thelist").prepend(html);
					
					//el.insertBefore(li, el.childNodes[0]);
				}
			});
		}
		
		myScroll.refresh();		// Remember to refresh when contents are loaded (ie: on ajax completion)
	}, 1000);	// <-- Simulate network congestion, remove setTimeout from production!
}

function pullUpAction () {
	setTimeout(function () {	// <-- Simulate network congestion, remove setTimeout from production!
		var el, li, i;
		el = document.getElementById('thelist');
		
		/*
		for (i=0; i<3; i++) {
			li = document.createElement('li');
			li.innerText = 'Generated row ' + (++generatedCount);
			el.appendChild(li, el.childNodes[0]);
		}
		*/
		
		var s = $('.item-normal');
		if (s.hasClass('item-selected')) {
			items('html', 'up', function(response) {
				if(response) {
					var html = $(response);
					$("#thelist").append(html);
					
					//el.insertBefore(li, el.childNodes[0]);
				}
			});
		} else {
			bids('html', 'up', function(response) {
				if(response) {
					var html = $(response);
					$("#thelist").append(html);
					
					//el.insertBefore(li, el.childNodes[0]);
				}
			});
		}
		
		myScroll.refresh();		// Remember to refresh when contents are loaded (ie: on ajax completion)
	}, 1000);	// <-- Simulate network congestion, remove setTimeout from production!
}

function loaded() {
	pullDownEl = document.getElementById('pullDown');
	pullDownOffset = pullDownEl.offsetHeight;
	pullUpEl = document.getElementById('pullUp');	
	pullUpOffset = pullUpEl.offsetHeight;
	
	myScroll = new iScroll('wrapper', {
		useTransition: true,
		topOffset: pullDownOffset,
		onRefresh: function () {
			if (pullDownEl.className.match('loading')) {
				pullDownEl.className = '';
				pullDownEl.querySelector('.pullDownLabel').innerHTML = '向下拖动刷新...';
			} else if (pullUpEl.className.match('loading')) {
				pullUpEl.className = '';
				pullUpEl.querySelector('.pullUpLabel').innerHTML = '向上拉动刷新...';
			}
		},
		onScrollMove: function () {
			if (this.y > 5 && !pullDownEl.className.match('flip')) {
				pullDownEl.className = 'flip';
				pullDownEl.querySelector('.pullDownLabel').innerHTML = '释放刷新...';
				this.minScrollY = 0;
			} else if (this.y < 5 && pullDownEl.className.match('flip')) {
				pullDownEl.className = '';
				pullDownEl.querySelector('.pullDownLabel').innerHTML = '向下拖动刷新...';
				this.minScrollY = -pullDownOffset;
			} else if (this.y < (this.maxScrollY - 5) && !pullUpEl.className.match('flip')) {
				pullUpEl.className = 'flip';
				pullUpEl.querySelector('.pullUpLabel').innerHTML = '释放刷新...';
				this.maxScrollY = this.maxScrollY;
			} else if (this.y > (this.maxScrollY + 5) && pullUpEl.className.match('flip')) {
				pullUpEl.className = '';
				pullUpEl.querySelector('.pullUpLabel').innerHTML = '向上拉动刷新...';
				this.maxScrollY = pullUpOffset;
			}
		},
		onScrollEnd: function () {
			if (pullDownEl.className.match('flip')) {
				pullDownEl.className = 'loading';
				pullDownEl.querySelector('.pullDownLabel').innerHTML = '正在加载...';				
				pullDownAction();	// Execute custom function (ajax call?)
			} else if (pullUpEl.className.match('flip')) {
				pullUpEl.className = 'loading';
				pullUpEl.querySelector('.pullUpLabel').innerHTML = '正在加载...';				
				pullUpAction();	// Execute custom function (ajax call?)
			}
		}
	});
	
	setTimeout(function () { document.getElementById('wrapper').style.left = '0'; }, 800);
}

document.addEventListener('touchmove', function (e) { e.preventDefault(); }, false);

document.addEventListener('DOMContentLoaded', function () { setTimeout(loaded, 200); }, false);

function onBoxItemSelected(selectedItem) {
	if (selectedItem.hasClass('item-selected')) {
		return;
	}
	var boxitems = $("li", '.list-item-toolbar-box');
	for (var i = 0; i < boxitems.length; i++) {
		var boxitem = $(boxitems[i]);
		boxitem.removeClass('item-selected');
		boxitem.css('backgroundColor', '');
	}
	
	selectedItem.addClass('item-selected');
	selectedItem.css('backgroundColor', 'silver');
}

$(document).ready(function(){
	$('#order-sheet').on("click", function() {
		var box = $('.nav-bar-box-cart-and-ordersheet');
		box.toggle();
	});
	
	$('.item-normal').on('click', function() {
		var _this = $(this);
		onBoxItemSelected(_this);
		items('html', '', function(response) {
			if(response) {
				var html = $(response);
				$("#thelist").html(html);
				
				//el.insertBefore(li, el.childNodes[0]);
			}
		});
	});
	
	$('.item-bid').on('click', function() {
		var _this = $(this);
		onBoxItemSelected(_this);
		bids('html', '', function(response) {
			if(response) {
				var html = $(response);
				$("#thelist").html(html);
				
				//el.insertBefore(li, el.childNodes[0]);
			}
		});
	});
	
	$.ajax({
		type: "post",
		url: "/order-sheet/simple.shtml",
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
					var stat = $(".order-sheet-stats").text();
					stat = parseInt(stat);
					stat += response.count;
					$(".order-sheet-stats").text(stat);
					return;
			    }
			}
		}
	});
});




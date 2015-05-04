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
            t.css("zIndex", 1000);
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

Loading = function(context, title) {
	// 错误弹窗
    var _popTimer = true;
    var loading = null;
	function _show() {
		if(_popTimer){
            _popTimer = false;
            
            var html = $("#" + context).html();
			loading = $(html);
			$(document.body).append(loading);
			
			//loading.html(title);
			loading.css("display", "block");
			loading.css("zIndex", 1000);
			/*
            setTimeout(function(){
                _popTimer = true;
                loading.css("display", "none");
                loading.remove();
            },2000);
            */
        }
	}
	
	function _hide() {
		if (loading != null) {
			loading.css("display", "none");
            loading.remove();
            loading = null;
		}
	}
	
	return {
		show: _show, 
		hide: _hide
	};
};
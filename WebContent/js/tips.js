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
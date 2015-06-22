(function ($) {
  $.fn.slideDown = function (duration) {    
    // get old position to restore it then
    var position = this.css('position');
    
    // show element if it is hidden (it is needed if display is none)
    this.show();
    
    // place it so it displays as usually but hidden
    this.css({
      position: 'absolute',
      visibility: 'hidden'
    });

    // get naturally height
    var height = this.height();
    
    // set initial css for animation
    this.css({
      position: position,
      visibility: 'visible',
      overflow: 'hidden',
      height: 0
    });

    // animate to gotten height
    var _this = $(this);
    _this.animate({
      height: height
    }, duration, function() {
    	_this.removeAttr("style");
    });
  };
    $.fn.isArray = function(obj) { 
	  return Object.prototype.toString.call(obj) === '[object Array]'; 
  	};
  	
	$.fn.ajax = {
		ajaxSubmit: function(args, action, func) {
			this.clearContext(); 
			this.callBack = null; 
			var subArr = []; 
			var subArrT = []; 
			if ($.fn.isArray(args)) { 
				subArr = args; 
			} else { 
				var tag = args.tagName.toLowerCase(); 
				if (tag == "form") { 
					for (var i = 0, num = args.childNodes.length; i < num; i++) { 
						subArr.push(args.childNodes[i]); 
					} 
				} else { 
					subArr = [args]; 
				} 
			} 
			//create asyn form and ifroma 
			var objForm = document.createElement("form"); 
			objForm.action = action; 
			objForm.target = "bBankAsynFormSubmit_iframe_1b"; 
			objForm.encoding = "multipart/form-data"; 
			objForm.method = "post"; 
			objForm.id = "bBankAsynFormSubmit_form_1b"; 
			objForm.style.display = "none"; 
			var objIframe = $('<iframe id="bBankAsynFormSubmit_iframe_1b" name="bBankAsynFormSubmit_iframe_1b" src="about:blank" style="display:none;" onload="javascript:setTimeout(\'window.parent.$.fn.ajax.complete()\', 100)"></iframe>')[0]; 
//			var objIframe = document.createElement("iframe");
//			objIframe.id = "bBankAsynFormSubmit_iframe_1b";
//			objIframe.name = "bBankAsynFormSubmit_iframe_1b";
//			objIframe.src = "about:blank";
//			objIframe.style.display = "none";
//			objIframe.onload="javascript:setTimeout(\'asyn.complete()\', 100)";
			//add submit value in form 
			for (var i = 0, num = subArr.length; i < num; i++) { 
				if (!subArr[i].name && subArr[i].nodeType == 1 && subArr[i].tagName.toLowerCase() == "input") 
					subArr[i].name = "bBankAsynFormSubmit_input_1b_" + i; 
				var input = subArr[i].cloneNode(true); 
				subArrT.push(input); 
				subArr[i].parentNode.replaceChild(input, subArr[i]); 
				objForm.appendChild(subArr[i]); 
			} 
			//submit 
			document.body.appendChild(objIframe); 
			document.body.appendChild(objForm); 
			objForm.submit(); 
			//dispose 
			for (var i = 0, num = subArrT.length; i < num; i++) { 
				subArrT[i].parentNode.replaceChild(subArr[i], subArrT[i]); 
			} 
			if (func) 
				this.callBack = func; 
		}, 
		complete: function () { 
			var responseText = ""; 
			try { 
				var objIframe = document.getElementById("bBankAsynFormSubmit_iframe_1b"); 
				if (objIframe.contentWindow) { 
					responseText = objIframe.contentWindow.document.body.innerHTML; 
				} else { 
					responseText = objIframe.contentDocument.document.body.innerHTML;
				}
			} catch (err) { } 
			this.clearContext(); 
			if (this.callBack) 
				this.callBack(responseText); 
		}, 
		clearContext: function () { 
			if ($('#bBankAsynFormSubmit_form_1b')) 
				$('#bBankAsynFormSubmit_form_1b').remove();
			if ($('#bBankAsynFormSubmit_iframe_1b')) 
				$('#bBankAsynFormSubmit_iframe_1b').remove(); 
		},
		callBack: null
	}
})(Zepto);


$(function () {
	  $('.slide-trigger').on('click', function () {
	    $('.slide').slideDown(2000);
	  });
	});

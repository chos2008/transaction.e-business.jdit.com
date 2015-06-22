function getProductCallback(productId) {
		var url = "/product/" + productId + ".shtml";
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
			success: function(response) {
				if(response) {
					var html = $(response);
					$(".s-item-list").prepend(html);
					
					//el.insertBefore(li, el.childNodes[0]);
				}
			}
		});
	}
window.onload = function() {
	
	
	$("#item_image").on("change", function() {
		if (typeof FileReader === 'undefined') {
	        alert('本地图片预览功能不支持...');
	        return;
	    }
	    var reader = new FileReader();
	    reader.onload = function(e) {
	        //$(".add-item-img").attr("src", this.result);
	    	$(".add-item-img").css("backgroundImage", "url(" + this.result + ");");
	    };
	    reader.readAsDataURL(document.getElementById("item_image").files[0]);
	});
	
	
	
	$(".add-item").on('click', function() {
		var name = $("#name").val();
		if (name == "") {
			var tips = new Tips('tmpl-tips', "请填写商品名称");
			tips.show();
			return;
		}
		var price = $('#price').val();
		if (price == "") {
			var tips = new Tips('tmpl-tips', "请输入商品价格");
			tips.show();
			return;
		}
		var stock = $('#stock').val();
		if (stock == "") {
			var tips = new Tips('tmpl-tips', "请输入商品库存");
			tips.show();
			return;
		}
		var content = $('#content').val();
		if (content == "") {
			var tips = new Tips('tmpl-tips', "请输入商品描述");
			tips.show();
			return;
		}
		
		
		var form = $("#u_item");
		
//		$.fn.ajax.ajaxSubmit(document.getElementById("u_item"), form.attr("action"), function(resp) {
//			alert("....");
//		});
		
//		form.attr("action", "../../../item/item/add.shtml");
//		form.attr("method", "post");
//		form.attr("enctype", "multipart/form-data");
		
		
//		form.submit(function(e){
//			  alert("Submitted");
//		});
		form.submit();
//		document.getElementById("u_item").submit(function(e){
//			alert("Submitted");
//		});
		//$("#submit", form).submit();
		
//		var options = {
//            url: form.attr("action"), 
//            type: 'post', 
//            success: function(data) {
//                var jsondata = eval("("+data+")");
//                if(jsondata.error == "0") {
////                    var url = jsondata.url;
////                    alert(url);
////                    $("#img").attr("src", url);
//                }else{
////                    var message = jsondata.message;
////                    alert(message);
//                }
//            }
//        };
//		form.ajaxSubmit(options);
		
//		$.ajax({
//			type: "post", 
//			url: "/item/add.shtml", 
//			data: {
//				"name": name, 
//				"price": price, 
//				"stock": stock, 
//				"content": content
//			}, 
//			error: function() {
//				var tips = new Tips('tmpl-tips', "与服务器通信失败，请检查网络是否稳定");
//				tips.show();
//				return;
//			}, 
//			success:function(response) {
//				if(response){
//				    if(response.code == 0) {
//				    	location.href = "/mindex.htm";
//						return;
//				    }
//				    var tips = new Tips('tmpl-tips', "商品添加失败");
//					tips.show();
//					return;
//				}
//			}
//		});
	});
}
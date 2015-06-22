
	window.onload = function() {
		$('.add-user-address').on('click', function() {
			var username = $("#username").val();
			var contact = $("#contact").val();
			var region = $("#region").val();
			var address = $("#address").val();
			var postcode = $("#postcode").val();
			if (username == "") {

				//t.show();
				var tip = new Tips("tmpl-tips", "请输入收货人姓名");
				tip.show();
				return;
			}

			if (contact == "") {
				var tip = new Tips("tmpl-tips", "请输入收货人联系电话");
				tip.show();
				return;
			}

			if (region == "") {
				var tip = new Tips("tmpl-tips", "请输入所在地区");
				tip.show();
				return;
			}
			if (address == "") {
				var tip = new Tips("tmpl-tips", "请输入详细地址");
				tip.show();
				return;
			}
			var loading = new Loading("tmpl-loading", "请输入...");
			loading.show();
			$.ajax({
				type:"post",
				url: "../../address/add.shtml",
				data: {
					"username": username, 
					"contact": contact, 
					"region": region,
					"address": address,
					"postcode": postcode
				}, 
				error: function() {
					loading.hide();

					var tips = new Tips('tmpl-tips', "与服务器通信失败，请检查网络是否稳定");
					tips.show();
					return;
				}, 
				success:function(response) {
					loading.hide();

					if(response) {
						if(response.code == 0) {
							location.href="../../mindex.htm";
							return;
						}
						var tips = new Tips('tmpl-tips', "添加失败");
						tips.show();
						return;
					}
				}
			});
		});
	};

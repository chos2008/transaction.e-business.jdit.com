<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<title>谁是谁的菜</title>

<script type="text/javascript">
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

	function back() {
		var i = document.getElementById('investment');
		var sp = document.getElementById('sp');
		
		sp.style.display = 'none';
		i.style.display = 'none';
		
		var menuItem = document.getElementById('menu-item');
		menuItem.style.display = 'block';
	}
	
	function commit(investment) {
		var menuItem = document.getElementById('menu-item');
		menuItem.style.display = 'none';
		if (investment == 1) {
			var i = document.getElementById('investment');
			var sp = document.getElementById('sp');
			
			sp.style.display = 'block';
			i.style.display = 'none';
			
			var b = document.getElementById('nav-back');
			unbind(b, "click", back);
			bind(b, "click", back);
		} else if(investment == 2) {
			var i = document.getElementById('investment');
			var sp = document.getElementById('sp');
			
			sp.style.display = 'none';
			i.style.display = 'block';
			
			var b = document.getElementById('nav-back');
			unbind(b, "click", back);
			bind(b, "click", back);
		} else {
			
		}
	}
	
	function onsole() {
		var project = document.getElementById('project');
		project.placeholder = "请描述您的需求";
		
		var submit = document.getElementById('submit-investment');
		submit.value = "发布需求";
	}
	
	function oncompany() {
		var project = document.getElementById('project');
		project.placeholder = "请描述您要发布的生意";
		
		var submit = document.getElementById('submit-investment');
		submit.value = "发布生意";
	}
</script>
</head>
<body style="margin: 0px 0px; padding: 0px 0px;">
<div id="nav" style="width = 100%;">
	<div style="width: 100%; display: -moz-box; display: -webkit-box; display: box; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;">
		<!--  -moz-box-flex:3; -webkit-box-flex:3; box-flex:3; -->
		<p id="nav-back" style="width: 70px; height: 36px; line-height: 36px; margin: 0px 0px; text-align: center;">
			<label title="paypal" class="icon-paypal" style="width: 100%; display: block;"></label>
			<label style="width: 100%; display: block;"><a href="javascript: void(0);">返回</a></label>
		</p>
		<p style="width: 70px; height: 36px; line-height: 36px; margin: 0px 0px; text-align: center;">
			<label title="google wallet" class="icon-google-wallet" style="width: 100%; display: block;"></label>
			<label style="width: 100%; display: block;"><a href="investment.jsp"></a></label>
		</p>
	</div>
</div>

<div id="menu-item" style="width = 100%;">
	<div style="width: 100%; display: -moz-box; display: -webkit-box; display: box; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;">
		<!--  -moz-box-flex:3; -webkit-box-flex:3; box-flex:3; -->
		<div onclick="javascript: commit(1);" style="width: 70px; text-align: center; margin: 4px 4px 4px 2px;">
			<div style="height: 70px; border: 1px solid silver; border-radius: 3px 3px; -moz-border-radius: 3px 3px; -webkit-border-radius: 3px 3px;">
				<label title="google wallet" class="icon-google-wallet" style="width: 100%; display: block;"></label>
				<label style="width: 100%; display: block;"><a href="javascript: void(0);">寻找项目</a></label>
			</div>
		</div>
		<div onclick="javascript: commit(2);" style="width: 70px; text-align: center; margin: 4px 2px 4px 4px;">
			<div style="height: 70px; border: 1px solid silver; border-radius: 3px 3px; -moz-border-radius: 3px 3px; -webkit-border-radius: 3px 3px;">
				<label title="paypal" class="icon-paypal" style="width: 100%; display: block;"></label>
				<label style="width: 100%; display: block;"><a href="javascript: void(0);">招商</a></label>
			</div>
		</div>
		<div onclick="javascript: commit(3);" style="width: 70px; text-align: center; margin: 4px 2px 4px 4px;">
			<div style="height: 70px; border: 1px solid silver; border-radius: 3px 3px; -moz-border-radius: 3px 3px; -webkit-border-radius: 3px 3px;">
				<label title="paypal" class="icon-paypal" style="width: 100%; display: block;"></label>
				<label style="width: 100%; display: block;"><a href="javascript: void(0);">个人需求</a></label>
			</div>
		</div>
	</div>
</div>

<div id="investment" style="display: none;">
	<div style="width: 100%;">
		<div style="width: 100%; display: -moz-box; display: -webkit-box; display: box; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;">
			<!--  -moz-box-flex:3; -webkit-box-flex:3; box-flex:3; -->
			<p style="width: 70px; height: 36px; text-align: center;">
				<label><input type="radio" name ="option" value="sole" onclick="javascript: onsole();">个体</label>
			</p>
			<p style="width: 70px; height: 36px; text-align: center;">
				<label><input type="radio" name ="option" value="company" checked="checked" onclick="javascript: oncompany();">公司</label>
			</p>
		</div>
		
		
	
		<div style="margin: 2px 5px 3px; border: 1px solid silver;">
			<input id="project" type="text" name="pname" placeholder="请填写招标项目名称" style="width: 100%; height: 35px; border: 0px solid red;"/>
		</div>
		
		<div style="margin: 2px 5px 3px; border: 1px solid silver;">
			<input type="text" name="pname" placeholder="手机/电子邮箱" style="width: 100%; height: 35px; border: 0px solid red;"/>
		</div>
		
		<div style="margin: 2px 5px 3px; border: 1px solid silver;">
			<input type="text" name="pname" placeholder="请填写招标项目金额" style="width: 100%; height: 35px; border: 0px solid red;"/>
		</div>
		
		<div style="margin: 2px 5px 3px; border: 1px solid silver;">
			<textarea rows="20" spellcheck="true" contenteditable="true" placeholder="请填写招标项目具体要求" style="width: 100%; border: 0px solid red; margin: 0px 0px; padding: 0px 0px; resize: none;"></textarea>
		</div>
		
		<div style="margin: 2px 5px 3px; border: 1px solid silver;">
			<input type="text" name="pname" placeholder="请填写招标项目结束时间" style="width: 100%; height: 35px; border: 0px solid red;"/>
		</div>
		
		<div style="margin: 2px 5px 3px; border: 1px solid silver; text-align: center;">
			<input id="submit-investment" type="submit" value="发布招标项目" style="width: 100%; height: 35px; border: 1px solid red;"/>
		</div>
	</div>
</div>

<div id="sp" style="display: none;">
	<div style="width: 100%;">
		<div style="margin: 2px 5px 3px; border: 1px solid silver;">
			<input type="text" name="pname" placeholder="请填写招标项目名称" style="width: 100%; height: 35px; border: 0px solid red;"/>
		</div>
		
		<div style="margin: 2px 5px 3px; border: 1px solid silver;">
			<input type="text" name="pname" placeholder="手机/电子邮箱" style="width: 100%; height: 35px; border: 0px solid red;"/>
		</div>
		
		<div style="margin: 2px 5px 3px; border: 1px solid silver;">
			<input type="text" name="pname" placeholder="请填写招标项目金额" style="width: 100%; height: 35px; border: 0px solid red;"/>
		</div>
		
		<div style="margin: 2px 5px 3px; border: 1px solid silver;">
			<textarea rows="20" spellcheck="true" contenteditable="true" placeholder="请填写招标项目具体要求" style="width: 100%; border: 0px solid red; margin: 0px 0px; padding: 0px 0px; resize: none;"></textarea>
		</div>
		
		<div style="margin: 2px 5px 3px; border: 1px solid silver;">
			<input type="text" name="pname" placeholder="请填写招标项目结束时间" style="width: 100%; height: 35px; border: 0px solid red;"/>
		</div>
		
		<div style="margin: 2px 5px 3px; border: 1px solid silver; text-align: center;">
			<input type="submit" value="发布招标项目" style="width: 100%; height: 35px; border: 1px solid red;"/>
		</div>
	</div>
</div>
</body>
</html>
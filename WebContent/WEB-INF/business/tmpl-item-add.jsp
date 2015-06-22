<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<iframe name="ajax-submit-callback" src="about:blank" style="display:none;" >
	
</iframe>
<div>
	<form id="u_item" target="ajax-submit-callback" action="../../../item/item/add.shtml?store_id=${param.storeId}" method="post" enctype="multipart/form-data">
		<div style="position: relative; margin: 2px 5px 3px 20px; border: 0px solid silver;">
			<input id="name" type="text" maxlength="32" name="name" placeholder="请填写商品名称" style="width: 100%; height: 35px; line-height: 35px; border: 0px solid red; background: transparent; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; outline: none; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only;"/>
		</div>
		
		<div style="position: relative; margin: 2px 5px 3px 20px; border: 0px solid silver;">
			<span style="width: 100%; display: block; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; color: initial;  -webkit-appearance: textfield;-webkit-appearance: textfield; padding: 1px; background-color: white; border: 0px inset; border-image-source: initial; border-image-slice: initial; border-image-width: initial; border-image-outset: initial; border-image-repeat: initial; -webkit-rtl-ordering: logical; -webkit-user-select: text; cursor: auto; color: darkgrey;">商品图片</span>
			<span class="add-item-img" style="position: relative;"><input id="item_image" type="file" name="item_image" style="width: 100%; position: absolute; top: 0px; right: 0px; bottom: 0px; left: 0px; text-align: right; opacity:0; filter:Alpha(opacity: 0);"></span>
		</div>
		
		<div style="margin: 2px 5px 3px; padding: 3px 5px 3px 15px; border: 0px solid silver; background-color: white; background-image: url('images/qapp_center_loading.png'); background-position: center center; background-repeat: no-repeat; opacity: 0.6;">
			<textarea id="content" name="content" rows="10" spellcheck="true" contenteditable="true" placeholder="请输入商品描述" style="width: 100%; border: 0px solid red; margin: 0px 0px; padding: 0px 0px; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; resize: none; outline: none; opacity: 0.6; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only;"></textarea>
		</div>
		
		<div style="position: relative; margin: 2px 5px 3px 20px; border: 0px solid silver;">
			<input id="price" type="number" maxlength="32" name="price" placeholder="请输入商品价格" style="width: 100%; height: 35px; line-height: 35px; border: 0px solid red; background: transparent; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; outline: none; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only; margin: 0; -moz-appearance: textfield;"/>
		</div>
		
		<div style="position: relative; margin: 2px 5px 3px 20px; border: 0px solid silver;">
			<input id="stock" type="number" maxlength="32" name="stock" placeholder="请输入商品库存" style="width: 100%; height: 35px; line-height: 35px; border: 0px solid red; background: transparent; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; outline: none; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only; margin: 0; -moz-appearance: textfield;"/>
		</div>
		<!-- 
		<input type="submit" value="提交" style=""/>
		 -->
	</form>
</div>

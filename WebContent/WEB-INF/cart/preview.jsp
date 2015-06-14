<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<%@ taglib prefix="fmt" uri="/WEB-INF/fmt.tld"%>
<div class="preview" style="background-color: white; height: 350px;">
	<ul class="list-item list-item-t" style="height: 90px; line-height: 90px; position: relative; border: 0px solid silver;">
		<li class="list-item-t-item" style="height: 90px; line-height: 90px;">
			<span class="list-item-t-item-preview-cart-img-back" style="cursor: pointer;"></span>
		</li>
		<li class="list-item-t-item-right" style="height: 90px; line-height: 24px; margin: 0px 0px; padding: 33px 4px 0px 0px;">
			<!-- 
			<span class="list-item-t-item-preview-cart-img-close"></span>
			 -->
			<a class="dd_cart" bind-data="${param.itemId}" href="javascript: void(0);" style="width: 60px; margin: 0px auto; height: 24px; line-height: 24px; display: block; color: #fff; background-color: #ff3c3c; border: 1px solid #BE4646; border-radius: 3px; -webkit-border-radius: 3px; text-align: center; font-size: 0.5rem;">确定</a>
		</li>
	</ul>
	<ul class="list-item list-item-t" style="height: 90px; line-height: 90px; position: relative; border: 0px solid silver;">
		<li class="list-item-t-item" style="height: 90px; line-height: 90px;">
			<span style="display: block; line-height: 24px;">&yen;${item.amount}</span>
			<span style="display: block; line-height: 24px;">库存${item.stock}</span>
			<span style="display: block; line-height: 24px;"><a>${item.title}</a></span>
		</li>
	</ul>
	<ul style="list-style: none;">
		<li style="border: 0px solid silver;">
		<div>数量： <input class="quantity" type="number" value="1" maxlength="32" name="title" placeholder="" style="width: 100%; height: 35px; line-height: 35px; border: 0px solid red; background: transparent; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; outline: none; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only; margin: 0; -moz-appearance: textfield;"/></div>
		</li>
	</ul>
</div>
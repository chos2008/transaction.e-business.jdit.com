<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<title>我的账户</title>
<link rel="stylesheet" type="text/css" href="../css/common-style.css"/>
</head>
<body style="margin: 0px 0px;">
<div style="width: 100%;">
	<div style="">
	<c:choose>
		<c:when test="${empty alapay}">
		<div style="width: 40px; height: 40px; margin: 0px auto; border-radius: 20px 20px 20px 20px; background: url('../images/m_logo_j_40x40.jpg'); background-position: center center; background-repeat: no-repeat; background-size: 100% 100%;"></div>
		<p style="margin: 0px 0px; padding: 0px 0px; text-align: center;"><a href="/user/bindAlaPayAccount.shtml">绑定支付账户</a></p>
		</c:when>
		
		<c:otherwise>
		<div style="width: 40px; height: 40px; margin: 0px auto; border-radius: 20px 20px 20px 20px; background: url('../images/m_logo_j_40x40.jpg'); background-position: center center; background-repeat: no-repeat; background-size: 100% 100%;"></div>
			<c:choose>
				<c:when test="${empty account or empty account.balance}">
				<p style="margin: 0px 0px; padding: 0px 0px; text-align: center;">账户余额<br/>&yen;0.00</p>
				</c:when>
				<c:otherwise>
				<p style="margin: 0px 0px; padding: 0px 0px; text-align: center;">账户余额<br/>&yen;${account.balance}</p>
				</c:otherwise>
			</c:choose>
		</c:otherwise>
	</c:choose>
	</div>
</div>

<div class="copyright" style="width: 100%; bottom: 0px; text-align: center;">
	<div style="padding: .9rem .4rem 4rem; background-color: #4e525e;">
		<div style="width: 100%; display: -moz-box; display: -webkit-box; display: box; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;">
			<p style="width: 160px; margin: 0px 0px; text-align: center;">
				<a href="../user/logout.shtml" style="border-radius: 6px; font-size: 14px; display: block; height: 1.5rem; line-height: 1.5rem; color: #c3c6ca; border: 2px solid #42454d; background-color: #555965; padding: 0 .75rem; text-decoration: none;">退出当前帐号</a>
			</p>
		</div>
		<div style="width: 100%; display: -moz-box; display: -webkit-box; display: box; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;">
			<p style="width: 70px; height: 36px; line-height: 36px; margin: 0px 0px; text-align: center;">
				<a href="javascript: void(0);" style="text-decoration: none;">触屏版</a>
			</p>
			<p style="width: 70px; height: 36px; line-height: 36px; margin: 0px 0px; text-align: center;">
				<a href="javascript: void(0);" style="text-decoration: none;">极速版</a>
			</p>
			<p style="width: 70px; height: 36px; line-height: 36px; margin: 0px 0px; text-align: center;">
				<a href="javascript: void(0);" style="text-decoration: none;">电脑版</a>
			</p>
		</div>
		<div style="width: 100%; margin-top: .9rem; height: .9rem; line-height: .9rem; box-sizing: border-box; background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACEAAAAhCAMAAABgOjJdAAAAGXRFW…v7MdDuE3a/JRrCmqwFQ2yV8gmvg/d+aPCMH0GLvB//AgwAo1MTpxsaxVoAAAAASUVORK5CYII=) no-repeat 3.7rem center; background-size: .85rem .85rem; color: #c3c6ca; font-size: 12px;">
			上海正旅网络科技有限公司版权所有 2008-2014 <a href="#" target="_blank" seed="copyright-link" smartracker="on"></a>
		</div>
	</div>
</div>

	
</body>
</html>
var articleTitle=""+document.title.substring(0, document.title.indexOf("-"));
var articleUrl=""+document.location.href;
function postToWb(){
	var _t = encodeURI(articleTitle);
	var _url = encodeURI(articleUrl);
	var _appkey = encodeURI("c59181915b944d7abcb5b628a8e89990");//你从腾讯获得的appkey
	var _pic = encodeURI('');//（列如：var _pic='图片url1|图片url2|图片url3....）
	var _site = 'http://www.ebrun.com/';//你的网站地址
	var _u = 'http://v.t.qq.com/share/share.php?title='+_t+'&url='+_url+'&appkey='+_appkey+'&site='+_site+'&pic='+_pic;
	window.open( _u,'转播到腾讯微博', 'width=700, height=680, top=0, left=0, toolbar=no, menubar=no, scrollbars=no, location=yes, resizable=no, status=no' );
}
function snsQQ(){
	var _u = 'http://sns.qzone.qq.com/cgi-bin/qzshare/cgi_qzshare_onekey?url='+encodeURIComponent(articleUrl)+'&title='+encodeURIComponent(articleTitle);
	window.open( _u,'分享到QQ空间', 'width=700, height=680, top=0, left=0, toolbar=no, menubar=no, scrollbars=no, location=yes, resizable=no, status=no' );
}

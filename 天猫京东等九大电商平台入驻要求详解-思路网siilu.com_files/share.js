var articleTitle=""+document.title.substring(0, document.title.indexOf("-"));
var articleUrl=""+document.location.href;
function postToWb(){
	var _t = encodeURI(articleTitle);
	var _url = encodeURI(articleUrl);
	var _appkey = encodeURI("c59181915b944d7abcb5b628a8e89990");//�����Ѷ��õ�appkey
	var _pic = encodeURI('');//�����磺var _pic='ͼƬurl1|ͼƬurl2|ͼƬurl3....��
	var _site = 'http://www.ebrun.com/';//�����վ��ַ
	var _u = 'http://v.t.qq.com/share/share.php?title='+_t+'&url='+_url+'&appkey='+_appkey+'&site='+_site+'&pic='+_pic;
	window.open( _u,'ת������Ѷ΢��', 'width=700, height=680, top=0, left=0, toolbar=no, menubar=no, scrollbars=no, location=yes, resizable=no, status=no' );
}
function snsQQ(){
	var _u = 'http://sns.qzone.qq.com/cgi-bin/qzshare/cgi_qzshare_onekey?url='+encodeURIComponent(articleUrl)+'&title='+encodeURIComponent(articleTitle);
	window.open( _u,'����QQ�ռ�', 'width=700, height=680, top=0, left=0, toolbar=no, menubar=no, scrollbars=no, location=yes, resizable=no, status=no' );
}

$(document).ready(function(){
	
	$(".head ul li a").each(function(index, el){
		var url = el.href;
		if (url.charAt(url.length-1) == "/")
		{
			url = url.substr(0, url.length-1);
		}
		var curLocation = document.location.href;
		curLocation = curLocation.substring(0, curLocation.lastIndexOf("/"));
		if (curLocation==url)
		{
			$(el).css({'color':'#ff7d13','border-bottom':'2px solid #ff7d13'});
		}
	});
});
function updownsearch(){
	var event = window.event || arguments.callee.caller.arguments[0];
	if(event.keyCode==13){
      $('#searchbutton').click();
      return false;
	}
}
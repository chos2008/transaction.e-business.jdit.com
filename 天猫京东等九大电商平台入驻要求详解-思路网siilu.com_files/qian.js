// JavaScript Document

var olis=document.getElementById('hot_fw').getElementsByTagName('li');
for(var i=0;i<olis.length;i++)
{
	olis.item(i).onmouseover=function()
	{
		this.children[0].className='liover';
	}
	olis.item(i).onmouseout=function()
	{
		this.children[0].className='';
	}    
}

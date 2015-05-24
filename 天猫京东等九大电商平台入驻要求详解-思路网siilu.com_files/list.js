// JavaScript Document

function hotshow(index){
	var hiddl=document.getElementById('hosildshow').getElementsByTagName('dl');
	for(var i=0;i<hiddl.length;i++){
		if(i%2!=0){
			hiddl.item(i).style.display='none';
			}else{
				hiddl.item(i).style.display='block';
				}
			
		}
	hiddl.item(index).style.display='none';
	hiddl.item(index+1).style.display='block';

}

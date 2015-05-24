var re = /<script.*<\/script>/i;
var html = $("#cons_right_ebnews_j0").html();
var dao_new = $("#ebnews_dao_new").html();
html = html.replace(re, '');
dao_new = dao_new.replace(re,'');
if(html.length>5 && $("#ebnews_0")){
	$("#ebnews_0").html($("#ebnews_j0").html());
	$("#ebnews_j0").html('');
}
if(dao_new.length>5 && $("#dao_new")){
	$("#dao_new").addClass('dao_new');
	$("#dao_new").html($("#ebnews_dao_new").html());
	$("#ebnews_dao_new").html('');
}
if($("#art_ref") && $("#ebnews_art_rel")){
	var art_ref = $("#ebnews_art_rel").html();
	if(art_ref){
		art_ref = art_ref.replace(re,'');
		if(art_ref.length>5 && $("#art_ref")){
			$("#art_ref").addClass('fl');
			$("#art_ref").html(art_ref);
			$("#ebnews_art_rel").html();
		}
	}
}
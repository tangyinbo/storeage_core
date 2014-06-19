(function($){
	//事件按钮Id
	$.page={
			firstPage:"page_first",
			frontPage:"page_front",
			currentPate:"page_corrent",
			nextPage:"page_next",
			lastpage:"page_last",
			formNameId:"page_formId"
	};
	
	//获取formName;
	function getFormName(){
		var eventForm = $("#"+$.page.formNameId);
		if(typeof(formElent)=='undefined' )
			throw ' 默认的表单名称 page_formName  id 不存在';
		return eventForm;
	};
	//自定义事件Id
	$.page.reserteventId=function(options){
		$.page = $.extend($.page,options);
	}
	$("#"+$.page.firstPage).live('click',function(){
		var eventForm =getFormName();
		alert(eventForm.attr('name'));
	});
	$("#"+$.page.frontPage).live('click',function(){
		
		alert($.page.frontPage);
	});
	$("#"+$.page.currentPate).live('click',function(){
		alert($.page.currentPate);
	});
	$("#"+$.page.nextPage).live('click',function(){
		alert($.page.nextPage);
	});
	$("#"+$.page.lastpage).live('click',function(){
		alert($.page.lastpage);
	});

})(jQuery);
(function($){
	//事件按钮Id
	$.page={
			firstPage:"page_first",
			frontPage:"page_front",
			currentPate:"page_corrent",
			nextPage:"page_next",
			lastpage:"page_last",
			formNameId:"page_form",
			page:"page",
			pageCount:"page_count"
	};
	//获取formName;
	function getFormName(){
		var eventForm = $("#"+$.page.formNameId);
		if(typeof(eventForm)=='undefined' )
			throw ' 默认的表单名称 page_formName  id 不存在';
		return eventForm;
	};
	function getPage(){
		var pageElement = $("#page");
		if(typeof(pageElement)=='undefined') throw '页面缺少#page 元素';
		var page = pageElement.val();
		return page;
	}
	
	function firstPage(){
		 $("#page").val(1);
		 formSubmit();
	}
	function nextPage(){
		var page = getPage();
		 $("#page").val(++page);
		 formSubmit();
	}
	
	function lastPage(){
		$("#page").val($("#page_count").val());
		formSubmit();
	}
	
	function frontPage(){
		var page = getPage();
		 $("#page").val(--page);
		 formSubmit();
	}
	function formSubmit(){
		var eventForm =getFormName();
		eventForm.submit();
	}
	function preventEvent(ele){
		return $(ele).parent('li.disabled').length!=0;
	}
	
	//自定义事件Id
	/*$.page.reserteventId=function(options){
		$.page = $.extend($.page,options);
	}*/
	
		$(document).on('click',"#"+$.page.firstPage,function(){
			if(preventEvent(this))return;
			firstPage();
		});
		$(document).on('click',"#"+$.page.frontPage,function(){
			if(preventEvent(this))return;
			frontPage();
		});
		$(document).on('click',"#"+$.page.nextPage,function(){
			if(preventEvent(this))return;
			nextPage();
		});
		$(document).on('click',"#"+$.page.lastpage,function(){
			if(preventEvent(this))return;
			lastPage();
		});
})(jQuery);
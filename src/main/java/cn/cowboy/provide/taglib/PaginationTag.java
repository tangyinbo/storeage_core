package cn.cowboy.provide.taglib;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.cowboy.provide.common.Pagination;
import cn.cowboy.provide.exception.PaginationException;

/**
 * 
 * @ClassName: PaginationTag
 * @Description: TODO
 * @author Tangyinbo
 * @date 2014-6-19 下午2:33:04
 * 
 */
public class PaginationTag extends BodyTagSupport {
	private static final Logger log = LoggerFactory.getLogger(PaginationTag.class);
	private String formName;

	public void setFormName(String formName) {
		this.formName = formName;
	}

	@Override
	public int doStartTag() throws JspException {
		JspWriter write = pageContext.getOut();
		try {
			//write.print(outCss());
			write.print(printHtml());
		} catch (IOException e) {
			throw new JspException();
		} catch (PaginationException e) {
			log.error("====>>>>分页参数未赋值",e);
			throw new JspException(e);
		}
		return super.doStartTag();
	}

	@Override
	public int doEndTag() throws JspException {
		return super.doEndTag();
	}

	public String printCss(){
		String css = "<style type='text/css'>" +
				"#page_towhere{"+
					"width:50px"+
				"}</style>";
		return null;
	}
	private String printHtml() throws PaginationException{
		Pagination pagination =(Pagination) pageContext.getRequest().getAttribute("pagination");
		if(pagination==null){
			throw new PaginationException("the pagination param expect not null, but actual value is null...");
		}
		ClassGenerator generator = new ClassGenerator(pagination);
		String html = "<div class='pagination pagination-right' style='margin-top:0'>" +
				"<ul>" +
				"<li class=\""+generator.page_first+"\"><a href='#' id='page_first'><i class='icon-fast-backward'></i>first</a></li>" +
				"<li class=\""+generator.page_front+"\"><a href='#' id='page_front'><i class='icon-backward'></i>front</a></li>" +
				"<li class='disabled'><a href='#' id='page_corrent'>"+pagination.getCurrentPage()+"</a></li>" +
				"<li class=\""+generator.page_next+"\"><a href='#' id='page_next'><i class='icon-forward'></i>next</a></li>" +
				"<li class=\""+generator.page_last+"\"><a href='#' id='page_last'><i class='icon-fast-forward'></i>end</a></li>" +
				/*"<li><input type='text' class='input-mini'/></li>" +*/
				"</ul>" +
				"</div>";
		return html;
	}
	
	/**
	 * 
	* @ClassName: classGenerator
	* @Description: 类名生成器
	* @author Tangyinbo
	* @date 2014-6-20 上午9:44:41
	*
	 */
	private class ClassGenerator{
		private Pagination pagination;
		
		public ClassGenerator(Pagination pagination) {
			this.pagination = pagination;
			evalClass();
		}
		
		private static final String ACTIVECLASS="active";
		private static final String DISABLEDCLASS="disabled";
		public String page_first;
		public String page_front;
		public String page_corrent=DISABLEDCLASS;
		public String page_next;
		public String page_last;
		private void evalClass(){
			this.page_first=pagination.isFirstPage()?DISABLEDCLASS:"";
			this.page_front = pagination.isHasFrontPage()?"":DISABLEDCLASS;
			this.page_next = pagination.isHasNextPage()?"":DISABLEDCLASS;
			this.page_last = pagination.isLastPage()?DISABLEDCLASS:"";
		}
	}
	
	public String printScript(){
		String script="";
		return null;
	}
}

package cn.cowboy.provide.taglib;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * 
 * @ClassName: PaginationTag
 * @Description: TODO
 * @author Tangyinbo
 * @date 2014-6-19 下午2:33:04
 * 
 */
public class PaginationTag extends BodyTagSupport {
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
	private String printHtml(){
		String html = "<div class='pagination pagination-right' style='margin-top:0'>" +
				"<ul>" +
				"<li><a href='#' id='page_first'><i class='icon-fast-backward'></i>first</a></li>" +
				"<li><a href='#' id='page_front'><i class='icon-backward'></i>front</a></li>" +
				"<li><a href='#' id='page_corrent'>1</a></li>" +
				"<li><a href='#' id='page_next'><i class='icon-forward'></i>next</a></li>" +
				"<li><a href='#' id='page_last'><i class='icon-fast-forward'></i>end</a></li>" +
				/*"<li><input type='text' class='input-mini'/></li>" +*/
				"</ul>" +
				"</div>";
		return html;
	}
	
	public String printScript(){
		String script="";
		return null;
	}
}

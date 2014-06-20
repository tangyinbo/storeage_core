package cn.cowboy.provide.taglib;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

import org.apache.shiro.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.cowboy.domain.StoreDict;
import cn.cowboy.provide.constants.Constants;

public class DictRadioTag extends BodyTagSupport {
	private static final Logger log = LoggerFactory.getLogger(DictRadioTag.class);
	private String dictTypeId;
	private String reViewDictId;
	private String showField;
	private String radioName;

	@Override
	public int doStartTag() throws JspException {
		ServletContext context = pageContext.getRequest().getServletContext();
		Map<String, List<StoreDict>> dicts = (Map<String, List<StoreDict>>) context.getAttribute(Constants.WEBCONTEXT_DICT_MAP);
		JspWriter write = pageContext.getOut();
		try {
			write.print(printHtml(dicts));
		} catch (IOException e) {
			log.error("====>>>>taglib radio 异常", e);
		} finally {
		}
		return super.doStartTag();
	}

	private String printHtml(Map<String, List<StoreDict>> dicts) {
		List<StoreDict> dictList = dicts.get(dictTypeId);
		StringBuffer sb = new StringBuffer();
		String checked="";
		for (StoreDict dict : dictList) {
			checked="";
			if (StringUtils.hasLength(reViewDictId) && reViewDictId.equals(dict.getDictId())) {
				checked="checked";
			}
			sb.append("<label><input type='radio' "+checked+" name=" + radioName + " value=" + dict.getDictId() + "> " + dict.getDictName() + "</label> ");
		}
		return sb.toString();
	}

	public String getDictTypeId() {
		return dictTypeId;
	}

	public void setDictTypeId(String dictTypeId) {
		this.dictTypeId = dictTypeId;
	}

	public String getReViewDictId() {
		return reViewDictId;
	}

	public void setReViewDictId(String reViewDictId) {
		this.reViewDictId = reViewDictId;
	}

	public String getShowField() {
		return showField;
	}

	public void setShowField(String showField) {
		this.showField = showField;
	}

	public String getRadioName() {
		return radioName;
	}

	public void setRadioName(String radioName) {
		this.radioName = radioName;
	}

}

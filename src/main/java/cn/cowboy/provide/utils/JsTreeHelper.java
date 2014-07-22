package cn.cowboy.provide.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;

/**
 * 
* @ClassName: JsTreeHelper
* @Description: jstree数据生成器
* @author Tangyinbo
* @date 2014-7-18 上午11:48:50
*
 */
public class JsTreeHelper{
	
		private String  id;
		private String  text;
		private String  icon;
		private List<JsTreeHelper>  children;
		private Map<String,String>  li_attr;
		private Map<String,String>  a_attr;
		private Map<String,Object> state;
		
		public static void main(String[] args) {
			JsTreeHelper help = new JsTreeHelper("1","text","icon",null,null,null,null);
			System.out.println(JSON.toJSONString(help));
		}
		
		
		public JsTreeHelper() {
			super();
		}

		private JsTreeHelper(String id, String text, String icon, List<JsTreeHelper> children, Map<String, String> li_attr, Map<String, String> a_attr, Map<String, Object> state) {
			super();
			this.id = id;
			this.text = text;
			this.icon = icon;
			this.children = children;
			this.li_attr = li_attr;
			this.a_attr = a_attr;
			this.state = state;
		}

		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public String getIcon() {
			return icon;
		}
		public void setIcon(String icon) {
			this.icon = icon;
		}
		public List<JsTreeHelper> getChildren() {
			return children;
		}
		public void setChildren(List<JsTreeHelper> children) {
			this.children = children;
		}
		public Map<String, String> getLi_attr() {
			return li_attr;
		}
		public void setLi_attr(Map<String, String> li_attr) {
			this.li_attr = li_attr;
		}
		public Map<String, String> getA_attr() {
			return a_attr;
		}
		public void setA_attr(Map<String, String> a_attr) {
			this.a_attr = a_attr;
		}
		public Map<String, Object> getState() {
			return state;
		}
		public void setState(Map<String, Object> state) {
			this.state = state;
		} 
		
		
}

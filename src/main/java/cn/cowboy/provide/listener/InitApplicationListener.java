package cn.cowboy.provide.listener;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.cowboy.domain.StoreDict;
import cn.cowboy.provide.constants.Constants;
import cn.cowboy.service.DictService;

public class InitApplicationListener extends ContextLoaderListener {
	private static final Logger log = LoggerFactory.getLogger(InitApplicationListener.class);
	
	@Override
	public void contextInitialized(ServletContextEvent event) {
		super.contextInitialized(event);
		ServletContext sc=event.getServletContext();
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(sc);
		initDict(context,sc);
	}


	private void initDict(ApplicationContext context,ServletContext sc) {
		log.info("==>>初始化数据词典开始...");
		// 初始化数据词典
		DictService dictService = context.getBean(DictService.class);
		Map<String,List<StoreDict>> maps = dictService.getEncapDict();
		sc.setAttribute(Constants.WEBCONTEXT_DICT_MAP,maps );
		log.info("==>>词典总类-->  "+maps.size());
		log.info("==>>初始化数据词典结束...");
	}

}

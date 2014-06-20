package cn.cowboy.service;

import java.util.List;
import java.util.Map;

import cn.cowboy.domain.StoreDict;
import cn.cowboy.provide.common.Pagination;

/**
 * 
* @ClassName: DictService
* @Description: 数据词典业务类
* @author Tangyinbo
* @date 2014-6-20 下午2:04:02
*
 */
public interface DictService {
	 int createDict(StoreDict dict);
	 List<StoreDict> selectDicts();
	 int eidtDict(StoreDict dict);
	List<StoreDict> selectDictsPage(Pagination pagination);
	Map<String, List<StoreDict>> getEncapDict();
}

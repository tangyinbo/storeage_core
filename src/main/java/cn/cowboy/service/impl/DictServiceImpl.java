package cn.cowboy.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cowboy.dao.DictMapper;
import cn.cowboy.domain.StoreDict;
import cn.cowboy.provide.common.Pagination;
import cn.cowboy.service.DictService;

@Service
public class DictServiceImpl implements DictService {
	@Autowired
	private DictMapper dictMapper;

	@Override
	public int createDict(StoreDict dict) {
		return dictMapper.createDict(dict);
	}

	@Override
	public List<StoreDict> selectDicts() {
		return dictMapper.selectDicts();
	}
	
	/**
	 * 
	* @Title: getEncapDict 
	* @Description: TODO
	* @param @param dicts
	* @param @return   
	* @return Map<String,List<StoreDict>>  
	* @author Tangyinbo   
	* @date 2014-6-20 下午2:20:46
	* @throws
	 */
	@Override
	public Map<String,List<StoreDict>> getEncapDict(){
		List<StoreDict> dicts = selectDicts();
		String dictTypeid = "";
		Map<String,List<StoreDict>> dictMap = new HashMap<String,List<StoreDict>>();
		for(StoreDict dict:dicts){
			dictMap.put(dict.getDictTypeId(), groupDict(dict.getDictTypeId(),dicts));
		}
		return dictMap;
	}
	
	/**
	 * 
	* @Title: groupDict 
	* @Description: 字典分组
	* @param @param dictTypeId
	* @param @param dicts
	* @param @return   
	* @return List<StoreDict>  
	* @author Tangyinbo   
	* @date 2014-6-20 下午2:30:20
	* @throws
	 */
	public List<StoreDict> groupDict(String dictTypeId,List<StoreDict> dicts){
		String dictTypeid = "";
		List<StoreDict> dictList = new ArrayList<StoreDict>();
		for(StoreDict dict:dicts){
			if(dictTypeId.equals(dict.getDictTypeId())){
				dictList.add(dict);
			}
		}
		return dictList;
	}

	@Override
	public int eidtDict(StoreDict dict) {
		return dictMapper.eidtDict(dict);
	}

	@Override
	public List<StoreDict> selectDictsPage(Pagination pagination) {
		// TODO Auto-generated method stub
		return null;
	}

}

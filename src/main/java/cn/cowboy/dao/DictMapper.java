package cn.cowboy.dao;

import java.util.List;

import cn.cowboy.domain.StoreDict;
import cn.cowboy.provide.common.Pagination;

public interface DictMapper {

	int createDict(StoreDict dict);

	List<StoreDict> selectDicts();

	int eidtDict(StoreDict dict);

}

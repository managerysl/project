package com.manager.dao;

import java.util.List;
import java.util.Map;

import com.manager.bean.TreeBean;


/**
 * 
 * @author wolf - ysl
 *
 */
public interface IMenuDao {

	/**
	 *  根据父节点查询
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public List<TreeBean> getMenuByPid(Map<String,Object> params )throws Exception;
}

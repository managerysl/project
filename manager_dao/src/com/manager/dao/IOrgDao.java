package com.manager.dao;

import java.util.List;
import java.util.Map;

import com.manager.bean.TreeBean;


public interface IOrgDao {
	/**
	 *  根据父节点查询子节点
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public List<TreeBean> getOrgByPid(Map<String,Object> params )throws Exception;

}

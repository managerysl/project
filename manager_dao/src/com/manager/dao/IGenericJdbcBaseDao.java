package com.manager.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author wolf - ysl
 */
public interface IGenericJdbcBaseDao<T> {
	public List<?> findRow(String sql, Object... values) throws Exception;

	public Map<?, ?> getRow(String sql, Object... values);

	public int saveRow(String sql, Object... values);

	public int findForInt(String sql, Object... values) throws Exception;

	public JdbcTemplate getJdbctemplate() throws Exception;

	public int update(String sql, Object... values) throws Exception;
	
	public Object execution(String sql ,Object... values) throws Exception;
}

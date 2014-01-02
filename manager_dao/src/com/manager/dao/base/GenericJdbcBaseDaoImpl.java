package com.manager.dao.base;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import com.manager.dao.IGenericJdbcBaseDao;

/**
 * 
 * @author wolf - ysl
 *
 */
public class GenericJdbcBaseDaoImpl<T> implements IGenericJdbcBaseDao<T> {
	
	private Logger log = Logger.getLogger(getClass());
	
	private JdbcTemplate jdbcTemplate;
	
	private DataSource dataSource;

	public List<?> findRow(String sql, Object... values) throws Exception {
		log.debug("===findRow===sql=====" + sql);
		return this.jdbcTemplate.queryForList(sql, values);
	}

	public Map<?,?> getRow(String sql, Object... values) {
		log.debug("===getRow===sql=====" + sql);
		return this.jdbcTemplate.queryForMap(sql, values);
	}

	public int saveRow(String sql, Object... values) {
		log.debug("===saveRow===sql=====" + sql);
		return this.jdbcTemplate.update(sql, values);
	}

	public int findForInt(String sql, Object... values) throws Exception {
		try {
			return this.jdbcTemplate.queryForInt(sql, values);
		} catch (Exception e) {
			throw new Exception("query for int error for :" + e.getMessage(), e);
		}
	}

	public JdbcTemplate getJdbctemplate() throws Exception {
		
		return this.jdbcTemplate;
	}

	@Override
	public int update(String sql, Object... values) throws Exception {
		log.debug("===update===sql=====" + sql);
		return this.jdbcTemplate.update(sql, values);
	}

	public JdbcTemplate getJdbcTemplate() {
		return this.jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public Object execution(String sql, Object... values) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

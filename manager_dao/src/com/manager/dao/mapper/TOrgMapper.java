package com.manager.dao.mapper;

import com.manager.bean.TOrg;
import com.manager.bean.TOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOrgMapper {
    int countByExample(TOrgExample example);

    int deleteByExample(TOrgExample example);

    int deleteByPrimaryKey(String orgId);

    int insert(TOrg record);

    int insertSelective(TOrg record);

    List<TOrg> selectByExample(TOrgExample example);

    TOrg selectByPrimaryKey(String orgId);

    int updateByExampleSelective(@Param("record") TOrg record, @Param("example") TOrgExample example);

    int updateByExample(@Param("record") TOrg record, @Param("example") TOrgExample example);

    int updateByPrimaryKeySelective(TOrg record);

    int updateByPrimaryKey(TOrg record);
}
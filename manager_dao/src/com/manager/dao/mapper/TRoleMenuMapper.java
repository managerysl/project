package com.manager.dao.mapper;

import com.manager.bean.TRoleMenu;
import com.manager.bean.TRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRoleMenuMapper {
    int countByExample(TRoleMenuExample example);

    int deleteByExample(TRoleMenuExample example);

    int insert(TRoleMenu record);

    int insertSelective(TRoleMenu record);

    List<TRoleMenu> selectByExample(TRoleMenuExample example);

    int updateByExampleSelective(@Param("record") TRoleMenu record, @Param("example") TRoleMenuExample example);

    int updateByExample(@Param("record") TRoleMenu record, @Param("example") TRoleMenuExample example);
}
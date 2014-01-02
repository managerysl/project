package com.manager.dao.mapper;

import com.manager.bean.TRoleUser;
import com.manager.bean.TRoleUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRoleUserMapper {
    int countByExample(TRoleUserExample example);

    int deleteByExample(TRoleUserExample example);

    int deleteByPrimaryKey(String roleUserId);

    int insert(TRoleUser record);

    int insertSelective(TRoleUser record);

    List<TRoleUser> selectByExample(TRoleUserExample example);

    TRoleUser selectByPrimaryKey(String roleUserId);

    int updateByExampleSelective(@Param("record") TRoleUser record, @Param("example") TRoleUserExample example);

    int updateByExample(@Param("record") TRoleUser record, @Param("example") TRoleUserExample example);

    int updateByPrimaryKeySelective(TRoleUser record);

    int updateByPrimaryKey(TRoleUser record);
}
package com.manager.dao.mapper;

import com.manager.bean.TModel;
import com.manager.bean.TModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TModelMapper {
    int countByExample(TModelExample example);

    int deleteByExample(TModelExample example);

    int deleteByPrimaryKey(String modelId);

    int insert(TModel record);

    int insertSelective(TModel record);

    List<TModel> selectByExample(TModelExample example);

    TModel selectByPrimaryKey(String modelId);

    int updateByExampleSelective(@Param("record") TModel record, @Param("example") TModelExample example);

    int updateByExample(@Param("record") TModel record, @Param("example") TModelExample example);

    int updateByPrimaryKeySelective(TModel record);

    int updateByPrimaryKey(TModel record);
}
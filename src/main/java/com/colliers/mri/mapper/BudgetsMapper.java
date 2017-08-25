package com.colliers.mri.mapper;

import com.colliers.mri.pojo.Budgets;
import com.colliers.mri.pojo.BudgetsExample;
import com.colliers.mri.pojo.BudgetsKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BudgetsMapper {
    long countByExample(BudgetsExample example);

    int deleteByExample(BudgetsExample example);

    int deleteByPrimaryKey(BudgetsKey key);

    int insert(Budgets record);

    int insertSelective(Budgets record);

    List<Budgets> selectByExample(BudgetsExample example);

    Budgets selectByPrimaryKey(BudgetsKey key);

    int updateByExampleSelective(@Param("record") Budgets record, @Param("example") BudgetsExample example);

    int updateByExample(@Param("record") Budgets record, @Param("example") BudgetsExample example);

    int updateByPrimaryKeySelective(Budgets record);

    int updateByPrimaryKey(Budgets record);
}
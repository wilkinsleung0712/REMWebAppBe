package com.colliers.mri.mapper;

import com.colliers.mri.pojo.Budnote;
import com.colliers.mri.pojo.BudnoteExample;
import com.colliers.mri.pojo.BudnoteKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BudnoteMapper {
    long countByExample(BudnoteExample example);

    int deleteByExample(BudnoteExample example);

    int deleteByPrimaryKey(BudnoteKey key);

    int insert(Budnote record);

    int insertSelective(Budnote record);

    List<Budnote> selectByExampleWithBLOBs(BudnoteExample example);

    List<Budnote> selectByExample(BudnoteExample example);

    Budnote selectByPrimaryKey(BudnoteKey key);

    int updateByExampleSelective(@Param("record") Budnote record, @Param("example") BudnoteExample example);

    int updateByExampleWithBLOBs(@Param("record") Budnote record, @Param("example") BudnoteExample example);

    int updateByExample(@Param("record") Budnote record, @Param("example") BudnoteExample example);

    int updateByPrimaryKeySelective(Budnote record);

    int updateByPrimaryKeyWithBLOBs(Budnote record);

    int updateByPrimaryKey(Budnote record);
}
package com.colliers.mri.mapper;

import com.colliers.mri.pojo.Gacc;
import com.colliers.mri.pojo.GaccExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface GaccMapper {
    long countByExample(GaccExample example);

    int deleteByExample(GaccExample example);

    int deleteByPrimaryKey(String acctnum);

    int insert(Gacc record);

    int insertSelective(Gacc record);

    List<Gacc> selectByExample(GaccExample example);

    Gacc selectByPrimaryKey(String acctnum);

    int updateByExampleSelective(@Param("record") Gacc record, @Param("example") GaccExample example);

    int updateByExample(@Param("record") Gacc record, @Param("example") GaccExample example);

    int updateByPrimaryKeySelective(Gacc record);

    int updateByPrimaryKey(Gacc record);
}
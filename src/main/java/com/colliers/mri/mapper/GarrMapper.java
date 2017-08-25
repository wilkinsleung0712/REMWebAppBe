package com.colliers.mri.mapper;

import com.colliers.mri.pojo.Garr;
import com.colliers.mri.pojo.GarrExample;
import com.colliers.mri.pojo.GarrKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface GarrMapper {
    long countByExample(GarrExample example);

    int deleteByExample(GarrExample example);

    int deleteByPrimaryKey(GarrKey key);

    int insert(Garr record);

    int insertSelective(Garr record);

    List<Garr> selectByExample(GarrExample example);

    Garr selectByPrimaryKey(GarrKey key);

    int updateByExampleSelective(@Param("record") Garr record, @Param("example") GarrExample example);

    int updateByExample(@Param("record") Garr record, @Param("example") GarrExample example);

    int updateByPrimaryKeySelective(Garr record);

    int updateByPrimaryKey(Garr record);
}
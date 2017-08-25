package com.colliers.mri.mapper;

import com.colliers.mri.pojo.Podt;
import com.colliers.mri.pojo.PodtExample;
import com.colliers.mri.pojo.PodtKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PodtMapper {
    long countByExample(PodtExample example);

    int deleteByExample(PodtExample example);

    int deleteByPrimaryKey(PodtKey key);

    int insert(Podt record);

    int insertSelective(Podt record);

    List<Podt> selectByExampleWithBLOBs(PodtExample example);

    List<Podt> selectByExample(PodtExample example);

    Podt selectByPrimaryKey(PodtKey key);

    int updateByExampleSelective(@Param("record") Podt record, @Param("example") PodtExample example);

    int updateByExampleWithBLOBs(@Param("record") Podt record, @Param("example") PodtExample example);

    int updateByExample(@Param("record") Podt record, @Param("example") PodtExample example);

    int updateByPrimaryKeySelective(Podt record);

    int updateByPrimaryKeyWithBLOBs(Podt record);

    int updateByPrimaryKey(Podt record);
}
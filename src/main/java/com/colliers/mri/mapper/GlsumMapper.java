package com.colliers.mri.mapper;

import com.colliers.mri.pojo.Glsum;
import com.colliers.mri.pojo.GlsumExample;
import com.colliers.mri.pojo.GlsumKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface GlsumMapper {
    long countByExample(GlsumExample example);

    int deleteByExample(GlsumExample example);

    int deleteByPrimaryKey(GlsumKey key);

    int insert(Glsum record);

    int insertSelective(Glsum record);

    List<Glsum> selectByExample(GlsumExample example);

    Glsum selectByPrimaryKey(GlsumKey key);

    int updateByExampleSelective(@Param("record") Glsum record, @Param("example") GlsumExample example);

    int updateByExample(@Param("record") Glsum record, @Param("example") GlsumExample example);

    int updateByPrimaryKeySelective(Glsum record);

    int updateByPrimaryKey(Glsum record);
}
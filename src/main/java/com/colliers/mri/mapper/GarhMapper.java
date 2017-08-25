package com.colliers.mri.mapper;

import com.colliers.mri.pojo.Garh;
import com.colliers.mri.pojo.GarhExample;
import com.colliers.mri.pojo.GarhKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface GarhMapper {
    long countByExample(GarhExample example);

    int deleteByExample(GarhExample example);

    int deleteByPrimaryKey(GarhKey key);

    int insert(Garh record);

    int insertSelective(Garh record);

    List<Garh> selectByExample(GarhExample example);

    Garh selectByPrimaryKey(GarhKey key);

    int updateByExampleSelective(@Param("record") Garh record, @Param("example") GarhExample example);

    int updateByExample(@Param("record") Garh record, @Param("example") GarhExample example);

    int updateByPrimaryKeySelective(Garh record);

    int updateByPrimaryKey(Garh record);
}
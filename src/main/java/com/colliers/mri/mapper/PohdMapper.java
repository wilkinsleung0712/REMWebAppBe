package com.colliers.mri.mapper;

import com.colliers.mri.pojo.Pohd;
import com.colliers.mri.pojo.PohdExample;
import com.colliers.mri.pojo.PohdWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PohdMapper {
    long countByExample(PohdExample example);

    int deleteByExample(PohdExample example);

    int deleteByPrimaryKey(String ponum);

    int insert(PohdWithBLOBs record);

    int insertSelective(PohdWithBLOBs record);

    List<PohdWithBLOBs> selectByExampleWithBLOBs(PohdExample example);

    List<Pohd> selectByExample(PohdExample example);

    PohdWithBLOBs selectByPrimaryKey(String ponum);

    int updateByExampleSelective(@Param("record") PohdWithBLOBs record, @Param("example") PohdExample example);

    int updateByExampleWithBLOBs(@Param("record") PohdWithBLOBs record, @Param("example") PohdExample example);

    int updateByExample(@Param("record") Pohd record, @Param("example") PohdExample example);

    int updateByPrimaryKeySelective(PohdWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PohdWithBLOBs record);

    int updateByPrimaryKey(Pohd record);
}
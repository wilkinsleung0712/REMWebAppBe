package com.colliers.mri.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface VarienceReportMapper {

    List<String> selectVarienceAccountCodeList(@Param("entityId") String entityId,
                                               @Param("basis") String basis,
                                               @Param("period") String beginPeriod,
                                               @Param("beginAcctRange") String beginAcctRange,
                                               @Param("endAcctRange") String endAcctRange);
}

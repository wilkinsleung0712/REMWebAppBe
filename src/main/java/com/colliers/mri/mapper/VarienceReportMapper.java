package com.colliers.mri.mapper;

import com.colliers.mri.pojo.VarienceReportBudget;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface VarienceReportMapper {

    List<String> selectVarienceAccountCodeList(@Param("entityId") String entityId,
                                               @Param("basis") String basis,
                                               @Param("beginPeriod")  String beginPeriod,
                                               @Param("endPeriod") String endPeriod,
                                               @Param("beginAcctRange") String beginAcctRange,
                                               @Param("endAcctRange") String endAcctRange);

    List<VarienceReportBudget> selectVarienceBudgetResult(@Param("entityId") String entityId,
                                                          @Param("basis") String basis,
                                                          @Param("beginPeriod")  String beginPeriod,
                                                          @Param("endPeriod") String endPeriod,
                                                          @Param("beginAcctRange") String beginAcctRange,
                                                          @Param("endAcctRange") String endAcctRange,
                                                          @Param("budType") String budType);
}

package com.colliers.common.utils.dao;

import com.colliers.mri.mapper.VarienceReportMapper;
import com.colliers.mri.pojo.VarienceReportBudget;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public class CustomDaoImpl extends SqlSessionDaoSupport implements VarienceReportMapper {

    public CustomDaoImpl() {
    }

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public List<String> selectVarienceAccountCodeList(String entityId, String basis, String beginPeriod, String endPeriod, String beginAcctRange, String endAcctRange) {
        HashMap<String, Object> argsMap = new HashMap<>();
        argsMap.put("entityId", entityId);
        argsMap.put("basis", basis);
        argsMap.put("beginPeriod",beginPeriod);
        argsMap.put("endPeriod", endPeriod);
        argsMap.put("beginAcctRange", beginAcctRange);
        argsMap.put("endAcctRange", endAcctRange);

        List<String> dataList = this.getSqlSession().selectList("com.colliers.mri.mapper.VarienceReportMapper.selectVarienceAccountCodeList", argsMap);
        return dataList;

    }

    @Override
    public List<VarienceReportBudget> selectVarienceBudgetResult(String entityId, String basis, String beginPeriod, String endPeriod, String beginAcctRange, String endAcctRange,String budType) {
        List<VarienceReportBudget> dataList = null;
        HashMap<String, Object> argsMap = new HashMap<>();
        argsMap.put("entityId", entityId);
        argsMap.put("basis", basis);
        argsMap.put("beginPeriod",beginPeriod);
        argsMap.put("endPeriod", endPeriod);
        argsMap.put("beginAcctRange", beginAcctRange);
        argsMap.put("endAcctRange", endAcctRange);
        argsMap.put("budType", budType);
        try{
            dataList = this.getSqlSession().selectList("com.colliers.mri.mapper.VarienceReportMapper.selectVarienceBudgetResult", argsMap);
        }catch (Exception ex){
            System.out.println(ex);
        }

        return dataList;
    }
}

package com.colliers.common.utils.dao;

import com.colliers.mri.mapper.VarienceReportMapper;
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
    public List<String> selectVarienceAccountCodeList(String entityId, String basis, String period, String beginAcctRange, String endAcctRange) {
        HashMap<String, Object> argsMap = new HashMap<>();
        argsMap.put("entityId", entityId);
        argsMap.put("basis", basis);
        argsMap.put("period", period);
        argsMap.put("beginAcctRange", beginAcctRange);
        argsMap.put("endAcctRange", endAcctRange);

        List<String> dataList = this.getSqlSession().selectList("com.colliers.mri.mapper.VarienceReportMapper.selectVarienceAccountCodeList", argsMap);
        return dataList;

    }
}

package com.colliers.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colliers.common.ColliersMRIResult;
import com.colliers.mri.mapper.PodtMapper;
import com.colliers.mri.mapper.PohdMapper;
import com.colliers.mri.pojo.Podt;
import com.colliers.mri.pojo.PodtExample;
import com.colliers.mri.pojo.PodtExample.Criteria;
import com.colliers.service.OrderSearchService;

@Service
public class OrderSearchServiceImpl implements OrderSearchService {

    @Autowired
    private PohdMapper pohdMapper;

    @Autowired
    private PodtMapper podtMapper;

    @Override
    public ColliersMRIResult searchOrderById(String ponum) {
        PodtExample example = new PodtExample();
        Criteria criteria = example.createCriteria();
        criteria.andPonumEqualTo(ponum);
        List<Podt> order = this.podtMapper.selectByExample(example);
        return ColliersMRIResult.ok(order);
    }

    @Override
    public ColliersMRIResult getOrderList() {
        // TODO Auto-generated method stub
        return null;
    }

}

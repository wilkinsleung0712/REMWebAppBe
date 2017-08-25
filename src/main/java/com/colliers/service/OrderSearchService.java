package com.colliers.service;

import com.colliers.common.ColliersMRIResult;

public interface OrderSearchService {

    public ColliersMRIResult searchOrderById(String ponum);
    
    public ColliersMRIResult getOrderList();
}

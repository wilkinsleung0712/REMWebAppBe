package com.colliers.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.colliers.common.ColliersMRIResult;
import com.colliers.common.utils.ExceptionUtils;
import com.colliers.service.OrderSearchService;

@RestController
public class OrderSearchController {

    @Autowired
    private OrderSearchService orderSearchService;

    @RequestMapping("/searchOrder")
    public ColliersMRIResult searchOrder(@RequestParam("ponum") String ponum) {
        if (StringUtils.isBlank(ponum)) {
            return ColliersMRIResult.build(500, "ponum is not valid.");
        }

        ColliersMRIResult result = null;

        try {
            result = orderSearchService.searchOrderById(ponum);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            result = ColliersMRIResult.build(400, ExceptionUtils.getStackTrace(e));
        }

        return result;
    }
}

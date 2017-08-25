package com.colliers.controller;

import com.colliers.common.ColliersMRIResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wilkins.liang on 10/05/2017.
 */
@RestController

public class TestController {
    @GetMapping(value = "/test", produces = {"application/json"})
    public ColliersMRIResult getTest() {
        return ColliersMRIResult.ok("Test Successful");
    }
}

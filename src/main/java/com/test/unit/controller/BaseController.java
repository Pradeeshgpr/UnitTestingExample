package com.test.unit.controller;

import com.test.unit.iservice.IBaseScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base/v1")
public class BaseController {

    @Autowired
    private IBaseScoreService baseScoreService;

    @GetMapping(value = "/hello")
    public String getHello() {
        return "Hello";
    }

}

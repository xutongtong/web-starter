package com.kaidike.base.interfaces.demo.web;

import com.kaidike.base.interfaces.demo.facade.DemoServiceFacade;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DemoController {

    private DemoServiceFacade demoServiceFacade;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam Map<String,String> params) {

        String str = "Hello World!";

        return str;

    }
}

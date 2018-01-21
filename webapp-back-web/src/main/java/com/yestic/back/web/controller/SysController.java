package com.yestic.back.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SysController {

    private static final Logger SYS_CONTROLLER_LOGGER = LoggerFactory.getLogger(SysController.class);

    @GetMapping("/index")
    public String index(){
        SYS_CONTROLLER_LOGGER.info("SysController log:index");
        return "index";
    }

}

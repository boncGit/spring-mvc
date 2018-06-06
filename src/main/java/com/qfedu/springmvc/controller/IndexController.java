package com.qfedu.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mengxy on 2018/6/5.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String home(){
        return "home";
    }
}

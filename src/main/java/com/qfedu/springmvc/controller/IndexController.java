package com.qfedu.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mengxy on 2018/6/5.
 */
@Controller
//@RequestMapping("/")
public class IndexController {

//    @RequestMapping("/")
//    public String home(){//自定义主页面
//        return "home";
//    }

    @RequestMapping("/login")
    public String home(){//自定义主页面
        return "home";
    }
}

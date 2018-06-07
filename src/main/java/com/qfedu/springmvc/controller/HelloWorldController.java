package com.qfedu.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mengxy on 2018/6/4.
 */

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {

    @RequestMapping(value = "/world",method = RequestMethod.POST)
    public String helloWorld(){
        System.out.println("hello world");
        return "helloWorld";
    }

    @RequestMapping(value = "/loginForm",method = RequestMethod.GET)
    public String loginForm(){
        System.out.println("用户登陆");
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView login(@RequestParam(value = "userName", required = false) String userName, String password){
        System.out.println("执行登陆");
        System.out.println("用户名："+userName);
        System.out.println("密码："+password);
        ModelAndView model = new ModelAndView("/helloWorld");
        return model;
//        return "redirect:helloWorld";  跳转的方式
    }

    /**
     * 获取cookie标签
     * @param sessionId
     * @return
     */
    @RequestMapping(value = "/testCookie",method = RequestMethod.GET)
    public String testCookie(@CookieValue("JSESSIONID") String sessionId){
          System.out.println("sessionId:"+sessionId);
        return "success";
    }


    public String testHeaer(@RequestHeader() String header){
        System.out.println("header:"+ header);
        return "success";
    }
}

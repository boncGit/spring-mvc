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
@RequestMapping("/hello")
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

    @RequestMapping(value = "/testHeaer",method = RequestMethod.GET)
    public String testHeaer(@RequestHeader(value = "User-Agent") String header){
        System.out.println("header:"+ header);
        return "success";
    }

    @RequestMapping(value = "/testParam",params = {"userName","age!=10"})
    public String testParam(String userName,String age){
        System.out.println(userName+"____"+age);
        return "success";
    }

    @RequestMapping(value = "/testAntpath/*/helen")//*:代表任意字符
    public String testAntpath(){
        System.out.println("antpath");
        return "success";
    }


    /*******************freemarker************************************/
    @RequestMapping(value = "/testFreemarker",method = RequestMethod.GET)
    public String testFreemarker(){
        System.out.println("Freemarker");
        return "test";
    }
}

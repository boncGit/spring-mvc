package com.qfedu.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Mengxy on 2018/6/4.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    public String list(@RequestParam(value="currentpage",required=false,defaultValue="1") Integer currentpage,
                        @RequestParam(value="pagesize",required=false,defaultValue="10") Integer pagesize ){
        System.out.println("currentpage:"+currentpage);
        System.out.println("pagesize:"+pagesize);

        return "user/userList";
    }

    @RequestMapping("/get/{id}")
    public String get(@PathVariable(value="id") Integer id){
        System.out.println("id:"+id);
        return "user/editUser";
    }
}

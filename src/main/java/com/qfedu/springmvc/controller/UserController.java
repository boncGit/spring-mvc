package com.qfedu.springmvc.controller;

import com.qfedu.springmvc.pojo.Address;
import com.qfedu.springmvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

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


    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(){
        return "user/form";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(User user){
        System.out.println(user);
        return "success";
    }

    @RequestMapping(value = "/userinfo", method = RequestMethod.POST)
    public String saveUser(@RequestBody String param){
        System.out.println("param:"+param);
        return "success";
    }

    @RequestMapping("/edit")
    public ModelAndView editUser(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        ModelAndView model = new ModelAndView("user/form");
        String sessiodId = session.getId();
        String sessionId2 = request.getSession().getId();
        User user = new User();
        user.setAge(1);
        user.setEmail("123");
        user.setPassword("123");
        user.setUsername("mengxy");
        Address address = new Address();
        address.setProvince("黑龙江");
        address.setCity("哈尔滨");
        user.setAddress(address);
        model.addObject("user",user);
        return model;
    }

    @RequestMapping("/edit2")
    public String editUser2(Map<String,Object> map){
        User user = new User();
        user.setAge(1);
        user.setEmail("123");
        user.setPassword("123");
        user.setUsername("mengxy");
        Address address = new Address();
        address.setProvince("黑龙江");
        address.setCity("哈尔滨");
        user.setAddress(address);
        map.put("user",user);
        return "user/form";
    }

    @RequestMapping("/edit3")
    public String editUser3(Model model){
        User user = new User();
        user.setAge(1);
        user.setEmail("123");
        user.setPassword("123");
        user.setUsername("mengxy");
        Address address = new Address();
        address.setProvince("黑龙江");
        address.setCity("哈尔滨");
        user.setAddress(address);
        model.addAttribute("user",user);
        return "user/form";
    }
}

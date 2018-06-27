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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

/*******************RESTful************************************/
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(){

        return "user/userList";
    }

    @RequestMapping(value = "/userInfo/{id}",method = RequestMethod.DELETE)
    public String delete(){
        //执行删除
        System.out.println("delete");

        return "redirect:/user/userList";
    }

    @RequestMapping(value = "/userInfo/{id}",method = RequestMethod.PUT)
    public String update(){
        //执行删除
        System.out.println("update");

        return "redirect:/user/userList";
    }



    @RequestMapping(value = "/userJson",method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUserJson(){
        //执行删除
        System.out.println("userjson数据");
        List<User> list = new ArrayList<User>();
        User user1 = new User();
        user1.setUsername("test1");
        user1.setPassword("123456");
        User user2 = new User();
        user2.setUsername("test1");
        user2.setPassword("123456");
        User user3 = new User();
        user3.setUsername("test1");
        user3.setPassword("123456");
        list.add(user1);list.add(user2);list.add(user3);
        return list;
    }

    @RequestMapping(value = "/userMap",method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String,Object>> getUserMap(){
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("userName","test1");
        map.put("password","123456");
        Map<String,Object> map2 = new HashMap<String,Object>();
        map2.put("userName","test2");
        map2.put("password","654321");
        list.add(map);list.add(map2);
        return list;
    }
}

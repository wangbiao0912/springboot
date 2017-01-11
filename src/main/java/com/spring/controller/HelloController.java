package com.spring.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wangbiao on 17-1-6.
 */
// @Controller   // 这个注解是返回模板页面的
@RequestMapping("/user")
@RestController  //@RestController等于这个注解相加 @ResponseBody+@Controller
public class HelloController {
    @RequestMapping("/index")
    public String index(){
        return "welcome";
    }

    //@RequestMapping(value = "/login",method = RequestMethod.GET)
    @RequestMapping("/login")
    public String beginLogin(int userId, Model model)
    {
        System.out.println(userId+">>>>>>");
      //  model.addAttribute("userName","我是测试的");

      // return "测试页面";
        return "userLogin";
    }

    @RequestMapping(value = "/login3",method = RequestMethod.GET)
    public ModelAndView beginLogin(int userId)
    {
        System.out.println(userId+">>>>>>");
        ModelAndView mv=new ModelAndView();
        //通过实体模型存储当前查询集合对象数据
        mv.addObject("userName", "我是测试的");
        mv.setViewName("userLogin");
        // return "测试页面";
        return mv;
    }

    @RequestMapping("/login2")
    public String login2()
    {
        return "Welcome to spring boot!";
    }
}
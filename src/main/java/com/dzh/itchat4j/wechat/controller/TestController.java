package com.dzh.itchat4j.wechat.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping(value="/hello.do")
    public ModelAndView getTest(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView("HelloWorld");
        return modelAndView;
    }
	
}

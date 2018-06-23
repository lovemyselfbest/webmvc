package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import redis.clients.jedis.Jedis;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
@RequestMapping("/default")
public class DefaultController {
    @GetMapping("/index")
    public ModelAndView index(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("default/index");
        modelAndView.addObject("model","hello");

        /*
        Jedis jedis = new Jedis("192.168.0.55");
        jedis.connect();
        jedis.hset("hkey","key1","value1");
        jedis.hset("hkey","key2","value2");
        Map<String, String> result = jedis.hgetAll("hkey");
        */

        return modelAndView;
    }

    @PostMapping("/index")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("default/index");
        modelAndView.addObject("model","hello2");
        Cookie cookie = new Cookie("test","testValue");
        cookie.setPath("/default/index");
        cookie.setDomain("msite.me.so");
        //cookie.setPath("/default/index");
        response.addCookie(cookie);
        return modelAndView;
    }


}

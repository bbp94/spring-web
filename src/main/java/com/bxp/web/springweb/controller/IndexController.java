package com.bxp.web.springweb.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@Controller
public class IndexController {

    @RequestMapping(value = "/hello")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/show")
    public String show(){
        return "show";
    }

    @RequestMapping(value = "/load")
    public @ResponseBody void load(String username,String password) {
//        String value = LocalDateTime.now().toString();
        System.out.print(username+"  "+password);
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
//        SQLDao dao = ctx.getBean("SQLDao", SQLDao.class);

    }
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(HttpServletRequest request){

        return "add";
    }
}

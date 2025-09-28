package com.perra.web_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {

        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(@RequestParam("num1")int nino,int num2,HttpSession session){

    int result = nino +num2;
        session.setAttribute("result", result);
        return "result.jsp";
    }

}

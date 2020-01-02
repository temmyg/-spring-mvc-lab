package com.springmvc.lab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("")
@Controller
public class HelloController {
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String printHello(ModelMap model){
        model.addAttribute("message", "Hello Ge Zhou!");
        return "hello";
    }
}

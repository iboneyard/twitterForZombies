package com.indrajit.tfz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author indrajit
 */

@Controller
@RequestMapping("/")
public class HomeController extends BaseController{

    @RequestMapping(value="/", method = RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView();
        setCurrentUser(modelAndView);
        modelAndView.setViewName("home/index");
        return modelAndView;
    }

}
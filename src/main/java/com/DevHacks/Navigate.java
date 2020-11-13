package com.DevHacks;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class Navigate {

    @RequestMapping("/navigateToPage")
    public ModelAndView navigateToPage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("pages/login");
        return mv;
    }
}

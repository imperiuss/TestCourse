package com.imp.TestSite3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Main controller
 */


@Controller
public class SpringCourseController {

      @RequestMapping (method = RequestMethod.GET)
      public String showMainPage (){
          return "03-login";
      }
}

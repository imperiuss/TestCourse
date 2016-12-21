package com.imp.TestSite3.controller;

import com.imp.TestSite3.entity.Course;
import com.imp.TestSite3.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/**
 * Main controller
 */


@Controller
@RequestMapping("/courses")
public class SpringCourseController {


    @Autowired
    private CourseService courseService;

      @RequestMapping
      public String showMainPage (Model model){

          List<Course> courses = courseService.getCourses();

          model.addAttribute("courses", courses);

        return "MainPage";
    }

      @RequestMapping ("/login")
      public String showLoginPage (){
          return "LoginPage";
      }


}

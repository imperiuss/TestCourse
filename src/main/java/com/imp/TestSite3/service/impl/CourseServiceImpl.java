package com.imp.TestSite3.service.impl;

import com.imp.TestSite3.dao.CourseDao;
import com.imp.TestSite3.entity.Course;
import com.imp.TestSite3.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Transactional
    public List<Course> getCourses() {
        return courseDao.getCourses();
    }
}

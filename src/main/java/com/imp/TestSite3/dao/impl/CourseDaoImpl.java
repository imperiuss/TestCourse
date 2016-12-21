package com.imp.TestSite3.dao.impl;

import com.imp.TestSite3.dao.CourseDao;
import com.imp.TestSite3.entity.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseDaoImpl implements CourseDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Course> getCourses() {

        Session session = sessionFactory.getCurrentSession();

        List<Course> courses = session.createQuery("from Course", Course.class).getResultList();

        return courses;
    }
}

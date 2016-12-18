package com.imp.TestSite3.entity;

import java.util.List;
import java.util.Map;

/**
 *  Course entity
 */
public class Course {

    private int courseID;

    private String courseState;

    private String courseOwner;

    private String courseCategory;

    private List<User> subscribers;

    private Map<User, Integer> courseUserGrade;

    public Course() {
    }

    public Course(int courseID) {
        this.courseID = courseID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseState() {
        return courseState;
    }

    public void setCourseState(String courseState) {
        this.courseState = courseState;
    }

    public String getCourseOwner() {
        return courseOwner;
    }

    public void setCourseOwner(String courseOwner) {
        this.courseOwner = courseOwner;
    }

    public String getCourseCategory() {
        return courseCategory;
    }

    public void setCourseCategory(String courseCategory) {
        this.courseCategory = courseCategory;
    }

    public List<User> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<User> subscribers) {
        this.subscribers = subscribers;
    }

    public Map<User, Integer> getCourseUserGrade() {
        return courseUserGrade;
    }

    public void setCourseUserGrade(Map<User, Integer> courseUserGrade) {
        this.courseUserGrade = courseUserGrade;
    }
}

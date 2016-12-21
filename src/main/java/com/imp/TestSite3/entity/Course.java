package com.imp.TestSite3.entity;

import javax.persistence.*;

/**
 *  Course entity
 */
@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;

    @Column (name = "course_state")
    private String courseState;

    @Column (name = "course_owner")
    private String courseOwner;

    @Column (name = "course_category")
    private String courseCategory;

    public Course() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseState='" + courseState + '\'' +
                ", courseOwner='" + courseOwner + '\'' +
                ", courseCategory='" + courseCategory + '\'' +
                '}';
    }
}

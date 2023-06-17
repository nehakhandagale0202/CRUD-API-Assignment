package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "student_demo")
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    @Column(name="student_id",nullable=false)
    private int id;

    @Column(name="student_fname",nullable=false)
    private String student_fname;
    
    @Column(name="student_lname",nullable = false)
    private String student_lname;

    @Column(name="student_email",nullable=false)
    private String student_email;
    
    @Column(name="student_mob",nullable=false)
    private String student_mob;

    @Column(name="student_city",nullable=false)
    private String student_city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudent_fname() {
        return student_fname;
    }

    public void setStudent_fname(String student_fname) {
        this.student_fname = student_fname;
    }

    public String getStudent_lname() {
        return student_lname;
    }

    public void setStudent_lname(String student_lname) {
        this.student_lname = student_lname;
    }

    public String getStudent_email() {
        return student_email;
    }

    public void setStudent_email(String student_email) {
        this.student_email = student_email;
    }

    public String getStudent_mob() {
        return student_mob;
    }

    public void setStudent_mob(String student_mob) {
        this.student_mob = student_mob;
    }

    public String getStudent_city() {
        return student_city;
    }

    public void setStudent_city(String student_city) {
        this.student_city = student_city;
    }

    
    public student() {
    }

    
    public student(int id, String student_fname, String student_lname, String student_email, String student_mob,
            String student_city) {
        this.id = id;
        this.student_fname = student_fname;
        this.student_lname = student_lname;
        this.student_email = student_email;
        this.student_mob = student_mob;
        this.student_city = student_city;
    }

    @Override
    public String toString() {
        return "student [id=" + id + ", student_fname=" + student_fname + ", student_lname=" + student_lname
                + ", student_email=" + student_email + ", student_mob=" + student_mob + ", student_city=" + student_city
                + "]";
    }

    

}

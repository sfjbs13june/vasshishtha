package com.student.app.controller;

import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class student_controller {

    @GetMapping("/get/students")
    public List<Student> getStudents(){
        List listStudents= new ArrayList();
        Student student1= new Student("1","aaa","abc","1");
        Student student2= new Student("2","aaa","abc","1");
        Student student3= new Student("3","aaa","abc","1");
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        return listStudents;

    }
    @GetMapping("/map/students")
    public Map mapStudents() {
        Map studentMap = new HashMap();
        Student student1 = new Student("1", "K", "1", "CA");
        Student student2 = new Student("2", "K", "1", "CA");
        Student student3 = new Student("3", "K", "1", "CA");
    }
}

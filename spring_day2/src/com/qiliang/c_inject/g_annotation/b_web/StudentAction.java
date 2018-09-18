package com.qiliang.c_inject.g_annotation.b_web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("studentActionID")
public class StudentAction {


    @Autowired
    private StudentService studentService;

    public void excute() {

        studentService.addStudent();
        System.out.println("/////..../////");
    }
}

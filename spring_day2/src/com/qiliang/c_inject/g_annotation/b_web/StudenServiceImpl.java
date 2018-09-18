package com.qiliang.c_inject.g_annotation.b_web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StudenServiceImpl implements StudentService {

    private StudentDao studentDao;

    @Autowired
    @Qualifier("studentDaoId")
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void addStudent() {
        System.out.println("add Student");
        studentDao.save();
    };

}

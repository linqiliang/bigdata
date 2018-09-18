package com.qiliang.c_inject.g_annotation.b_web;

import org.springframework.stereotype.Repository;

@Repository("studentDaoId")
public class StudentDaoImpl implements StudentDao {
    @Override
    public void save() {
        System.out.println("Dao");
    }
}


package com.qiliang.a_mybatis.junit;

import com.qiliang.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.List;

public class MybatisFires {

    @Test
    public  void findUserByIdTest() throws IOException {


        //mybatis 配置文件
        String resource = "SqlMapConfig.xml";

        //得到配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();


        //User user = sqlSession.selectOne("test.findUserById",1);

        List<User> user = sqlSession.selectList("test.findUserByName","an");

        System.out.println(user);
        sqlSession.close();
    }


    @Test
    public  void insertUser() throws IOException {

        //mybatis 配置文件
        String resource = "SqlMapConfig.xml";

        //得到配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User();
        user.setAddress("DG");
        user.setBirthday(new Date(2018,8,8));
        user.setSex("f");
        user.setUsername("sdf");
        //User user = sqlSession.selectOne("test.findUserById",1);

        //List<User> user = sqlSession.selectList("test.findUserByName","an");

        int i  = sqlSession.insert("test.insertUser",user);
        sqlSession.commit();

        System.out.println(String.format("%s%d",user,i ));
        sqlSession.close();
    }

}

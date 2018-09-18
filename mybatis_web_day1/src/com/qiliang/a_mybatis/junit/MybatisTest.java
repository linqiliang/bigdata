package com.qiliang.a_mybatis.junit;


import com.qiliang.a_mybatis.mapper.UserMapper;
import com.qiliang.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class MybatisTest {

    SqlSession sqlSession = null;

    @Before
    public void before() throws Exception {

        //mybatis 配置文件
        String resource = "SqlMapConfig.xml";

        //得到配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        this.sqlSession = sqlSessionFactory.openSession();

    }
    @Test
    public void testMapper() throws Exception {

        UserMapper userMapper = this.sqlSession.getMapper(UserMapper.class);

        User user = userMapper.findUserById(1);

        System.out.println(user);

    }
}

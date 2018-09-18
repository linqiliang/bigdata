package com.qiliang.b_api;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestApi {

    public static void main(String[] args) {

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_day2");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");


        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);

        jdbcTemplate.update("insert into t_user(username,pw) values(?,?);","tom","998");

    }
}

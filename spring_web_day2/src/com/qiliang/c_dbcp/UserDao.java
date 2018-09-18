package com.qiliang.c_dbcp;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {


    private JdbcTemplate jdbcTemplate;

    public void update(User user){
        String sql = "update t_user set username=?,pw=? where id=?";
        Object[] args = {user.getUsername(),user.getPw(),user.getId()};
        jdbcTemplate.update(sql,args);
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}

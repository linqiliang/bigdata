package com.qiliang.f_properties;


import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UserDao extends JdbcDaoSupport {

    public void update(User user){
        String sql = "update t_user set username=?,pw=? where id=?";
        Object[] args = {user.getUsername(),user.getPw(),user.getId()};
        this.getJdbcTemplate().update(sql,args);
    }

}

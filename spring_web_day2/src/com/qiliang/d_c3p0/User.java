package com.qiliang.d_c3p0;

public class User {

    private Integer id;
    private String username;
    private String pw;

    public Integer getId() {
        return id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPw() {
        return pw;
    }

    public String getUsername() {
        return username;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

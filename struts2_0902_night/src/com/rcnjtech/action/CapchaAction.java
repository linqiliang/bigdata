package com.rcnjtech.action;

import com.opensymphony.xwork2.ActionSupport;

public class CapchaAction extends ActionSupport {

    @Override
    public String execute() throws Exception {
        return "success";
    }

    public String getPic() throws Exception {
        System.out.println("get In getPic");
        return "success";
    }
}


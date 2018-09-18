package com.rcnjtech.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DemoAction12 extends ActionSupport
        implements ServletRequestAware, ServletResponseAware, ServletContextAware {

    private HttpServletResponse response;
    private HttpServletRequest request;
    private ServletContext application;

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application = servletContext;
    }

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.request = httpServletRequest;
    }

    @Override
    public void setServletResponse(HttpServletResponse httpServletResponse) {
        this.response = httpServletResponse;
    }


    public String execute() {

 //       HttpServletRequest request = ServletActionContext.getRequest();
  //      HttpServletResponse response = ServletActionContext.getResponse();
   //     ServletContext application = ServletActionContext.getServletContext();
        HttpSession session = request.getSession();
        System.out.println("Servlet Test !!");

        System.out.println(request);
        System.out.println(response);
        System.out.println(application);
        System.out.println(session);

        return null;
    }
}

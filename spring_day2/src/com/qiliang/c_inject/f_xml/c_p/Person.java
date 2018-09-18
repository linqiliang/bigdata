package com.qiliang.c_inject.f_xml.c_p;


public class Person {

    private String pname;
    private Integer page;
    private Address homeAddr;
    private Address companyAddr;

    public Address getCompanyAddr() {
        return companyAddr;
    }

    public void setCompanyAddr(Address companyAddr) {
        this.companyAddr = companyAddr;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Address getHomeAddr() {
        return homeAddr;
    }

    public void setHomeAddr(Address homeAddr) {
        this.homeAddr = homeAddr;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Override
    public String toString() {
        System.out.println(this.page+this.pname+this.homeAddr+this.companyAddr);
        return super.toString();
    }
}


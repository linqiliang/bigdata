package com.qiliang.c_inject.f_xml.d_spel;

public class Address {

    private String addr;
    private String tel;

    public String getAddr() {
        return addr;
    }

    public String getTel() {
        return tel;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        System.out.println(this.addr+this.tel);
        return super.toString();
    }
}

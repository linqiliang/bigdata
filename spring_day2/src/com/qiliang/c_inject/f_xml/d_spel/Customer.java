package com.qiliang.c_inject.f_xml.d_spel;

public class Customer {
    private String c_name;// = "jack";
    private Double pi; //=Math.PI;

    public Double getPi() {
        return pi;
    }

    public void setPi(Double pi) {
        this.pi = pi;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    @Override
    public String toString() {
        System.out.println(this.c_name+this.pi);
        return super.toString();
    }
}

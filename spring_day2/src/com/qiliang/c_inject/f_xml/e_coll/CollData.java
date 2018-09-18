package com.qiliang.c_inject.f_xml.e_coll;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollData {

    private String[] arrayData;
    private List<String> listData;
    private Map<String,String> mapData;
    private Set<String> setData;
    private Properties propsData;

    public List<String> getListData() {
        return listData;
    }

    public Map<String, String> getMapData() {
        return mapData;
    }

    public Properties getPropsData() {
        return propsData;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Set<String> getSetData() {
        return setData;
    }

    public String[] getArrayData() {
        return arrayData;
    }

    public void setListData(List<String> listData) {
        this.listData = listData;
    }

    public void setArrayData(String[] arrayData) {
        this.arrayData = arrayData;
    }

    public void setMapData(Map<String, String> mapData) {
        this.mapData = mapData;
    }

    public void setPropsData(Properties propsData) {
        this.propsData = propsData;
    }

    public void setSetData(Set<String> setData) {
        this.setData = setData;
    }
}


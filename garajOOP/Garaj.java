package com.garajOOP;

import java.util.ArrayList;
import java.util.List;

public class Garaj extends Observable{
    private List<Araclar> aracList = new ArrayList<>();
    private List<Araclar> aracListBefore = new ArrayList<>();
    private int yer;



    public Garaj(int yer) {
        this.yer = yer;
    }

    public int aracBul(int tip) {
        for (Araclar ss : this.aracList){
            if (ss.getTip() == tip){
                return this.aracList.indexOf(ss);
            }
        }
        return -1;
    }

    public List<Araclar> getAracList() {
        return aracList;
    }
    public void setAracList(List<Araclar> aracList) {
        this.aracList = aracList;
        kontrol();
    }

    public List<Araclar> getAracListBefore() {
        return aracListBefore;
    }
    public void setAracListBefore(List<Araclar> aracListBefore) {
        this.aracListBefore = aracListBefore;
    }

    public int getYer() {
        return yer;
    }
    public void setYer(int yer) {
        this.yer = yer;
    }

    public void kontrol(){
        boolean isFarklı = getAracList() != getAracListBefore();
        if (isFarklı) {
            haberVer();
        }
    }
}

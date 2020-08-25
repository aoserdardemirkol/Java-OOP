package com.garajOOP;

public class Araclar {
    private int tip;
    private String ad;
    private int alan;

    public Araclar(int tip, String ad, int alan) {
        this.tip = tip;
        this.ad = ad;
        this.alan = alan;
    }

    public int getTip() {
        return tip;
    }
    public void setTip(int tip) {
        this.tip = tip;
    }

    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getAlan() {
        return alan;
    }
    public void setAlan(int alan) {
        this.alan = alan;
    }

    public String toString() {
        return "Araç Tipi: " + ad + " - Kapladığı Alan:" + alan;
    }
}
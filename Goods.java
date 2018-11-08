package com.lijiaxing.List;

public class Goods {
    private String name;
    private String no;
    private float price;
    private int shuliang;

    public Goods(){

    }
    public Goods(String name, String no, float price, int shuliang) {
        this.name = name;
        this.no = no;
        this.price = price;
        this.shuliang = shuliang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getShuliang() {
        return shuliang;
    }

    public void setShuliang(int shuliang) {
        this.shuliang = shuliang;
    }
}

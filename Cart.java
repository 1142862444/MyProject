package com.lijiaxing.List;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Goods> list = new ArrayList<>();

    public List<Goods> getList() {
        return list;
    }

    public void setList(List<Goods> list) {
        this.list = list;
    }
}

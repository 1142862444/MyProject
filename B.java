package com.lijiaxing.List;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;

public class B {
    private List<Goods> list;
    public B(){
        Cart cart = new Cart();
        list = cart.getList();
    }
    public List buy(Goods newGoods){
        boolean flag = false;
        Iterator<Goods> iterator = list.iterator();//遍历器
        while (iterator.hasNext()){//是否有下一个
            Goods oldGoods = iterator.next();//得到所有老商品的信息
            if (newGoods.getNo().equals(oldGoods.getNo())){//判断新老商品是不是同一种商品
                oldGoods.setShuliang(newGoods.getShuliang()+oldGoods.getShuliang());//老商品数量+新商品数量
                flag = true;
                break;
            }
        }
        if (!flag){//新商品
            list.add(newGoods);//加入新商品
        }
        return list;
    }
    @Test
    public void test(){
        Goods goods1 = new Goods("咖啡","0001",100,2);
        this.buy(goods1);
        Goods goods2 = new Goods("咖啡","0001",100,5);
        this.buy(goods2);
        Goods goods3 = new Goods("牛奶","0002",200,1);
        this.buy(goods3);
        Goods goods4 = new Goods("方糖","0003",50,20);
        this.buy(goods4);
        Goods goods5 = new Goods("方糖","0003",50,10);
        this.buy(goods5);
        Goods goods6 = new Goods("奶茶","0004",150,50);
        List<Goods> list = this.buy(goods6);
        for (Goods goods :list){
            System.out.println(goods.getName()+":"+goods.getShuliang()*goods.getPrice());
        }
    }
}

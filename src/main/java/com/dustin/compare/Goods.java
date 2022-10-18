package com.dustin.compare;

/**
 * @author Dustin_Peng
 * @Description 比较
 * @create 2022-10-04-01:18
 */
public class Goods implements Comparable{
    private String name;
    private double price;

    public Goods() {
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    /**
     * 指明商品比较大小的方式
     * @param o
     * @return
     */
    @Override
    public int compareTo(Object o) {
        //按照商品价格从低到高，再按照产品名称从低到高排序
        if(o instanceof Goods){
            Goods goods = (Goods)o;
            if(this.price == goods.price){
                return this.name.compareTo(goods.name);
            }else{
                return Double.compare(this.price,goods.price);
            }
            //方式二
        }
        throw new RuntimeException("传入的数据类型不一致！");
    }

}

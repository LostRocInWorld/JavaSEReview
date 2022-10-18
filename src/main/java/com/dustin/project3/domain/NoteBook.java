package com.dustin.project3.domain;

/**
 * @Project JavaSEReview
 * @Package com.dustin.project3.team.domain
 * @ClassName NoteBook
 * @Description 笔记本
 * @Date 2022/9/27   01:39
 * @Created by Dustin_Peng
 */
public class NoteBook implements Equipment {
    private String model;
    /**
     * 价格
     */
    private double price;

    public NoteBook() {
    }

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model+"("+price+")";
    }
}

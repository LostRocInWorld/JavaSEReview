package com.dustin.project3.domain;

/**
 * @Project JavaSEReview
 * @Package com.dustin.project3.team.domain
 * @ClassName Printer
 * @Description 打印机
 * @Date 2022/9/27   01:41
 * @Created by Dustin_Peng
 */
public class Printer implements Equipment{
    private String model;
    private String type;

    public Printer() {
    }

    public Printer(String model, String type) {
        this.model = model;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return model+"("+type+")";
    }
}

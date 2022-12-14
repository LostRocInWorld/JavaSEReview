package com.dustin.project3.domain;

/**
 * @Project JavaSEReview
 * @Package com.dustin.project3.team.domain
 * @ClassName PC
 * @Description 电脑
 * @Date 2022/9/27   01:37
 * @Created by Dustin_Peng
 */
public class PC implements Equipment{
    /**
     * 电脑型号
     */
    private String model;
    /**
     * 显示器名称
     */
    private String display;

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model+"("+display+")";
    }
}

package com.dustin.project3.service;

/**
 * @Project JavaSEReview
 * @Package com.dustin.project3.team.service
 * @ClassName Status
 * @Description 状态
 * @Date 2022/9/27   01:47
 * @Created by Dustin_Peng
 */
//public class Status {
//    private final String NAME;
//
//
//    public static final Status FREE = new Status("FREE");
//    public static final Status BUSY = new Status("BUSY");
//    public static final Status VOCATION = new Status("VOCATION");
//    private Status(String name){
//        NAME=name;
//    }
//
//    public String getNAME() {
//        return NAME;
//    }
//
//    @Override
//    public String toString() {
//        return NAME;
//    }
//}
public enum Status{
    FREE,BUSY,VOCATION;
}

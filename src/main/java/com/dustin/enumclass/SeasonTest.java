package com.dustin.enumclass;

/**
 * @author Dustin_Peng
 * @Description 枚举类的使用
 * @create 2022-10-04-03:34
 */
public class SeasonTest {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);
    }

}
//自定义枚举类
class Season{
    //1.声明Season对象的属性（成员变量），使用private final修饰
    private final String seasonName;
    private final String seasonDesc;
    //2.私有类的构造器，并给对象属性赋值
    private Season(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    //3.提供当前枚举类的多个对象:声明为public static final的
    public static final Season SPRING = new Season("春天","春暖花开");
    public static final Season SUMMER = new Season("夏天","夏日炎炎");
    public static final Season AUTUMN = new Season("秋天","秋分飒爽");
    public static final Season WINTER = new Season("冬天","冰天雪地");
    //4.其他要求：获取枚举类对象的属性，重写toString()
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}

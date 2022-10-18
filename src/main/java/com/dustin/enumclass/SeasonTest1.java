package com.dustin.enumclass;

import java.util.Arrays;

enum Season1 implements Info {
    //1.提供当前枚举类的对象，多个对象之间用","隔开，末尾对象以";"结束
    SPRING("春天", "春暖花开") {
        @Override
        public void show() {
            System.out.println("春天在哪里？");
        }
    },
    SUMMER("夏天", "夏日炎炎") {
        @Override
        public void show() {
            System.out.println("宁夏");
        }
    },
    AUTUMN("秋天", "秋分飒爽") {
        @Override
        public void show() {
            System.out.println("秋日");
        }
    },
    WINTER("冬天", "冰天雪地") {
        @Override
        public void show() {
            System.out.println("大约在冬季");
        }
    };

    //2.声明Season对象的属性（成员变量），使用private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //3.私有类的构造器，并给对象属性赋值
    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //4.其他要求：获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

//    @Override
//    public void show() {
//        System.out.println("这是季节"+getSeasonName()+","+getSeasonDesc());
//    }
}

interface Info {
    void show();
}

/**
 * @author Dustin_Peng
 * @Description 使用enum关键字定义
 * @create 2022-10-04-03:48
 */
public class SeasonTest1 {
    public static void main(String[] args) {
        Season1 summer = Season1.SUMMER;
        System.out.println(summer);//SUMMER--常量名
        System.out.println(Season1.class.getSuperclass());//class java.lang.Enum
        System.out.println(Arrays.toString(Season1.values()));//[SPRING, SUMMER, AUTUMN, WINTER]
        Season1 spring = Season1.valueOf("SPRING");
        System.out.println(spring);
        spring.show();

    }
}

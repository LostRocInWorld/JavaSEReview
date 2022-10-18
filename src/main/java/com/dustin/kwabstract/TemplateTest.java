package com.dustin.kwabstract;

/**
 * @Project JavaSEReview
 * @Package com.dustin.kwabstract
 * @ClassName TemplateTest
 * @Description 模板方法的设计模式
 * @Date 2022/9/23   04:19
 * @Created by Dustin_Peng
 */
public class TemplateTest {
    public static void main(String[] args) {
        SubTemplate test = new SubTemplate();
        test.spendTime();
    }
}

abstract class Template {
    /**
     * 计算某段代码执行所要花费的时间
     */
    public void spendTime() {
        long start = System.currentTimeMillis();
        //不确定的部分，易变的部分
        someCode();
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为" + (end - start)+"ms");
    }

    //不确定的部分，易变的部分
    abstract void someCode();
}

class SubTemplate extends Template {
    @Override
    void someCode() {
        label:for (int i = 0; i < 10000; i++) {
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue label;
                }
            }
            System.out.print(i+"\t");
        }
        System.out.println();
    }
}
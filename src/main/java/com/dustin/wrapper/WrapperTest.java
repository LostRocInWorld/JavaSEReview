package com.dustin.wrapper;

import org.junit.Test;
import com.dustin.wrapper.Order;

/**
 * @Project JavaSEReview
 * @Package com.dustin.wrapper
 * @ClassName WrapperTest
 * @Description 包装类测试
 * @Date 2022/9/21   23:57
 * @Created by Dustin_Peng
 */
public class WrapperTest {
    //基本数据类型-->包装类:调用包装类的构造器
    @Test
    public void testBasicToWrapper(){
        int num1 = 10;
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());

        Integer in2 = new Integer("124");
        System.out.println(in2);

//        Integer in3 = new Integer("124abc");//NumberFormatException

        Float f1 = new Float(12.3);
        System.out.println(f1);

        //只要字符串为true就为true
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(false);
        Boolean b3 = new Boolean("true");//true
        Boolean b4 = new Boolean("false");//false
        Boolean b5 = new Boolean("true123");//false

        Order o = new Order();
        System.out.println(o.isMale);//false
        System.out.println(o.isFemale);//null
    }
    //包装类-->基本数据类型:调用包装类的xxxValue()
    @Test
    public void testWrapperToBasic(){
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();

        Character ch1 = new Character('1');
        char c1 = ch1.charValue();

        Float fl1 = new Float(21.5);
        float f1 = fl1.floatValue();
        System.out.println(f1+21);
    }

    /**
     * 自动装箱和拆箱(JDK5.0新增)
     */
    @Test
    public void test3(){
        int num1 = 10;
        //基本数据类型-->包装类，再去使用方法
//        Integer in1 = new Integer(num1);
//        method(in1);
        //直接使用int类型
        method(num1);
        //自动装箱:基本数据类型-->包装类
        int num2 = 20;
        Integer in1 = num2;
        System.out.println(in1.toString());
        //自动拆箱:包装类-->基本数据类型
        int num3 = in1;
    }

    public void method(Object i){
        System.out.println(i);
    }

    @Test
    public void test4(){
        int num1 = 10;
        //方式1：连接运算
        String str1 = num1 + "";
        //方式2：调用String重载的valueOf(xxx)
        String str2 = String.valueOf(num1);
        System.out.println(str2);
    }

    @Test
    public void test5(){
        String str1 = "123";
        //错误情况：使用强转，编译不通过
//        int num1 = (int)str1;
//        Integer num1 = (Integer)str1;
        int num2 = Integer.parseInt(str1);

        String str2 = "true";
        boolean b = Boolean.parseBoolean(str2);
    }


    @Test
    public void test6(){
        Object o1 = true?new Integer(1) : new Double(2.0);
        System.out.println(o1);//1.0

        Object o2;
        if(true){
            o2 = new Integer(1);
        }else{
            o2 = new Double(2.0);
        }
        System.out.println(o2);//1
    }

    @Test
    public void test7(){
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//false

        //自动装箱
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//true

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//false
    }

}
class Order{
    boolean isMale;
    Boolean isFemale;
}


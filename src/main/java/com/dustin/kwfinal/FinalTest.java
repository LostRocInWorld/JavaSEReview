package com.dustin.kwfinal;

/**
 * @Project JavaSEReview
 * @Package com.dustin.kwfinal
 * @ClassName FinalTest
 * @Description 关键字-final
 * @Date 2022/9/23   01:57
 * @Created by Dustin_Peng
 */
public class FinalTest {
    public  final int WIDTH ;

    public FinalTest() {
        WIDTH = 5;
    }

    public FinalTest(int n) {
        WIDTH = 2;
    }

    public void show(){
        int num = 10;
        final int NUM2 = 10;
        num +=1;
//        NUM3+=1;
    }

    public void show(final int NUM3){
        System.out.println(NUM3);
//        NUM3+=2;
    }

    public static void main(String[] args) {
        int num = 10;
        num = num+5;

        AA aa = new AA();

        System.out.println(aa.num);
    }
}
final class A{}
//class B extends A{}
class AA{
    public final int num =2;
    public final void show(){}
}
class BB extends AA{
//    public void show(){}
}
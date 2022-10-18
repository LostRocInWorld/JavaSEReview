package com.dustin.kwinterface;

/**
 * @Project JavaSEReview
 * @Package com.dustin.kwinterface
 * @ClassName Flyable
 * @Description 接口
 * @Date 2022/9/23   21:53
 * @Created by Dustin_Peng
 */
public interface Flyable {
    //1.JDK1.7及以前：只能定义全局常量和抽象方法
    public static final int MAX_SPEED = 7900;//第一宇宙速度
    int MIN_SPEED = 1;//最低速度，书写时可以省略public static final

    //抽象方法
    public abstract void fly();
    void stop();//可省略public abstract
    //2.JDK8，还可以定义静态方法丶默认方法
}
interface Attackable{
    void attack();
}

class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }
}
abstract class Kite implements Flyable{
    @Override
    public void fly() {
        System.out.println("随风起飞");
    }
}
class MonkeyKite extends Kite{
    //必须实现stop方法
    @Override
    public void stop() {
        System.out.println("缓慢停止");
    }
    public void fly() {
        System.out.println("呜呼起飞");
    }
}
class Bullet extends Kite implements Flyable,Attackable{
    @Override
    public void fly() {

    }

    @Override
    public void stop() {
        System.out.println(MIN_SPEED);
    }

    @Override
    public void attack() {

    }
}
//**********
interface AA{
    void method1();
}
interface BB{
    void method2();
}
interface CC extends AA,BB{}
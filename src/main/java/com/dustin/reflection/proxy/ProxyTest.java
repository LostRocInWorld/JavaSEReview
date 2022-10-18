package com.dustin.reflection.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Human {
    String getBelief();

    void eat(String food);
}

/**
 * @author Dustin_Peng
 * @Description 动态代理举例
 * @create 2022-10-18-02:13
 */
public class ProxyTest {
    public static void main(String[] args) {
        //proxyIns--代理类对象，返回的与被代理类同属一个接口
        Human proxyIns = (Human) ProxyFactory.getProxyInstance(new SuperMan());
        //当通过代理类对象调用方法时，会自动的调用被代理类对象要调用的方法
        proxyIns.eat("四川麻辣烫");
        String belief = proxyIns.getBelief();
        System.out.println(belief);

        NikeClothFactory nike = new NikeClothFactory();
        ClothFactory proxyClothFactory = (ClothFactory) ProxyFactory.getProxyInstance(nike);
        proxyClothFactory.produceCloth();
    }
}

//被代理类
class SuperMan implements Human {
    @Override
    public String getBelief() {
        return "I believe I can fly!!!";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃" + food);
    }
}

class ProxyFactory {
    /**
     * 调用方法返回代理类对象--解决问题一
     *
     * @param obj 被代理类对象
     */
    public static Object getProxyInstance(Object obj) {
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.bind(obj);
        Object o = Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler);
        return o;
    }
}

class MyInvocationHandler implements InvocationHandler {
    private Object obj;//需要使用被代理类的对象进行赋值

    public void bind(Object obj) {
        this.obj = obj;
    }
    //当我们通过代理类调用方法a时，就会自动调用如下方法
    //将被代理类要执行的方法a的功能就声明在invoke()中

    /**
     * @param proxy  代理类的对象
     * @param method 代理类对象调用的方法，此方法也就作为了被代理类对象中要调用的方法
     * @param args   方法形参列表
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        HumanUtil.method1();
        //obj：被代理类的对象
        Object returnVal = method.invoke(obj, args);
        //上述方法的返回值就作为当前MyInvocationHandler中invoke()的返回值
        HumanUtil.method2();
        return returnVal;
    }
}

class HumanUtil {
    public static void method1() {
        System.out.println("++++通用方法一++++");
    }

    public static void method2() {
        System.out.println("++++通用方法二++++");
    }
}
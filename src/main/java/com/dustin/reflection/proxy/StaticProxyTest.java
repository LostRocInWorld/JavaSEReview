package com.dustin.reflection.proxy;

/**
 * @author Dustin_Peng
 * @Description 静态代理举例
 * @create 2022-10-18-02:06
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        //创建被代理类对象
        NikeClothFactory nike = new NikeClothFactory();
        //创建代理类对象
        ProxyClothFactory factory = new ProxyClothFactory(nike);
        factory.produceCloth();
    }
}
interface ClothFactory{
    void produceCloth();
}
class ProxyClothFactory implements ClothFactory{
    private ClothFactory factory;//就用被代理类对象进行实例化

    public ProxyClothFactory(ClothFactory factory){
        this.factory = factory;
    }
    @Override
    public void produceCloth() {
        System.out.println("代理工厂做一些准备工作");
        factory.produceCloth();
        System.out.println("代理工厂做一些后续收尾工作");
    }
}
class NikeClothFactory implements ClothFactory{
    @Override
    public void produceCloth() {
        System.out.println("Nike工厂生产一批运动服");
    }
}
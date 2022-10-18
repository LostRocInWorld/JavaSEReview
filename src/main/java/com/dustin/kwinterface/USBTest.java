package com.dustin.kwinterface;


/**
 * @Project JavaSEReview
 * @Package com.dustin.kwinterface
 * @ClassName USBTest
 * @Description 接口--规范，多态性
 * @Date 2022/9/23   22:22
 * @Created by Dustin_Peng
 */
public class USBTest {
    public static void main(String[] args) {
        Computer com = new Computer();
        //创建了接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        com.transferData(flash);//多态性
        //非匿名实现类的匿名对象
        com.transferData(new Printer());
        //创建接口匿名实现类的非匿名对象
        USB phone = new USB(){
            @Override
            public void start() {
                System.out.println("手机链接开始");
            }

            @Override
            public void stop() {
                System.out.println("手机链接结束");
            }
        };
        com.transferData(phone);
        //匿名实现类的非匿名对象
        com.transferData(new USB(){
            @Override
            public void start() {
                System.out.println("mp3链接开始");
            }

            @Override
            public void stop() {
                System.out.println("mp3链接结束");
            }
        });
    }
}

class Computer{
    public void transferData(USB usb){//USB usb = new Flash()
        usb.start();
        System.out.println("具体传输数据的细节");
        usb.stop();
    }
}
interface USB{
    //定义了一系列的规范
    //定义长宽高，传输速率等等
    void start();
    void stop();
}

class Flash implements USB{
    @Override
    public void start() {
        System.out.println("U盘开启工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
    }
}
class Printer implements USB{
    @Override
    public void start() {
        System.out.println("打印机开启工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}

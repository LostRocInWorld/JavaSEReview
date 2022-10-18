package com.dustin.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Dustin_Peng
 * @Description 网络通信
 * @create 2022-10-13-03:30
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress ip1 = InetAddress.getByName("10.184.134.29");
            System.out.println(ip1);
            InetAddress ip2 = InetAddress.getByName("www.baidu.com");
            System.out.println(ip2);
            //本地回环地址--127.0.0.1，域名对应localhost，表示本机
            InetAddress local1 = InetAddress.getByName("127.0.0.1");
            System.out.println(local1);//   /127.0.0.1
            InetAddress local2 = InetAddress.getByName("localhost");
            System.out.println(local2);
            //获取本机ip
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);
            //getHostName()--域名
            System.out.println(localHost.getHostName());
            //getHostAddress()--ip地址
            System.out.println(localHost.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } finally {
        }

    }
}

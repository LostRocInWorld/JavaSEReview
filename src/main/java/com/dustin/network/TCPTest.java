package com.dustin.network;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Dustin_Peng
 * @Description TCP网络编程1
 * @create 2022-10-13-04:34
 */
public class TCPTest {
    /**
     * 客户端
     * 发送一个信息给服务端，服务端将信息打印到控制台
     */
    @Test
    public void client() {

        Socket socket = null;
        OutputStream os = null;
        try {
            InetAddress server = InetAddress.getLocalHost();
            //1.创建socket对象，指明服务器端的ip和端口号
            socket = new Socket(server, 25535);
            //2.获取输出流，用于输出数据
            os = socket.getOutputStream();
            //3.写出的操作
            os.write("你好我是客户端!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源关闭
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 服务端
     */
    @Test
    public void server() {
        ServerSocket ss = null;
        Socket socket = null;
        InputStream is = null;
        ByteArrayOutputStream bos = null;
        try {
            //1.创建服务器端的ServerSocket对象，指明自己的端口号
            ss = new ServerSocket(25535);
            //2.调用accept()表示可以接收来自客户端的socket
            socket = ss.accept();
            //3.获取输入流
            is = socket.getInputStream();
            //4.读取输入流的数据
            bos = new ByteArrayOutputStream();
            int len;
            byte[] buffer = new byte[20];
            while ((len = is.read(buffer)) != -1) {
                bos.write(buffer, 0, len);//写入到内部数组
            }
            System.out.println("收到了来自于"+socket.getInetAddress().getHostName()+"/"+socket.getInetAddress().getHostAddress()+"的数据：");
            System.out.println(bos.toString());
            System.out.println(new String(bos.toByteArray()));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.关闭资源
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ss != null) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

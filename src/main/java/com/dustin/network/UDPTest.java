package com.dustin.network;

import org.junit.Test;

import java.io.Closeable;
import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

/**
 * @author Dustin_Peng
 * @Description UDP网络编程
 * @create 2022-10-13-22:59
 */
public class UDPTest {
    @Test
    public void sender() throws IOException {
        DatagramSocket socket = new DatagramSocket();
        String str = "UDP方式发送的数据";//数据
        InetAddress dest = InetAddress.getLocalHost();//目标ip
        DatagramPacket packet = new DatagramPacket(str.getBytes(),0,str.length(),dest,9090);
        socket.send(packet);
        closeStream(socket);
    }
    @Test
    public void receiver() throws IOException {
        DatagramSocket socket = new DatagramSocket(9090);//指定自己的端口号
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);
        socket.receive(packet);

        String data = new String(packet.getData(), 0, packet.getLength());
        System.out.println(data);
        closeStream(socket);
    }

    private void closeStream(Closeable s) {
        if (s != null) {
            try {
                s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

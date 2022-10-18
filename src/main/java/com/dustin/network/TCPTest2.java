package com.dustin.network;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Dustin_Peng
 * @Description TCP
 * @create 2022-10-13-05:00
 */
public class TCPTest2 {
    @Test
    public void client() {
        Socket socket = null;
        OutputStream os = null;
        BufferedInputStream bis = null;
        InputStream is = null;
        ByteArrayOutputStream bos = null;
        try {
            //1.创建socket
            InetAddress server = InetAddress.getLocalHost();
            socket = new Socket(server, 23323);
            //2.获取输入流
            os = socket.getOutputStream();
            //3.发送数据
            File file = new File("IO1.png");
            bis = new BufferedInputStream(new FileInputStream(file));
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            System.out.println("客户端发送成功");
            socket.shutdownOutput();
            //4.客户端接受"发送成功"的返回信息
            is = socket.getInputStream();
            //使用字节数组输出流接收防止乱码
            bos = new ByteArrayOutputStream();
            int len1;
            byte[] buffer1 = new byte[1024];
            while ((len1 = is.read(buffer1)) != -1) {
                bos.write(buffer1, 0, len1);
            }
            System.out.println(bos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(os);
            closeStream(bis);
            closeStream(is);
            closeStream(bos);
            closeStream(socket);
        }
    }

    @Test
    public void server() {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream is = null;
        BufferedOutputStream bos = null;
        OutputStream os = null;
        try {
            //1.创建serversocket
            serverSocket = new ServerSocket(23323);
            //2.调用accpet
            socket = serverSocket.accept();
            //3.读取数据
            is = socket.getInputStream();
            File receiveFile = new File("tcp-io.png");
            bos = new BufferedOutputStream(new FileOutputStream(receiveFile));
            int len;
            byte[] buffer = new byte[1024];
            while ((len = is.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("图片传输完成");
            //4.给客户端反馈
            os = socket.getOutputStream();
            os.write("你好,照片服务器端已经收到".getBytes());
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源
            closeStream(bos);
            closeStream(is);
            closeStream(os);
            closeStream(socket);
            closeStream(serverSocket);
        }
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

package com.dustin.interfaceproxy;

/**
 * @Project JavaSEReview
 * @Package com.dustin.interfaceproxy
 * @ClassName NetworkTest
 * @Description 静态代理
 * @Date 2022/9/23   22:48
 * @Created by Dustin_Peng
 */
public class NetworkTest {
    public static void main(String[] args) {
        ProxyServer proxyServer = new ProxyServer(new Server());
        proxyServer.browse();
    }
}
interface Network{
    void browse();
}

class Server implements Network{
    @Override
    public void browse() {
        System.out.println("真实服务器访问网络");
    }
}
class ProxyServer implements Network{
    private Network net;
    public ProxyServer(Network net){
        this.net = net;
    }

    public void check(){
        System.out.println("联网之前的检查工作");
    }

    @Override
    public void browse() {
        check();
        net.browse();
    }
}

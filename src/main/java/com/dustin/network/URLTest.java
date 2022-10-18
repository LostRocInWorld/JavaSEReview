package com.dustin.network;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Dustin_Peng
 * @Description URL
 * @create 2022-10-14-01:25
 */
public class URLTest {
    @Test
    public void testURL() throws MalformedURLException {
        URL url = new URL("https://genesis.pti.corp.pegatron/loginpage?name=user");
        System.out.println(url.getProtocol());//https
        System.out.println(url.getHost());//genesis.pti.corp.pegatron
        System.out.println(url.getPort());//-1
        System.out.println(url.getPath());//    /loginpage
        System.out.println(url.getFile());//    /loginpage
        System.out.println(url.getQuery());//   name=user

    }
}

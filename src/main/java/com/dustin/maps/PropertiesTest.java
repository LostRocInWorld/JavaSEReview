package com.dustin.maps;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Dustin_Peng
 * @Description Properties
 * @create 2022-10-07-04:46
 */
public class PropertiesTest {
    @Test
    public void test1() {
        Properties props = new Properties();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/main/java/com/dustin/maps/props.properties");
            props.load(fis);
            String name = props.getProperty("name");
            String pwd = props.getProperty("password");
            System.out.println("name = " + name + "\t" + "password = " + pwd);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

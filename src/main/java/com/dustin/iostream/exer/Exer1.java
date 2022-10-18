package com.dustin.iostream.exer;

import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Dustin_Peng
 * @Description 练习
 * @create 2022-10-11-23:17
 */
public class Exer1 {

    /**
     * 图片加密
     *
     * @param src
     * @param dest
     */
    public void copyFiles(String src, String dest) {
        //1.实例化File类对象
        File srcFile = new File(src);//相较于当前Module
        File destFile = new File(dest);//相较于当前Module
        //2.流对象的实例化
        FileInputStream fi = null;
        FileOutputStream fo = null;
        try {
            fi = new FileInputStream(srcFile);
            fo = new FileOutputStream(destFile);
            //复制的过程
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fi.read(buffer)) != -1) {
                for (int i = 0; i < len; i++) {
                    buffer[i] ^= 5;
                }
                fo.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fo != null)
                    fo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fi != null)
                    fi.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testCopySecret() {
        copyFiles("IOSecret.png", "IOGood.png");
        System.out.println("加密完成");
    }

    public Map<Character, Integer> getCnt(String src) {
        if (!src.endsWith(".txt")) {
            return null;
        }
        File srcFile = new File(src);
        HashMap<Character, Integer> map = new HashMap<>();
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(srcFile);
            fw = new FileWriter(new File(srcFile.getParent(), "result.txt"));
            char[] buffer = new char[1024];
            int len;
            while ((len = fr.read(buffer)) != -1) {
                for (int i = 0; i < len; i++) {
                    if (map.get(buffer[i]) != null) {
                        map.put(buffer[i], map.get(buffer[i]) + 1);
                    } else {
                        map.put(buffer[i], 1);
                    }
                }
            }
            Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Character, Integer> entry = it.next();
                switch (entry.getKey()) {
                    case ' ':
                        fw.write("空格" + "\t\t\t" + entry.getValue() + "\n");
                        break;
                    case '\t':
                        fw.write("tab" + "\t\t\t" + entry.getValue() + "\n");
                        break;
                    case '\n':
                        fw.write("换行" + "\t\t\t" + entry.getValue() + "\n");
                        break;
                    case '\r':
                        fw.write("回车" + "\t\t\t" + entry.getValue() + "\n");
                        break;
                    default:
                        fw.write(entry.getKey() + "\t\t\t" + entry.getValue() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return map;
    }

    @Test
    public void exer2() {
        Map<Character, Integer> cnt = getCnt("wktype暫記.txt");
//        System.out.println(cnt);
    }
}

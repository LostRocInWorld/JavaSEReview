package com.dustin.file.exer;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author Dustin_Peng
 * @Description File类练习
 * @create 2022-10-10-23:46
 */
public class FileExer1 {
    @Test
    public void test1() throws IOException {
        File file = new File("hello.txt");
        //创建一个与File同目录的另外一文件，文件名为：haha.txt
        File file1 = new File(file.getParent(), "haha.txt");
        boolean create = file1.createNewFile();
        if (create) {
            System.out.println("创建成功");
        }
    }

    @Test
    public void test2() throws IOException {
        File src = new File("src");
        String[] list = src.list();//下一层目录
        for (String dest :
                list) {
            if (dest.endsWith(".jpg")) {
                System.out.println("存在.jpg结尾的文件");
                break;
            }
        }
    }

    @Test
    public void test3() throws IOException {
        String dir = "src/main/java/com/dustin/file/FileTest.java";
        getAllFiles(dir);
    }

    public void getAllFiles(String dir) {
        File src = new File(dir);
        if (src.isDirectory()) {
            File[] files = src.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    getAllFiles(file.getAbsolutePath());
                } else {
                    System.out.println("文件名称:" + file.getPath() + "+文件大小：" + file.length() + "字节");
                }
            }
        } else {
            System.out.println("文件名称:" + src.getPath() + "+文件大小：" + src.length() + "字节");
        }
    }
}

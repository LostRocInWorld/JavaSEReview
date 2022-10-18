package com.dustin.iostream;

import org.junit.Test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dustin_Peng
 * @Description Path类
 * @create 2022-10-13-01:48
 */
public class PathTest {
    @Test
    public void test1(){
        Path path1 = Paths.get("hello.txt");
        Path path2 = Paths.get("D:\\","IdeaJavaProject\\JavaSEReview\\hello.txt");
        Path path3 = Paths.get("D:\\","IdeaJavaProject\\JavaSEReview"+"\\src\\main\\com\\dustin\\array");

        System.out.println(path1);
        System.out.println(path1.startsWith("D:\\"));
        System.out.println(path2.endsWith("o.txt"));//false ,hello.txt为true
        System.out.println(path1.isAbsolute() + "\t" + path2.isAbsolute());
        System.out.println(path1.getParent());//相对路径没有父路径,返回null
        System.out.println(path2.getParent());//相对路径没有父路径
        System.out.println(path1.getRoot());//相对路径返回null，path2返回D:\
        System.out.println(path1.getFileName());//hello.txt
        System.out.println(path2.getNameCount());//相对路径返回1（一层），绝对路径返回有多少层目录
        Path path3Name = path3.getName(0);//用于目录，返回对应层数的目录名，如0为IdeaJavaProject；使用文件参数大于0报错IllegalArgumentException，返回hello.txt
        System.out.println(path3Name);
        System.out.println(path1.toAbsolutePath());//D:\IdeaJavaProject\JavaSEReview\hello.txt
        System.out.println(path1.resolve(path3));//返回两个路径以换行隔开
        File file1 = path1.toFile();
        Path toPath = file1.toPath();
    }
}

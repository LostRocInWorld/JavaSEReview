package com.dustin.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Dustin_Peng
 * @Description IO流
 * @create 2022-10-09-04:48
 */
public class FileTest {
    //实例化
    public static void main(String[] args) {
        //相对于module
        File file1 = new File("hello.txt");//D:\IdeaJavaProject\JavaSEReview\hello.txt
        File file2 = new File("D:\\IdeaJavaProject\\JavaSEReview\\hello.txt");
        System.out.println(file1);

        File file3 = new File("D:\\IdeaJavaProject\\JavaSEReview", "src");

        File file4 = new File(file3, "hi.txt");
    }

    @Test()
    public void test1() {
        File file1 = new File("hello.txt");//D:\IdeaJavaProject\JavaSEReview\hello.txt
        System.out.println(file1.getAbsolutePath());//D:\IdeaJavaProject\JavaSEReview\hello.txt
        System.out.println(file1.getPath());//hello.txt
        System.out.println(file1.getName());//hello.txt
        System.out.println(file1.getParent());//null--由于是相对路径，和文件是否存在无关
        System.out.println(file1.length());//0
        System.out.println(file1.lastModified());//1665271429996
        System.out.println(Arrays.toString(file1.list()));
    }
//查询
    @Test()
    public void test2() {
        File file = new File("D:\\IdeaJavaProject\\JavaSEReview", "src");
        String[] list = file.list();
        //文件名或文件目录名
        for (String s :
                list) {
            System.out.println(s);
        }

        File[] files = file.listFiles();
        for (File f :
                files) {
            System.out.println(f);
        }
    }
    //重命名
    @Test()
    public void test3() {
        //file1.renameTo(file2)，file1文件必须存在且file2不能存在
        File file1 = new File("D:\\IdeaJavaProject\\JavaSEReview", "hello.txt");
        File file2 = new File("D:\\IdeaJavaProject\\JavaSEReview\\src\\hello.txt");
        System.out.println(file1.renameTo(file2));
    }
//判断
    @Test()
    public void test4() {
        File file1 = new File("D:\\IdeaJavaProject\\JavaSEReview\\hello.txt");
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());
    }
//创建
    @Test()
    public void test5() throws IOException {
        //文件的创建
        File file1 = new File("hi.txt");
        if (!(file1.exists())) {
            file1.createNewFile();
            System.out.println("创建成功");
        }else{
            file1.delete();
            System.out.println("删除成功");
        }

    }
    @Test()
    public void test6() throws IOException {
        //文件目录的创建
        File file1 = new File("src/main/java/temp");
        boolean mkdir = file1.mkdir();
        if(mkdir){
            System.out.println("创建成功");
        }

        File file2 = new File("src/main/java/temp/temp1/temp2");
        boolean mkdirs = file2.mkdirs();
        if(mkdirs){
            System.out.println("创建成功");
        }
        //要想删除成功，temp2文件目录下不能有子目录或子文件
        file1.delete();
    }
    
    @Test
    public void test7(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("AA",1);
        map.put("BB",2);
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
        }

    }


}


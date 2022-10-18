package com.dustin.wrapper.exer;

import org.junit.Test;

import java.util.Scanner;
import java.util.Vector;

/**
 * @Project JavaSEReview
 * @Package com.dustin.wrapper.exer
 * @ClassName ScoreTest
 * @Description 包装类测试
 * @Date 2022/9/22   01:29
 * @Created by Dustin_Peng
 */
public class ScoreTest {

/*
利用Vector代替数组处理，从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级
提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的长度
而想两类java.util.Vector可以根据需要动态伸缩。

创建Vector对象：Vector v = new Vector();
给向量添加元素：v.addElement(Object obj); //obj必须是对象
取出向量中的元素:Object obj = v.elementAt(int index);
注意第一个元素的下标是0，返回值是Object
计算向量的长度：v.size()

若与最高分相差10分内，A等；20分内，B等；30分内，C等；其他，D等
*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector v = new Vector();
        int count = 1;
        Integer max = 0;;
        while(true){
            System.out.print("请输入第"+count+"个学生的成绩：");
            Integer temp = scanner.nextInt();
            if(temp >100){
                System.out.println("成绩输入非法，请重新输入");
                continue;
            }
            if(temp<0){
                break;
            }
            v.add(temp);
            count++;
            //获取最大成绩
            if(max<temp){
                max=temp;
            }
        }

        //遍历输出
        char level;
        for (int i = 0; i < v.size(); i++) {
            Integer nowScore = (Integer) v.elementAt(i);
            if(max - nowScore<=10){
                level='A';
            }else if(max - nowScore <= 20){
                level='B';
            }else if(max - nowScore <= 30){
                level='C';
            }else {
                level='D';
            }
            System.out.println("学生的成绩为："+nowScore+"等级为："+level);
        }
    }

    }


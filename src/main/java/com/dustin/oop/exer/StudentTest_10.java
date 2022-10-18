package com.dustin.oop.exer;

/**
 * @Project JavaSEReview
 * @Package com.dustin.object.exer
 * @ClassName StudentTest_10
 * @Description 对象数组练习
 * @Date 2022/9/15   04:46
 * @Created by Dustin_Peng
 */
public class StudentTest_10 {
    public static void main(String[] args) {
        Student[] students = new Student[20];
        for (int i = 0; i < 20; i++) {
            students[i] = new Student();
            students[i].setScore();
            students[i].setState();
            students[i].number = i + 1;
        }
        //打印3年级的学生信息
        System.out.println("------3年级学生如下------");
        for (int i = 0; i < students.length; i++) {
            if (students[i].state == 3) {
                System.out.println(students[i].getInfo());
            }
        }
        System.out.println("-----------------------");
        //冒泡排序
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].score > students[j + 1].score) {
//                    System.out.println("第"+i+"轮大循环中的"+"第"+j+"次小循环");
                    Student temp = students[j];
//                    System.out.println("temp的地址值"+temp);
//                    System.out.println("students[j]的地址值"+students[j]);
//                    System.out.println("students[j+1]的地址值"+students[j+1]);

//                    System.out.println("temp=students[j]后的temp的地址值"+temp);
//                    System.out.println("temp=students[j]后的students[j]的地址值"+students[j]);
                    students[j] = students[j + 1];
//                    System.out.println("students[j] = students[j + 1]后的students[j]的地址值"+students[j]);
//                    System.out.println("students[j] = students[j + 1]后的students[j+1]的地址值"+students[j + 1]);
                    students[j + 1] = temp;
//                    System.out.println("students[j + 1] = temp后的students[j+1]的地址值"+students[j + 1]);
//                    System.out.println("students[j + 1] = temp后的temp的地址值"+temp);
//                    System.out.println("================================");
                }
            }
        }
        System.out.println("冒泡排序后");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getInfo());
        }
//        System.out.println(Arrays.toString(students));
    }
}

class Student {
    int number;
    int state = 1;
    int score;

    public void setScore() {
        score = random(1, 100);
    }

    public void setState() {
        state = random(1, 6);
    }

    public int random(int min, int max) {
        return (int) (Math.random() * (max) + min);
    }

    /**
     * 获取学生信息，学号+年级+成绩
     * @return 学生信息
     */
    public String getInfo() {
        return "《学号:" +
                number +
                ",年级:" +
                state +
                ",成绩:" + score+"》";
    }


}

package com.dustin.inheritance;

/**
 * @Project JavaSEReview
 * @Package com.dustin.inheritance
 * @ClassName Mankind
 * @Description 继承性练习1
 * @Date 2022/9/20   05:02
 * @Created by Dustin_Peng
 */
public class Mankind {
    /**
     * 性别
     */
    private int sex;
    /**
     * 工资
     */
    private int salary;

    public Mankind() {
    }

    public void manOrWoman(){
        if(1 == sex ){
            System.out.println("man");
        }else if(0 == sex){
            System.out.println("woman");
        }
    }

    public void employed(){
        System.out.println((0 == salary?"no job!":"have job!"));
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

package com.dustin.inheritance;

/**
 * @Project JavaSEReview
 * @Package com.dustin.inheritance
 * @ClassName Kids
 * @Description 继承性练习1
 * @Date 2022/9/20   05:05
 * @Created by Dustin_Peng
 */
public class Kids extends Mankind{
    /**
     * 年龄
     */
    private int yearsOld;

    public Kids() {
    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println("I am "+ yearsOld+" yearsOld");
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void employed(){
        System.out.println("Kids should study and no job!");
    }

}

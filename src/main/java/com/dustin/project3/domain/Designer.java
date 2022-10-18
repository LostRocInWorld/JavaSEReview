package com.dustin.project3.domain;

/**
 * @Project JavaSEReview
 * @Package com.dustin.project3.team.domain
 * @ClassName Designer
 * @Description 设计师
 * @Date 2022/9/27   01:29
 * @Created by Dustin_Peng
 */
public class Designer extends Programmer{
    private double bonus;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return  getDetails()+"设计师\t"+getStatus()+"\t"+bonus+"\t\t"+getEquipment().getDescription() ;
    }

    public String getDetailsForDevTeam(){
        return getMemberID()+"/"+getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary()+"\t设计师\t"+getBonus();
    }
}

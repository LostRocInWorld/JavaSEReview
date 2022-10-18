package com.dustin.project3.domain;

/**
 * @Project JavaSEReview
 * @Package com.dustin.project3.team.domain
 * @ClassName Architect
 * @Description 架构师
 * @Date 2022/9/27   01:29
 * @Created by Dustin_Peng
 */
public class Architect extends Designer {
    private int stock;

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getDetails() + "架构师\t" + getStatus() + "\t" + getBonus() + "\t" + stock + "\t\t" + getEquipment().getDescription();
    }

    public String getDetailsForDevTeam(){
        return getMemberID()+"/"+getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary()+"\t架构师\t"+getBonus()+"\t"+getStock();
    }
}

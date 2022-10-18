package com.dustin.project3.domain;

import com.dustin.project3.service.Status;

/**
 * @Project JavaSEReview
 * @Package com.dustin.project3.team.domain
 * @ClassName Programmer
 * @Description 程序员
 * @Date 2022/9/27   01:28
 * @Created by Dustin_Peng
 */
public class Programmer extends Employee {
    /**
     * 开发团队中的id
     */
    private int memberID;
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return   getDetails()+"程序员\t" + status + "\t\t" + equipment.getDescription();
    }

    public String getDetailsForDevTeam(){
        return memberID+"/"+getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary()+"\t"+"程序员";
    }
}

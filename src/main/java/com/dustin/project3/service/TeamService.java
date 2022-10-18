package com.dustin.project3.service;

import com.dustin.project3.domain.Architect;
import com.dustin.project3.domain.Designer;
import com.dustin.project3.domain.Employee;
import com.dustin.project3.domain.Programmer;

/**
 * @Project JavaSEReview
 * @Package com.dustin.project3.team.junit
 * @ClassName TeamService
 * @Description 关于开发团队成员的管理：添加丶删除等
 * @Date 2022/9/27   02:56
 * @Created by Dustin_Peng
 */
public class TeamService {
    /**
     * 限制开发团队的人数
     */
    private static final int MAX_MEMEBER = 5;
    /**
     * 开发团队的id
     */
    private static int counter = 1;
    /**
     * 保存开发团队成员
     */
    private Programmer[] team = new Programmer[MAX_MEMEBER];
    /**
     * 开发团队的实际人数
     */
    private int total;

    public TeamService() {
    }

    public int getTotal() {
        return total;
    }

    /**
     * 获取开发团队的所有成员
     *
     * @return
     */
    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < total; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    /**
     * 将指定员工添加到开发团队中
     *
     * @param e 某个Employee
     */
    public void addMember(Employee e) throws TeamException {
        //成员不满
        if (total >= MAX_MEMEBER) {
            throw new TeamException("成员已满，无法添加");
        }
        //改成员不是开发人员
        if (!(e instanceof Programmer)) {
            throw new TeamException("成员不是开发人员");
        }
        //该员工已经在开发团队中
        if (isExist(e)) {
            throw new TeamException("该员工已经在开发团队中");
        }
        //该员工已经在其他团队中
        Programmer p = (Programmer) e;
//        if (Status.BUSY.equals(p.getStatus().getNAME())) {
//            throw new TeamException("该员工已经在其他团队中");
//        }else if(Status.VOCATION.equals(p.getStatus().getNAME())){
//            throw new TeamException("该员工已经在休假");
//        }
        switch (p.getStatus()) {
            case BUSY:
                throw new TeamException("该员工已经在其他团队中");
            case VOCATION:
                throw new TeamException("该员工已经在休假");
        }
        int aNum = 0;
        int dNum = 0;
        int pNum = 0;
        //team中已有成员架构师，设计师，程序员的数量
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                aNum++;
            } else if (team[i] instanceof Designer) {
                dNum++;
            } else if (team[i] instanceof Programmer) {
                pNum++;
            }
        }

        if (e instanceof Architect) {
            //团队至多只有一个架构师
            if (aNum >= 1) {
                throw new TeamException("团队至多只有一个架构师");
            }
        } else if (e instanceof Designer) {
            //团队至多只有2个设计师
            if (dNum >= 2) {
                throw new TeamException("团队至多只有2个设计师");
            }
        } else if (e instanceof Programmer) {
            //团队至多只有3个程序员
            if (pNum >= 3) {
                throw new TeamException("团队至多只有3个程序员");
            }
        }

        //将e添加到现有的team中
        team[total++] = p;
        p.setStatus(Status.BUSY);
        p.setMemberID(counter++);
    }

    /**
     * 判断该成员是否存在开发团队汇总
     *
     * @param e 成员
     * @return true--在，false--不在
     */
    private boolean isExist(Employee e) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == e.getId()) {
                return true;
            }
        }
        return false;
    }

    public void removeMember(int memberID) throws TeamException {
        if (memberID < 0) {
            throw new TeamException("输入的ID不正确");
        }
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberID() == memberID) {
                //变status
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        //未找到指定memberID
        if (i == total) {
            throw new TeamException("找不到指定的成员");
        }
        //后一个覆盖前一个
        for (int j = i + 1; j < total; j++) {
            team[j - 1] = team[j];
        }
        //最后一个置空
        team[--total] = null;

    }
}

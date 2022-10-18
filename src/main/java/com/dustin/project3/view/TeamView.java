package com.dustin.project3.view;

import com.dustin.project3.service.TeamException;
import com.dustin.project3.domain.Employee;
import com.dustin.project3.domain.Programmer;
import com.dustin.project3.service.NameListService;
import com.dustin.project3.service.TeamService;

/**
 * @Project JavaSEReview
 * @Package com.dustin.project3.team.view
 * @ClassName TeamView
 * @Description 项目3视图
 * @Date 2022/9/27   01:19
 * @Created by Dustin_Peng
 */
public class TeamView {
    private NameListService nameListService = new NameListService();
    private TeamService teamService = new TeamService();

    public static void main(String[] args) {
        TeamView view = new TeamView();
        try {
            view.enterMainMenu();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void enterMainMenu() {
        boolean isFlag = true;
        char menu = '0';
        while (isFlag) {
            System.out.println("--------------------------------开发团队调度软件--------------------------------");
            if(menu!='1'){
                listAllEmployee();
            }
            System.out.print("1-团队列表 2-添加成员 3-删除团队成员 4-退出 请选择(1-4):");
             menu = TSUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.print("你确认是否要退出(Y/N)：");
                    char exit = TSUtility.readConfirmSelection();
                    if('Y' == exit){
                        isFlag = false;
                    }
                    break;
            }
            System.out.println();

        }

    }

    /**
     * 显示所有的员工信息
     */
    private void listAllEmployee() throws TeamException {
        Employee[] allEmployees = nameListService.getAllEmployees();
        if(allEmployees.length == 0){
            System.out.println("--------------------------------当前团队没有员工--------------------------------");
        }
        System.out.println("id\tname\tage\tsalary\ttype\tstatus\tbonus\tstock\tequipment");
        for (int i = 0; i < allEmployees.length; i++) {
            System.out.println(allEmployees[i]);
        }
    }

    private void getTeam() {
        System.out.println("--------------------------------团队成员列表--------------------------------");
        Programmer[] devTeam = teamService.getTeam();
        if(devTeam.length == 0 || devTeam == null ||teamService.getTotal() == 0 ){
            System.out.println("--------------------------------开发团队没有员工--------------------------------");
            return;
        }
        System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票\n");
        for (int i = 0; i < devTeam.length; i++) {
            System.out.println(devTeam[i].getDetailsForDevTeam());
        }
        System.out.println("------------------------------------------------------------------------");
    }

    private void addMember() {
        System.out.println("--------------------------------添加成员--------------------------------");
        System.out.print("1.请输入要添加的员工的ID:");
        int id = TSUtility.readInt();
        try {
            teamService.addMember(nameListService.getEmployee(id));
            System.out.println("添加成功");
        } catch (TeamException e) {
            System.out.println("添加失败，原因"+e.getMessage());
        }
        TSUtility.readReturn();
    }

    private void deleteMember() {
        System.out.println("--------------------------------删除成员--------------------------------");
        System.out.print("1.请输入要删除的员工的memberID:");
        int id = TSUtility.readInt();
        try {
            System.out.print("是否要删除(Y/N):");
            char confirmSelection = TSUtility.readConfirmSelection();
            System.out.println("confirmSelection = " + confirmSelection);
            if('Y' == confirmSelection){
                teamService.removeMember(id);
                System.out.println("删除成功");
            }
        } catch (TeamException e) {
            System.out.println("删除失败，原因"+e.getMessage());
        }
        TSUtility.readReturn();
    }
}

package com.dustin.project1;


/**
 * @Project JavaSEReview
 * @Package com.dustin.project1
 * @ClassName FamilyAccount
 * @Description 家庭记账文件
 * @Date 2022/9/12   22:45
 * @Created by Dustin_Peng
 */
public class FamilyAccount {
    public static void main(String[] args) {
        boolean stopFlag = true;
        //初始金额
        int balance = 10000;
        //用于记录用户的收支明细
        String details = "";

        while (stopFlag) {
            System.out.println("------------家庭记账软件------------\n");
            System.out.println("\t\t1 收支明细\t\t");
            System.out.println("\t\t2 登记收入\t\t");
            System.out.println("\t\t3 登记支出\t\t");
            System.out.println("\t\t4 退   出\t\t\n");
            System.out.print("\t\t\t请选择<1-4>：");

            //获取用户的选择：1-4
            char menuSelection = Utility.readMenuSelection();
            switch (menuSelection) {
                case '1':
                    System.out.println("------------当前收支明细记录------------");
                    System.out.println("收支\t账户金额\t收支金额\t说明");
                    System.out.println(details);
                    System.out.println("-------------------------------------");
                    break;
                case '2':
                    System.out.println("本次收入金额：");
                    int income = Utility.readNumber();
                    System.out.println("本次收入说明：");
                    String incomeInfo = Utility.readString();
                    //处理余额balance
                    balance += income;
                    //处理details记录的详情
                    details += "收入\t" + balance + "\t" + income + "\t" + incomeInfo + "\n";
                    System.out.println("------------本次收入记录完成------------");
                    break;
                case '3':
                    System.out.println("本次支出金额：");
                    int outcome = Utility.readNumber();
                    System.out.println("本次支出说明：");
                    String outInfo = Utility.readString();
                    //处理余额balance
                    if(balance>=outcome){
                        balance -= outcome;
                    }else{
                        System.out.println("账户余额不足，支出失败!!!");
                        continue;
                    }
                    //处理details记录的详情
                    details += "支出\t" + balance + "\t" + outcome + "\t" + outInfo + "\n";
                    System.out.println("------------本次支出记录完成------------");
                    break;
                case '4':
                    System.out.print("是否确认退出：");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y') {
                        stopFlag = false;
                    }
            }
        }
    }
}

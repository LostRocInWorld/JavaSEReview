package com.dustin.project3.service;

import com.dustin.project3.domain.*;

/**
 * @Project JavaSEReview
 * @Package com.dustin.project3.team.service
 * @ClassName NameListService
 * @Description 负责将Data中的数据封装到Employee数组中，同时提供相关操作Employee[]的方法
 * @Date 2022/9/27   01:58
 * @Created by Dustin_Peng
 */
public class NameListService {
    private Employee[] employees;

    /**
     * 给employees及数组元素初始化
     */
    public NameListService() {
        //1.根据项目提供的Data类构建相应大小的employees数组
        employees = new Employee[Data.EMPLOYEES.length];
        //2.再根据Data类中的数据构建不同的对象
        for (int i = 0; i < Data.EMPLOYEES.length; i++) {
            //获取类型
            int type = Integer.parseInt(Data.EMPLOYEES[i][0]);
            //获取基本信息
            int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
            String name = Data.EMPLOYEES[i][2];
            int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
            double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);
            double bonus;
            int stock;
            Equipment ep;
            switch (type) {
                case Data.EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case Data.PROGRAMMER:
                    ep = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, ep);
                    break;
                case Data.DESIGNER:
                    ep = createEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, ep, bonus);
                    break;
                case Data.ARCHITECT:
                    ep = createEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, ep, bonus, stock);
                    break;
            }
        }

        //3.再将对象存入数组中
    }

    /**
     * 获取指定index上的设备
     *
     * @param i 索引
     * @return 具体的设备类
     */
    private Equipment createEquipment(int i) {
        int eqType = Integer.parseInt(Data.EQIPMENTS[i][0]);

        switch (eqType) {
            case Data.PC:
                return new PC(Data.EQIPMENTS[i][1], Data.EQIPMENTS[i][2]);
            case Data.NOTEBOOK:
                return new NoteBook(Data.EQIPMENTS[i][1], Double.parseDouble(Data.EQIPMENTS[i][2]));
            case Data.PRINTER:
                return new Printer(Data.EQIPMENTS[i][1], Data.EQIPMENTS[i][2]);
        }
        return null;
    }

    public Employee[] getAllEmployees() {
        return employees;
    }

    public Employee getEmployee(int id) throws TeamException{
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getId() == id){
                return employees[i];
            }
        }
        throw new TeamException("找不到指定的员工");
    }
}

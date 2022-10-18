package com.dustin.project3.junit;

import com.dustin.project3.domain.Employee;
import com.dustin.project3.service.NameListService;
import com.dustin.project3.service.TeamException;
import org.junit.Test;

/**
 * @Project JavaSEReview
 * @Package com.dustin.project3.team.junit
 * @ClassName NameListServiceTest
 * @Description NameListService的测试
 * @Date 2022/9/27   02:28
 * @Created by Dustin_Peng
 */
public class NameListServiceTest {
    @Test
    public void testGetAllEmployees(){
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        for (Employee e:
             employees) {
            System.out.println(e);
        }
    }
    @Test
    public void testGetEmployee(){
        NameListService service = new NameListService();
        try {
            Employee employee = service.getEmployee(100);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }
}

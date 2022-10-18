package com.dustin.generic;

import org.junit.Test;

/**
 * @author Dustin_Peng
 * @Description 测试
 * @create 2022-10-08-04:32
 */
public class DAOTest {
    @Test
    public void test1(){
        CustomerDAO dao = new CustomerDAO();
        dao.add(new Customer());
    }
}

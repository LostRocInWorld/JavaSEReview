package com.dustin.generic.exer;

/**
 * @author Dustin_Peng
 * @Description 自定义泛型练习
 * @create 2022-10-09-04:40
 */
public class DaoTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<User>();
        dao.save("1001",new User(1,25,"Jack"));
        dao.save("1002",new User(2,20,"Rose"));
        dao.save("1003",new User(3,31,"Tommy"));
        dao.update("1003",new User(3,31,"Jerry"));
        System.out.println(dao.list());
        dao.delete("1002");
        System.out.println(dao.list());

    }
}

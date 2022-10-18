package com.dustin.thread;

/**
 * @author Dustin_Peng
 * @Description 懒汉式
 * @create 2022-09-30-03:32
 */
public class Temp {
    private static Temp t = null;
    private String name;

    private Temp() {
    }

    public static Temp getInstance() {
        synchronized (Temp.class) {
            if (t == null) {
                if (t == null) {
                    t = new Temp();
                }
            }
        }
        return t;
    }
}

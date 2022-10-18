package com.dustin.project1;

import java.util.Scanner;

/**
 * @Project JavaSEReview
 * @Package com.dustin.project1
 * @ClassName Utility
 * @Description 家庭记账软件公共功能
 * @Date 2022/9/12   22:45
 * @Created by Dustin_Peng
 */
public class Utility {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * 用于界面菜单选择，要求输入1-4并返回对应的char
     *
     * @return 返回用户输入的char
     */
    public static char readMenuSelection() {
        char c;
        while (true) {
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.println("选择错误，请重新输入：");
            } else break;
        }
        return c;
    }

    /**
     * 用于输入收支的金额。从键盘读取一个不超过4位的整数，并返回它
     *
     * @return int
     */
    public static int readNumber() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(4);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("数字输入错误，请重新输入：");
//                e.printStackTrace();
            }
        }
        return n;
    }

    /**
     * 从键盘读取一个不超过8位的字符串，并返回
     *
     * @return String
     */
    public static String readString() {
        return readKeyBoard(8);

    }

    /**
     * 用于确认选择的输入。从键盘读取"Y"或"N"无视大小写，并将其作为方法的返回值
     *
     * @return char
     */
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.println("选择错误请重新输入：");
            }
        }
        return c;
    }

    private static String readKeyBoard(int limit) {
        String line = "";
        while (scanner.hasNext()) {
            line = scanner.nextLine();
            if (line.length() < 1 || line.length() > limit) {
                System.out.println("输入长度(不大于" + limit + ")错误，请重新输入：");
            } else break;
        }
        return line;
    }

}

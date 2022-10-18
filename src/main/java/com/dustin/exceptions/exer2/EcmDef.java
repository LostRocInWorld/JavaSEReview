package com.dustin.exceptions.exer2;

import java.util.Scanner;

/**
 * @Project JavaSEReview
 * @Package com.dustin.exceptions.exer2
 * @ClassName EcmDef
 * @Description 练习2
 * @Date 2022/9/26   23:36
 * @Created by Dustin_Peng
 */
public class EcmDef {
    static int ecm(Integer[] array) throws ArrayIndexOutOfBoundsException, ArithmeticException, Ecdef {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                throw new Ecdef("输入的数为负数");
            }
        }
        return array[0] / array[1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] array = new Integer[2];
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.print("请输入第" + (i + 1) + "数：");
                array[i] = Integer.parseInt(scanner.nextLine());
            }
            int result = ecm(array);
            System.out.println("两数相除的结果为:" + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("未输入分子或分母");
        } catch (NumberFormatException e) {
            System.out.println("输入的类型不一致");
        } catch (ArithmeticException e) {
            System.out.println("除以0");
        } catch (Ecdef ecdef) {
            System.out.println(ecdef.getMessage());
        }

    }

}

class Ecdef extends RuntimeException {
    static final long serialVersionUID = -7034897190745766939L;

    public Ecdef() {
    }

    public Ecdef(String message) {
        super(message);
    }
}

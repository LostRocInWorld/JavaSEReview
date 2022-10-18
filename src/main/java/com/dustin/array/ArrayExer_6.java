package com.dustin.array;

/**
 * @Project JavaSEReview
 * @Package com.dustin.array
 * @ClassName ArrayExer_6
 * @Description 例题和数组元素的赋值杨辉三角
 * @Date 2022/9/13   22:38
 * @Created by Dustin_Peng
 */
public class ArrayExer_6 {
    public static void main(String[] args) {
        //1.求二维数组所有元素之和
//        int[][] arr = {{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                sum += arr[i][j];
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println("和为：" +
//                sum);

        //2.打印一个10行的杨辉三角：
        // 第一行有个1个元素，第n行有n个元素
        //每一行的第一个元素和最后一个元素都是1
        //从第3行开始，对于非第一个元素和最后一个元素，有yh[i][j] = yh[i-1][j-1]+yh[i-1][j]
//        //1.声明一个二维数组
//        int[][] yh = new int[10][];
//        //2.给数组中的元素赋值
//        for (int i = 0; i < yh.length; i++) {
//            //2.1声明出当前行有多少个元素
//            yh[i] = new int[i + 1];
//            //2.2给首末元素赋值
//            yh[i][0] = 1;
//            yh[i][i] = 1;
//            //2.3给中间的元素赋值
//            if (i >= 2) {
//                for (int j = 1; j < i; j++) {
//                    yh[i][j] = yh[i - 1][j - 1] + yh[i - 1][j];
//                }
//            }
//        }
//
//
//        //
//        for (int i = 0; i < yh.length; i++) {
//            //2.1声明出当前行有多少个元素
//            int[] tempArray = new int[i + 1];
//            //2.2给元素赋值
//            for (int j = 0; j <= i; j++) {
//                if (i >= 2) {
//                    if (!((j == 0) || (j == i))) {
//                        tempArray[j] = yh[i - 1][j - 1] + yh[i - 1][j];
//                    } else {
//                        tempArray[j] = 1;
//                    }
//                } else {
//                    tempArray[j] = 1;
//                }
//            }
//            yh[i] = tempArray;
//        }
//        //3.遍历输出
//        for (int x = 0; x < yh.length; x++) {
//            System.out.print("[" +
//                    x +
//                    "]\t");
//            for (int y = 0; y < yh[x].length; y++) {
//                System.out.print(yh[x][y] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.print("\t");
//        for (int i = 0; i < 10; i++) {
//            System.out.print("[" +
//                    i +
//                    "]\t");
//        }

        //创建一个长度为6的int型数组，要求数组元素的值都在1~30之间， 且是随机赋值。同时要求，元素的值各不相同
        //1.声明并初始化一个数组
        int[] arr = new int[6];
        //2.随机赋值
//        for (int i = 0; i < arr.length; i++) {
//            //用一个开关来确定是赋值正确
//            boolean isFlag = true;
//
//            retry:
//            while (isFlag) {
//                int temp = (int) (Math.random() * 30 + 1);
//                arr[i] = temp;//5
//                //2.1与前面的进行比对
//                if (i > 0) {
//                    for (int j = 0; j < i; j++) {
//                        //如果有重复就结束比对重新获取
//                        if (arr[j] == arr[i]) {
//                            System.out.println("当前赋值第" + (i + 1) + "个时与之前的第" + (j + 1) + "个重复，值为：" + arr[i]);
//                            continue retry;//如果一样了重新尝试
//                        }
//                    }
//                    isFlag = false;
//                } else {
//                    isFlag = false;
//                }
//            }
//        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 30 + 1);
            //2.1与前面的进行比对

            for (int j = 0; j < i; j++) {
                //如果有重复就结束比对重新获取
                if (arr[j] == arr[i]) {
                    System.out.println("当前赋值第" + (i + 1) + "个时与之前的第" + (j + 1) + "个重复，值为：" + arr[i]);
                    i--;
                    break;//如果一样了重新尝试
                }
            }
        }
        //3.输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}

package com.dustin.stringclass.exer;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author Dustin_Peng
 * @Description String常见算法题
 * @create 2022-10-01-03:27
 */
public class StringExer {

    @Test
    public void tes1() {
        String str = "   hello nih ao   ";
        System.out.println(myTrim(str));

    }

    @Test
    public void tes2() {
        String str = "abcdefgh";
        String reverse = reverse(str, 1, 3);
        System.out.println(reverse);
        System.out.println(reverse2(str, 1, 3));
    }

    @Test
    public void tes3() {
        String str = "abkkcadkabkebfkabkskab";
        int count = getCount("ab", str);
        System.out.println(count);
        System.out.println(getCount1(str, "ab"));
    }

    @Test
    public void tes4() {
        String str1 = "abcwerthelloyuiodefabcde";
        String str2 = "cvhellobnmabcde";
        String substring = getMaxSubstring(str1, str2);
        System.out.println(substring);
        System.out.println(Arrays.toString(getMaxSubstring1(str1,str2)));

    }


    @Test
    public void tes5() {
        String str = "abcwerthelloyuiodef";
        System.out.println(stringSort(str));
    }

    /**
     * 模拟一个trim方法，去除字符串两端的空格
     */
    public String myTrim(String str) {
        if ("".equals(str) | str == null) {
            return str;
        }
        char[] chars = str.toCharArray();
        int minIndex = 0;
        int maxIndex = str.length() - 1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                break;
            }
            minIndex++;
        }
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != ' ') {
                break;
            }
            maxIndex--;
        }
        return str.substring(minIndex, maxIndex + 1);
    }

    /**
     * 将一个字符串进行反转。将字符串中指定部分进行反转。比如"abcdefg"反转为"abfedcg"
     */
    public String reverse(String str, int begin, int end) {
        if ("".equals(str) || str == null) {
            return str;
        }
        if (begin > end) {
            return str;
        } else if (begin < 0 || end > str.length() - 1) {
            System.out.println("角标越界了");
            return str;
        }
        char[] chars = str.toCharArray();

        for (int i = begin, j = end; j > i; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }

    //方式二，使用String拼接操作
    public String reverse2(String str, int begin, int end) {
        if ("".equals(str) || str == null) {
            return str;
        }
        if (begin > end) {
            return str;
        } else if (begin < 0 || end >= str.length() - 1) {
            System.out.println("角标越界了");
            return str;
        }
        String reverseStr = str.substring(0, begin);
        for (int i = end; i > begin; i--) {
            reverseStr += str.charAt(i);
        }
        reverseStr += str.substring(end + 1);
        return reverseStr;
    }

    //方式三，使用StringBuilder替换String
    public String reverse3(String str, int begin, int end) {
        if ("".equals(str) || str == null) {
            return str;
        }
        if (begin > end) {
            return str;
        } else if (begin < 0 || end >= str.length() - 1) {
            System.out.println("角标越界了");
            return str;
        }
        StringBuilder builder = new StringBuilder(str.length());
        builder.append(str.substring(0, begin));
        for (int i = end; i >= begin; i++) {
            builder.append(str.charAt(i));
        }
        builder.append(str.substring(end));
        return builder.toString();
    }


    /**
     * 获取一个字符串在另一个字符串中出现的次数
     */
    public int getCount(String str, String target) {
        if ("".equals(str) || "".equals(target) || str == null || target == null) {
            return -1;
        }
        String newStr = str.replace(target, "");
        return (str.length() - newStr.length()) / target.length();
    }

    public int getCount1(String str, String target) {
        int mainLen = str.length();
        int subLen = str.length();
        int count = 0;
        int index = 0;
        if ("".equals(str) || "".equals(target) || str == null || target == null) {
            return -1;
        }

        if (mainLen >= subLen) {
            while ((index = str.indexOf(target,index)) != -1) {
                count++;
                index+=subLen;//需要被优化的地方
            }
            return count;
        } else {
            return -1;
        }
    }

    //方式二的改进


    /**
     * 获取两个字符串中最大相同子串
     */
    public String getMaxSubstring(String original, String target) {
        if(original == null || target == null){
            return null;
        }
        String maxStr = (original.length()>= target.length() ? original:target);
        String minStr = (original.length()< target.length() ? original:target);
        int len = minStr.length();
        String substring = null;
        for (int i = len; i > 0; i--) {
            //终点y-起始点x=i(每轮的长度)(因为索引从0开始，substring是左闭右开的)
            //每轮进入都初始化x，y的值。比如目标子串的长度为10,i(子串长度)为7有x=0,y=7;x=1,y=8;x=2,y=9
            for (int x = 0, y = i + x - 1; y <= len; x++, y++) {
                substring = minStr.substring(x, y);
                if (maxStr.contains(substring)) {
                    return substring;
                }
            }
        }
        return substring;
    }
    //多个相同子串
    public String[] getMaxSubstring1(String original, String target) {
        if(original == null || target == null){
            return null;
        }
        String maxStr = (original.length()>= target.length() ? original:target);
        String minStr = (original.length()< target.length() ? original:target);
        int len = minStr.length();
        StringBuffer buffer = new StringBuffer();
        for (int i = len; i > 0; i--) {
            //终点y-起始点x=i(每轮的长度)(因为索引从0开始，substring是左闭右开的)
            //每轮进入都初始化x，y的值。比如目标子串的长度为10,i(子串长度)为7有x=0,y=7;x=1,y=8;x=2,y=9
            for (int x = 0, y = i + x - 1; y <= len; x++, y++) {
                String substring = minStr.substring(x, y);
                if (maxStr.contains(substring)) {
                    buffer.append(substring+",");
                }
            }
            //长度递减的情况下，如果已经有结果了，终止循环
            if(buffer.length()!=0){
                break;
            }
        }
        String[] strings = buffer.toString().replaceAll(",$", "").split("\\,");
        return strings;
    }



    /**
     * 字符串排序，我用Arrays.sort()
     */
    public String stringSort(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}

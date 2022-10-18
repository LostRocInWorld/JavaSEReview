package com.dustin.kwstatic;

/**
 * @Project JavaSEReview
 * @Package com.dustin.kwstatick
 * @ClassName ChineseTest
 * @Description static
 * @Date 2022/9/22   03:20
 * @Created by Dustin_Peng
 */
public class ChineseTest {
    public static void main(String[] args) {
        Chinese.nation = "中国";

        Chinese c1 = new Chinese();
        c1.name="张三";
        c1.age = 40;
        c1.nation = "中国";
        Chinese c2 = new Chinese();
        c2.name="马龙";
        c2.age = 35;
        c2.nation = "CHINA";

        System.out.println(c2.nation);

    }
}

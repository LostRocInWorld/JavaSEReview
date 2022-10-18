package com.dustin.java8newfeature.optional;

import org.junit.Test;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author Dustin_Peng
 * @Description Optional
 * @create 2022-10-19-01:56
 */
public class OptionalTest {
    @Test
    public void test1() {
        Girl girl = new Girl();
//        Optional.of(T t)
        Optional<Girl> girl1 = Optional.of(girl);
        System.out.println(girl1);
//        Optional.empty()
        Optional<Object> empty = Optional.empty();
//        Optional.ofNullable(T t)
        girl = null;
        Optional<Girl> girl2 = Optional.ofNullable(girl);
        System.out.println(girl2);
    }

    @Test
    public void test2() {
        Boy boy = new Boy();
        boy = null;
        String girlName = getGirlName2(boy);//可能有空指针异常NullPointerException
        System.out.println(girlName);
    }

    public String getGirlName(Boy boy) {
        return boy.getGirl().getName();
    }

    public String getGirlName1(Boy boy) {//未引入Optional之前的优化
        if (boy != null) {
            Girl girl = boy.getGirl();
            if (girl != null) {
                return girl.getName();
            }
        }
        return null;
    }

    public String getGirlName2(Boy boy) {//引用Optional进行优化
        Girl defaultGirl1 = new Girl("古力娜扎");
        Girl defaultGirl2 = new Girl("迪丽热巴");
        Boy defaultBoy = new Boy(defaultGirl1);
        Optional<Boy> boyOptional = Optional.ofNullable(boy);
        Boy boyElse = boyOptional.orElse(defaultBoy);
        Girl girl = boyElse.getGirl();
        Optional<Girl> girlOptional = Optional.ofNullable(girl);
        Girl girlElse = girlOptional.orElse(defaultGirl2);
        return girlElse.getName();
    }


    @Test
    public void test3() {
        Optional<Object> op1 = Optional.empty();
        if(op1.isPresent()){//Optional封装的数据是否为空
            System.out.println("数据为空");
        }
//        System.out.println(op1.get());
        System.out.println();
    }
}

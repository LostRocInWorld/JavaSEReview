package com.dustin.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Project JavaSEReview
 * @Package com.dustin.exceptions
 * @ClassName SuperClass
 * @Description 重写方法的异常抛出
 * @Date 2022/9/24   04:44
 * @Created by Dustin_Peng
 */
public class SuperClass {
 public void method() throws IOException{}
}
class SubClass extends SuperClass{
    public void method() throws FileNotFoundException {}
}
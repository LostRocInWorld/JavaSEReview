package com.dustin.exceptions;

/**
 * @Project JavaSEReview
 * @Package com.dustin.exceptions
 * @ClassName MyException
 * @Description 自定义异常类
 * @Date 2022/9/26   23:21
 * @Created by Dustin_Peng
 */
public class MyException extends RuntimeException  {

    static final long serialVersionUID = -7034897190745766939L;//可以理解为唯一标识这个类

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}

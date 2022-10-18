package com.dustin.project3.service;

/**
 * @Project JavaSEReview
 * @Package com.dustin.project3.team.service
 * @ClassName TeamException
 * @Description 异常
 * @Date 2022/9/27   02:25
 * @Created by Dustin_Peng
 */
public class TeamException extends RuntimeException{
    static final long serialVersionUID = -7034897190745766939L;

    public TeamException(String message) {
        super(message);
    }
}

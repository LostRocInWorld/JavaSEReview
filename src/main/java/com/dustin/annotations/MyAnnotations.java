package com.dustin.annotations;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

/**
 * @author Dustin_Peng
 * @Description JDK8新特性
 * @create 2022-10-06-00:40
 */
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE,TYPE_PARAMETER,TYPE_USE})
public @interface MyAnnotations {
    MyAnnotation[] value();
}

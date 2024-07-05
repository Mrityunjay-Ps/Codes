package JAVA.practice.Annonation;
/*
* This is a user define annotations....
*
* And now we will look into more built-in annotation
* */

import java.lang.annotation.*;

//@Retention(RetentionPolicy.CLASS)
@Target(value = {ElementType.LOCAL_VARIABLE, ElementType.METHOD})
@interface MyAnno{
    String name();
    String date();
    String appVersion();
}

public class userDefine {
    @MyAnno(name="Jay",date="21' Sep 2022", appVersion = "1.2")
    public static void main(String[] args) {

        int a;
    }
}

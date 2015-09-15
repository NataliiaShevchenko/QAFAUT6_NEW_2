package com.company;

/**
 * Created by Nataliia on 15.09.2015.
 */

//public и privat  |   static  и не static
public class WhyStatic {
    public static int publicstaticVar = 0;
    public int publicNonStaticVar = 1;
    private static int privateStaticVar = 2;
    private int privateNonStaticVar = 3;


    public static int getStaticVar(){
        return privateStaticVar;
    }

    public int getNonStaticVar(){
        return privateNonStaticVar;
    }


}

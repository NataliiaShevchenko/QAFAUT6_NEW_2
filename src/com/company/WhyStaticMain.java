package com.company;

/**
 * Created by Nataliia on 15.09.2015.
 */
public class WhyStaticMain {
    public static void main(String[] args){
        System.out.println("WhyStatic.publicStaticVar = " + WhyStatic.publicstaticVar);
        System.out.println("WhyStatic.privateStaticVar = " + WhyStatic.getStaticVar());


        WhyStatic w = new WhyStatic();
        WhyStatic w2 = new WhyStatic();
        System.out.println("WhyStatic.NonpublicStaticVar = " + w.publicNonStaticVar);
        System.out.println("WhyStatic.NonpublicStaticVar = " + w2.publicNonStaticVar);

        w.publicNonStaticVar = 10;
        System.out.println("WhyStatic.NonpublicStaticVar = " + w.publicNonStaticVar);
        System.out.println("WhyStatic.NonpublicStaticVar = " + w2.publicNonStaticVar);

        System.out.println("WhyStatic.NonpublicStaticVar = " + w.getNonStaticVar());
        System.out.println("WhyStatic.NonpublicStaticVar = " + w2.getNonStaticVar());
    }
}

package com.company;

/**
 * Created by Nataliia on 10.09.2015.
 */

public class Chernovik {

    public static void main(String[] args) {
        int b = 200;
        String a = "a";
        System.out.println(f(a,b));

        int h = 200;
        String d = "b";
        System.out.println(g(d, h));

    }




        public static String f (String a,int b){
            String c = "";
            for (int i = 0; i < b; i++) {
                c = c + a;
            }
            return c;
        }

    public static String g (String d, int h){
        String c = "";
        for (int i =0; i<h; i++){
            c=c+d;
            }
        return c;
    }
    }


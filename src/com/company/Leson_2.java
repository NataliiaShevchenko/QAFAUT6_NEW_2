package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Nataliia on 20.08.2015.
 */
public class Leson_2 {
    @Test
    public void test1() {
        Assert.assertEquals(19, 10 + 10);

        Assert.assertEquals(true, 1 == 2); // первая строка равносильна следующей
        Assert.assertTrue(1 == 2);
    }

    @Test
    public void test2() {
        Assert.assertEquals(10, sumAll(new int[]{1, 4, 2, 3, 0}));
    }

    @Test
    public void testFailed() {
        Assert.assertEquals(38, sumAll(new int[]{1, 41, 2}));
                    }

    @Test
    public void test3() {
        Assert.assertEquals(20, sumAll(new int[]{5, 5, 10}));

    }




    public static int sumAll(int[] sumAll) {             //функция, которая считает результаты
        int sum = 0;
        for (int i = 0; i < sumAll.length; i++) {
            sum = sum + sumAll[i];
        }
        return sum;

    }
}




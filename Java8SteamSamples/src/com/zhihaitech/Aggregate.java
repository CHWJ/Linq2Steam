package com.zhihaitech;

import java.util.Arrays;

public class Aggregate {
    public static void run() {
        int[] numbers = new int[]{1, 2, 3, 4, 5};

        // 累加器
        int reduce = Arrays.stream(numbers).reduce(0, Integer::sum);
        // print: 15
        System.out.println(reduce);

        reduce = Arrays.stream(numbers).reduce(1, Math::multiplyExact);
        // print: 120
        System.out.println(reduce);
    }
}

package com.zhihaitech;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author 0012 zzl
 * @date 2020/4/25 17:33
 */
public class Grouping {
    public static void run() {
        sampleGroupByLambda();
    }

    static void sampleGroupByLambda() {
        Integer[] numbers = {10, 15, 20, 25, 30, 35};

        // way 1. partitioningBy
        System.out.println("partitioningBy:");
        Map<Boolean, List<Integer>> partition = Arrays.stream(numbers).collect(Collectors.partitioningBy(n -> (n % 10 == 0)));
        partition.forEach((k, v) -> {
            if (k) {
                System.out.println("Divisible by 10");
            } else {
                System.out.println("Not Divisible by 10");
            }

            v.forEach(System.out::println);
        });
//        partitioningBy:
//        Not Divisible by 10
//        15
//        25
//        35
//        Divisible by 10
//        10
//        20
//        30

        // way 2. groupingBy
        System.out.println("groupingBy:");
        Map<Boolean, List<Integer>> group = Arrays.stream(numbers).collect(Collectors.groupingBy(n -> (n % 10 == 0)));
        group.forEach((k, v) -> {
            if (k) {
                System.out.println("Divisible by 10");
            } else {
                System.out.println("Not Divisible by 10");
            }

            v.forEach(System.out::println);
        });
//        groupingBy:
//        Not Divisible by 10
//        15
//        25
//        35
//        Divisible by 10
//        10
//        20
//        30
    }
}

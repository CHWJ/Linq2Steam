package com.zhihaitech;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Aggregate {
    private static final int[] numbers = new int[] {1, 2, 3, 4, 5};

    public static void run()
    {
        sampleAggregateLambdaSimple();

        sampleAggregateLambdaSeed();

        sampleAverageLambda();

        sampleCountLambda();

        sampleMaxLambda();

        sampleMinLambda();

        sampleSumLambda();
    }

    private static void sampleAggregateLambdaSimple()
    {
        // 累加器
        int reduce = Arrays.stream(numbers).reduce(0, Integer::sum);
        // print: 15
        System.out.println(reduce);

        reduce = Arrays.stream(numbers).reduce(1, Math::multiplyExact);
        // print: 120
        System.out.println(reduce);
    }

    private static void sampleAggregateLambdaSeed()
    {
        int reduce = Arrays.stream(numbers).reduce(10, Integer::sum);
        // print: 25
        System.out.println(reduce);
    }

    private static void sampleAverageLambda()
    {
        OptionalDouble average = Arrays.stream(numbers).average();
        // 3.0
        average.ifPresent( System.out::println);
    }

    private static void sampleCountLambda()
    {
        long result = Arrays.stream(numbers).count();
        // 5
        System.out.println(result);
    }

    private static void sampleMaxLambda()
    {
        OptionalInt result = Arrays.stream(numbers).max();
        // 5
        result.ifPresent( System.out::println);
    }

    private static void sampleMinLambda()
    {
        OptionalInt result = Arrays.stream(numbers).min();
        // 1
        result.ifPresent( System.out::println);
    }

    private static void sampleSumLambda()
    {
        int result = Arrays.stream(numbers).sum();
        // 15
        System.out.println(result);
    }
}

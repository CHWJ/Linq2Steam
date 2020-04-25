package com.zhihaitech;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author 0012 zzl
 * @date 2020/4/25 17:20
 */
public class Element {
    public static void run()
    {
        sampleFirstLambdaConditional();
    }

    static void sampleFirstLambdaConditional()
    {
        String[] countries = { "Denmark", "Sweden", "Norway" };

        Optional<String> first = Arrays.stream(countries).filter(c -> c.length() == 6).findFirst();
        System.out.println("First element with a length of 6 characters:");
        first.ifPresent(System.out::println);
    }
}

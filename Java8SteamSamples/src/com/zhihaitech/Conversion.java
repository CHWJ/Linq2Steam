package com.zhihaitech;

import java.awt.image.Kernel;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author 0012 zzl
 * @date 2020/4/25 16:40
 */
public class Conversion {
    static class English2German {
        private String englishSalute;
        private String germanSalute;

        public String getEnglishSalute() {
            return englishSalute;
        }

        public void setEnglishSalute(String englishSalute) {
            this.englishSalute = englishSalute;
        }

        public String getGermanSalute() {
            return germanSalute;
        }

        public void setGermanSalute(String germanSalute) {
            this.germanSalute = germanSalute;
        }

        public English2German(String englishSalute, String germanSalute) {
            this.englishSalute = englishSalute;
            this.germanSalute = germanSalute;
        }
    }

    public static void run() {
        sampleToDictionaryLambdaSimple();
    }

    private static void sampleToDictionaryLambdaSimple() {
        English2German[] english2German = new English2German[]{
                new English2German("Good morning", "Guten Morgen"),
                new English2German("Good day", "Guten Tag"),
                new English2German("Good evening", "Guten Abend")
        };

        Map<String, String> result = Arrays.stream(english2German).collect(Collectors.toMap(English2German::getEnglishSalute, English2German::getGermanSalute));

        System.out.println("Values inserted into dictionary:");
        result.forEach((k, v) -> {
            System.out.println(String.format("English salute %1$s is %2$s in German", k, v));
        });

        // Values inserted into dictionary:
        // English salute Good morning is Guten Morgen in German
        // English salute Good day is Guten Tag in German
        // English salute Good evening is Guten Abend in German
    }
}

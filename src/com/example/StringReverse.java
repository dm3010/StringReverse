package com.example;

public class StringReverse {
    public static void main(String[] args) {
        if(args.length>0) {
            String inputString = args[0];
            String reverseString = reverse(inputString);
            long t1, t2, t3;

            t1 = getTime(() -> reverse(inputString), 1000);
            t2 = getTime(() -> reverse(inputString), 10000);
            t3 = getTime(() -> reverse(inputString), 1000000);

            System.out.println(inputString);
            System.out.println(reverseString);
            System.out.println(t1);
            System.out.println(t2);
            System.out.println(t3);
        }
    }

    private static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    private static long getTime(Runnable runnable, int count) {
        long startTime = System.nanoTime();
        for (int i = 0; i < count; i++) {
            runnable.run();
        }
        return (System.nanoTime() - startTime) / 1000000;
    }
}



package com.practice;

public class MathUtil {

    public int add(int a, int b) {
        System.out.println("sum is: "+(a+b+2));
        return a+b+2;
    }

    public int diff(int a, int b) {
        System.out.println("diff is: "+ (a-b));
        return a-b;
    }

    public int mul(int a, int b) {
        System.out.println("mul is: "+ (a*b));
        return a*b;
    }

    public int div(int a, int b) {
        System.out.println("div is: "+ (a/b));
        return a/b;
    }
}

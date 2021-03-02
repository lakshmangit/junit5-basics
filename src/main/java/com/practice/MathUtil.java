
package com.practice;

public class MathUtil {

    public int add(int a, int b) {
        System.out.println("Sum is: "+(a+b+2));
        return a+b+2;
    }

    public int diff(int a, int b) {
        System.out.println("Diff is: "+ (a-b));
        return a-b;
    }

    public int mul(int a, int b) {
        System.out.println("Mul is: "+ (a*b));
        return a*b;
    }

    public int div(int a, int b) {
        System.out.println("Div is: "+ (a/b));
        return a/b;
    }

    public int sqr(int a) {
	 System.out.println("Sqr is:"+(a*a));
        return a*a;
    }

    public int cube(int a) {
        return a*a*a;
    }
}

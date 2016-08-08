package com.test;

public class AssertTest {
    public static void main(String[] args) {
//        assert 1 != 1 : "incorrect expression";
        try {
            System.out.println(sum(100, 20));
        } catch (Error e) {
            System.out.println("===error");
        }
        System.out.println(sum(10, 200));
    }


    public static int sum(int a, int b) {
        //assert a < 100 && b < 100 : printErrString(a, b);-- так метод войд - вызывать нельзя
        assert a < 100 && b < 100 : getErrString(a, b);
        return a + b;
    }

    private static String getErrString(int a, int b) {
        return "a=" + a + "; b=" + b;
    }

    private static void printErrString(int a, int b) {
        System.out.println("a=" + a + "; b=" + b);
    }
}

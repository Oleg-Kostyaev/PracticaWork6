package com.javabasic.work61;

public class Task61 {
    public static void main(String[] args) {
        double a = 10.5;
        double b = 4.8;
        double c = 8.2;

        double area = areaTriangle(a, b, c);
        System.out.printf("%.2f", area);
    }

    public static double areaTriangle(double a, double b, double c) {
        double per =  (a + b + c) / 2;
        double area = Math.sqrt(per * (per - a) * (per - b) * (per - c));
        return area;
    }
}

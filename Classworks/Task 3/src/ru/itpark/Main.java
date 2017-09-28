package ru.itpark;

import static java.lang.Math.*;

public class Main {

    public static double f(double x) {
        return sin(x);
    }


    public static double integrate(double a, double b, int n) {
        double result;
        double h = abs(a - b) / n;
        // рассчитать ширину разбиения
        for (double x = a; x <= b; x = x + h) {
            result = result + f(x) * h;
        }
        return result;
    }


    public static void main(String[] args) {
        double integrateOfSin = integrate(0, PI, 10000);
        System.out.println(integrateOfSin);
    }
}



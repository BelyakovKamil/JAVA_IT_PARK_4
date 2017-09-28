package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
//        for (int i = 0; i < N; i++) {
//            if (array[i] % 2 == 0) {
//                array[i] = 0;
//            }
//        }
        for (int i = N-1; i > (-1); i--) {
            System.out.print(array[i] + " ");
        }
    }
}

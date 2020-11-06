package com.practice10;

import java.awt.event.MouseAdapter;
import java.util.Enumeration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //four();
        //five();
        seven(20);


    }


    public static void four() {
        // 4, 5, 6
        System.out.println("Задание 4 ------\nВведите число разрядов и сумму разрядов");

        Scanner scan = new Scanner(System.in);
        long k = scan.nextInt();
        int s = scan.nextInt();


        int count = 0;
        Double c = new Double(Math.pow(10, k));
        k = c.longValue() - 1;
        while (k > 0) {
            long del = k;
            int sum = 0;
            while(del > 0) {
                sum += del % 10;
                del /= 10;
            }
            if (sum == s) count++;
            k--;
        }
        System.out.println(count);
    }
// 2 3 5 7

    public static void five() {
        System.out.println("Задание 5 (Сумма цифр числа) ------\nВведите число");
        Scanner scan = new Scanner(System.in);
        System.out.println(sumdigits(scan.nextInt()));
    }
    public static int sumdigits(int a){
        if (a / 10 == 0) return a;
        return a % 10 + sumdigits(a / 10);
    }
    public static void seven(int a){
        boolean[] arr = new boolean[a + 1];
        System.out.println(arr[3]);
        for (int i = 2; i <= a; i++){
            if (!arr[i]) {
                for (int j = i * 2; j <= a; j = i * j) {
                    arr[j] = true;
                }
            }
        }
        for (int i = 0; i < a + 1; i++){
            if(!arr[i]) System.out.println(Integer.toString(i) + ' ');
        }
    }
}

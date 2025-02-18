package org.g10_기하_직사각형과_삼각형;

import java.util.Scanner;

public class 삼각형외우기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        if (n + m + k == 180) {
            if (n == m && k == n) {
                System.out.println("Equilateral");
            } else if (n == m || m == k || n == k) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}

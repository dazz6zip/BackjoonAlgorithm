package org.g9_약수_배수와_소수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 약수들의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            List<Integer> list = new ArrayList<>();
            int input = sc.nextInt();
            if (input == -1) {
                break;
            }
            int temp = 0;
            for (int i = 1; i < input; i++) {
                if (input % i == 0) {
                    list.add(i);
                    temp += i;
                }
            }

            if (input == temp) {
                System.out.print(input + " = ");
                for (int i = 0; i < list.size(); i++) {
                    if (i == list.size() - 1) {
                        System.out.print(list.get(i));
                    } else {
                        System.out.print(list.get(i) + " + ");
                    }
                }
                System.out.println();
            } else {
                System.out.println(input + " is NOT perfect.");
            }

        }
    }
}

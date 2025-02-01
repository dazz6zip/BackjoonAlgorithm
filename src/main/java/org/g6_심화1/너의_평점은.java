package org.g6_심화1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 너의_평점은 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);

        double total = 0;
        double c = 0;

        for (int i = 0; i < 20; i++) {
            String[] input = sc.nextLine().split(" ");

            if (!input[2].equals("P")) {
                c += Double.parseDouble(input[1]);
                total += (Double.parseDouble(input[1]) * map.get(input[2]));
            }
        }

        System.out.printf("%.6f\n", total / c);
    }
}

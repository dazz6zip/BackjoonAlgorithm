package org.g6_심화1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 그룹_단어_체커 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int notGroup = 0;

        for (int i = 0; i < n; i++) {
            String[] input = sc.next().split("");
            List<String> list = new ArrayList<>();
            for (int j = 0; j < input.length; j++) {
                if (!list.contains(input[j])) {
                    list.add(input[j]);
                } else if (!input[j].equals(input[j-1])) {
                    notGroup++;
                    break;
                }
            }
        }

        System.out.println(n - notGroup);
    }
}

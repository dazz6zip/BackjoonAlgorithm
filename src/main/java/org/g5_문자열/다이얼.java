package org.g5_문자열;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 다이얼 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] words = input.split("");

        Map<Character, Integer> map = new HashMap<>();

        int number = 2;
        for (char i = 'A'; i <= 'Z'; i++) {
            map.put(i, number);

            switch (number) {
                case 7:
                    if (i == 'S') {
                        number++;
                    }
                    break;
                case 8:
                    if (i == 'U') {
                        continue;
                    } else if(i == 'V') {
                        number++;
                    }
                case 9:
                    if (i == 'Z') {
                        number++;
                    }
                    break;
                default:
                    if ((i - 'A' + 1) % 3 == 0) {
                        number++;
                    }
                    break;
            }
        }

        int result = 0;
        for (String word : words) {
           result += map.get(word.charAt(0)) + 1;
        }

        System.out.println(result);
    }
}

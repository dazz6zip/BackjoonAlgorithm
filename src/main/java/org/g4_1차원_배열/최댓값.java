package org.g4_1차원_배열;

import java.util.*;

public class 최댓값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> map = new HashMap<>();
        int max = -1;
        int maxKey = 0;

        for (int i = 0; i < 9; i++) {
            int input = sc.nextInt();
            map.put(i, input);
            if(max < input){
                max = input;
                maxKey = i;
            }
        }

        System.out.println(Collections.max(map.values()));
        System.out.println(maxKey + 1);
    }
}

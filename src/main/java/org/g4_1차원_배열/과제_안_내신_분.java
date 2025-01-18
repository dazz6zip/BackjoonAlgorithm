package org.g4_1차원_배열;

import java.util.*;

public class 과제_안_내신_분 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Boolean> map = new HashMap<>();

        for (int i = 1; i <= 30; i++){
            map.put(i, false);
        }

        for (int i = 0; i < 28; i++) {
            int input = sc.nextInt();
            map.put(input, true);
        }

        List<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Boolean> entry : map.entrySet()){
            if (!entry.getValue()){
                list.add(entry.getKey());
            }
        }

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        }
}

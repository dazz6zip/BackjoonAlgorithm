package org.g6_심화1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 킹_퀸_룩_비숍_나이트_폰 {
    public static void main(String[] args) {
        String[] ex = {"1", "1", "2", "2", "2", "8"};

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < ex.length; i++) {
            String[] ic = input.split(" ");
            list.add(Integer.parseInt(ex[i]) - Integer.parseInt(ic[i]));
        }

        for (Integer l : list) {
            System.out.print(l + " ");
        }
    }
}

package org.g6_심화1;

import java.util.Scanner;

public class 크로아티아_알파벳 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // 단어 입력

        String[] list = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String l : list) {
            input = input.replace(l, "*");
        }

        System.out.println(input.length());
    }
}

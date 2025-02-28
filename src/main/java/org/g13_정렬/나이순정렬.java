package org.g13_정렬;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class 나이순정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        List<String[]> temp = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String age = sc.next();
            String name = sc.next();
            temp.add(new String[]{age, name, String.valueOf(i)});
        }

        temp.sort(Comparator.comparingInt(a -> Integer.parseInt(a[0])));
        // temp.sort(Comparator.comparingInt(값 추출 함수))
        // temp 를 정렬하기 위해 a[0] 값을 int 로 변환하여 기준으로 사용함

        for (String[] t : temp) {
            System.out.println(t[0] + " " + t[1]);
        }
    }
}

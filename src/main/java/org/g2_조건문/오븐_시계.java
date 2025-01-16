package org.g2_조건문;

import java.util.Scanner;

public class 오븐_시계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String now = sc.nextLine();
        int time = sc.nextInt();

        String[] temp = now.split(" ");

        int hour = Integer.parseInt(temp[0]);
        int min = Integer.parseInt(temp[1]);

        min += time;
        if (min >= 60) {
            int temp_hour = 0;
            while (true) {
                min -= 60;
                temp_hour++;
                if (min < 60) {
                    break;
                }
            }
            hour += temp_hour;
        }

        if(hour > 23) {
            hour -= 24;
        }

        System.out.println(hour + " " + min);

    }
}

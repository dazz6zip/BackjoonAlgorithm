package org.조건문;

import java.util.Scanner;

public class 알람_시계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] temp = input.split(" ");

        int temp_hour, temp_minute;

        temp_hour = Integer.parseInt(temp[0]);
        temp_minute = Integer.parseInt(temp[1]) - 45;
        if(temp_minute < 0) {
            temp_hour -= 1;
            if(temp_hour < 0) {
                temp_hour += 24;
            }
            temp_minute += 60;
        }

        System.out.println(temp_hour + " " + temp_minute);
    }
}

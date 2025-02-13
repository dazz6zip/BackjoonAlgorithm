package org.g9_약수_배수와_소수;

import java.util.Scanner;

public class 배수와약수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int i1 = sc.nextInt();
            int i2 = sc.nextInt();

            String result;

            if (i1 == 0 && i2 == 0){
                break;
            }
            if (i2 % i1 == 0){
                result = "factor";
            } else if (i1 % i2 == 0) {
                result = "multiple";
            } else {
                result = "neither";
            }
            System.out.println(result);
        }
    }
}

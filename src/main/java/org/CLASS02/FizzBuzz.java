package org.CLASS02;

import java.io.*;

public class FizzBuzz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {
            String input = br.readLine();
            if (checkInt(input)) {
                int n = Integer.parseInt(input);
                n += (3 - i);
                if (n % 3 == 0 && n % 5 == 0) {
                    bw.write("FizzBuzz");
                } else if (n % 3 == 0) {
                    bw.write("Fizz");
                } else if (n % 5 == 0) {
                    bw.write("Buzz");
                } else {
                    bw.write(n + "\n");
                }
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean checkInt(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

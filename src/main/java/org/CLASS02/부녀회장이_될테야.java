package org.CLASS02;

import java.io.*;

public class 부녀회장이_될테야 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] apt = new int[15][15];

        for (int i = 1; i <= 14; i++) {
            apt[0][i] = i;
        }

        for (int i = 1; i <= 14; i++) {
            for (int j = 1; j <= 14; j++) {
                apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
            }
        }

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            bw.write(apt[k][n] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

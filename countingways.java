package com.certification.hacker_earth_inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class  countingways {
    static int [][] d2array;
    static int mod = 1000000007;
    public static void main(String [] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //int varx = Integer.parseInt((sc.nextLine().trim()));
        int varx = sc.nextInt();
        d2array = new int[101][10001];
        for (int k = 1; k <= 100; k++)
            d2array[k][0] = 1;
        for (int k = 1; k <= 100; k++) {
            long sum = 1;
            for (int x = 1; x <= 10000; x++) {
                if (x < k) {
                    d2array[k][x] = d2array[k - 1][x];
                    sum = (sum + d2array[k][x]) % mod;
                } else if (x == k) {
                    d2array[k][x] = (int) sum;
                    sum = (sum + d2array[k][x]) % mod;
                } else {
                    sum = (sum + mod - d2array[k][x - k - 1]) % mod;
                    d2array[k][x] = (int) sum;
                    sum = (sum + d2array[k][x]) % mod;
                }
            }
        }
        for (int x = 0; x < varx; x++) {
            String[] in = sc.nextLine().split(" ");
            int N = Integer.parseInt(in[0]);
            int K = Integer.parseInt(in[1]);
            System.out.println(d2array[K][N]);
            System.out.println("");
        }
    }
}


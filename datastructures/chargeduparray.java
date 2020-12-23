package com.certification.hacker_earth_inputoutput.datastructures;

import java.util.*;
class ChargedUpArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int cases = scanner.nextInt();
        for (int i = 0; i < cases; i++) {
            int n = scanner.nextInt();
            long[] array = new long[n];
            for (int j = 0; j < n; j++) {
                array[j] = scanner.nextLong();
            }
            solve(array,n);
        }
    }
    public static void solve(long[] A,int N){
        long sum = 0;
        double k = Math.pow(2,N);
        for(int i=0; i<N; i++) {
            if(A[i]>=k/2) {
                sum = (sum+A[i])%(1000000007);
            }
        }
        System.out.println((int)sum);
    }
}

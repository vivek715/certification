package com.certification.hacker_earth_inputoutput;
import java.util.Scanner;
public class numberofsteps {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, min, count = 0;
        n = sc.nextInt();
        int[] a = new int[n], b = new int[n];
        a[0] = sc.nextInt();
        min = a[0];
        for(i = 1; i < n; i++) {
            a[i] = sc.nextInt();
            if(a[i] < min) {
                min = a[i];
            }
        }
        for(i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        i = 1;
        while(i == 1) {
            i = 0;
            for(int j = 0; j < n; j++) {
                while(a[j] > min && b[j] != 0) {
                    a[j] = a[j] - b[j];
                    count++;
                    i = 1;
                }
                if(a[j] < min) {
                    min = a[j];
                }
                if(min < 0) {
                    break;
                }
            }
            if(min < 0) {
                break;
            }
        }
        if(min < 0) {
            System.out.print("-1");
        } else {
            System.out.print(count);
        }
    }
}

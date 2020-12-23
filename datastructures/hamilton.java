package com.certification.hacker_earth_inputoutput.datastructures;

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n, c = 1;

        n= sc.nextInt();
        int a[] = new int[n];
        for( int i = 0; i < n; i++ )
            a[i] = sc.nextInt();
        for(int i = 0; i < n-1; i++ ){
            for( int j = i+1; j < n; j++){
                if( a[i] >= a[j] )
                    c = 0;
                else {
                    c = 1;
                    break;
                }
            }
            if( c == 0)
                System.out.print(a[i]+ " ");
            c = 1;

        }
        System.out.print(a[n-1]+" ");
        //return 0;

        /* Sample code to perform I/O:
         * Use either of these methods for input*/


    }
}
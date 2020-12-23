package com.certification.hacker_earth_inputoutput.datastructures;



/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
public class polygonposiblility {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //int a[] = new int[n];
//    cin>>t;
        for(int j=t;j>=t;t--){
            int n,i,sum=0;
            // cin>>n;

            n = sc.nextInt();
            int a[] = new int[n];
            for(i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(i=0;i<n;i++){
                sum=sum+a[i];
            }
            boolean temp=true;
            for(i=0;i<n;i++){
                if(a[i]>=(sum-a[i])){
                    temp=false;
                    System.out.println("No");
                    break;
                }
            }
            if(temp==true){
                System.out.println("Yes");
            }
        }
    }
}


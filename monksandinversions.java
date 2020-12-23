package com.certification.hacker_earth_inputoutput;
import java.util.Scanner;
public class monksandinversions {
        public static void main(String args[] ) throws Exception {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int array1[] = new int[n]; //  array1 -- inversion1
            int array2[] = new int[n]; //  array2 --inversion2
            int array3[] = new int[n]; // array3 --inversion3
            for(int i=0; i<n; i++){
                array1[i] = s.nextInt();
            }
            for(int i=0; i<n; i++){
                array2[i] = s.nextInt();
            }
            for(int i=0; i<n; i++){
                array3[i] = array1[i]+array2[i];
            }
            for(int i=0; i<n; i++){
                System.out.print(array3[i]+" ");
            }
        }
    }


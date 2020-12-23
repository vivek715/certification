package com.certification.hacker_earth_inputoutput;

import java.util.Scanner;
public class microarrayProb {
    public static Scanner sc= new Scanner (System.in);
    public static void main(String args[] ) throws Exception {
        int input= sc.nextInt(); // number of arrays in test case
        int array1[] =new int [input];
        for(int i=0;i<input;i++)
        {

            int size = sc.nextInt(); // array N integers is noted as size
            int k=sc.nextInt();
            double [] a=new double  [size];
            for(int j=0;j<size;j++)
            {
                a[j]=sc.nextInt();
            }
            double  min = a[0];
            for (int o = 0; o < size; o++)
            {
                if(a[o] <min)
                    min = a[o];
            }
            while (min<k)
            {
                min++;
                array1[i]++;
            }
        }
        for(int i =0;i<input;i++) {
            System.out.println(array1[i]);
        }
    }
}

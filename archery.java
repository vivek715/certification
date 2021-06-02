//package com.l2.programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        while(input-->0){
            int no_archers = Integer.parseInt(br.readLine());
            String s[] = br.readLine().trim().split(" +");
            long a = Integer.parseInt(s[0]);
            for(int i = 1;i<no_archers;i++)
                a = lcm(a,Integer.parseInt(s[i]));
            System.out.println(a);
        }
    }
    public static long lcm(long a,long b){
        return (a*b)/gcd(a,b);
    }
    public static long gcd(long a,long b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}

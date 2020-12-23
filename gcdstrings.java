package com.certification.hacker_earth_inputoutput;

import java.util.Scanner;

class gcdstrings {
    static long[] str;
    static long mod= 1000000007;

    public static long methodgcd(int base,int exponent){
        if (exponent == 0)
            return 1;

        long result = methodgcd(base, exponent / 2);
        result = result * result % mod;

        if (exponent % 2 == 1)
            result = result * base % mod;
        return result;
    }
    public static long append(long a,long b,long n){
        long ans=0;
        while(n-- !=0){
            ans=((ans*b %mod)+a)%mod;
        }
        return ans;
    }
    public static long method2gcd(int a,int b) {
        int varx = a % b;
        switch (varx) {
            case 0:
                str[0] = methodgcd(2, a - 1);
                str[1] = methodgcd(2, b - 1);
                return str[0];
        }
            method2gcd(b, a % b);
            long temp = str[0];
            long res = ((append(str[0], methodgcd(2, b), a / b) * methodgcd(2, a % b)) % 10000006 + str[1]) % 10000006;
            str[0] = res;
            str[1] = temp;
            return res;
        }
        public static void main (String args[] ) throws Exception {

            Scanner scn = new Scanner(System.in);
            int input = scn.nextInt();
            while (input-- != 0) {
                int a = scn.nextInt();
                int b = scn.nextInt();
                str = new long[2];
                long ans = method2gcd(a, b);
                //System.out.println(" ");
                System.out.println(ans);
            }
        }

    }


//import for Scanner and other utility classes
//package com.amarin.urlshortenerapi;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {

    public static boolean checkpair(long var1 , long var2)
    {

        long n2 = (var1+var2)/2;
        long n1 = (var1-var2)/2;

        if(n1>=0 && n2>=0 && n2>=n1) {
            return true;
        }

        return false;
    }

    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String val = br.readLine();                // Reading input from STDIN


        // Write your code here
        long N = Long.parseLong(val);
        long res = 0;
        for(long i=1;i*i<=N;i++) {
            if(N%i==0) {
                long var1 = i;
                long var2 = N/i;

                if((var1%2 == var2%2)||(var1%2==0 && var2%2==0))
                {
                    if(checkpair(var1,var2) == true) {

                        res++;
                    }
                    if(checkpair(var2,var1) == true && i*i!=N  ) {

                        res++;
                    }
                }
            }
        }
        System.out.println(res);

    }
}

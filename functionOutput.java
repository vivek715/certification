package com.certification.hacker_earth_inputoutput;

import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class functionOutput {
    public static int f(int p,int q,int r)
    {
        int ans=0;
        for(int i=0;i<=p;i++)
        {
            int temp=0;
            for(int j=1;j<=q;j++)
            {
                int ta=(int)Math.pow(r,i);
                int tb=(int)(ta-1)/ta;
                temp+=Math.pow(tb,j);
            }
            int temp2=fact(p)/(fact(p-i)*fact(i));
            if(i==1)
            {
                ans-=(temp*temp2);

            }
            else
            {
                ans+=(temp*temp2);
            }
        }
        return ans;
    }
    public static int fact(int y)
    {
        int g=1;
        for(int i=y;i>=1;i--)
        {
            g*=i;
        }
        return g;
    }
    public static void main(String args[] ) throws Exception {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++)
        {
            int p=scan.nextInt();
            int q=scan.nextInt();
            int r=scan.nextInt();
            System.out.println(f(p,q,r));
        }
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here

    }
}

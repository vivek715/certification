package com.certification.hacker_earth_inputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
    public static void main(String args[] ) throws Exception {
        TestClass t1=new TestClass();
        int i,j,m,n,k;

        long[] arr=new long[1000000];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(m=0;m<t;m++)
        {
            long d=Long.parseLong(br.readLine());
            String[] s=br.readLine().split(" ");
            for(k=0;k<s.length;k++)
            {
                arr[k]=Long.parseLong(s[k]);

            }
            int[] count=new int[1000];
            for(n=0;n<s.length;n++)
            {
                count[n]=getCount(arr[n]);

            }
            for(i=0;i<s.length;i++)
            {
                for(j=0;j<s.length-i-1;j++)
                {
                    if(count[j]>count[j+1])
                    {
                        int temp=count[j];
                        count[j]=count[j+1];
                        count[j+1]=temp;
                        long temp2=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp2;

                    }
                }
            }
            for(int o=0;o<s.length;o++)
            {
                System.out.print(arr[o]+" ");
            }
            System.out.print("\n");

        }

    }
    static int getCount(long a)
    {
        int c=0;
        while(a>0)
        {
            a=a&(a-1);
            c++;
        }

        return c;
    }

}
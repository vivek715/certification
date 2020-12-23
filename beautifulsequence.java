package com.certification.hacker_earth_inputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class beautifulsequence {


      public  static int lis(long a[])
        {
            int n=a.length;
            ArrayList<Long> list = new ArrayList<>();
            list.add(0l);
            int last=0;
            for(int i=0;i<n;i++){
                if(a[i]<=0)
                    continue;
                else
                {
                    int low=0,high=last;
                    while(low<high)
                    {
                        int mid= (low+high)/2 +1;
                        if(list.get(mid)<=a[i])
                            low=mid;
                        else
                            high=mid-1;
                    }
                    if(low==last)
                    {
                        last++;
                        list.add(0l);
                    }
                    list.set(low+1,a[i]);
                }

            }
            return last;
        }
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int n;
        String s[];
        for(int j=0;j<t;j++)
        {
            n=Integer.parseInt(br.readLine());
            s = br.readLine().split(" ");
            long ar [] = new long[s.length];
            for(int i=0;i<s.length;i++)
                ar[i]=Long.parseLong(s[i]) -i;
            int count=0;

            System.out.println(n-lis(ar));
        }

    }
    }
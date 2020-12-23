package com.certification.hacker_earth_inputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
//@vivek auther fully frustated issue in office need to get out of it as soon as possible
//its 12:06PM time limit is 1hr :30 min
//beautifulsegments
/*public class beautifulSegments {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcases = Integer.parseInt(br.readLine()); //tcases denoting number of test cases.
        for(int z = 0; z < tcases; z++){
            int arrelemets = Integer.parseInt(br.readLine());//N denoting number of elements in the array.
            int count = 0;
            if (arrelemets == 0) {
                System.out.println(count);
                continue;
            }
            int[] temparr = new int[arrelemets];
            String[] separry = br.readLine().split(" ");//N space seperated integers denoting the elements of the array.
            for(int i = 0; i < arrelemets; i++){
                temparr[i] = Integer.parseInt(separry[i]);
            }
           outcondition:  for(int i = 0; i < arrelemets-1; i++){
                int j = i+1;
                for( j = i+1;j<arrelemets;j--) {
                    if(temparr[j] < temparr[j-1]) {
                        j--;
                        break;
                    }
                    j++;
                }
                int l = j - i;
                if(j == i || j + l  >= arrelemets){
                    continue;
                }
                for(int p = j+1; p < j+l+1; p++){
                    if(temparr[p-1] <= temparr[p]) {
                        continue outcondition;
                    }
                }
                count++;
            }
            System.out.println(count);
        }
    }
}*/

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class beautifulSegments {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) throws Exception {
        //CustomReaderr fr=new CustomReaderr();
        //int tc=fr.nextInt();
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        exceptions ex = new exceptions();
        int tcases = Integer.parseInt(br.readLine()); //tcases denoting number of test cases.
        while (tcases-- != 0) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                System.out.println(0);
                continue;
            }
            int a[] = new int[n];
            int l[] = new int[n];
            int r[] = new int[n];
            l[0] = 0;
            int c = 0;
            r[n - 1] = 0;
            for (int i = 0; i < n; i++) {
                a[i] = a[i]=ex.nextInt();
                if (i > 0) {
                    if (a[i - 1] <= a[i]) {
                        l[i] = l[i - 1] + 1;

                    }
                }

            }

            for (int i = n - 2; i >= 0; i--) {
                if (a[i] > a[i + 1]) {
                    r[i] = r[i + 1] + 1;

                }
            }


            for (int i = n - 2; i >= 0; i--) {
                c = c + Math.min(r[i], l[i]);
            }
            System.out.println(c);

        }


    }

    static class exceptions {
        StringTokenizer str;
        public String next() {
            while (str == null || !str.hasMoreElements()) {
                try {
                    str = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            return str.nextToken();

        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

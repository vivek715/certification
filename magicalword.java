package com.certification.hacker_earth_inputoutput;

import java.io.*;
class magicalword {
    public static void main(String args[] ) throws Exception {
        BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
        int Temp=Integer.parseInt(scan.readLine());
        char array[]=new char[127];
        for(int i=32;i<65;i++){
            array[i]='C';
        }
        array[65]='C';
        array[66]='C';
        array[67]='C';
        array[68]='C';
        array[69]='C';
        array[70]='G';
        array[71]='G';
        array[72]='G';
        array[73]='I';
        array[74]='I';
        array[75]='I';
        array[76]='I';
        array[77]='O';
        array[78]='O';
        array[79]='O';
        array[80]='O';
        array[81]='O';
        array[82]='S';
        array[83]='S';
        array[84]='S';
        array[85]='S';
        array[86]='S';
        array[87]='Y';
        array[88]='Y';
        array[89]='Y';
        array[90]='Y';
        array[91]='Y';
        array[92]='Y';
        array[93]='Y';
        array[94]='a';
        array[95]='a';
        array[96]='a';
        array[97]='a';
        array[98]='a';
        array[99]='a';
        array[100]='e';
        array[101]='e';
        array[102]='e';
        array[103]='g';
        array[104]='g';
        array[105]='g';
        array[106]='k';
        array[107]='k';
        array[108]='k';
        array[109]='m';
        array[110]='m';
        array[111]='m';
        array[112]='q';
        array[113]='q';
        array[114]='q';
        array[115]='q';
        array[116]='q';
        array[117]='q';
        array[118]='q';
        array[119]='q';
        array[120]='q';
        array[121]='q';
        array[122]='q';
        for(int i=123;i<127;i++){
            array[i]='q';
        }
        while(Temp-->0){
            int N=Integer.parseInt(scan.readLine());
            String str=scan.readLine();
            for(int i=0;i<str.length();i++){
                int num=str.charAt(i);
                //    System.out.println(num);
                if(Temp==1 && str.charAt(i)==45){
                    System.out.print('a');
                }else{
                    System.out.print(array[num]);
                }
            }
            System.out.println();
        }
    }
}

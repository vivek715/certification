package com.certification.hacker_earth_inputoutput.datastructures;

import java.util.*;
import java.io.*;
class hatesubarrays {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  testCase = Integer.parseInt(br.readLine());
        for(int i=0;i<testCase;i++){
            String x = br.readLine();
            showString(x.toCharArray());
        }

    }

    static void showString(char[] x){
        Stack<Character> stack = new Stack<Character>();
        for(int i=x.length-1;i>=0;i-- ){
            if(!stack.isEmpty() && stack.peek()==x[i]){
                stack.pop();
            }else
                stack.push(x[i]);
        }
        if(stack.size()==0)
            System.out.println("KHALI");
        else {
            while(!stack.isEmpty()){
                System.out.print(stack.pop());
            }
            System.out.println();
        }
    }
}
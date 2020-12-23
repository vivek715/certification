package com.certification.hacker_earth_inputoutput;

import java.io.IOException;
import java.util.Scanner;
//@vivek 3:46pm nov-15-2020 diwali
  public  class numberofrs {
        public final static Scanner STDIN_SCANNER = new Scanner(System.in);
        public static void main(String[] args) throws IOException {
            String input = STDIN_SCANNER.nextLine();
            String invert = new StringBuilder().append(input).reverse().toString();
            char j = input.charAt(0);
            int count = 0;
            for(char k:input.toCharArray()){
                if(k == j){
                    count++;
                }
            }
            if(input.equals(invert)){

                if(count == input.length()){
                    System.out.println(0);
                }else{
                    System.out.println(input.length()-1);
                }
            }
            else{
                System.out.println(input.length());
            }


        }
    }


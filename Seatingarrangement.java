package com.certification.hacker_earth_inputoutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Seatingarrangement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
          int i = sc.nextInt();
          if(i==1){ System.out.println(i+1 +"MS");
              System.out.println(i+2 +"AS");}
        if(i==2){  System.out.println(i-1 +"WS");
            System.out.println(i+1 +"AS");}
        if(i==3){System.out.println(i-1 +"MS");
            System.out.println(i+2 +"WS");}
        if(i==4){System.out.println(i+1 +"MS");
            System.out.println(i+2 +"WS");}
        if(i==5){System.out.println(i+1 +"WS");
            System.out.println(i-1 +"MS");}
        if(i==6){System.out.println(i-1 +"MS");
            System.out.println(i-2 +"AS");}
            int x = i % 6;
            if (x == 1 ){
                System.out.println(i+1 +"MS");
                System.out.println(i+2 +"AS");
            }
            if( x == 0){
              //  System.out.println("WS");
                System.out.println(i-1 +"MS");
                System.out.println(i-2 +"AS");
            if (x == 2 ){
                System.out.println(i-1 +"WS");
                System.out.println(i+1 +"AS");
            }
            if( x == 5){
                System.out.println(i-1 +"AS");
                System.out.println(i+1 +"WS");
            }
                //System.out.println("MS");
            if (x == 4 )
            {  System.out.println(i+2 +"WS");
                System.out.println(i+1 +"MS");}
            if( x == 3){
                System.out.println(i-2 +"WS");
                System.out.println(i-1 +"MS");}
            }
    //            System.out.println("AS");
    }
}

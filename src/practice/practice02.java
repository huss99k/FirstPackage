package practice;

import  java.util.*;

public class practice02 {


    public static void main(String[] args) {
   namerepit("Tika khanal",7);

       // System.out.println(oppositestr("Hello",8));
       // System.out.println(oppositestr("Ge Tika",10));
    }


    public static String oppositestr(String message,int numoftimes){

        int i = 0;
        String str ="";

        while(i<=numoftimes){

            message = message.substring(0);
            System.out.println(message +":"+ i );
            char randChar = (char)((int)(45+Math.random()*27));

            message += "," + randChar;
            str += message + " :Full loop ";

            i++;
        }







        return str;

    }


       public static String namerepit(String message,int numoftimes){

        String str1 = "";
        for(int i = 0;i<numoftimes;i++){


            str1 = message.substring(message.length()/2);
            System.out.println(str1);



        }


        return str1;
       }





}

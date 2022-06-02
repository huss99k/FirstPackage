package practice;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Wrapper {

    public static void main(String[] args){

        //Create your method here

      System.out.println(  intToBinary(87));
        // convertor("89770.9");

        int temp  = 345;


        System.out.println( java.lang.Integer.toHexString(temp));

    }



    public static String intToBinary(int n) {
        String s = "";
        while (n > 0)
        {s =  ( (n % 2 ) == 0 ? "0" : "1") +s;
            n = n / 2;
        }
        return s;
    }

}



package practice;
import java.util.*;

public class march5 {

    public static void main(String[] args) {
        System.out.println(randomCode(8));

    }

    public static String randomCode(int a){
        String message = "";
        int i = 0;
        while(i < a ){
            char ran = (char)(65 + (Math.random()*26));
           message += ran;
          message = message.toLowerCase();
          int lent = message.length();
            System.out.println("loop : " + i +"Length is " + lent + " : " + message + "\t");

            i++;
        }

        return message;
    }



}
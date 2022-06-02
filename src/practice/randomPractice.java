package practice;
import java.util.*;
public class randomPractice {

    public static void main(String[] args) {

       // Scanner scan = new Scanner(System.in);
        //System.out.println("Please Enter a Phone Number For replace");
        //int num = scan.nextInt();
        char[] obj1 = new char[8];

        obj1[0] = (char)(65 + (Math.random()*26));
        obj1[1] = (char)(65 + (Math.random()*26));
        obj1[2] = (char)(65 + (Math.random()*26));
        obj1[3] = (char)(65 + (Math.random()*26));
        obj1[4] = (char)(65 + (Math.random()*26));
        obj1[5] = (char)(65 + (Math.random()*26));
        obj1[6] = (char)(65 + (Math.random()*26));
        obj1[7] = (char)(65 + (Math.random()*26));



        System.out.println(Arrays.toString(obj1));

    }

    public static  String replacePhoneNum(){
        String result = "";

        Math.random();

        return result;
    }
}

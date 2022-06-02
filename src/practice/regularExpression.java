package practice;
import java.util.*;
public class regularExpression {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a text for a Match");
        boolean result = false;

        String  str = scan.nextLine();


        for (int i = 0;i <= str.length(); i++) {
            if(str.matches("[\\d]{2}-[\\w].*")){
                result = true;
                System.out.println("Occurence no: " + i + " Pattern 1");
                if(result == true)
                    break;
            }else if(str.matches("([1-9]{3}).+")){
                result = true;
                System.out.println("Occurence no: " + i + " Pattern 2");
            }

    }
        System.out.println(result);
}
}
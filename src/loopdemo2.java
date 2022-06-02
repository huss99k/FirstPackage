import java.util.*;
public class loopdemo2 {


    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

        System.out.println("Please enter Yes/no: ");

        String response = sc.next();

        while(response.equals("Yes") && response.equals("no")){

            System.out.println("You didnt enter yes or no ");
            System.out.println("Pleas enter yes/no : ");

            response = sc.next();
        }

        System.out.println("You entered " + response);




        }
    }


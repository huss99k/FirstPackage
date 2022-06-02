import java.util.Scanner;

public class Program002{

    public static void main(String[] args) {

        System.out.println("Please Enter two numbers :");
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int add = num1 + num2;
        int sub = num1 -num2;
        int multi = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;

        System.out.println("Addition is : " +  add);
        System.out.println("Subtration is : " + sub);
        System.out.println("Multiplication is : " + multi);
        System.out.println("Division is : " + div);
        System.out.println("Modulo is : " + mod);








    }
}

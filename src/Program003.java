import java.util.Scanner;

public class Program003 {

    public static void main(String[] args) {

        System.out.println("Enter Radius for AreaOfCircle : ");

        Scanner input = new Scanner(System.in);
        System.out.println("U entered "  + input);

        double rad = input.nextDouble();
        double pi = 3.14159;
        double area = (pi*rad*rad);


        System.out.println("The Area is : " + area);









    }
}

import java.util.Scanner;
public class dowhile {
    public dowhile() {
    }

    public static void main(String[] args) {



        //int num =0;
        //while(num<3){
          //  System.out.println("Execute");
            //num++;
        //}


         int num = 3;
         do{

             System.out.println("execute");
         }while(num < 3);

String correctPass = "123456";
        System.out.println("Welcome to facebook. Enter Your Password");
        Scanner scanner = new Scanner(System.in);

        String pass = scanner.next();

        while(!pass.equals(correctPass)){

            System.out.println("Welcome to facebook. Enter Your Password");
            pass = scanner.next();
        }

        System.out.println("Welcome");

    }
}

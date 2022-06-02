package May;
import java.util.*;
public class Op1 {

    public static void main(String[] args) {

        coffee n1 = new coffeeType();
        n1.program1();
        System.out.println( ((coffeeType)n1).price);


    }
}

     class coffee extends Op1{

        int price = 12;
        String name;
        String brand;
        boolean iscoffebrewing;


        public boolean program1() {
            boolean result = false;
            if (iscoffebrewing == true)
                result = true;
            System.out.println("Coffee is Brewing....Please Wait");

            return result;
        }

    }

         class coffeeType extends coffee{

            String Drinktype;
            int price = 18;

            public boolean program1() {
                boolean result = false;
                if(iscoffebrewing == true)
                    result=true;    System.out.println( Drinktype + " is Brewing....Please Wait " + "2nd class method");
              //  System.out.println(  super.price=45);
              //  System.out.println(  this.price = 15);
                return result;
            }

    }




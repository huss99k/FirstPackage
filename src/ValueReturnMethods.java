public class ValueReturnMethods {


    public static void main(String[] args) {


       // int reversed = reversefourdigitInteger(2701); void methods does not return anything


        System.out.println("before method cal");
        reversefourdigitInteger(2355);
        System.out.println("after method cal");;
    }
    public static void reversefourdigitInteger(int number){


        int a = number % 10;
        int remianing = number / 10;
        int b = remianing % 10;
        remianing/=10;
        int c = remianing % 10;
        remianing/=10;
        int d = remianing % 10;

        System.out.println("" + a+b+c+d);

    }
}

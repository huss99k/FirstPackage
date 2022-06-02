public class PassingAValueToMethod {

    public static void main(String[] args) {


        printAverage(3,7);


        double a = 5;
        double b = 8;
        printAverage(a,b);
        printAverage(4,6);
    }
    public static void printAverage(double a,double b){


        System.out.println((a+b)/2);
    }
}

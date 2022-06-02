public class Accumulatorloops {

    public static void main(String[] args) {


        //find sum of numbers bwt 1-100

        int i = 0;
        int total = 0;
        while(i <= 100){
            total = total + i;
            System.out.println("Loop no" + i + " Total is : " + total);
            i++;
        }
    }
}

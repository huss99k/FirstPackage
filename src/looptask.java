public class looptask {

    public static void main(String[] args) {

        System.out.println("  Multiplication Table");
        System.out.println("  1 2 3 4 5 6 7 8 9 ");
        System.out.println("  _____________________");

        for(int i = 1; i<10;i++){
            for(int j = 1;j<10;j++){
                System.out.printf("\t"+i*j);
            }
            System.out.println(" ");
        }


    }
}

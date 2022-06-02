package loops;

public class looplabels {

    public static void main(String[] args) {

      OUTERLOOP:  for (int i = 0;i <5;i++){
          INNERLOOP:  for(int j= 0;j<10;j++){
                System.out.println("* ");
                if(j==5){
                    break OUTERLOOP;
                }
            }
        }
    }
}

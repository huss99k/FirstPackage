package loops;
import java.util.*;
public class pattern {
    public static void main(String[] args) {

        int[] kg = new int[]{89, 78, 12, 3, 90, 80, 70};

        System.out.println(Arrays.toString(kg));

        //  for (int i = 0; i < kg.length; i++){
        //     System.out.print(" " + kg[i]);

        // }
        int k = 6;
        for (int i = 6; i >= 1; --i ){

        for (int j = 1; j <= i; ++j) {
            System.out.print(j + " ");
           }
            System.out.println("");
        }
    }
}

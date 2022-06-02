public class loopsandStrings {

    public static void main(String[] args) {


        String str = "Hello Java!";

        int i =0;

        while(i <= str.length()){
            System.out.print(str.indexOf(str,1));
          i++;
        }
    }
}

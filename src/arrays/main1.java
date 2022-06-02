package arrays;

public class main1 {


    public static void main(String[] args) {

        System.out.println(removeNonAlphaNumeric("https://www.duotech.io/"));

    }


    public static String removeNonAlphaNumeric(String str){
        //implement
        String result = "";
        char [][] sv = {{','},{'.'},{'/'},{'|'}, {'!'}, {'@'}, {'#'}, {'&'}, {'('}, {')'}, {'–'}, {'['}, {'{'}, {'}'},{']'}, {':'} ,{';'},                             {'?'}, {'/'}, {'*'}};

        StringBuilder sb = new StringBuilder(str);

        if(sb.length() == 0)
            System.out.println("Please Enter A Text");

        for(int i = 0;i < str.length();i++){
            for(int j =  0; j < str.length();j++){
                if(sb.charAt(j) == sv[i][j]){
                    sb = sb.deleteCharAt(i);
                }
            }

        }
        result = sb.toString();

        return result;
    }


}


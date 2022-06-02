package loops;

public class palindrome {
    public static void main(String[] args) {
        String str = "tenet";
         boolean  isPalindrome = true;
        for(int i = 0,j = str.length()-1;i<j;i++,j--){

            if(str.charAt(i) != str.charAt(j)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("not a Palindrome");
        }
    }
}

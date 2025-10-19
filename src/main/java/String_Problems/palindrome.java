package String_Problems;

public class palindrome {
    public static void main(String[] args) {
        String word="madam";
        int start=0;
        int end=word.length()-1;

        while(start>end){
            if(word.charAt(start)!=word.charAt(end)){
                System.out.println("Word is not palindrome");
            }
            start++;end--;
        }
        System.out.println("Word is palindrome");
    }
}

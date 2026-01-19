package Jan_Practice;

public class Palindrome extends ReverseEachWord{
    public static void main(String[] args) {
        String given ="madamko";
        if(given.equals(ReverseEachWord.reverseWord(given))){
            System.out.println(given+" is a palindrome");
        }else {
            System.out.println(given+" is not palindrome");
        }
    }

}

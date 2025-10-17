package String_Problems;

import java.util.Arrays;

public class reverseString {

    static void reverse(String word){
        String a=word;
        for(int i=a.length()-1;i>=0;i--){
            System.out.print(a.charAt(i));
        }
        System.out.print(" ");
    }

    static void reverseWordsFromSentence(String sent){
        String [] words=sent.split(" ");
        for(String a:words){
            reverse(a);
        }
    }
    public static void main(String[] args) {
        reverse("vaibhav");
        System.out.println(" ");
        reverseWordsFromSentence("vaibhav chandrakant zingade");
    }
}

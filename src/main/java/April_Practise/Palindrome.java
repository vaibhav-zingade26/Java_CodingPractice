package April_Practise;

import org.testng.annotations.Test;

public class Palindrome {
    //madam revese should same
    String name="abb0a";

    @Test
    public void isPalindrome(){
        int left=0;
        int right=name.length()-1;
        boolean isPlaindrome=true;
        while(left<right){
            if(name.charAt(left)!=name.charAt(right)){
                System.out.println("is not Palindrome");
            }
            left++;right--;
            isPlaindrome=false;

        }

        if(isPlaindrome){
            System.out.println(name+"is palindrome");
        }


    }


}

package April_Practise;

import org.testng.annotations.Test;

public class ReverseString {
    String name="abcd";

    @Test
    public void usingTwoPointer(){
        char[] arr=name.toCharArray();
        int start=0;
        int end=arr.length-1;
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }
        System.out.println(name+" : "+new String(arr));
    }

    @Test
    public void usingStringBuilder(){
        StringBuilder reverse=new StringBuilder();
        for(int i=name.length()-1;i>=0;i--){
            reverse.append(name.charAt(i));
        }
        System.out.println(name+" : "+reverse);
    }
}

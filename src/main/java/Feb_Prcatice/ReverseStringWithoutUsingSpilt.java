package Feb_Prcatice;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringWithoutUsingSpilt {
    public static void main(String[] args) {
        String s="I am SDET";

        List<String> ls=new ArrayList<>();
        int left=0;
        for(int right=0;right<s.length();right++){
            if(s.charAt(right)==' '){
                ls.add(s.substring(left,right));
                left=right+1;
                System.out.println(left);
            }

        }
        ls.add(s.substring(left));
        //System.out.println(ls);

        for(int i=ls.size()-1;i>=0;i--){
            System.out.print(ls.get(i)+" ");
        }




    }
}

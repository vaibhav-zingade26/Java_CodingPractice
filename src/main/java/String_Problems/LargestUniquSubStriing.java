package String_Problems;

public class LargestUniquSubStriing {
    public static boolean isUnique(String sub){
        for(int i=0;i<sub.length();i++){
            if(sub.indexOf(sub.charAt(i))!=sub.lastIndexOf(sub.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    String s="abcda";
    String result="";
    for(int i=0;i<s.length();i++){
        for(int j=i+1;j<s.length();j++){
            if(isUnique(s.substring(i,j)) && s.substring(i,j).length()>result.length()){
                result=s.substring(i,j);
            }
        }
    }
        System.out.println("Logest substring is : "+result);
    }
}

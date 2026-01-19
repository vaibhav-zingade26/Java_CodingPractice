package Jan_Practice;

public class ReverseEachWord {
    public static String reverseWord(String a){
        String b="";
        for(int i=a.length()-1;i>=0;i--){
            b=b+a.charAt(i);
        }
        return b;
    }

    public static void main(String[] args) {
        String given = "I am Vaibhav Zingade";
        for(String a:given.split(" ")){
            reverseWord(a);
        }
    }
}

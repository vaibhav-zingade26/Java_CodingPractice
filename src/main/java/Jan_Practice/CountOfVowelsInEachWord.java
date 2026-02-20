package Jan_Practice;

public class CountOfVowelsInEachWord {

    public static int countVowels(String a){
       String v="aeiouAEIOU";
       int counter=0;
       for(char c:a.toCharArray()){
           if(v.contains(Character.toString(c))){
               counter++;
           }
       }
       return counter;
    }
    public static void main(String[] args) {
        String given="I Like Java Programming";

        for(String a:given.split(" ")){
            System.out.println(a+" "+countVowels(a));
        }

    }
}

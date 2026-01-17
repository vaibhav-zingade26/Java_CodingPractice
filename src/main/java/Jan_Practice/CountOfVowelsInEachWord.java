package Jan_Practice;

public class CountOfVowelsInEachWord {

    public static int countVowels(String a){
        String vowels="aeiouAEIOU";
        int counter=0;
        for(char c:a.toCharArray()){
            if(vowels.contains(Character.toString(c))){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        String given="I Like Java Programming";
        for(String word:given.split(" ")){
            System.out.print(word+" : "+countVowels(word)+" ");
        }
        System.out.println();
    }
}

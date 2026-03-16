package March_Oractise;

public class CountVowelsinString {
    public static void main(String[] args) {
        String s="automation";
        String vowels="aeiou";
        int count=0;
        for(char b:s.toCharArray()){
            if(vowels.contains(Character.toString(b))){
                count++;
            }
        }
        System.out.println("Number of vowels are "+count);
    }
}

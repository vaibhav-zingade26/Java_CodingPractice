package String_Problems;

public class countVowelsAndConsonents {
    public static void main(String[] args) {
        String word = "Hello World";
        int vowels=0;
        int consonents=0;
        for (char a : word.toCharArray()) {
           if(Character.isLetter(a)){
               if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                   vowels++;
               }else{
                   consonents++;
               }
           }
        }
        System.out.println("vowels : "+vowels);
        System.out.println("consonents : "+consonents);
    }
}

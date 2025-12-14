package String_Problems;

public class AnagramUsingAscii {
    public static void main(String[] args) {
        String a="aba";
        String b="aba";

        int[] ascii = new int[256];

        for(int i=0;i<a.length();i++){
            ascii[a.charAt(i)]++;
        }
        for(int j=0;j<b.length();j++){
            ascii[b.charAt(j)]--;
        }
        for(int value :ascii){
            if(value!=0){
                System.out.println("Not Anagram");
                return;
        }
    }
        System.out.println("Anagram");
    }
}

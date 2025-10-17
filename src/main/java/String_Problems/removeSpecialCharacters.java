package String_Problems;

public class removeSpecialCharacters {
    public static void main(String[] args) {
        String a="abg5672h887*&8hg**";
        //System.out.println(Character.isLetter('a'));
        String res="";
        for(char b:a.toCharArray()){
            if(Character.isLetter(b)){
                res=res+b;
            }
        }
        System.out.println(res);
    }
}

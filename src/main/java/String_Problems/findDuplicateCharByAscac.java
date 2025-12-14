package String_Problems;

public class findDuplicateCharByAscac {
    public static void main(String[] args) {
        String b="rfkjwfw";
        int[] c= new int[256];
        for(int i=0;i<b.length();i++){
            c[b.charAt(i)]++;
        }
        for(int j=0;j<c.length;j++){
            if(c[j]>1){
                System.out.println((char)j);
            }
        }
    }
}

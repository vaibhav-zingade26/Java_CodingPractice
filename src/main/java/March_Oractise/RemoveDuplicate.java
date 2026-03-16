package March_Oractise;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "programming";
        String result="";

        for(char b:s.toCharArray()){
            if(result.indexOf(b)==-1){
                result+=b;
            }
        }
        System.out.println(result);




    }
}

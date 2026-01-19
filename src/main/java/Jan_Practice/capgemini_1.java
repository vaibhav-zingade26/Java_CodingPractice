package Jan_Practice;

public class capgemini_1 {

    public static void main(String[] args) {
        String s="00000012345";
        int count=0;
        for(char a:s.toCharArray()){
            if(a=='0'){
                count++;
            }
        }
        String result=s.substring(count)+"0".repeat(count);

        System.out.println(result);
    }
}

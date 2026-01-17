package Jan_Practice;

public class CapGemini_SubString {
    /// given 00000012345    print 123450000

    public static void main(String[] args) {
        String given="00000012345";
        int counter=0;

        while(counter<given.length() && given.charAt(counter)=='0'){
            counter++;
        }

        String out=given.substring(counter);

        for(int i=0;i<counter;i++){
            out=out+'0';
        }

        System.out.println(out);

    }
}

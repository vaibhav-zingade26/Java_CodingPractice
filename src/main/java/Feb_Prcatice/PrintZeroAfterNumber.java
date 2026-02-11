package Feb_Prcatice;

public class PrintZeroAfterNumber {


    public static void main(String[] args) {
        String number ="0000012424";int count=0;
        for(char b:number.toCharArray()){
            if(b=='0'){
                count++;
            }else break;
        }
        System.out.println(count);
        System.out.println(number.substring(count)+"0".repeat(count));

    }



}

package String_Problems;

public class sumOfNumberFromString {
    public static void main(String[] args) {
        String givenString="vhb1n2gyhhg";
        int sum=0;
        String temp="";
        for(char a:givenString.toCharArray()){
            if(Character.isDigit(a)){
                temp=temp+a;
            }else if(!temp.isEmpty()){
                sum=sum+Integer.parseInt(temp);
                temp="";
            }
        }
        if(!temp.isEmpty()){
            sum+=Integer.parseInt(temp);
        }
        System.out.println(sum);
    }
}

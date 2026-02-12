package String_Problems;

public class NaveenAutomationProblem {
    public static String reverseString(String name){
        StringBuilder sb = new StringBuilder();
        for(int i=name.length()-1;i>=0;i--){
            sb.append(name.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String b="12abc43jkl242xyz";
        StringBuilder sb= new StringBuilder();

        String[] arr=b.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        for(String n:arr){
            System.out.println(n);
            if(n.matches("[a-zA-z]+")){
                sb.append(reverseString(n));
            }else {
                sb.append(n);
            }

        }
        System.out.println(sb);


    }
}

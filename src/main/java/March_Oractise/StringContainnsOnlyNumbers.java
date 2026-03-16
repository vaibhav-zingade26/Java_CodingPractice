package March_Oractise;

public class StringContainnsOnlyNumbers {
    public static void main(String[] args) {
        String s="1234O5";

        if(s.matches("[0-9]+")){
            System.out.println("Contains only numbers");
        }else {
            System.out.println("Contains other than numbers");
        }
    }
}

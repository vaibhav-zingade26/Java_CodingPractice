package March_Oractise;

public class SeperateNumbersAndCharacters {
    public static void main(String[] args) {
        String s = "12abhbd43njw242jkikm";
       StringBuilder word = new StringBuilder();
       StringBuilder no = new StringBuilder();

        for(char b:s.toCharArray()){
            if(Character.isLetter(b)){
                word.append(b);
            }else if(Character.isDigit(b)){
                no.append(b);
            }
        }

        System.out.println("Word = "+word);
        System.out.println("Number = "+no);

    }
}

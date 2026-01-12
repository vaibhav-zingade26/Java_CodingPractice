package Jan_Practice;

public class AnagramUsingAscii {
    public static void main(String[] args) {
        String a = "ab4rc";
        String b = "abc";


        int[] ascii = new int[256];

        for (int i = 0; i < a.length(); i++) {
            ascii[a.charAt(i)]++;
        }

        for (int i = 0; i < ascii.length; i++) {
            System.out.print(ascii[i] + " ");
        }
        System.out.println(" ");


        for (int i = 0; i < b.length(); i++) {
            ascii[b.charAt(i)]--;
        }

        for (int i = 0; i < ascii.length; i++) {
            System.out.print(ascii[i] + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < ascii.length; i++) {
            if (ascii[i] != 0) {
                System.out.println("Not Anagram");
                return;
            }

        }
        System.out.println("Anagram");

    }
}

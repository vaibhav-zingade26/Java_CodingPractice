package Jan_Practice;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] a={12,34,56,44,33};

        int largest=0;
        int second=0;

        for(int n:a){
            if(n> largest){
                second=largest;
                largest=n;
            } else if (n>second && n!=largest) {
                second=n;
            }
        }
        System.out.println(second);
    }
}

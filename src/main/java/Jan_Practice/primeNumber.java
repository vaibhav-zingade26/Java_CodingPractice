package Jan_Practice;

public class primeNumber {
    public static void isPrime(int number){
        boolean isPrime=true;
       /* if(number==1){
            System.out.println("Number is not prime and Whole number");
        }*/

        for(int i=2;i<number/2;i++){
            if(number%i==0 && number>1){
                isPrime=false;
                break;
            }
        }

        System.out.println(isPrime ? "Prime Number":"Not Prime number");
    }

    public static void main(String[] args) throws Exception {
        int number=145;
        isPrime(number);

    }



}

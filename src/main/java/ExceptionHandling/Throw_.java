package ExceptionHandling;

public class Throw_ {
    int age=18;
    public void ageIdentifier(){
        if(age<20) {
            throw new ArithmeticException("Age is less than 20");
        }else{
            System.out.println("u can vote");
        }
    }
    public static void main(String[] args) {
       Throw_ throw_= new Throw_();
       try {
           throw_.ageIdentifier();
       }catch (Exception e){
           System.out.println(e);
           System.out.println("Happy birthday");
       }
    }
}

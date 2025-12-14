package Inheritence;

public class B extends A {
    int a = 8;
    int b = 7;

    public static void main(String[] args) {

        A parent = new B();
        parent.divide();
        B child = new B();
        child.sum();
    }

    public void sum() {
        System.out.println("B-->Sum : " + a + b);
    }

    public void mutilplier() {
        System.out.println("B-->Multiplication : " + a * b);
    }
}

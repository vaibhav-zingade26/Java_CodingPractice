package Abstraction;

public class Indigo extends ParentAirCraft {
    ParentAirCraft p;
    public Indigo(){

    }

    public void parentMethod(){
        p=new ParentAirCraft() {
            @Override
            public void colourOfAirLine() {

            }
        };
        System.out.println("*******************");
        p.chargesOfAircraft();

    }

    public static void main(String[] args) {
        //UpCasting
        ParentAirCraft p = new Indigo();  // upcasting
        p.colourOfAirLine();
        p.chargesOfAircraft();



        //DownCasting
        Indigo ig=(Indigo)p;
        ig.chargesOfAircraft();

        Indigo c = new Indigo();
        c.chargesOfAircraft();
        c.engine_Guideline();
        c.parentMethod();
    }

        @Override
        public void colourOfAirLine () {
            System.out.println("Black and Blue");
        }

        public void chargesOfAircraft(){
            System.out.println("Charges of Indigo");
        }

}

package Abstraction;

public class Indigo extends ParentAirCraft {

    public static void main(String[] args) {
        //UpCasting
        ParentAirCraft p = new Indigo();
        p.colourOfAirLine();
        //DownCasting
        Indigo ig=(Indigo)p;
        ig.chargesOfIndigo();

        Indigo c = new Indigo();
        c.chargesOfIndigo();
        c.engine_Guideline();
    }

        @Override
        public void colourOfAirLine () {
            System.out.println("Black and Blue");
        }

        public void chargesOfIndigo(){
            System.out.println("Charges of Indigo");
        }

}

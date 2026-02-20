package Interfaces;

import javax.sound.midi.InvalidMidiDataException;

public class IndianTraffic implements CentralTraffic {




    public static void main(String[] args) {
        CentralTraffic i= new IndianTraffic();
        i.breakYellow();i.goGreen();i.stopRed();
        IndianTraffic in=new IndianTraffic();
        in.IndianTraffic_basics();

    }
    public void IndianTraffic_basics(){
        System.out.println("If yellow then, move fast don't stop ");
    }


    @Override
    public void goGreen() {
        System.out.println("goGreen");
    }

    @Override
    public void breakYellow() {
        System.out.println("breakYellow");
    }

    @Override
    public void stopRed() {
        System.out.println("stopRed");
    }
}
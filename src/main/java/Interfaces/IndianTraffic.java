package Interfaces;

public class IndianTraffic implements CentralTraffic,StateTraffic{

    public static void main(String[] args) {
        IndianTraffic i=new IndianTraffic();
        i.wrongSide();
        i.vehicle_toeing();
        i.challan();
    }

    @Override
    public void goGreen() {
        System.out.println("Go fast");
    }

    @Override
    public void breakYellow() {
        System.out.println("Fast as much as possible");
    }

    @Override
    public void stopRed() {
        System.out.println("Stop until it is gets red");
    }

    public void wrongSide(){
        System.out.println("If traffic police is not present go wrong side");
    }

    @Override
    public void challan() {
        System.out.println("Call father or pay the challan");
    }

    @Override
    public void vehicle_toeing() {
        System.out.println("Fastest government body");
    }
}

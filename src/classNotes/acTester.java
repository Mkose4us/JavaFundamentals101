package classNotes;

public class acTester {
    public static void main(String[] args) {
        airconditioner ac1=new airconditioner();
        ac1.brand="samsung";
        ac1.currentTemp=73.3f;
        ac1.isOn=true;
        ac1.displayAllInfo();
        ac1.displayTheBrand();
        ac1.showCurrentTem();
        ac1.turnOn();
    }
}

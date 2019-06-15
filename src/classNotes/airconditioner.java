package classNotes;

public class airconditioner {
    String brand;
    float currentTemp;
    boolean isOn;
    public void displayTheBrand(){
        System.out.println("brand is "+brand);
    }
    public void showCurrentTem(){
        System.out.println(currentTemp);
    }
    public void displayAllInfo(){
        System.out.println("brand is "+brand+"current temp is "+currentTemp+"and it is"+isOn);

    }
    public void turnOn(){
        if(!isOn)
        isOn=true;
        else
            System.out.println("it is already on");
    }




}

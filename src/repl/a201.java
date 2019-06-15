package repl;

public class a201 {
    private int channel=1;
    private int volumeLevel=1;
    private boolean on=false;
    private String brand="undefined";

    public a201() {
        System.out.println("Creating TV object using no Args- constructor");
    }

    public a201(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(channel<=0 && channel>120)
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        else
        this.channel = channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if(volumeLevel>1 && volumeLevel<7)
        this.volumeLevel = volumeLevel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int channelUp(){
        return channel+1;
    }
    public int channelDown(){
        return channel-1;
    }
    public void volumeUp(){
        if(on)
            System.out.println(volumeLevel+1);
        else
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
    }
    public void volumeDown(){
        if(on)
        System.out.println( volumeLevel-1);
        else
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
    }
    public void isOn (){
        System.out.println(on);
    }
    public void turnOn(){
        if(on)
            System.out.println("TV is already ON");
    }
    public void turnOff(){
        if(!on)
            System.out.println("TV is already OFF");
    }




}

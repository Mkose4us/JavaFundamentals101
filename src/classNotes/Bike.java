package classNotes;

public class Bike {
    private String brand;
    private int gear;
    private int speed;
    private int id;
    static private int countOfBike;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public int getId() {
        return id;
    }

    public Bike(String brand, int gear, int speed) {
        this();
        this.brand = brand;
        this.gear = gear;
        this.speed = speed;

    }
    private Bike(){
        System.out.println("no args is being called");
    }
  //  public int speedUp(int increaseBy){

   // }
   // public int slowDown(int decreaseBy){

    //}


    public String toString() {
        return "Bike{" +
                "brand='" + brand + '\'' +
                ", gear=" + gear +
                ", speed=" + speed +
                ", id=" + id +
                '}';
    }
    public static void showCurrentCount(){
        System.out.println(countOfBike);
    }

}

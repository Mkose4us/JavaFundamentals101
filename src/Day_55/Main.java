package Day_55;

public class Main {
    public static void main(String[] args) {
        HourlyEmployee h1=new HourlyEmployee("Melek",78,3,2);
        System.out.println(  h1.toString());
        SalariedEmployee se=new SalariedEmployee("ahet",323,2300);
        System.out.println(se.toString());
    }
}

class HourlyEmployee extends Employee{

    private int hourWorked;
    private int hourlyRate;

    public HourlyEmployee(String name, int id, int hourWorked, int hourlyRate) {
        super(name, id);
        this.hourWorked = hourWorked;
        this.hourlyRate = hourlyRate;
    }

    public int getHourWorked() {
        return hourWorked;
    }

    public void setHourWorked(int hourWorked) {
        this.hourWorked = hourWorked;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public int calculateAnnualSalary(){
        return hourWorked*hourlyRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee {" +"NAME "+getName()+" ID = "+getId()+
                " hourWorked= " + hourWorked +
                ",   hourlyRate= " + hourlyRate +"  salaray is="+ calculateAnnualSalary()+
                '}';
    }
}
class SalariedEmployee extends Employee{
    //private int id;
    //private String name;
    private int monthlySalary;
    public int calculateAnnualSalary(){
        return this.monthlySalary*12;
    }

    public SalariedEmployee(String name, int id, int monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +getName()
+getId()       +         "monthlySalary=" + monthlySalary +calculateAnnualSalary()+
                '}';
    }
}
abstract class Employee{
    private String name;
   private int id;
   public abstract int calculateAnnualSalary();

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

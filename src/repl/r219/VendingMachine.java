package repl.r219;

abstract public class VendingMachine {

   public abstract void select(int itemNumber);
   public abstract double pay(double money);
   public abstract double returnChange();
   public abstract void cancel();

}

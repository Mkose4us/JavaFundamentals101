package repl.r219;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DrinkVendingMachine vending = new DrinkVendingMachine(
                new Drink("Iced Coffee",4.50,10),
                new Drink("Iced Tea",2.50,5),
                new Drink("Smart Water",4.0,20),
                new Drink("Coke",2.30,13) );

        System.out.println( vending.drinks.get(1).toString() ); //Drink{name='Iced Coffee', cost=4.5, quantity=10}
       vending.select(1);
        System.out.println(vending.isSelected);
        vending.cancel();

        System.out.println(vending.pay(7.50));
        System.out.println(vending.change);
        System.out.println( vending.drinks.get(1).toString() );
        vending.cancel();
        System.out.println( vending.drinks.get(1).toString() );



    }
}




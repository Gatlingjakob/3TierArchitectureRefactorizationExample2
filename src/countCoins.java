/**
 * Created by Jakob on 25-10-2016.
 */
import java.util.*;
import java.io.*;

public class countCoins {
    public static void main (String[] args) throws FileNotFoundException {

        //Data Access Object//
        Scanner input = new Scanner(new File ("countcoins.txt"));

        //Business Logic//
        countCoins(input);

    }

    public static void countCoins(Scanner input) {

        //(Business Logic)//

        String penny = ("pennies");
        String nickel = ("nickels");
        String dime = ("dimes");
        String quarter = ("quarters");
        double getCash = 0;

        while (input.hasNext()) {

            int temp = input.nextInt();
            String coin = input.next();


            if (coin.equalsIgnoreCase(penny)){
                getCash = getCash + (temp*0.01);
            }

            if (coin.equalsIgnoreCase(nickel)){
                getCash = getCash + (temp*0.05);
            }

            if (coin.equalsIgnoreCase(dime)){
                getCash  = getCash + (temp*0.10);
            }

            if (coin.equalsIgnoreCase(quarter)){
                getCash = getCash + (temp*0.25);
            }

        }

        //Presentation//
        System.out.printf("Total money: $ %2.2f" , getCash);
        System.out.println();
        System.out.print("You rich, son!");
    }
}


package machine;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        /*
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");*/

        Scanner in = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = in.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = in.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans = in.nextInt();
        System.out.println("Write how many cups of coffee you will need: \n ");
        int cupsOfCoffee = in.nextInt();



        int limitOfCups = 0;
       if ((water < 200) && (milk < 50) && (beans < 15) && (cupsOfCoffee != 0)) {

           System.out.println("No, I can make only " + limitOfCups +" cup(s) of coffee");
       } else if (water >= 200 && milk >= 50 && beans >= 15) {
           if ((water / 200 < cupsOfCoffee) || (milk / 50 < cupsOfCoffee) || (beans / 15 < cupsOfCoffee)) {
               if ((water / 200 < cupsOfCoffee) && (water / 200) <= (milk / 50) && (water /200) <= (beans / 15)){
                   limitOfCups = water / 200;
                   System.out.println("No, I can make only " + limitOfCups + " cup(s) of coffee");
               } else if ((milk / 50 < cupsOfCoffee) && (milk / 50) <= (water / 200) && (milk / 50) <= (beans / 15)) {
                   limitOfCups = milk / 50;
                   System.out.println("No, I can make only " + limitOfCups + " cup(s) of coffee");
               }else if ( (beans / 15 < cupsOfCoffee) && (beans / 15) <= (water / 200) && (beans /15) <= (milk / 50)) {
                   limitOfCups = beans / 15;
                   System.out.println("No, I can make only " + limitOfCups + " cup(s) of coffee");
               }
           } else {
               if ( (water / 200) <= (milk / 50) && (water /200) <= (beans / 15)) {
                   limitOfCups = (water / 200) - cupsOfCoffee;
                   if (limitOfCups == 0) {
                       System.out.println("Yes, I can make that amount of coffee");
                   } else {
                       System.out.println("Yes, I can make that amount of coffee (and even " + limitOfCups + " more than that)");
                   }
               } else if ( (milk / 50) <= (water / 200) && (milk / 50) <= (beans / 15)) {
                   limitOfCups =( milk / 50) - cupsOfCoffee;
                   if (limitOfCups == 0){
                       System.out.println("Yes, I can make that amount of coffee");
                   } else {
                       System.out.println("Yes, I can make that amount of coffee (and even " + limitOfCups + " more than that)");
                   }
               } else if ( (beans / 15) <= (water / 200) && (beans /15) <= (milk / 50)) {
                   limitOfCups = (beans / 15) - cupsOfCoffee;
                   if (limitOfCups == 0) {
                       System.out.println("Yes, I can make that amount of coffee");
                   } else {
                       System.out.println("Yes, I can make that amount of coffee (and even " + limitOfCups + " more than that)");
                   }
               }
           }
       } else {
           System.out.println("Yes, I can make that amount of coffee");
       }



        /*
        water *=cupsOfCoffee;
        milk*= cupsOfCoffee;
        beans *=cupsOfCoffee;
        System.out.println("For " + cupsOfCoffee + " cups of coffee you will need:\n" + water + " ml of water\n" + milk + " ml pf milk\n" + beans + " g of coffee beans");*/
    }
}

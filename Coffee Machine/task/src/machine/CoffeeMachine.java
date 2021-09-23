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
        int water = 400;
        int milk = 540;
        int beans = 120;
        int money = 550;
        int disposableCups = 9;
        String machineState = "The coffee machine has:\n" +
                water + " ml of water\n" +
                milk + " ml of milk\n" +
                beans + " g of coffee beans\n" +
                disposableCups + " disposable cups\n" +
                "$" + money + " of money";

        int flag = 1;
        while (flag == 1) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            switch (in.next()) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    switch (in.next()) {
                        case "1":
                            if (water - 250 >= 0 && beans - 16 >=0 && disposableCups - 1 >= 0){
                                water -= 250;
                                beans -= 16;
                                money += 4;
                                disposableCups--;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else {
                                if (water - 250 < 0) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (beans - 16 < 0) {
                                    System.out.println("Sorry, not enough coffee beans!");
                                } else {
                                    System.out.println("Sorry, not enough disposable cups!");
                                }
                            }
                            break;
                        case "2":
                            if (water - 350 >= 0 && milk - 75 >= 0 && beans - 20 >= 0 && disposableCups - 1 >= 0) {
                                water -= 350;
                                milk -= 75;
                                beans -= 20;
                                money += 7;
                                disposableCups--;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else {
                                if (water - 350 < 0) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (milk - 75 < 0) {
                                    System.out.println("Sorry, not enough milk!");
                                } else if ( beans - 20 < 0) {
                                    System.out.println("Sorry, not enough coffee beans!");
                                } else {
                                    System.out.println("Sorry, not enough disposable cups!");
                                }
                            }
                            break;
                        case "3":
                            if (water - 200 >= 0 && milk - 100 >= 0 && beans - 12 >=0 && disposableCups -1 >= 0) {
                                water -= 200;
                                milk -= 100;
                                beans -= 12;
                                money += 6;
                                disposableCups--;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else {
                                if (water - 200 < 0) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (milk - 100 <0) {
                                    System.out.println("Sorry, not enough milk!");
                                } else if (beans - 12 < 0) {
                                    System.out.println("Sorry, not enough coffee beans!");
                                } else {
                                    System.out.println("Sorry, not enough disposable cups!");
                                }
                            }
                            break;
                        default:
                            return;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    water += in.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    milk += in.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    beans += in.nextInt();
                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    disposableCups += in.nextInt();
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money -= money;
                    break;
                case "remaining":
                    machineState = "The coffee machine has:\n" +
                            water + " ml of water\n" +
                            milk + " ml of milk\n" +
                            beans + " g of coffee beans\n" +
                            disposableCups + " disposable cups\n" +
                            "$" + money + " of money";
                    System.out.println(machineState);
                    break;
                case "exit":
                    flag = 0;
                    break;
            }
            System.out.println();
        }
        /*
        System.out.println("Write how many cups of coffee you will need: \n ");
        int cupsOfCoffee = in.nextInt();*/



        /*
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
       }*/



        /*
        water *=cupsOfCoffee;
        milk*= cupsOfCoffee;
        beans *=cupsOfCoffee;
        System.out.println("For " + cupsOfCoffee + " cups of coffee you will need:\n" + water + " ml of water\n" + milk + " ml pf milk\n" + beans + " g of coffee beans");*/
    }
}

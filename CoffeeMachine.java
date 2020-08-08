package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int money = 550;
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;


        while (true) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");
        String option = in.next();

        switch (option) {
            case "buy":
                System.out.print("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu ");
                String cofeon = in.next();

                switch (cofeon) {
                    case "1":
                        if (water < 250 || beans < 16 || cups < 1) {
                            System.out.print("\nSorry, not enough water!\n");
                        } else {
                            water -= 250;
                            beans -= 16;
                            money += 4;
                            cups -= 1;
                            System.out.print("\nI have enough resources, making you a coffee!\n");
                        }
                        break;


                    case "2":
                        if (water < 350 || beans < 20 || cups < 1 || milk < 75) {
                            System.out.print("\nSorry, not enough water!\n");
                        } else {
                            water -= 350;
                            milk -= 75;
                            beans -= 20;
                            money += 7;
                            cups -= 1;
                            System.out.print("\nI have enough resources, making you a coffee!\n");
                        }
                        break;


                    case "3":
                        if (water < 200 || beans < 12 || cups < 1 || milk < 100) {
                            System.out.print("\nSorry, not enough water!\n");
                        } else {
                            water -= 200;
                            milk -= 100;
                            beans -= 12;
                            money += 6;
                            cups -= 1;
                            System.out.print("\nI have enough resources, making you a coffee!\n");
                        }
                        break;

                    case "back":
                        break;

                }
                break;

            case "fill":
                System.out.println("Write how many ml of water do you want to add: ");
                int wtr = in.nextInt();
                water += wtr;
                System.out.println("Write how many ml of milk do you want to add: ");
                int mlk = in.nextInt();
                milk += mlk;
                System.out.println("Write how many grams of coffee beans do you want to add: ");
                int bns = in.nextInt();
                beans += bns;
                System.out.println("Write how many disposable cups of coffee do you want to add: ");
                int cps = in.nextInt();
                cups += cps;

                break;


            case "take":
                System.out.printf("I gave you $%d\n", money);
                money = 0;

                break;

            case "remaining":
                remaining(water, milk, beans, cups, money);
                break;

            case "exit":
                exit();
                break;

        }
    }
    }
    static void remaining(int water,int milk,int beans,int cups,int money){
        System.out.printf("The coffee machine has:\n" +
                "%d of water\n" +
                "%d of milk\n" +
                "%d of coffee beans\n" +
                "%d of disposable cups\n" +
                "%d of money", water, milk, beans, cups, money);
    }
    static void exit(){
        System.exit(0);
    }
}


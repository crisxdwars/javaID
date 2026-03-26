import java.lang.*;
import java.util.*;

public class written_talurong {
    public static void main(String[] args) {
        boolean triggerUser = true;
        String user = "Choose a Meal: ";
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("\nWelcome to my restaurant!\n------------------------\n");                                  
                Thread.sleep(1500);
                    System.out.println("MEAL-----PACKAGE-----PRICE");
                    System.out.println("[A]--Chicken & Fries---100");
                    System.out.println("[B]--Hamburger & Fries-150");
                    System.out.println("[C]--Pizza & Salad-----200");
                    System.out.print(user);
                    String you = input.nextLine();
                    String converted = you.toLowerCase();
                    switch (converted) {
                        case "a":
                            System.out.println("You Choosed Chicken & Fries");
                            user = "Quantity: ";
                            System.out.print("\n"+user);
                            int quant_A = Integer.parseInt(input.nextLine());
                            Thread.sleep(500);
                            System.out.println("Order Processed!");
                            System.out.println("\nMeal: Chicken & Fries\n" + "Quantity: " + quant_A + "\nTotal: " + quant_A * 100);
                            System.out.println("\nWait for your order to be delivered.");
                            System.out.println("\nReturning..");
                        break;
                        case "b":
                            System.out.println("You Choosed Hamburger & Fries");
                            user = "Quantity: ";
                            System.out.print("\n"+user);
                            int quant_B = Integer.parseInt(input.nextLine());
                            Thread.sleep(500);
                            System.out.println("Order Processed!");
                            System.out.println("\nMeal: Hamburger & Fries\n" + "Quantity: " + quant_B + "\nTotal: " + quant_B * 150);
                            System.out.println("\nWait for your order to be delivered.");
                            System.out.println("\nReturning..");
                        break;
                        case "c":
                            System.out.println("You Choosed Pizza & Salad");
                            user = "Quantity: ";
                            System.out.print("\n"+user);
                            int quant_C = Integer.parseInt(input.nextLine());
                            Thread.sleep(500);
                            System.out.println("Order Processed!");
                            System.out.println("\nMeal: Pizza & Salad\n" + "Quantity: " + quant_C + "\nTotal: " + quant_C * 200);
                            System.out.println("\nWait for your order to be delivered.");
                            System.out.println("\nReturning..");
                        break;
                        default:
                            System.out.println("\nPlease Enter The Right Choice\n");
                            System.out.print("\n" + user);
                            Thread.sleep(500);
                        break;
                    }
                

            } catch (Exception e) {
                System.err.println("\nPut the right value\n");
                user = "Choose a Meal: ";
            }
        } while (triggerUser);
    }
}
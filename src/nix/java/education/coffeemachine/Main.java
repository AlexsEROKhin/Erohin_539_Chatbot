package nix.java.education.coffeemachine;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static final CoffeeMachine employee = new CoffeeMachine(400,540,120,9, 550.00);
    public static void main(String[] args) {
        System.out.println("""
                Starting to make coffee
                Grinding coffee beans
                Boiling water
                Mixin boiled water with crushed coffee beans
                Pouring coffee into the cup
                Pouring some milk into the cup
                Ingridients is ready!
                """);
        while (true) {
            System.out.println("Write action: buy, fill, take, remaining, exit:");
            String action = scanner.next();
            if (action.equals("buy")) {
                employee.buyCoffee();
                System.out.println(employee.showIngridients());

            }
            if (action.equals("fill")) {
                employee.incIngredients();
                System.out.println(employee.showIngridients());

            }
            else if (action.equals("take")) {
                System.out.println("I gave you " + " " + employee.getMoney());
                employee.takeMoney();
            }
            else  if (action.equals("remaining")){
                System.out.println(employee.showIngridients());
            }
            else  if (action.equals("exit")){
                break;
            }
        }
    }
}

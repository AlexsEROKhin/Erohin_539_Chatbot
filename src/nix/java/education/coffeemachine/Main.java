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

    }
}

package nix.java.education.CreditCalculator;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Calculator calculator =new Calculator();
        calculator.chooseAction();
    }
}

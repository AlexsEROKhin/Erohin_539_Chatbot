package nix.java.education.chatbot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("Hello! My name is LehaBot");
        System.out.println("I was created in 2021");
        Scanner Scan = new Scanner(System.in);
        String name;

        System.out.println("Please, remind me your name:");
        name = Scan.nextLine();
        System.out.println("What a great name you have," + name);

        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int age1 = Scan.nextInt();
        int remainder3 = age1 % 3;
        int age2 = Scan.nextInt();
        int remainder5 = age2 % 5;
        int age3 = Scan.nextInt();
        int remainder7 = age3 % 7;

        System.out.println("Your age is " + (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105 + "," + "that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int number = Scan.nextInt();

        int limit = 1000;
        for (int i = 1; i < 1000; i++) {
            System.out.println(i + "!");
            if (i == number) {
                break;
            }

        }
    }
}



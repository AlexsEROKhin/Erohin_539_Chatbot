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
    }

}

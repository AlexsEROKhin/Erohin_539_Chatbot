package nix.java.education.hangman;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Висилица!\nИгра скоро будет доступна...");
        System.out.print("Угадай слово: ");
        String answer = scan.nextLine();
        String word = "java";
        if (answer.equals(word)) {
            System.out.println("Вы выжили!");
        } else {
            System.out.println("Вы проиграли!");

        }
        Random random = new Random();
        String[] words = {"java", "python", "javascript", "kotlin"};
        String variation = words[random.nextInt(words.length)];
        System.out.print("Раунд 2\nУгадай слово: ");
        String answer2 = scan.nextLine();
        StringBuffer secret = new StringBuffer(variation);
        char[] symbol = variation.toCharArray();

        for (int i = 0; i < symbol.length; i++) {
            secret.setCharAt(i, '-');
        }
        ArrayList<String> someLetters = new ArrayList<>();
        short health = 8;
        boolean True = true;
        while (True) {
            if (health > 0) {
                System.out.print(secret + "\nВведите букву:");
                String user = scan.nextLine();
                someLetters.add(user);
                health--;

                if (someLetters.contains(user)) {
                    System.out.println("Эта буква уже угадана");
                    health--;
                } else {
                    for (int i = 0; i < variation.length(); i++) {
                        if (symbol[i] == user.charAt(0)) {
                            secret.setCharAt(i, user.charAt(0));
                        }
                    }
                }
                if (secret.toString().equals(variation)) {
                } else {
                    System.out.println("Этой буквы нет в слове!");
                    health--;
                }
                someLetters.add(user);
            } else {
                System.out.println("Вы проиграли!");
                break;
            }
        }
    }
}





package nix.java.education.hangman;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Висилица!\nИгра скоро будет доступна...");
        System.out.print("Угадай слово: ");
        String answer = scan.nextLine();
        String word = "java";
        if (answer.equals(word)){
            System.out.println("Вы выжили!");
        }
        else{
            System.out.println("Вы проиграли!");

        }
        Random random = new Random();
        String[] words = {"java","python", "javascript", "kotlin"};
        String variation = words[random.nextInt(words.length)];
        System.out.print("Раунд 2\nУгадай слово: ");
        String answer2 = scan.nextLine();
        if (answer2.equals(variation)){
            System.out.println("Вы выжили!");
        }
        else{
            System.out.println("Вы проиграли!");
        }
        char[] symbol = variation.toCharArray();
        for (int i = 2; i < symbol.length; i++) {
            symbol[i] = '-';
        }
        String secret = String.valueOf(symbol);
        System.out.print("Раунд 3\nУгадай слово "+secret+ ": ");
        String answer3 = scan.nextLine();
        if (variation.equals(answer3)) {
            System.out.println("Вы выжили!");
        } else {
            System.out.println("Вы проиграли!");
        }
    }
}






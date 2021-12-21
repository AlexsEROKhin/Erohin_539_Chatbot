package nix.java.education.hangman;

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
    }
}






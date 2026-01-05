import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String word = "pizza";
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for(int i=0; i < word.length(); i++){
            wordState.add('_');
        }

        System.out.println("****************************");
        System.out.println("WELCOME TO THE HANGMAN GAME!");
        System.out.println("****************************");
        System.out.println();

        System.out.print("Word: ");

        for(char c : wordState){
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("Guess a letter: ");
        char guess = s.next().toLowerCase().charAt(0);

        if (word.indexOf(guess) >= 0){
            System.out.println("CORRECT LETTER!");
        }
        else{
            System.out.println("WRONG LETTER!");
        }


        s.close();
    }

    static String getHangmanArt(int wg){

        return switch (wg){
            case 0 -> """
                      
                      """;
            case 1 -> """
                      o
                      """;
            case 2 -> """
                       o
                       |
                      """;
            case 3 -> """
                       o
                      /|
                      """;
            case 4 -> """
                       o
                      /|\\
                      """;
            case 5 -> """
                       o
                      /|\\
                      /
                      """;
            case 6 -> """
                       o
                      /|\\
                      / \\
                      """;
            default -> """
                       
                       """;
        };
    }
}

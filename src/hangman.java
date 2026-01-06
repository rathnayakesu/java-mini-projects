import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String filePath = "src/words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                words.add(line.trim());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Can not find the file.");
        }
        catch (IOException e){
            System.out.println("Something went wrong!");
        }

        Random random = new Random();
        String word;
        if (!words.isEmpty()) {
            word = words.get(random.nextInt(words.size()));
        } else {
            System.out.println("Error: No words found to start the game.");
            return;
        }

        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for(int i=0; i < word.length(); i++){
            wordState.add('_');
        }

        System.out.println("****************************");
        System.out.println("WELCOME TO THE HANGMAN GAME!");
        System.out.println("****************************");
        System.out.println();

        while(wrongGuesses < 6){
            System.out.println(getHangmanArt(wrongGuesses));

            System.out.print("Word: ");

            for(char c : wordState){
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = s.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0){
                System.out.println("CORRECT LETTER!");

                for(int i=0; i < word.length(); i++){
                    if(word.charAt(i) == guess){
                        wordState.set(i, guess);
                    }
                }
                if(!wordState.contains('_')){
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("YOU Win");
                    System.out.println("The Word was "+ word);
                    break;
                }
            }
            else{
                wrongGuesses++;
                System.out.println("WRONG LETTER!");
            }
        }
        if(wrongGuesses >= 6){
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("GAME OVER!");
            System.out.println("The word was "+ word);
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

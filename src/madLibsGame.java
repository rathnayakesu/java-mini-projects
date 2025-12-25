import java.util.Scanner;

public class madLibsGame {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scn.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        noun1 = scn.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = scn.nextLine();
        System.out.print("Enter a verb end with -ing (action): ");
        verb1 = scn.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = scn.nextLine();
    }
}

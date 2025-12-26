import java.util.Scanner;

public class tempConvertor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double temp ;
        double newTemp;
        String  unit;

        System.out.print("Enter the temperature: ");
        temp = scn.nextDouble();

        System.out.print("Convert to celsius or fahrenheit (C or F): ");
        unit = scn.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp-32)* 5/9 : (temp * 5/9) + 32;

        System.out.printf("%.1f°%s", newTemp, unit);
    }
}

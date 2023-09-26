package Collections1;
//Write a java code to read floating values using arraylist and print it using for each loop
import java.util.ArrayList;
import java.util.Scanner;

public class Foth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Float> floatList = new ArrayList<>();

        System.out.print("Enter the number of floating-point values: ");
        int numValues = scanner.nextInt();

        System.out.println("Enter " + numValues + " floating-point values:");

        for (int i = 0; i < numValues; i++) {
            float value = scanner.nextFloat();
            floatList.add(value);
        }

        System.out.println("Printing the values using a for-each loop:");

        for (float value : floatList) {
            System.out.println(value);
        }

        scanner.close();
    }
}
package OYBEK;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// JAVAda arrays

        Scanner scanner = new Scanner(in);

        System.out.print("Array length: ");
        int n = scanner.nextInt();
        int []array = new int[n];
        int max = array[0];

        System.out.print("Element: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

        }

        System.out.print("Array elements: ");
        for (int i : array) {
            System.out.print(i+", "+i);
        }

        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }

        int min = array[0];
        for (int j : array) {
            if (min > j) {
                min = j;
            }
        }
        System.out.println();
        System.out.println("Max "+max);
        System.out.println("Min "+min);
    }
}

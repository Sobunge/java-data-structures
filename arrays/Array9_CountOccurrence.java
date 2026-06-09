import java.util.Scanner;

public class Array9_CountOccurrence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declaring and initializing the array
        int[] numbers = { 10, 20, 30, 20, 40, 50, 20 };

        // Prompting user for the target number to count
        System.out.print("Enter the number to count: ");
        // Declaring the target variable to count
        int target = scanner.nextInt();
        scanner.close();

        // Printing the occurrence results
        System.out.println("The occurrence of " + target + " is: " + countOccurence(numbers, target));

    }

    public static int countOccurence(int[] arr, int target) {
        int count = 0;

        for (int number : arr) {
            if (number == target) {
                count++;
            }
        }
        return count;
    }
}
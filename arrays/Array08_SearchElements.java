import java.util.Scanner;

public class Array08_SearchElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declaring and initializing the array
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Prompting the user to enter a number to search
        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();
        scanner.close();

        // Printing the search result
        System.out.println("The result of the search is: " + searchElement(numbers, target));
    }

    // Creating a method to search for an element in an array
    public static boolean searchElement(int[] arr, int target) {

        for (int number : arr) {
            if (number == target) {
                return true;
            }
        }

        return false;
    }
}

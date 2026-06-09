public class Array06_EvenNumberCount {
    public static void main(String[] args) {

        // Initializing the array with numbers from 1 to 10
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12 };

        // Initializing the variable to count the even numbers
        int evenCount = 0;

        // Looping through the array to count the even numbers
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            }
        }

        // Printing the count of even numbers
        System.out.println("Count of even numbers in the array: " + evenCount);
    }
}

import java.util.Arrays;

public class Array10_ReverseOrder {
    public static void main(String[] args) {

        // Declaring and initializing an array of integers with 10 elements
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Array to hold the reversed order of numbers
        int[] reversedNumbers = new int[10];

        // Reversing the order of the elements in the 'numbers' array and storing them
        // in 'reversedNumbers'
        for (int i = 9; i >= 0; i--) {
            reversedNumbers[9 - i] = numbers[i];
        }

        System.out.println(Arrays.toString(reversedNumbers));

    }
}

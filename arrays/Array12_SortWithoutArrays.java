import java.util.Arrays;

public class Array12_SortWithoutArrays {
  public static void main(String[] args) {

    // Declaring and initializing the array
    int[] numbers = { 3, 2, 1, 10, 11, 12, 16, 20, 100 };

    // Printing the sorted array
    System.out.println("Sorted array from smallest to larest: " + Arrays.toString(sortArrayStoL(numbers)));

  }

  // Sorting the array from smallest to largest
  public static int[] sortArrayStoL(int[] arr) {

    // Swapping the elements from smallest to largest
    for (int j = 0; j < arr.length; j++) {
      for (int i = 1; i < arr.length; i++) {

        if (arr[i] < arr[i - 1]) {
          // Delcaring a temporary variable to hold the first array element
          int temp = arr[i - 1];
          arr[i - 1] = arr[i];
          arr[i] = temp;

        }
      }
    }

    return arr;
  }
}
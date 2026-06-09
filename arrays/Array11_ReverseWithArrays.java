import java.util.Arrays;

public class Array11_ReverseWithArrays {
    
    public static void main(String[] args){

        // Declaring and initializing an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Creating a temp variable
        int temp;

        
        for(int i = 0; i < numbers.length ; i++){
            for(int j = i + 1; j < numbers.length; j++){
                // Swapping the elements
                temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }

        // Printing the reversed array
        System.out.println(Arrays.toString(numbers));
    }
}

public class Array05_SmallestElement {
    public static void main(String[] args){
        
        // Delecaring and initializing an array of integers
        int[] numbers = {5, 2, 9, 1, 5, 6};

        // Assuming the first element is the smallest
        int smallest = numbers[0];

        // Iterating through the array to find the smallest element
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }

        // Printing the smallest element
        System.out.println("The smallest element in the array is: " + smallest);  

    }
}

public class Array07_OddNumberCount {
    public static void main(String[] args){

        // Declaring and initializing an array of integers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Declaring and initializing a variable to count odd numbers
        int countOdd = 0;

        // Looping through the array to count odd numbers
        for(int number : numbers){
            if(number % 2 != 0 ){
                countOdd++;
            }
        }
        
        // Printing the count of odd numbers
        System.out.println("Count of odd numbers in the array: " + countOdd);
    }
}

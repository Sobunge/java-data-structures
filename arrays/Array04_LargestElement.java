public class Array04_LargestElement {
    public static void main(String[] args){
        int[] numbers = {10, 3, 100, 5, 200, 2000, 2, 1};

        //Assume that the first element is the largest
        int largest = numbers[0]; 

        //Loop through the array to find the largest element
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i]; //Update largest if current element is greater
            }
        }

        // Print the largest element
        System.out.println("The largest element in the array is: " + largest);
    }
}

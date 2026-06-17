import java.util.Arrays;

public class Array13_BackSortWithoutArrays {
    public static void main(String[] args){
        //Declaring and initializing the array
        int[] numbers = {3,2,1,10,11,43,22,1,32,1,0};

        //Printing the sorted array
        System.out.println("Sorted array from largest to smallest: " + Arrays.toString(sortArrayLtoS(numbers)));
    }

    public static int[] sortArrayLtoS(int[] arr){

        //Swapping elements to get the largest to smallest
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j< arr.length;j++){
                if(arr[j] > arr[i]){
                    //Declaring the temp value holder
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}

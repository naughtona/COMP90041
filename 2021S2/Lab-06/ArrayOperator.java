import java.util.Scanner;
import java.util.Stack;

public class ArrayOperator {
    private final static int ARRAY_LENGTH = 10;
    private static int[] numbers = new int[ARRAY_LENGTH];
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        while(keyboard.hasNext()) {
            testArrayOperations(keyboard);
            keyboard.nextLine();
            System.out.println();
        }

        keyboard.close();
    }

    private static void testArrayOperations(Scanner keyboard) {
        // Read in the array from keyboard, then display it.
        readArray(keyboard, numbers); display(numbers);

        // Get and print maximum value of an array.
        System.out.println("Max value is: " + getMax(numbers));
        // Get and print the sum of all elements in an array.
        System.out.println("Sum is: " + getSum(numbers));

        // Sort array elements in descending order, then display it.
        quickSortDesc(numbers); display(numbers);

        // Find and print the element with the largest number of appearances.
        // If there is a tie then return the smaller element.
        System.out.println("Most frequent value is: " + getMostFrequent(numbers));
    }
    
    private static void readArray(Scanner keyboard, int[] array) {
        System.out.print("Enter 10 integers: ");
        for(int i = 0; i < array.length; ++i)
            array[i] = keyboard.nextInt();
    }
    
    private static void display(int[] array) {
        System.out.print("Array: ");
        for(int elem : array)
            System.out.print(elem + " ");
        System.out.println();
    }
    
    private static int getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for(int elem : array)
            if(elem > max)
                max = elem;
        return max;     
    }

    private static int getMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int elem : array)
            if(elem < min)
                min = elem;
        return min;
    }
    
    private static int getSum(int[] array) {
        int sum = 0;
        for(int elem : array)
            sum += elem;
        return sum;
    }
    
    /**
     * QuickSort implementation using stack.
     * Reverse sort an array. Sorts the array in place.
     */
    public static void quickSortDesc(int[] array) {
        Stack<Integer[]> stack = new Stack<>();
        stack.push(new Integer[] {0, array.length});

        while(!stack.empty()) {
            Integer[] node = stack.pop();
            int pivot = node[0], storeIndex = pivot+1, l = pivot, r = node[1];
            for(int i = pivot+1; i < r; ++i)
                if(array[i] >= array[pivot])
                    swap(i, storeIndex++, array);
            swap(pivot, storeIndex-1, array);

            if(storeIndex - l > 1)
                stack.push(new Integer[] {l, storeIndex-1});
            if(r - storeIndex > 1)
                stack.push(new Integer[] {storeIndex, r});
        }
    }
    
    /*
     * Alternative sorting approach - built-ins!
     * Reverse sort an array. Sorts the array in place.
     */
    private static void sortArrayDescendingly(int[] array) {
        // convert to Integer array
        Integer[] objectArray = new Integer[ARRAY_LENGTH];
        for(int i = 0; i < objectArray.length; i++)
            objectArray[i] = Integer.valueOf(array[i]);
        // sort in Reverse
        Arrays.sort(objectArray, Collections.reverseOrder());
        // convert back to int array
        for(int i = 0; i < array.length; i++)
            array[i] = objectArray[i].intValue();
    }

    private static void swap(int i, int j, int[] array) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    
    private static int getMostFrequent(int[] array) {
        int min = getMin(array);
        int max = getMax(array);

        int[] freqs = new int[max - min + 1];
        for(int i = 0; i < ARRAY_LENGTH; ++i)
            freqs[array[i] - min] += 1;
        
        return min + indexOfMax(freqs);
    }

    private static int indexOfMax(int[] array) {
        int imax = 0;
        for(int i = 1; i < array.length; ++i)
            if(array[i] > array[imax])
                imax = i;
        return imax;
    }
    
}

/*
 * EXAMPLE INPUT FILE ("in")
 * 1 9 2 8 3 7 4 6 3 1
 * 4 9 2 8 3 4 4 6 1 2
 * 
 * EXAMPLE USE
 * javac ArrayOperator.java && java ArrayOperator < in
 *
 */

public class Main {
    public static void main(String[] args) {
        // Bubble sort is O(n^2)
        // it compares each element in the list with the next element.
        // if the current element is greater than the next element, it swaps them.
        // this process is repeated until the list is sorted.
        // it's suitable for small lists(specially unordered/unsorted data).

        // inefficient for large lists or when frequent sorting is required.
        // used where simplicity is more important than efficiency.
        // it's a stable sorting algorithm (it preserves the order of equal elements).


        // Initialize an array with unordered data
        int[] dataList = {23, 54, 28, 6, 86, 22, 55};

        // Print the data before performing Bubble sort
        System.out.print("Before Bubble sort : ");
        for (int num : dataList) {
            System.out.print(num + " ");
        }

        // Perform Bubble sort by passing the data list
        performBubbleSort(dataList);

        // Display a new line before printing the sorted data
        System.out.println("\n");

        // Print the data after Bubble sort
        System.out.print("After Bubble sort  : ");
        for (int num : dataList) {
            System.out.print(num + " ");
        }
    }

    // Method to perform Bubble sort on an array
    public static void performBubbleSort(int[] dataList) {
        int size = dataList.length;   // Get the size of the data list
        int temp;   // Temporary variable to hold the value of the current element

        // Outer loop to iterate through each element in the array
        for (int i = 0; i < size; i++) {
            // Inner loop to compare and swap elements based on Bubble sort logic
            // (size - i - 1) is used to avoid unnecessary comparisons, it's the number of elements that are already sorted
            // after each pass, the largest element will be at the end of the array
            for (int j = 0; j < size - i - 1; j++) {
                if (dataList[j] > dataList[j + 1]) {
                    // Swap the elements if they are in the wrong order( if [j] > [j+1] )
                    temp = dataList[j];
                    dataList[j] = dataList[j + 1];
                    dataList[j + 1] = temp;
                }
            }

            // Display the current state of the array after each pass (for demonstration purpose only)
            System.out.println("\n");
            for (int num : dataList) {
                System.out.print(num + " ");
            }
        }
    }
}

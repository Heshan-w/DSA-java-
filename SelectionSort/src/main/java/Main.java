public class Main {
    public static void main(String[] args) {
        // Selection sort is an O(n^2) sorting algorithm.
        // It divides the list into two parts: sorted and unsorted.
        // It finds the smallest element in the unsorted part and swaps it with the first element in the unsorted part.
        // This process is repeated until the entire list is sorted.
        // It's suitable for small lists, especially unordered data.

        // Inefficient for large lists or when frequent sorting is required.
        // Used where simplicity is more important than efficiency.
        // It's not a stable sorting algorithm (it doesn't preserve the order of equal elements).

        int[] dataList = {3, 53, 5, 12, 7, 34, 76, 102};    // Initialize an array with unordered data

        // Print the data before performing selection sort
        System.out.print("Before Selection sort: ");
        for (int num : dataList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Perform selection sort by passing the data list
        performSelectionSort(dataList);

        // Print the data after selection sort
        System.out.println("\n");
        System.out.print("After Selection sort : ");
        for (int num : dataList) {
            System.out.print(num + " ");
        }
    }

    // Method to perform selection sort on an array
    public static void performSelectionSort(int[] dataList) {
        int size = dataList.length; // Get the size of the data list
        int temp;   // Temporary variable to hold the value of the current element
        int minIndex;   // Variable to hold the index of the smallest element in the unsorted part

        // Outer loop to iterate through each element in the array
        for (int i = 0; i < size - 1; i++) {
            minIndex = i;

            // Inner loop to find the index of the smallest element in the unsorted part
            for (int j = i + 1; j < size; j++) {
                if (dataList[minIndex] > dataList[j]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element in the unsorted part
            temp = dataList[minIndex];
            dataList[minIndex] = dataList[i];
            dataList[i] = temp;

            // Display the current state of the array after each pass (optional)
            System.out.println("\nAfter Pass " + (i + 1) + ": ");
            for (int num : dataList) {
                System.out.print(num + " ");
            }
        }
    }
}

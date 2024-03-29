public class Main {
    public static void main(String[] args) {
        // Quick sort is O(n log n)
        // it's a divide and conquer algorithm.
        // it picks an element as a pivot and partitions the given array around the picked pivot.
        // it's a recursive algorithm.
        // it's not a stable sorting algorithm (it doesn't preserve the order of equal elements).

        // it's efficient for large lists and for data that is in RAM (not on disk).

        // it's not efficient for small lists.


        // Initialize an array with unordered data
        int[] dataList = {23, 54, 28, 6, 86, 22, 55};

        // Print the data before performing Quick sort
        System.out.print("Before Quick sort : ");
        for (int num : dataList) {
            System.out.print(num + " ");
        }

        // Perform Quick sort by passing the data list
        performQuickSort(dataList, 0, dataList.length - 1);

        // Print the data after Quick sort
        System.out.println("\n");
        System.out.print("After Quick sort  : ");
        for (int num : dataList) {
            System.out.print(num + " ");
        }
    }

    private static void performQuickSort(int[] dataList, int low, int high) {
        if (low < high) {
            // Select the pivot element
            int pivot = dataList[high];

            // Initialize the index to compare with the previous elements
            int i = low - 1;

            // Loop through the array
            for (int j = low; j < high; j++) {
                // If the current element is smaller than the pivot
                if (dataList[j] < pivot) {
                    i++;  // Increment the index
                    // Swap the current element with the element at the index
                    int temp = dataList[i];
                    dataList[i] = dataList[j];
                    dataList[j] = temp;
                }
            }

            // Swap the pivot element with the element at the index
            int temp = dataList[i + 1];
            dataList[i + 1] = dataList[high];
            dataList[high] = temp;

            // Perform Quick sort recursively on the left and right sub-arrays
            // with the pivot element as the partitioning element
            // (all the elements to the left of the pivot element are smaller than the pivot element
            performQuickSort(dataList, low, i);
            performQuickSort(dataList, i + 2, high);
        }
    }
}

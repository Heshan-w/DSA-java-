public class Main {
    public static void main(String[] args) {
        // merge sort is O(n log n)
        // it's a divide and conquer algorithm.
        // it divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves.
        // it's a recursive algorithm.
        // it's a stable sorting algorithm (it preserves the order of equal elements).

        // it's efficient for large lists and for data that is in RAM (not on disk).
        // it's not efficient for small lists, linked lists.

        int[] dataList = {23, 54, 28, 6, 86, 22, 55}; // unordered data

        System.out.print("Before Merge sort : "); // Print the data before performing Merge sort
        for (int num : dataList) {
            System.out.print(num + " ");
        }

        // Perform Merge sort by passing the data list
        performMergeSort(dataList, 0, dataList.length - 1);

        System.out.println("\n");
        System.out.print("After Merge sort  : "); // Print the data after Merge sort
        for (int num : dataList) {
            System.out.print(num + " ");
        }



    }

    private static void performMergeSort(int[] dataList, int i, int i1) {

    }
}

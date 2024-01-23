public class Main {
    public static void main(String[] args) {
        // Quick sort is O(n log n)
        // it's a divide and conquer algorithm.
        // it picks an element as a pivot and partitions the given array around the picked pivot.
        // it's a recursive algorithm.
        // it's not a stable sorting algorithm (it doesn't preserve the order of equal elements).
        // it's an in-place sorting algorithm (it doesn't require extra space).

        // it's efficient for large lists.
        // it's efficient for data that is in RAM (not on disk).
        // it's efficient for data that is in cache (not in RAM).
        // it's efficient for data that is in registers (not in cache).
        // it's efficient for data that is in the CPU (not in registers).

        // it's not efficient for small lists.
        // it's not efficient for data that is on disk (not in RAM).
        // it's not efficient for data that is in RAM (not in cache).
        // it's not efficient for data that is in cache (not in registers).
        // it's not efficient for data that is in registers (not in the CPU).

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

    private static void performQuickSort(int[] dataList, int i, int i1) {

    }
}

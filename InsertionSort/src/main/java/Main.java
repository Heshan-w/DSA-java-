public class Main {
    public static void main(String[] args) {
        int[] dataList = { 12, 11, 13, 5, 6 };  // Initialize an array with unordered data

        System.out.print("Before running array through insertion sort : "); // Print the data before performing insertion sort
        for (int num : dataList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Insertion Sort Algorithm
        for (int i = 1; i < dataList.length; i++) {
            int key = dataList[i];  // Select the current element to be inserted at the correct position
            int j = i - 1;           // Initialize the index to compare with the previous elements

            // Move elements greater than the key to the right
            // until finding the correct position for the key
            while (j >= 0 && dataList[j] > key) {
                // Shift the elements to the right
                dataList[j + 1] = dataList[j];
                // Decrement the index to compare with the previous elements
                j--;
            }

            dataList[j + 1] = key;  // Place the key at its correct position in the sorted part
        }

        System.out.print("After running array through insertion sort  : ");
        for (int num : dataList) {
            System.out.print(num + " ");
        }
    }
}

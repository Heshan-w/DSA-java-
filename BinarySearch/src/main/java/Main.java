public class Main {
    public static void main(String[] args) {
        // binary search is O(log n).
        // can only be run on sorted data.
        // binary search is highly efficient. Suitable for large lists(exclusively ordered/sorted data).

        // it Compares the target value to the middle element of the list,
        // -if a match is found, it returns the index of that element,
        // -if target value is greater than middle element, then target element is on the right side of the list,
        // -if target value is less than middle element, then target element is on the left side of the list.
        // repeat the process until target element is found or until start index is less than or equal to end index.


        int[] dataList = {3, 17, 26, 33, 40, 64, 67, 90}; // sorted data
        int target = 67; // target value to be found

        int searchResult = performBinarySearch(dataList, target);  // perform binary search by passing data list and target value

        if (searchResult != -1) {  // if search result is not -1, then target element is found
            System.out.println("Target element(" + target + ") FOUND at list index " + searchResult);
        } else {
            System.out.println("Target element(" + target + ") NOT FOUND");
        }
    }

    public static int performBinarySearch(int[] dataList, int target) {
        int start = 0;  // start index of the list
        int end = dataList.length - 1;  // end index of the list
        int middle;  // middle index of the list

        while(start <= end) {  // loop while start index is less than or equal to end index
            middle = (start + end) / 2;  // calculate middle index
            if (dataList[middle] == target) {  // if target element is found, return the index of that element
                return middle;
            } else if (dataList[middle] < target) {  // if target element is greater than middle element, then target element is on the right side of the list
                start = middle + 1;
            } else {  // if target element is less than middle element, then target element is on the left side of the list
                end = middle - 1;
            }
        }

        return -1;  // if target element is not found, return -1
    }
}

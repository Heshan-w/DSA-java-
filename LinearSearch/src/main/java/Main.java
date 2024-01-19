public class Main {
    public static void main(String[] args) {
        // linear search is O(n)
        // it Compares each element in the list with the value to be found (target value),
        // if a match is found, it returns the index of that element.

        // suitable for small lists(specially unordered/unsorted data).
        // inefficient for large lists or when frequent searches are required.
        // used where simplicity is more important than efficiency.


        int[] dataList = {23, 53, 2, 56, 62, 64, 67, 90}; // unordered data
        int target = 21; // target value to be found

        int searchResult = performLinearSearch(dataList, target); // perform linear search by passing data list and target value

        if (searchResult != -1) {  // if search result is not -1, then target element is found
            System.out.println("Target element(" + target + ") FOUND at list index " + searchResult);
        } else {
            System.out.println("Target element(" + target + ") NOT FOUND");
        }
    }

    public static int performLinearSearch(int[] dataList, int target) {
        for(int i = 0; i < dataList.length; i++) {  // loop through each element in the list
            if (dataList[i] == target) {  // if target element is found, return the index of that element
                return i;
            }
        }

        return -1;  // if target element is not found, return -1
    }
}

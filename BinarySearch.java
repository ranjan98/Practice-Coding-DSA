public class BinarySearch{
    // Binary Search
    public static int binarySearch(int arr[], int num){
        // Handling empty array case
        if(arr.length == 0)
            return -1;
        // When num is higher than last element
        if(arr[arr.length-1] < num)
            return -1;
        // main logic for binary search starts here
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = ((low+high)/2);
            if(arr[mid] == num)
                return mid;
            else if(arr[mid]<num)
                low = mid + 1;
            else if(arr[mid] > num)
                high = mid - 1;
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = new int[]{1, 3, 42, 50, 84, 93};
        int position = binarySearch(arr, 42);
        System.out.println(position);
    }
}

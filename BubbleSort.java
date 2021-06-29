public class BubbleSort{
    // Bubble Sort
    public static int[] bubbleSort(int arr[]){
        int len = arr.length;
        for(int i=0; i<len; i++){
            for(int j=0; j<len-1; j++){
                // Compare and swap
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    
    // Printing Array
    public static void print(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = new int[]{99, 22, 45, 1, 66, 93, 88, 10, 39, 22};
        int sortedArr[] = bubbleSort(arr);
        print(sortedArr);
    }
}

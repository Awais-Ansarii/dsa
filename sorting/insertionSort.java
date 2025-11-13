package sorting;

public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {4,5,1,3,2};
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println("");
        insertionSortCode(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

     public static void insertionSortCode(int arr[]){
        int n = arr.length;
        
        if(n <= 1){
            return;
        }
        for(int i=1; i<n; i++){
            int key = arr[i];
            
            int j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}

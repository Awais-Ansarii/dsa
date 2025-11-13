package sorting;

public class bubbleSort {

    public static void main(String[] args) {
        int arr[] = {4,5,1,3,2};
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println("");
        bblSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void bblSort(int arr[]){
         int n =arr.length;
         //outer loop;
         for(int i=0; i<n-1; i++){
             boolean isSwapped = false; // flag to check swap
             //inner loop
             for(int j=0; j< n-i-1; j++){
                 if(arr[j]> arr[j+1]){
                     //swap
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                     isSwapped = true;
                 }
             }
             
             
            //  no swap means already sorted
             if(!isSwapped) {
                 break;
             }
         }
     }
    
    
}

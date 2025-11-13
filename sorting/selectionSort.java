package sorting;

public class selectionSort {
 public static void main(String[] args) {
        int arr[] = {4,5,1,3,2};
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println("");
        selectionSortCode(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

        public static void selectionSortCode(int arr[])
   {
       for (int i=0; i<arr.length - 1; i++){
           int minIndex = i; //assume for now
           
           //find smallest element of arr
           for(int j= i+1; j<arr.length; j++){
               
               if(arr[j]<arr[minIndex]){
                   minIndex = j;
               }
           }
           //swap
           // only swap when needed
           if(minIndex != i){
               
           int temp = arr[i];
           arr[i] = arr[minIndex];
           arr[minIndex] = temp;
           
           }
           
           
           
           
           
           
       }
   }
}
    
    
     
   
    


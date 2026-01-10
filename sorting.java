import java.util.*;
public class sorting{
    public static void bubbleSort(int arr[]){
        for(int i=0;i<=arr.length-2;i++){
            int swap=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
                
                
            }
            if(swap==0){
                    System.out.println("Array is already sorted");
                    break;
                }
            
        }
        
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void countingsorting(int arr[]){
        int max=Math.MIN_VALUE;
        int count=0;
        for(int i=0;i<arr.length;i+){
            
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        bubbleSort(arr);
        printArr(arr);
    }
}
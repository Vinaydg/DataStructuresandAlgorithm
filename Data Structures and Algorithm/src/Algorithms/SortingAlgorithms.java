package Algorithms;

public class SortingAlgorithms {
    static void BubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < n ; i++){
            boolean noSwap = true;
            for(int j = 0; j < n - 1 ; j++){
                if (arr[j + 1] < arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    noSwap = false;
                }
            }
            if (noSwap){
                return;
            }
        }
    }

    static void 

    public static void main(String[] args) {
        int[] arr = {5,8,1,3,2,0,-2};
        System.out.printf("Array Before Sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        BubbleSort(arr);
        System.out.printf("Array After Sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}



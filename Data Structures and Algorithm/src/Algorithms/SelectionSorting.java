package Algorithms;

public class SelectionSorting {
    static void SelectionSort(int[] arr){
        int n = arr.length;
        int min = 0;
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            min = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,-1,10,2,48,152,76,5,45};

        System.out.print("Array Before Sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        SelectionSort(arr);

        System.out.print("Array After Sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

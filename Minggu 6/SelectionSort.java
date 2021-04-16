package latihan;

public class SelectionSort {
    static void selectionSort(int [] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {            
            int index = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[index])
                    index = j;
            // Swap element
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {7, 2, 12, 8, 3};
        
        System.out.println("==ALGORITMA SELECTION SORT==");
        System.out.println("Array Before Selection Sort");
        for (int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();

        selectionSort(arr); //sorting array elements using bubble sort

        System.out.println("Array After Selection Sort");
        for (int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
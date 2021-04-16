package latihan;

public class BubbleSortDescending {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < (n - 1); i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.println("A : " + arr[j + 1] + " > " + "B : " + arr[j]);
                if (arr[j + 1] > arr[j]) {
                //swap elements
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;    
                }
            }
        }
    }
            
    public static void main(String[] args) {
        int arr[] = {7, 2, 12, 8, 3};
        
        System.out.println("==ALGORITMA BUBBLE SORT==");
        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr); //sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }    
}


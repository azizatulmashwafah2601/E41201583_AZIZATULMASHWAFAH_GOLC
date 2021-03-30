package tugas1;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        int max, min, rata, array[];
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan banyaknya data nilai = ");
        int data = scan.nextInt();
        
        array = new int[data];
        
        for(int i = 0; i < data; i++) {
            System.out.print("Masukkan data nilai ke-" + (i+1) + " = ");
            array[i] = scan.nextInt();
        }
        
        min = array[0];
        max = array[0];        
        for(int j = 0; j < array.length; j++) {
            if(array[j] > max) {
                max = array[j];
            }
            else if(array[j] < min) {
                min = array[j];
            }
        }
        
        System.out.println("Nilai minimum = " + min);
        System.out.println("Nilai maximum = " + max);
        
        int hasil = 0;
        for(int k=0; k<array.length; k++) {
            hasil = hasil + array[k];
        }
        
        rata = hasil / array.length;
        System.out.println("Nilai rata-ratanya adalah = " + rata);        
    }
}

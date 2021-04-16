package latihan;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int angka;
        System.out.println("===ALGORITMA BINARY SEARCH===");
        System.out.println();
        System.out.println("Data array :");
        boolean nilai = true;
        int[] data = {23, 24, 25, 26, 27, 28, 29, 30};
        
        for (int i = 0; i < data.length; i++) {
             System.out.print(data[i] + " ");
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("\nMasukan angka yang ingin dicari = ");
        angka = scan.nextInt();
        
        int awal = data.length - 1;
        int akhir = 0;
        
        while (nilai)
        {
            int posisiSekarang = (awal + akhir) / 2;
            if (data[posisiSekarang] == angka) {
                nilai = false;
                System.out.println("Angka " + angka + " ditemukan" );
            }
            else if (akhir > awal) {
            System.out.println("Angka " + angka + " tidak ditemukan");
            break;
            }
            else {                
                if (data[posisiSekarang] < angka) {
                    akhir = posisiSekarang + 1;
                }
                else {
                    awal = posisiSekarang - 1;
                }
            }
        }
    }
}

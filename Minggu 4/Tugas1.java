package tugas1;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        System.out.print("Masukkan batas awal bilangan : ");
        int awal = new Scanner(System.in).nextInt();
        
        System.out.print("Masukkan batas akhir bilangan : ");
        int akhir = new Scanner(System.in).nextInt();
        
        System.out.print("Deret Bilangan Genap ");
        for(int i = awal; i <= akhir; i++) {
            if (i%2==0)
            System.out.print(i + " ");
        }
        System.out.println("");
    }    
}

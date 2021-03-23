package tugas1;
import java.util.Scanner;
import java.util.Random;

public class Tugas2 {
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah angka yang anda inginkan : ");
        int jumlahderet = new Scanner(System.in).nextInt();
 
        Random array = new Random();
        int hasilakhir;
        
        for ( int i = 0; i< jumlahderet ; i++ ){
            hasilakhir = array.nextInt(20);
            System.out.print(hasilakhir);            
            System.out.print(" ");
        }  
    }
}


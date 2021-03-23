package tugas1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class Tugas4 {
    private static ArrayList<Integer> HargaBarang = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Scanner nama = new Scanner(System.in);
        Scanner angka = new Scanner(System.in);
        
        System.out.println("--------------------------------------------------");
        System.out.println("           Kharisma Agung Plaza < KAP >           ");
        System.out.println("             Promo Belanja Berhadiah              ");
        System.out.println("        Khusus Pembelian 5 Barang Pertama         ");
        System.out.println("        Dengan harga minimum Rp 10000,00          ");
        System.out.println("--------------------------------------------------");
        
        System.out.print("Masukkan nama pembeli : ");
        String namapembeli = nama.nextLine();
        System.out.println("");
        
        for (int x = 0; x < 5; x++) {
            System.out.printf("Masukkan harga barang ke-%d\t: ", x + 1);
            int hrgaitem = angka.nextInt();
            HargaBarang.add(hrgaitem);
        }
        
        int TotalHarga = HargaBarang.stream().mapToInt(num -> num).sum();
        
        System.out.println("Total harga pembelian atas nama " +namapembeli+ " adalah Rp " +TotalHarga);
        
        if (Bonus()) {
            System.out.print("\n\nSelamat...\n");
            System.out.println("Anda mendapat hadiah 1 mug cantik      ");
            System.out.println("----------------------------------------------");
            System.out.println("                   Terima Kasih               ");
            System.out.println("  Anda sudah belanja di Kharisma Agung Plaza  ");
        } else {
            System.out.println("----------------------------------------------");
            System.out.println("                   Terima Kasih               ");
            System.out.println("  Anda sudah belanja di Kharisma Agung Plaza  ");
        }
    }
    static boolean Bonus() {
        boolean Bonusmu = true;

        for (int price : HargaBarang) {
            if (price < 10000) {
                Bonusmu = false;
                break;
            }
        }
        return Bonusmu;
    }
}

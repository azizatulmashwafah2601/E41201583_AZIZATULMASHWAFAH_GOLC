package tugas1;
import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        String nama;
        String menu;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("----------------------");
        System.out.println("      CAFE CERIA      ");
        System.out.println("    ANEKA MINUMAN     ");
        System.out.println("----------------------");
        System.out.println("    SPECIAL MENU      ");
        System.out.println("   1. Soft Drinks     ");
        System.out.println("   2. Mix Juice       ");
        System.out.println("   3. Nescafe         ");
        System.out.println("   4. Soda Milk       ");
        System.out.println("   5. Tea             ");
        System.out.println("----------------------");
        
        System.out.print("Masukkan nama pembeli : ");
        nama = scan.nextLine();
        
        System.out.print("Silahkan masukkan pilihan anda : ");
        menu = scan.nextLine();
        
        switch (menu) {
            case "1":
                System.out.println("Minuman yang anda pesan adalah Soft Drinks");
                break;
            case "2":
                System.out.println("Minuman yang anda pesan adalah Mix Juice");
                break;
            case "3":
                System.out.println("Minuman yang anda pesan adalah nescafe");
                break;
            case "4":
                System.out.println("Minuman yang anda pesan adalah Soda Milk");
                break;
            case "5":
                System.out.println("Minuman yang anda pesan adalah Tea");
                break;
            default:
                System.out.println("Mohon maaf pilihan menu salah");        
        }
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima Kasih " + nama + " telah berkunjung di Cafe Ceria");
    }
}

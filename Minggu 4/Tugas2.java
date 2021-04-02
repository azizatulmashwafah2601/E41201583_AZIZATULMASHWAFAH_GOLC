package tugas1;

public class Tugas2 {
    public static void main(String[] args) {
        System.out.println("           Do__While          ");
        System.out.println(" Bilangan perkalian 2 (0-100) ");
        System.out.println("==============================");
        
        int i = 2;
        int j = 2;
        
        do {
            System.out.print("   " + i);
            i*=2;
        } while (i <= 100);
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("           Do__While          ");
        System.out.println(" Bilangan kelipatan 2 (0-100) ");
        System.out.println("==============================");
        
        do {
            System.out.print(j + " ");
            j+=2;
        } while (j <= 100);
        System.out.println("");
    }
}

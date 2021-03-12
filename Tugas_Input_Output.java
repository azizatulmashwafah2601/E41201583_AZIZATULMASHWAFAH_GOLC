/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_input_output;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Tugas_Input_Output {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        String nim;
        int usia;
        double ratanilai;
        
        //membuat scanner baru
        Scanner coba = new Scanner(System.in);
        
        System.out.println("+++++++++++++++++++++++");
        System.out.println("Masukkan Data Diri Anda");
        System.out.println("+++++++++++++++++++++++");
        
        System.out.print ("Nama : ");
        nama = coba.nextLine();
        System.out.println("Nama : "+ nama);
        
        System.out.print ("NIM : ");
        nim = coba.nextLine();
        System.out.println("NIM : "+ nim);
        
        System.out.print ("Usia : ");
        usia = coba.nextInt();
        System.out.println("Usia :"+ usia);
        
        System.out.print ("Rata - rata Nilai : ");
        ratanilai = coba.nextDouble();
        System.out.println("Rata - rata Nilai : "+ ratanilai);
    }
    
}

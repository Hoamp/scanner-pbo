/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class biodata {
    public static void main(String[] args) {
        String nama,umur,alamat,notlp;
        
        Scanner masukkan = new Scanner(System.in);
        
        System.out.println("Masukkan nama : ");
        nama = masukkan.nextLine();
        
        System.out.println("Masukkan umur : ");
        umur = masukkan.nextLine();
        
        System.out.println("Masukkan alamat : ");
        alamat = masukkan.nextLine();
        
        System.out.println("Masukkan nomor telepon : ");
        notlp = masukkan.nextLine();
        
        System.out.println("\nBiodata anda");
        System.out.println("Nama anda = " + nama);
        System.out.println("Umur anda = " + umur);
        System.out.println("Alamat anda = " + alamat);
        System.out.println("Nomor telepon anda = " + notlp);
    }
}

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
public class persegiPanjang {
    public static void main(String[] args) {
        System.out.println("Menghitung luas dari bangun datar persegi panjang");
        Scanner masukkan = new Scanner(System.in);
        
        System.out.println("Masukkan nilai panjang : ");
            int panjang = masukkan.nextInt();
        System.out.println("Masukkan nilai lebar : ");
            int lebar = masukkan.nextInt();
            
        float luas = panjang * lebar;
        float keliling = 2 * (panjang + lebar);
        
        System.out.println("Luasnya adalah : " + luas);
        System.out.println("Kelilingnya adalah : " + keliling);
    }
}

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
public class segitiga {
    public static void main(String[] args) {
        System.out.println("Menghitung luas dari bangun datar segitiga");
//        float setengah = (float)0.5;
        Scanner masukkan = new Scanner(System.in);
        System.out.println("Masukkan nilai alas : ");
            int alas = masukkan.nextInt();
        System.out.println("Masukkan nilai tinggi : ");
            int tinggi = masukkan.nextInt();
            
        float luas = alas * tinggi * (float)0.5;
        float keliling = alas * 3;
        
        System.out.println("Luasnya adalah : " + luas);
        System.out.println("Kelilingnya adalah : " + keliling);
        
    }
}

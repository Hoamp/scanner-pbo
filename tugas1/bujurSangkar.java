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
public class bujurSangkar {
    public static void main(String[] args) {
        System.out.println("Menghitung luas dari bangun datar bujur sangkar");
        Scanner masukkan = new Scanner(System.in);
        
        System.out.println("Masukkan nilai sisi : ");
            int sisi = masukkan.nextInt();
            
        float luas = sisi * sisi;
        float keliling = sisi * 4;
        
        System.out.println("Luasnya adalah : " + luas);
        System.out.println("Keliling adalah : " + keliling);
        
    }
}

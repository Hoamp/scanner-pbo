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
public class lingkaran {
    public static void main(String[] args) {
        double phi,diameter,jari_jari,luas,keliling;
        Scanner masukkan = new Scanner(System.in);
        
        phi = 3.14;
        
        System.out.println("masukkan diameternya");
            diameter = masukkan.nextInt();
            jari_jari = diameter / 2;
            
            
        keliling = diameter * phi;
        luas = phi * jari_jari * jari_jari;
        System.out.println("Luasnya adalah : " + luas);
        System.out.println("Keliling adalah : " + keliling);
    }
}

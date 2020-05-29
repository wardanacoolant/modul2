package modul2;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import javax.swing.JOptionPane;

public class luasSegitiga {
    public static void main(String[]args){ 
        int a = 0;
        int t = 0; 
        double l = 0;
        try{
            BufferedReader baca = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("PROGRAM PENGHITUNG LUAS SEGITIGA");
            System.out.print("Masukkan panjang alas segitiga: "); 
            a = Integer.parseInt(baca.readLine()); 
            System.out.print("Masukkan tinggi segitiga: ");
            t = Integer.parseInt(baca.readLine());
            l = 0.5*a*t;
        }
        catch(IOException i){
            JOptionPane.showMessageDialog(null,l);
        }
        System.out.println("Jadi, luas segitiga dengan panjang alas " + a + " dan tinggi " + t + " adalah " +l);
    }
}

package modul2;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[]args){
        Scanner br = new Scanner (System.in);
        String nama;
        System.out.print("Masukan nama Anda: "); 
        nama = br.nextLine();
        System.out.println("Nama Anda adalah " + nama);
    }
}

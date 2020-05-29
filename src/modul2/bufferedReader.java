package modul2;

import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException;

public class bufferedReader {
    public static void main (String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nama; 
        int nim;
        try{
            System.out.print("Masukkan nama Anda: ");
            nama = br.readLine();
            System.out.print("Masukkan NIM Anda : ");
            nim = Integer.parseInt(br.readLine()); 
            System.out.println("---------------------------------------");
            System.out.println("Nama Anda adalah " + nama);
            System.out.println("NIM Anda adalah " + nim);
        }
        catch(IOException error){
            System.out.println(error);
        }
    }
}

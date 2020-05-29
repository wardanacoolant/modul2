package modul2;

import java.util.Scanner;

public class penentuGenapGanjil {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        System.out.printf("Inputkan sebuah bilangan : "); 
        int bilangan=s.nextInt();
        if (bilangan % 2 == 1) {
            System.out.println("Bilangan "+bilangan+" adalah bilangan ganjil.");
        }
        else
        System.out.println("Bilangan "+bilangan+" adalah bilangan genap.");
    }
}

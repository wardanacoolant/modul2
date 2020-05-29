package modul2;

import javax.swing.JOptionPane;

public class jOptionPane {
    public static void main(String[] args){
        String nama;
        nama = JOptionPane.showInputDialog("Masukkan nama Anda: ");
        JOptionPane.showMessageDialog(null, "Halo, " + nama + "!");
    }
}

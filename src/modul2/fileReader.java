package modul2;

import java.io.BufferedReader;
import java.io.FileNotFoundException; 
import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) {
        String lokasi_file = "C:/Users/USER/Documents/NetBeansProjects/Modul2/src/modul2/data.txt";
        try {
            FileReader fr = new FileReader(lokasi_file); 
            BufferedReader br = new BufferedReader(fr);
            String text;
            while ((text = br.readLine()) != null) System.out.println(text);
        }
        catch (FileNotFoundException fnfe) { 
            fnfe.getMessage();
        }
        catch (IOException ioe) { ioe.getMessage();
        }
    }
}

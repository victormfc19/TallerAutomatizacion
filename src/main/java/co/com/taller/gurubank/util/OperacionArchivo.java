package co.com.taller.gurubank.util;

import java.io.*;
import java.util.Scanner;

public class OperacionArchivo {

    public static void crearArchivo(String textToSave) {
        FileWriter flwriter = null;
        try {
            flwriter = new FileWriter("C:\\Users\\EQ01\\Desktop\\info.txt");
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            bfwriter.write(textToSave);
            bfwriter.close();
            System.out.println("Archivo creado satisfactoriamente..");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (flwriter != null) {
                try {
                    flwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String leerArchivo() {
        File file = new File(System.getProperty("user.home") + "/Desktop"+"/info.txt");
        String textToRead = null;
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                delimitar.useDelimiter("\\s*,\\s*");
                textToRead = delimitar.next();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return textToRead;
    }

}

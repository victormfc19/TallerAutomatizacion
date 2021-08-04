package co.com.taller.gurubank.util;

import java.io.*;
import java.util.Scanner;

public class OperacionArchivo {

    public static void crearArchivo(String customer_id) {
        FileWriter flwriter = null;
        try {
            //crea el flujo para escribir en el archivo
            flwriter = new FileWriter("C:\\Users\\EQ01\\Desktop\\info.txt");
            //crea un buffer o flujo intermedio antes de escribir directamente en el archivo
            BufferedWriter bfwriter = new BufferedWriter(flwriter);

            //escribe los datos en el archivo
            bfwriter.write(customer_id);

            //cierra el buffer intermedio
            bfwriter.close();
            System.out.println("Archivo creado satisfactoriamente..");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (flwriter != null) {
                try {//cierra el flujo principal
                    flwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String leerArchivo() {
        // crea el flujo para leer desde el archivo
        File file = new File("C:\\Users\\EQ01\\Desktop\\info.txt");
        String customer_id = null;
        Scanner scanner;
        try {
            //se pasa el flujo al objeto scanner
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                // el objeto scanner lee linea a linea desde el archivo
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                //se usa una expresión regular
                //que valida que antes o despues de una coma (,) exista cualquier cosa
                //parte la cadena recibida cada vez que encuentre una coma
                delimitar.useDelimiter("\\s*,\\s*");
                customer_id = delimitar.next();
            }
            //se cierra el ojeto scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return customer_id;
    }

}

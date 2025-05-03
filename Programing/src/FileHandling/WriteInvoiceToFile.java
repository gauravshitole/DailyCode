package FileHandling;

import java.io.*;
import java.time.LocalDate;

public class WriteInvoiceToFile {

    public static void main(String[] args) {
        LocalDate actualDate = LocalDate.of(2025, 2, 25);
        LocalDate MatureDate = LocalDate.of(2025, 5, 5);


        Invoice invoice = new Invoice(1, "Milk", 5000, actualDate, MatureDate);
        String filename = "invoic.txt";
        try {
            FileOutputStream fileOutputStream =new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(invoice);


        } catch (Exception e)
        {
            System.out.println( e);
        }
    }
}
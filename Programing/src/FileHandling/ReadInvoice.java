package FileHandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadInvoice {
    public static void main(String[] args) {
         String filname="hello.data";
         try {
             FileInputStream fileInputStream=new FileInputStream(filname);
             ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
          Object object=   objectInputStream.readObject();
             Invoice invoice=( Invoice)object;
             System.out.println(invoice);
         }catch (Exception e){
             System.out.println(e);
         }


    }
}


package praktikum2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


public class praktikum2 {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //inputStream untuk menampilkan isi sebuah file
       InputStream  fileInput=new FileInputStream("d:/tez.txt");
       
       // membaca data yang pertama
       //
       int data=fileInput.read();
       
       while (data!=-1){
           
           //convert byte to char
           System.out.print((char)data);
           
           //membaca byte
           data=fileInput.read();
           
       }
       //menutup data dari inputStreeam
       fileInput.close();
    }
    
}

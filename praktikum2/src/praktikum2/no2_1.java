
package praktikum2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


public class no2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
       InputStream fileInput=new FileInputStream("d:/test.txt");
       
       int data=fileInput.read();
       // kalo = -1 berarti kosong
       while(data !=-1){
           System.out.print((char)data);
           
           data=fileInput.read();
       }
       fileInput.close();
    }
    
}

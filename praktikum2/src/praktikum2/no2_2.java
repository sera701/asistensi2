
package praktikum2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class no2_2 {
      public static void main(String[] args) throws FileNotFoundException, IOException{
          String destination="d:/test.txt";
          OutputStream output=new FileOutputStream(destination);
          System.out.println("opened" + destination + "for writing.");
          
          String data="safira";
          for(int i=0; i<data.length(); i++){
              output.write((byte) data.charAt(i));
          }
          output.close();
          System.out.println("output stream closed");
        
    }
    
}

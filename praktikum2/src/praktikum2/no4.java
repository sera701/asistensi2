
package praktikum2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class no4 {
 
    public static void main(String[] args) throws FileNotFoundException,IOException{
        
         String destination = "d:/testing.txt";
        OutputStream output = new FileOutputStream(destination);
        System.out.println("Opened "+ destination + "for writing.");
       

        for (;;) {
            
            System.out.println("masukan text: ");            
            InputStream input = System.in;            
            InputStreamReader reader = new InputStreamReader(input);
            BufferedReader bufReader = new BufferedReader(reader);
            String name = bufReader.readLine();
            String data = name;
              
            if(name.equals("exit")){
            break;
        }
        }
              
        output.close();
        System.out.println("Output Stream Closed");
     
}

}
       



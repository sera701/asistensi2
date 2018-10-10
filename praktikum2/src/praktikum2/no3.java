
package praktikum2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;


public class no3 {

   public static void main(String[] args) throws FileNotFoundException,IOException{
        String destination = "d:/testingdocument.txt";
        OutputStream output = new FileOutputStream(destination);
        System.out.println("Opened" + destination + "for writing");
        InputStream input = System.in;
        InputStreamReader reader = new InputStreamReader(input);
        BufferedReader bufreader = new BufferedReader(reader);
        String name = bufreader.readLine();
        for (int i = 0; i <name.length(); i++) {
            output.write((byte) name.charAt(i));
            
        }
        output.close();
        System.out.println("output stream closed");
        
    }
    
}




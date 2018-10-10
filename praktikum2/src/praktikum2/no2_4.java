
package praktikum2;

import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class no2_4 {
      public static void main(String[] args){
          try {
              OutputStream output=System.out;
              
              OutputStreamWriter writer=new OutputStreamWriter(output);
              writer.write("hello world");
              
              writer.flush();
              writer.close();
          } catch (Exception ioe) {
              System.err.println("I/O error: " + ioe);
          }
      }
}

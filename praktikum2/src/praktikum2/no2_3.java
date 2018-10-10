
package praktikum2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class no2_3 {
     public static void main(String[] args){
         try {
                 System.out.print("please enter your name :");
                 
                 InputStream input=System.in;
                 
                 InputStreamReader reader=new InputStreamReader(input);
                 
                 BufferedReader bufReader=new BufferedReader(reader);
                 String name=bufReader.readLine();
                 System.out.println("please to meet you," + name);
             } catch (Exception ioe) {
                 System.out.println("I/O error: "+ ioe);
             }
             
         }
     } 


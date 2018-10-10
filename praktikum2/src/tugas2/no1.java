
package tugas2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class no1 {
  public static void main(String[]args){
      try{
        FileReader fr=new FileReader("e:/copy.txt");
        BufferedReader br=new BufferedReader(fr);
        FileWriter fw=new FileWriter("e:/paste.txt");
        BufferedWriter bf=new BufferedWriter(fw);
        String line;
        line=br.readLine();
        while(line !=null){
            try{
            bf.write(line,0,line.length());
            bf.newLine();
            line=br.readLine();
            System.out.println("data berhasil di copy");
        } catch(Exception e){
            System.out.println("data gagal di copy");
        }      
        }
        br.close();
        bf.close();
    }    catch(Exception e){
        e.printStackTrace();
    }
}
  
}

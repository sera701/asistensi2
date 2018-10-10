
package praktikum2;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class no2_5 {
     public static void main(String[] args){
         Image image=null;
         try {
             File sourceimage = new File("d:koala.jpg");
             image=ImageIO.read(sourceimage);
             
             InputStream is =new BufferedInputStream(new FileInputStream("d:koala.jpg"));
             image=ImageIO.read(is);
         } catch (IOException e) {
         }
         
         JFrame frame=new JFrame();
         JLabel label = new JLabel (new ImageIcon(image));
         frame.getContentPane().add(label, BorderLayout.CENTER);
         frame.pack();
         frame.setVisible(true);
     } 
}

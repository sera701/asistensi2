
package praktikum2;

import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


public class no2_6 {
       public static void main(String[] args) throws Exception{
           String audioFile="d./Sleep Away.wav";
           InputStream in=new FileInputStream(audioFile);
           
           AudioStream audioStream=new AudioStream(in);
           
           AudioPlayer.player.start(audioStream);
       }
}

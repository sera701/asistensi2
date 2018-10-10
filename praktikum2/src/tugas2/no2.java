
package tugas2;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;


public class no2 extends javax.swing.JFrame {


    public no2() {
        initComponents();
         this.setLocationRelativeTo(this);
        this.setTitle("OpenSave");
    //    this.setResizable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        judul = new javax.swing.JLabel();
        JButton1 = new javax.swing.JButton();
        JButton2 = new javax.swing.JButton();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(390, 250));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judul.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        judul.setText("Get Image");
        jPanel1.add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        JButton1.setText("OPEN");
        JButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(JButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 319, -1, -1));

        JButton2.setText("SAVE");
        JButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(JButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 319, -1, -1));
        jPanel1.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 199, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     JFileChooser chooser = new JFileChooser("") ;
    File filenya ;
    BufferedImage foto ;
    
    
    private void JButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton2ActionPerformed
  // TODO add your handling code here:
        
         JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));

        int r = chooser.showSaveDialog(this);
        if (r == JFileChooser.APPROVE_OPTION) {
            File sf = chooser.getSelectedFile();
            try {
                ImageIO.write(foto, "png", sf);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        

    }//GEN-LAST:event_JButton2ActionPerformed

    private void JButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton1ActionPerformed
  int buka_dialog = chooser.showOpenDialog(no2.this);
                    if (buka_dialog == JFileChooser.APPROVE_OPTION) {
                        filenya = chooser.getSelectedFile();
                        //  file =  chooser.getSelectedFile();

                        try {

                            foto = ImageIO.read(filenya);
                            ImageIcon icon = new ImageIcon(foto);
                            label.setIcon(icon);

                            Dimension imageSize = new Dimension(icon.getIconWidth(), icon.getIconHeight());
                            label.setPreferredSize(imageSize);

                            label.revalidate();
                            label.repaint();



                            //         panel1.createImage(paint(Graphics gr));

                        } catch (IOException e) {
                            System.out.println(e);
                        }
        
        
                    }      


    }//GEN-LAST:event_JButton1ActionPerformed
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(no2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(no2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(no2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(no2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new no2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton1;
    private javax.swing.JButton JButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
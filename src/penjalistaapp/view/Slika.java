/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjalistaapp.view;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Josip
 */
public class Slika extends javax.swing.JFrame {

    /**
     * Creates new form Slika
     */
    public Slika() {
        initComponents();
    changeIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSlika = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ERA");
        getContentPane().setLayout(new java.awt.FlowLayout());

        lblSlika.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjalistaapp/view/penjalista.png"))); // NOI18N
        getContentPane().add(lblSlika);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblSlika;
    // End of variables declaration//GEN-END:variables
    private void changeIcon() {
               try {
    setIconImage(ImageIO.read(new File("Slike/climbingIcon.png")));
}
catch (IOException exc) {
    exc.printStackTrace();
}
    }
}

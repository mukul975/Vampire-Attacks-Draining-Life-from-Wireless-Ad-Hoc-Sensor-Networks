/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import myDesign.*;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jp
 */
public class DesignSimcar extends javax.swing.JFrame {

    public Thread t = new Thread(new connect());

    /**
     * Creates new form DesignSim
     */
    public DesignSimcar() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        source.setVisible(true);
        A.setVisible(true);
        B.setVisible(true);
        C.setVisible(true);
        D.setVisible(true);
        E.setVisible(true);
        F.setVisible(true);
        Sink.setVisible(true);

        jLabel9.setVisible(false);
        jLabel3.setVisible(false);
        jLabel16.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel12.setVisible(false);
        jLabel10.setVisible(false);
        jLabel15.setVisible(false);
        jLabel14.setVisible(false);
        jLabel17.setVisible(false);
        jLabel11.setVisible(false);
        jLabel8.setVisible(false);
        jLabel7.setVisible(false);
        jLabel19.setVisible(false);
        jLabel4.setVisible(false);
        jLabel13.setVisible(false);
        jLabel18.setVisible(false);
        jLabel1.setVisible(false);

        t.start();

    }

    public class connect implements Runnable {

        public void run() {
            try {
                //  try {

                Thread.sleep(500);
                jLabel9.setVisible(true);

                Thread.sleep(500);
                jLabel3.setVisible(true);
                Thread.sleep(500);

                jLabel16.setVisible(true);
                Thread.sleep(000);

                jLabel5.setVisible(true);
                Thread.sleep(500);
                jLabel6.setVisible(true);
                Thread.sleep(1000);

                jLabel12.setVisible(true);
                Thread.sleep(1200);

                jLabel10.setVisible(true);
                Thread.sleep(1600);
                jLabel15.setVisible(true);
                Thread.sleep(2000);

                jLabel14.setVisible(true);
                Thread.sleep(2200);
                jLabel17.setVisible(true);
                Thread.sleep(2500);

                jLabel11.setVisible(true);
                Thread.sleep(3000);

                jLabel8.setVisible(true);
                Thread.sleep(3200);

                jLabel7.setVisible(true);
                Thread.sleep(3400);
                jLabel19.setVisible(true);
                Thread.sleep(3600);
                jLabel4.setVisible(true);
                Thread.sleep(3500);
                jLabel13.setVisible(true);
                Thread.sleep(3800);
                jLabel18.setVisible(true);
                Thread.sleep(4500);

                jLabel1.setVisible(true);



                // }
            } catch (InterruptedException ex) {
                Logger.getLogger(DesignSimcar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        source = new javax.swing.JLabel();
        A = new javax.swing.JLabel();
        B = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        D = new javax.swing.JLabel();
        E = new javax.swing.JLabel();
        F = new javax.swing.JLabel();
        Sink = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 750));
        getContentPane().setLayout(null);

        source.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        source.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/sourcepng.png"))); // NOI18N
        source.setText("Source");
        getContentPane().add(source);
        source.setBounds(770, 490, 170, 110);

        A.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Computer-icon.png"))); // NOI18N
        A.setText("A");
        getContentPane().add(A);
        A.setBounds(780, 230, 150, 130);

        B.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Computer-icon.png"))); // NOI18N
        B.setText("B");
        getContentPane().add(B);
        B.setBounds(750, 30, 140, 130);

        C.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Computer-icon.png"))); // NOI18N
        C.setText("C");
        getContentPane().add(C);
        C.setBounds(430, 20, 150, 130);

        D.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Computer-icon.png"))); // NOI18N
        D.setText("D");
        getContentPane().add(D);
        D.setBounds(260, 200, 150, 130);

        E.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Computer-icon.png"))); // NOI18N
        E.setText("E");
        getContentPane().add(E);
        E.setBounds(230, 470, 150, 130);

        F.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Computer-icon.png"))); // NOI18N
        F.setText("F");
        getContentPane().add(F);
        F.setBounds(530, 470, 150, 130);

        Sink.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        Sink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/sinkpng.png"))); // NOI18N
        Sink.setText("Sink");
        getContentPane().add(Sink);
        Sink.setBounds(40, 350, 160, 110);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/upright.gif"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(550, 350, 160, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/upside.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 490, 170, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/down.gif"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 350, 140, 110);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/leftdown.gif"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(270, 90, 140, 110);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/left.gif"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(560, 130, 130, 110);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/up.gif"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(800, 150, 140, 110);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/right.gif"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(360, 460, 140, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/up.gif"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(770, 370, 140, 110);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/upright.gif"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(600, 390, 160, 90);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/down.gif"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(240, 350, 140, 110);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/right.gif"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(360, 530, 140, 60);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/leftdown.gif"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(390, 160, 140, 110);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/left.gif"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(560, 60, 130, 110);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/up.gif"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(730, 150, 140, 110);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/left.gif"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(560, -10, 130, 110);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/leftdown.gif"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(330, 130, 140, 110);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/down.gif"))); // NOI18N
        getContentPane().add(jLabel18);
        jLabel18.setBounds(310, 350, 140, 110);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/up.gif"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(660, 150, 140, 110);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DesignSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesignSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesignSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesignSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesignSimcar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel A;
    private javax.swing.JLabel B;
    private javax.swing.JLabel C;
    private javax.swing.JLabel D;
    private javax.swing.JLabel E;
    private javax.swing.JLabel F;
    private javax.swing.JLabel Sink;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel source;
    // End of variables declaration//GEN-END:variables
}
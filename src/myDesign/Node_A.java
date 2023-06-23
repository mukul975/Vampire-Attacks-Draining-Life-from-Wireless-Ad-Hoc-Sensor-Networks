/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myDesign;

import actionUtils.Action;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import multiSockets.MulticastTx;
import test.DesignSimcar;

/**
 *
 * @author jp
 */
public class Node_A extends javax.swing.JFrame {

    String title="      Vampire Attacks: Draining Life from Wireless Ad Hoc Sensor Networks";
    Action action;
    public String source;
    String sget;
    String sget1;
    String sget2;

    public Node_A() {
        initComponents();
     
        jProgressBar1.setValue(100);
        action = new Action();
        init();
        Thread t = new Thread(new connect());
        t.start();
    }

    private void init() {

        source = action.getSource();// + " " + Node_name;
        setTitle(source+title+"     NODE A");
        jLabel3.setText(source);

        new MulticastTx(source);
    }

    class connect implements Runnable {

        public void run() {

            try {
                ServerSocket ss = new ServerSocket(8401);
                Socket s = ss.accept();
                System.out.println("Receive");
                InputStream is = s.getInputStream();
                ObjectInputStream ois = new ObjectInputStream(is);
                ArrayList<String> array = (ArrayList<String>) ois.readObject();
                System.out.println(array);
                sget = array.get(0);
                sget1 = array.get(1);
                sget2 = array.get(2);


                if (sget2.equals("Secure_Transmission")) {
                     for (int i = 100; i >= 60; i--) {
                    try {
                        Thread.sleep(100);
                        jProgressBar1.setValue(i);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Source.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

               // jTextArea1.setText(sget1);
                is.close();
                ois.close();
                s.close();
                ss.close();
                Send();
                }
                
                if (sget2.equals("carousel")) {
                   //  new DesignSimcar().setVisible(true);
                     for (int i = 100; i >= 60; i--) {
                    try {
                        Thread.sleep(100);
                        jProgressBar1.setValue(i);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Source.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                jTextArea1.setText(sget1);
                is.close();
                ois.close();
                s.close();
                ss.close();
                Send();
                }
                if (sget2.equals("stretch")) {
                     for (int i = 100; i >= 60; i--) {
                    try {
                        Thread.sleep(100);
                        jProgressBar1.setValue(i);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Source.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                jTextArea1.setText(sget1);
                is.close();
                ois.close();
                s.close();
                ss.close();
                Send();
                }


               
            } catch (Exception e) {
                System.out.println("OOPS! Errors are found -> " + e);
            }


        }
    }

    public void Send() {
        try {
            ObjectOutputStream oos, oos1, oos2, oos3, oos4, oos5, oos6;
            OutputStream os, os1, os2, os3, os4, os5, os6;
            Socket s, s1 = null, s2 = null, s3 = null, s4 = null, s5 = null, s6 = null;
            ArrayList<String> array = new ArrayList<String>();
            array.add(0, sget);
            array.add(1, sget1);
            array.add(2, sget2);
            int getv = jProgressBar1.getValue();
            for (int i = getv; i >= 40; i--) {
                try {
                    Thread.sleep(100);
                    jProgressBar1.setValue(i);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Source.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            s1 = new Socket("localhost", 8501);
            os = s1.getOutputStream();
            oos = new ObjectOutputStream(os);
            oos.writeObject(array);
            oos.close();
            os.close();
            s1.close();
        } catch (UnknownHostException ex) {
            Logger.getLogger(Node_A.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Node_A.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(820, 430));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Received Message :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 140, 130, 20);

        jProgressBar1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(560, 20, 210, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 180, 350, 190);

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(500, 120, 240, 250);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Neighbor Nodes :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(500, 90, 120, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText(" f");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 40, 80, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Energy Level :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(460, 20, 90, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Node Name: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 40, 80, 20);

        jButton1.setText("Configure");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 110, 79, 23);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/7.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 830, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
           jTextArea3.append("SOURCE");
        jTextArea3.append("\n");
        jTextArea3.append("B");
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Node_A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Node_A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Node_A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Node_A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Node_A().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}

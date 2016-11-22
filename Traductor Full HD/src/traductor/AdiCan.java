/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductor;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ADMN
 */
public class AdiCan extends javax.swing.JFrame {

    public String v2[] = new String[10];

    /**
     * Creates new form AdiCan
     */
    public AdiCan() {
        initComponents();
        setSize(736, 525);
        setLocationRelativeTo(null);
        setResizable(false);
        cargar();
        Login.Music.Play("Archivos/mega.mp3");
    }

    public void cargar() {
        ArrayList<String> pal = new ArrayList();
        if (Ejercicios.niv <= 5) {
            for (Palabras aux : Aprender.regist.traer_Palabra()) {
                if (aux.getNivel() == 1 || aux.getNivel() == 2) {
                    pal.add(aux.getEnglish());
                }
            }
        }
        if (Ejercicios.niv >= 6) {
            for (Palabras aux : Aprender.regist.traer_Palabra()) {
                if (aux.getNivel() == 3 || aux.getNivel() == 4) {
                    pal.add(aux.getEnglish());
                }
            }
        }
        int v[] = new int[10];
        int cv = 0;

        System.out.println("Tamaño arreglo: " + pal.size());
        while (cv < 10) {
            boolean val = true;
            int ran = (int) (Math.random() * ((pal.size() - 1) - 0 + 1) + 0);
            for (int i = 0; i < 10; i++) {
                if (ran == v[i]) {
                    val = false;
                }
            }
            if (val == true) {
                v[cv] = ran;
                v2[cv] = pal.get(ran);
                cv++;
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnVer = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guess The Audio");
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traductor/auu.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(80, 70, 50, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traductor/auu.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(80, 150, 50, 50);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traductor/auu.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(80, 230, 50, 50);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traductor/auu.jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(80, 310, 50, 50);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traductor/auu.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(80, 390, 50, 50);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traductor/auu.jpg"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(400, 70, 50, 50);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traductor/auu.jpg"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(400, 150, 50, 50);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traductor/auu.jpg"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(400, 230, 50, 50);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traductor/auu.jpg"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(400, 310, 50, 50);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traductor/auu.jpg"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(400, 390, 50, 50);

        jTextField1.setBackground(new java.awt.Color(255, 102, 51));
        jTextField1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(160, 80, 170, 30);

        jTextField2.setBackground(new java.awt.Color(255, 102, 51));
        jTextField2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(160, 160, 170, 30);

        jTextField3.setBackground(new java.awt.Color(255, 102, 51));
        jTextField3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(160, 240, 170, 30);

        jTextField4.setBackground(new java.awt.Color(255, 102, 51));
        jTextField4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(160, 320, 170, 30);

        jTextField5.setBackground(new java.awt.Color(255, 102, 51));
        jTextField5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(160, 400, 170, 30);

        jTextField6.setBackground(new java.awt.Color(255, 102, 51));
        jTextField6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(470, 80, 170, 30);

        jTextField7.setBackground(new java.awt.Color(255, 102, 51));
        jTextField7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(470, 160, 170, 30);

        jTextField8.setBackground(new java.awt.Color(255, 102, 51));
        jTextField8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(470, 240, 170, 30);

        jTextField9.setBackground(new java.awt.Color(255, 102, 51));
        jTextField9.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(470, 320, 170, 30);

        jTextField10.setBackground(new java.awt.Color(255, 102, 51));
        jTextField10.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(470, 400, 170, 30);

        jButton11.setBackground(new java.awt.Color(255, 255, 51));
        jButton11.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 0, 0));
        jButton11.setText("Check");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(310, 450, 120, 37);

        jButton12.setBackground(new java.awt.Color(255, 255, 51));
        jButton12.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 0, 0));
        jButton12.setText("Return");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(590, 450, 120, 37);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Guess The Audio");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 10, 260, 40);

        btnVer.setBackground(new java.awt.Color(255, 255, 51));
        btnVer.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btnVer.setForeground(new java.awt.Color(0, 0, 0));
        btnVer.setText("Show Answers");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        getContentPane().add(btnVer);
        btnVer.setBounds(30, 450, 180, 37);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traductor/64B.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -10, 730, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Login.Music.Stop();
        Login.Music.Play("Archivos/" + v2[1] + ".mp3");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Login.Music.Stop();
        Login.Music.Play("Archivos/" + v2[2] + ".mp3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Login.Music.Stop();
        Login.Music.Play("Archivos/" + v2[3] + ".mp3");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Login.Music.Stop();
        Login.Music.Play("Archivos/" + v2[4] + ".mp3");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Login.Music.Stop();
        Login.Music.Play("Archivos/" + v2[5] + ".mp3");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Login.Music.Stop();
        Login.Music.Play("Archivos/" + v2[6] + ".mp3");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Login.Music.Stop();
        Login.Music.Play("Archivos/" + v2[7] + ".mp3");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        Login.Music.Stop();
        Login.Music.Play("Archivos/" + v2[8] + ".mp3");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        Login.Music.Stop();
        Login.Music.Play("Archivos/" + v2[9] + ".mp3");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        int op = JOptionPane.showConfirmDialog(null, "Do you want to go out?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            Login.nivJug = Login.nivJug - 1;
            Inicio.lNivel.setText("Level " + Login.nivJug);
            Ejercicios.mar = 0;

            Ejercicios abrir = new Ejercicios();
            abrir.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        ArrayList<JTextField> ca = new ArrayList();
        ca.add(jTextField1);
        ca.add(jTextField2);
        ca.add(jTextField3);
        ca.add(jTextField4);
        ca.add(jTextField5);
        ca.add(jTextField6);
        ca.add(jTextField7);
        ca.add(jTextField8);
        ca.add(jTextField9);
        ca.add(jTextField10);
        int cont = 0;
        for (int j = 0; j < 10; j++) {
            String caja = ca.get(j).getText();
            if (v2[j].compareTo(caja) == 0) {
                ca.get(j).setBackground(Color.blue);
                cont++;
            } else {
                ca.get(j).setBackground(Color.red);
            }
        }
        System.out.println("Contador = " + cont);

        if (cont == 10) {
            Login.nivJug = Login.nivJug + 7;
            Inicio.lNivel.setText("Level " + Login.nivJug);
            Ejercicios.mar++;
            JOptionPane.showMessageDialog(null, "You Win!!!");
            Ejercicios a = new Ejercicios();
            a.setVisible(true);
            if (Ejercicios.mar == 3) {
                Marcianito m = new Marcianito();
                m.setVisible(true);
                Ejercicios.mar = 0;
            }
            this.setVisible(false);
        } else {
            Login.nivJug = Login.nivJug - 1;
            Inicio.lNivel.setText("Level " + Login.nivJug);
            JOptionPane.showMessageDialog(null, "Your level decreased...");
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login.Music.Stop();
        Login.Music.Play("Archivos/" + v2[0] + ".mp3");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        // TODO add your handling code here:
        ArrayList<JTextField> ca = new ArrayList();
        ca.add(jTextField1);
        ca.add(jTextField2);
        ca.add(jTextField3);
        ca.add(jTextField4);
        ca.add(jTextField5);
        ca.add(jTextField6);
        ca.add(jTextField7);
        ca.add(jTextField8);
        ca.add(jTextField9);
        ca.add(jTextField10);
        for (int j = 0; j < 10; j++) {
            ca.get(j).setText(v2[j]);
            ca.get(j).setBackground(Color.DARK_GRAY);
        }
        Login.nivJug = Login.nivJug - 1;
        Inicio.lNivel.setText("Level " + Login.nivJug);
        JOptionPane.showMessageDialog(null, "You Lose...");
        Ejercicios.mar = 0;
        Ejercicios a = new Ejercicios();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVerActionPerformed

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
            java.util.logging.Logger.getLogger(AdiCan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdiCan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdiCan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdiCan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdiCan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductor;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Laloo
 */
public class FFlor extends javax.swing.JFrame {

    /**
     * Creates new form FFlor
     */
    public FFlor() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        llenarFlor();

    }

    public void llenarFlor() {
        tFlor.setDefaultRenderer(Object.class, new ponerImagen());
        String tit[] = {"Spanish", "English", "Image"};
        DefaultTableModel tm = new DefaultTableModel(null, tit);
        ArrayList<Palabras> a = flor();
        for (Palabras aux : a) {

            //System.out.println(aux.getSapanish() + aux.getEnglish() + aux.getIma());
            JLabel fu = new JLabel();
            fu.setSize(255, 150);
            ImageIcon icon = new ImageIcon(getClass().getResource("Archivos/" + aux.getIma()));
            Icon icono = new ImageIcon(icon.getImage().getScaledInstance(fu.getWidth(), fu.getHeight(), Image.SCALE_DEFAULT));
            fu.setIcon(icono);
            tm.addRow(new Object[]{aux.getSapanish(), aux.getEnglish(), fu});

        }
        tFlor.setRowHeight(150);
        tFlor.setModel(tm);
        tFlor.getColumnModel().getColumn(2).setPreferredWidth(185);
    }

    public ArrayList<Palabras> flor() {
        ArrayList<Palabras> flo = new ArrayList();
        for (Palabras aux : Aprender.regist.traer_Palabra()) {
            if (aux.getTipo().compareTo("flor") == 0) {
                flo.add(aux);
            }
        }
        return flo;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tFlor = new javax.swing.JTable();
        btnCer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flowers");
        setBackground(new java.awt.Color(204, 102, 255));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(200, 83, 200));
        jLabel1.setText("FLOWERS");

        tFlor.setBackground(new java.awt.Color(193, 113, 213));
        tFlor.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        tFlor.setForeground(new java.awt.Color(255, 255, 255));
        tFlor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tFlor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tFlorMouseClicked(evt);
            }
        });
        tFlor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tFlorKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tFlor);

        btnCer.setBackground(new java.awt.Color(153, 51, 255));
        btnCer.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        btnCer.setForeground(new java.awt.Color(255, 255, 255));
        btnCer.setText("Close");
        btnCer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(btnCer))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(233, 233, 233))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCerActionPerformed

    private void tFlorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tFlorMouseClicked
        // TODO add your handling code here:
        Login.Music.Stop();
        int fila = this.tFlor.getSelectedRow();
        String mu = String.valueOf(this.tFlor.getValueAt(fila, 1));
        //mu.toLowerCase();
        Login.Music.Play("Archivos/" + mu + ".mp3");
    }//GEN-LAST:event_tFlorMouseClicked

    private void tFlorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tFlorKeyReleased
        // TODO add your handling code here:
        if (tFlor.getSelectedRows().length > 0) {
            Login.Music.Stop();
            int fila = this.tFlor.getSelectedRow();
            String mu = String.valueOf(this.tFlor.getValueAt(fila, 1));
            //mu.toLowerCase();
            Login.Music.Play("Archivos/" + mu + ".mp3");
        }
    }//GEN-LAST:event_tFlorKeyReleased

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
            java.util.logging.Logger.getLogger(FFlor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FFlor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FFlor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FFlor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FFlor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tFlor;
    // End of variables declaration//GEN-END:variables
}

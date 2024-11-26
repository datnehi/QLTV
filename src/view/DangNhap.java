package view;

import controller.Thuthucn;
import javax.swing.*;

public class DangNhap extends javax.swing.JFrame {

    public DangNhap() {

        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Dangnhap = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Tendangnhap = new javax.swing.JTextField();
        matkhau = new javax.swing.JPasswordField();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/back.png"))); // NOI18N
        jButton2.setText("Trở về");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 110, 30));

        Dangnhap.setText("Đăng Nhập");
        Dangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangnhapActionPerformed(evt);
            }
        });
        getContentPane().add(Dangnhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 220, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Đăng Nhập Tài Khoản Thủ Thư");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TÊN ĐĂNG NHẬP");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, 20));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MẬT KHẨU");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 100, 20));

        Tendangnhap.setName(""); // NOI18N
        Tendangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TendangnhapActionPerformed(evt);
            }
        });
        getContentPane().add(Tendangnhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 290, -1));

        matkhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matkhauActionPerformed(evt);
            }
        });
        getContentPane().add(matkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 290, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/—Pngtree—clouds sky blue aesthetic pastel_2447709.png"))); // NOI18N
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TendangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TendangnhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TendangnhapActionPerformed

    private void DangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangnhapActionPerformed
        if (Tendangnhap.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui long nhap ten dang nhap");
        } else if (matkhau.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui long nhap mat khau");
        } else if (Thuthucn.loginTT(Tendangnhap.getText(), matkhau.getText())) {
            dispose();
            TTpage ttpage = new TTpage();
            ttpage.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Tai khoan sai");
        }
    }//GEN-LAST:event_DangnhapActionPerformed

    private void matkhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matkhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matkhauActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        homepage homepage = new homepage();
        homepage.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dangnhap;
    private javax.swing.JTextField Tendangnhap;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPasswordField matkhau;
    // End of variables declaration//GEN-END:variables
}

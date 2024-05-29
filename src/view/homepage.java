package view;

import controller.Docgiacn;
import controller.Pmtcn;
import controller.Sachcn;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class homepage extends javax.swing.JFrame {

    public homepage() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) bangsach.getModel();
        Sachcn.loadBooks(model);
    }
    private static homepage instance;

    public static homepage getInstance() {
        if (instance == null) {
            instance = new homepage();
        }
        return instance;
    }

    public JTextField getMadg() {
        return madg;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        bangsach = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        masach = new javax.swing.JTextField();
        tensach = new javax.swing.JTextField();
        tacgia = new javax.swing.JTextField();
        theloai = new javax.swing.JTextField();
        timkiem = new javax.swing.JButton();
        allsach = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        madg = new javax.swing.JTextField();
        maphieu = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        bangmt = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setMinimumSize(new java.awt.Dimension(1010, 500));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel12.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setText("TÌM KIẾM SÁCH");
        jPanel12.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, -1, -1));

        bangsach.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bangsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Sách", "Tên Sách", "Tên Tác Giả", "Thể Loại", "Nhà Xuất Bản", "Năm Xuất Bản", "Vị Trí Lưu Trữ", "Hiện Trạng", "Trạng Thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(bangsach);

        jPanel12.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 890, 280));

        jButton1.setText("Đăng Nhập Tài Khoản Thủ Thư");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1109, 490, 260, 30));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel8.setAutoscrolls(true);
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/1.png"))); // NOI18N
        jLabel3.setText("MÃ SÁCH");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/1.png"))); // NOI18N
        jLabel4.setText("TÊN SÁCH");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/5.png"))); // NOI18N
        jLabel5.setText("TÊN TÁC GIẢ");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/2.png"))); // NOI18N
        jLabel7.setText("THỂ LOẠI");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        jPanel8.add(masach, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 260, -1));

        tensach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tensachActionPerformed(evt);
            }
        });
        jPanel8.add(tensach, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 260, -1));

        tacgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tacgiaActionPerformed(evt);
            }
        });
        jPanel8.add(tacgia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 260, -1));
        jPanel8.add(theloai, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 260, -1));

        timkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/8.png"))); // NOI18N
        timkiem.setText("Tìm Kiếm");
        timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timkiemActionPerformed(evt);
            }
        });
        jPanel8.add(timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 120, 30));

        allsach.setText("Tất cả sách");
        allsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allsachActionPerformed(evt);
            }
        });
        jPanel8.add(allsach, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 110, 30));

        jPanel12.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 460, 420));
        jPanel8.getAccessibleContext().setAccessibleName("Thông tin tìm kiếm");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/—Pngtree—clouds sky blue aesthetic pastel_2447709.png"))); // NOI18N
        jPanel12.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1630, 740));

        jTabbedPane1.addTab("Tra Cứu Sách", jPanel12);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        madg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                madgActionPerformed(evt);
            }
        });
        jPanel2.add(madg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 60, 130, 30));
        jPanel2.add(maphieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 160, 130, 30));

        bangmt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MPMT", "Mã Sách", "Tên Sách", "Ngày Mượn", "Hạn Trả", "HiệnTrạng Trước", "Hiện Trạng Sau", "Ngày Trả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(bangmt);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 1120, 440));

        jButton3.setText("Tìm Kiếm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 60, -1, 30));

        jButton2.setText("Đăng Nhập Tài Khoản Thủ Thư");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 530, 260, 30));

        jLabel1.setText("Mã Số ĐG");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 30, -1, -1));

        jLabel2.setText("Mã Phiếu");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 120, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/—Pngtree—clouds sky blue aesthetic pastel_2447709.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1630, 740));

        jTabbedPane1.addTab("Tra Cứu Lịch Sử Mượn Trả", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 700));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/—Pngtree—clouds sky blue aesthetic pastel_2447709.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1630, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            String ma1 = madg.getText();
            String ma2 = maphieu.getText();
            if (ma1.equals("") && ma2.equals("")) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin.");
                return;
            }
            if (!ma1.matches("DG\\d{2}") && ma2.equals("")) {
                JOptionPane.showMessageDialog(null, "Mã độc giả phải theo định dạng DG**.");
                return;
            }
            if (!ma2.matches("P\\d{3}") && ma1.equals("")) {
                JOptionPane.showMessageDialog(null, "Phiếu mượn trả phải theo định dạng P***.");
                return;
            }
            if (!ma1.matches("DG\\d{2}") && !ma2.matches("P\\d{3}")) {
                if (!ma1.matches("DG\\d{2}")) {
                    JOptionPane.showMessageDialog(null, "Mã độc giả phải theo định dạng DG**.");
                    return;
                }
                if (!ma2.matches("P\\d{3}")) {
                    JOptionPane.showMessageDialog(null, "Phiếu mượn trả phải theo định dạng P***.");
                    return;
                }
            }
            if (Docgiacn.loadById(ma1) == null && !ma1.equals("")) {
                JOptionPane.showMessageDialog(null, "Độc giả không tồn tại.");
                return;
            }
            if (Pmtcn.loadById(ma2) == false && !ma2.equals("")) {
                JOptionPane.showMessageDialog(null, "Phiếu mượn trả không tồn tại.");
                return;
            }
            DefaultTableModel model = (DefaultTableModel) bangmt.getModel();
            Pmtcn.ttMuonTra(ma1, ma2, model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void madgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_madgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_madgActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        DangNhap dangnhap = new DangNhap();
        dangnhap.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tensachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tensachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tensachActionPerformed

    private void tacgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tacgiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tacgiaActionPerformed

    private void timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timkiemActionPerformed
        String ma = masach.getText().trim();
        String ten = tensach.getText().trim();
        String tg = tacgia.getText().trim();
        String tl = theloai.getText().trim();
        if (ma.isEmpty() && ten.isEmpty() && tl.isEmpty() && tg.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin tìm kiếm!");
        } else {
            DefaultTableModel model = (DefaultTableModel) bangsach.getModel();
            Sachcn.timKiem(ma, ten, tl, tg, model);
        }

    }//GEN-LAST:event_timkiemActionPerformed

    private void allsachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allsachActionPerformed
        DefaultTableModel model = (DefaultTableModel) bangsach.getModel();
        Sachcn.loadBooks(model);
        masach.setText("");
        tensach.setText("");
        tacgia.setText("");
        theloai.setText("");
    }//GEN-LAST:event_allsachActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        DangNhap dangnhap = new DangNhap();
        dangnhap.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allsach;
    private javax.swing.JTable bangmt;
    private javax.swing.JTable bangsach;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField madg;
    private javax.swing.JTextField maphieu;
    private javax.swing.JTextField masach;
    private javax.swing.JTextField tacgia;
    private javax.swing.JTextField tensach;
    private javax.swing.JTextField theloai;
    private javax.swing.JButton timkiem;
    // End of variables declaration//GEN-END:variables
}

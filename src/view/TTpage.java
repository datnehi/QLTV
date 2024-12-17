package view;

import Database.Database;
import controller.Sachcn;
import controller.Pmtcn;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import controller.Sinhviencn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import model.Sinhvien;
import model.Sach;

public class TTpage extends javax.swing.JFrame {

    public TTpage() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) bangsach.getModel();
        Sachcn.loadBooks(model);
        DefaultTableModel model1 = (DefaultTableModel) bangls.getModel();
        Pmtcn.loadAll("", "", "", "", model1);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                String currentDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
                ngaymuon.setText(currentDate);
                ngaytra.setText(currentDate);
            }
        }, 0, 1000);
        mapmtmuon.setText(Sachcn.incrementCode(Pmtcn.findLastPmtId()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel32 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        huycapnhat = new javax.swing.JButton();
        themnhaxb = new javax.swing.JTextField();
        themma = new javax.swing.JTextField();
        themten = new javax.swing.JTextField();
        themtg = new javax.swing.JTextField();
        themtl = new javax.swing.JTextField();
        themnamxb = new javax.swing.JTextField();
        themhientrang = new javax.swing.JComboBox();
        themvitri = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        capnhat = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        bangsach = new javax.swing.JTable();
        nhapten = new javax.swing.JTextField();
        timkiemsach = new javax.swing.JButton();
        xoasach = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        sua = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tensachmuon = new javax.swing.JTextField();
        masvmuon = new javax.swing.JTextField();
        mapmtmuon = new javax.swing.JTextField();
        themmuon = new javax.swing.JButton();
        huythem = new javax.swing.JButton();
        tensvmuon = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        bangmuon = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        ngaymuon = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        masachmuon = new javax.swing.JTextField();
        hientrangmuon = new javax.swing.JComboBox();
        muonsach = new javax.swing.JButton();
        huymuon = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        bangtra = new javax.swing.JTable();
        timtra = new javax.swing.JButton();
        tensachtra = new javax.swing.JTextField();
        masvtra = new javax.swing.JTextField();
        ngaytra = new javax.swing.JTextField();
        trasach = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        bangls = new javax.swing.JTable();
        masvls = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tensachls = new javax.swing.JTextField();
        timkiemls = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        fromls = new com.toedter.calendar.JDateChooser();
        tols = new com.toedter.calendar.JDateChooser();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        tongdenhan = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bang1 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        tongluottk = new javax.swing.JTextField();
        from1 = new com.toedter.calendar.JDateChooser();
        to1 = new com.toedter.calendar.JDateChooser();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        tongchuatra = new javax.swing.JTextField();
        from5 = new com.toedter.calendar.JDateChooser();
        to5 = new com.toedter.calendar.JDateChooser();
        jButton11 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        bang3 = new javax.swing.JTable();
        jLabel42 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        tongquahan = new javax.swing.JTextField();
        from6 = new com.toedter.calendar.JDateChooser();
        to6 = new com.toedter.calendar.JDateChooser();
        jButton12 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        bang2 = new javax.swing.JTable();
        jLabel39 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        jLabel32.setText("jLabel32");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1600, 700));
        setPreferredSize(new java.awt.Dimension(1600, 780));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setAutoscrolls(true);
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/1.png"))); // NOI18N
        jLabel3.setText("MÃ SÁCH");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/1.png"))); // NOI18N
        jLabel4.setText("TÊN SÁCH");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/5.png"))); // NOI18N
        jLabel5.setText("TÊN TÁC GIẢ");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/3.png"))); // NOI18N
        jLabel6.setText("HIỆN TRẠNG");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/2.png"))); // NOI18N
        jLabel7.setText("THỂ LOẠI");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/00.png"))); // NOI18N
        jLabel8.setText("NHÀ XUẤT BẢN");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        huycapnhat.setText("Hủy");
        huycapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huycapnhatActionPerformed(evt);
            }
        });
        jPanel8.add(huycapnhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 90, -1));
        jPanel8.add(themnhaxb, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 180, -1));

        themma.setToolTipText("");
        themma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themmaActionPerformed(evt);
            }
        });
        jPanel8.add(themma, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 180, -1));
        jPanel8.add(themten, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 180, -1));
        jPanel8.add(themtg, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 180, -1));
        jPanel8.add(themtl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 180, -1));

        themnamxb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themnamxbActionPerformed(evt);
            }
        });
        jPanel8.add(themnamxb, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 180, -1));

        themhientrang.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        themhientrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themhientrangActionPerformed(evt);
            }
        });
        jPanel8.add(themhientrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 180, -1));

        themvitri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T1", "T2", "T3", "T4" }));
        themvitri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themvitriActionPerformed(evt);
            }
        });
        jPanel8.add(themvitri, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 180, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/123.png"))); // NOI18N
        jLabel38.setText("VỊ TRÍ LƯU TRỮ");
        jPanel8.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, 20));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/123.png"))); // NOI18N
        jLabel37.setText("NĂM XUẤT BẢN");
        jPanel8.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, 20));

        capnhat.setText("Cập Nhật");
        capnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capnhatActionPerformed(evt);
            }
        });
        jPanel8.add(capnhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        jButton1.setText("Làm mới bảng");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, -1, -1));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel49.setText("Quản lý sách");
        jPanel8.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 30));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 660, 420));

        jLabel16.setText("Nhập Tên Sách");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 90, 20));

        bangsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sách", "Tên Sách", "Tên Tác Giả", "Thể Loại", "Nhà Xuất Bản", "Năm Xuất Bản", "Vị trí", "Hiện Trạng", "Trạng Thái", "Chọn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(bangsach);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 850, 540));
        jPanel1.add(nhapten, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 30, 310, -1));

        timkiemsach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/8.png"))); // NOI18N
        timkiemsach.setText("Tìm Kiếm");
        timkiemsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timkiemsachActionPerformed(evt);
            }
        });
        jPanel1.add(timkiemsach, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 30, 120, 30));

        xoasach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/delete.png"))); // NOI18N
        xoasach.setText("Xóa Sách");
        xoasach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoasachActionPerformed(evt);
            }
        });
        jPanel1.add(xoasach, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 20, 110, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/—Pngtree—clouds sky blue aesthetic pastel_2447709.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1580, 750));

        sua.setText("Sửa");
        sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaActionPerformed(evt);
            }
        });
        jPanel1.add(sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 100, -1));

        jLabel29.setText("jLabel29");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        jTabbedPane1.addTab("Quản Lý Sách", jPanel1);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setText("Mã Phiếu");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel20.setText("Mã Sinh Viên");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 30));

        jLabel22.setText("Tên Sách");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        tensachmuon.setEditable(false);
        jPanel5.add(tensachmuon, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 200, 30));

        masvmuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masvmuonActionPerformed(evt);
            }
        });
        jPanel5.add(masvmuon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 200, 30));

        mapmtmuon.setEditable(false);
        mapmtmuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapmtmuonActionPerformed(evt);
            }
        });
        jPanel5.add(mapmtmuon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 200, 30));

        themmuon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        themmuon.setText("THÊM");
        themmuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themmuonActionPerformed(evt);
            }
        });
        jPanel5.add(themmuon, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 150, 30));

        huythem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        huythem.setText("HỦY");
        huythem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huythemActionPerformed(evt);
            }
        });
        jPanel5.add(huythem, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 140, 30));

        tensvmuon.setEditable(false);
        jPanel5.add(tensvmuon, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 200, 30));

        jLabel1.setText("Họ Và Tên");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 70, 30));

        jLabel10.setText("Hiện Trạng");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        bangmuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MPMT", "Mã Sách", "Tên Sách", "Ngày Mượn", "Hạn Trả", "Hiện Trạng Trước"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(bangmuon);

        jPanel5.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 880, 400));

        jLabel11.setText("Ngày");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 50, -1));

        ngaymuon.setEditable(false);
        jPanel5.add(ngaymuon, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 200, 30));

        jLabel23.setText("Mã Sách");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        masachmuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masachmuonActionPerformed(evt);
            }
        });
        jPanel5.add(masachmuon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 200, 30));

        hientrangmuon.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        hientrangmuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hientrangmuonActionPerformed(evt);
            }
        });
        jPanel5.add(hientrangmuon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 200, 30));

        muonsach.setText("Mượn Sách");
        muonsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muonsachActionPerformed(evt);
            }
        });
        jPanel5.add(muonsach, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 520, 110, 30));

        huymuon.setText("Hủy");
        huymuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huymuonActionPerformed(evt);
            }
        });
        jPanel5.add(huymuon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 520, 100, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/—Pngtree—clouds sky blue aesthetic pastel_2447709.png"))); // NOI18N
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Phiếu Mượn", jPanel5);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Tên Sách");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        jLabel17.setText("Mã Sinh Viên");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jLabel34.setText("Ngày");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, -1, -1));

        bangtra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MPMT", "Mã Sách", "Tên Sách", "Ngày Mượn", "Hạn Trả", "Hiện Trạng Trước", "Hiện Trạng Sau ", "Trả Sách"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(bangtra);

        jPanel2.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1570, 350));

        timtra.setText("Tìm Kiếm");
        timtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timtraActionPerformed(evt);
            }
        });
        jPanel2.add(timtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 70, 100, 30));
        jPanel2.add(tensachtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 190, -1));
        jPanel2.add(masvtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 190, -1));
        jPanel2.add(ngaytra, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, 190, -1));

        trasach.setText("Trả Sách");
        trasach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trasachActionPerformed(evt);
            }
        });
        jPanel2.add(trasach, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 540, 100, 40));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/—Pngtree—clouds sky blue aesthetic pastel_2447709.png"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        jTabbedPane1.addTab("Phiếu Trả", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bangls.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sinh Viên", "MPMT", "Mã Sách", "Tên Sách", "Ngày Mượn", "Hạn Trả", "Hiện Trạng Trước", "Hiện Trạng Sau ", "Ngày Trả"
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
        jScrollPane10.setViewportView(bangls);

        jPanel3.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1570, 400));

        masvls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masvlsActionPerformed(evt);
            }
        });
        jPanel3.add(masvls, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 170, -1));

        jLabel28.setText("Tên sách");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));
        jPanel3.add(tensachls, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 170, -1));

        timkiemls.setText("Tìm Kiếm");
        timkiemls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timkiemlsActionPerformed(evt);
            }
        });
        jPanel3.add(timkiemls, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 62, 90, 30));

        jLabel24.setText("Mã sinh viên");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        fromls.setDateFormatString("yyyy-MM-dd");
        jPanel3.add(fromls, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, 140, -1));

        tols.setDateFormatString("yyyy-MM-dd");
        jPanel3.add(tols, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 80, 140, -1));

        jLabel50.setText("Từ ngày");
        jPanel3.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, -1, -1));

        jLabel51.setText("Đến ngày");
        jPanel3.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/—Pngtree—clouds sky blue aesthetic pastel_2447709.png"))); // NOI18N
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        jTabbedPane1.addTab("Lịch Sử Mượn Trả", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setText("Số sách gần đến hạn:");
        jPanel9.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        tongdenhan.setEditable(false);
        jPanel9.add(tongdenhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 110, -1));

        jButton10.setText("Tìm Kiếm");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        bang1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sinh viên", "Mã phiếu", "Ngày mượn", "Hạn trả", "Mã sách"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(bang1);

        jPanel9.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 410, 270));

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 190, 430, 390));

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setText("Tổng số lượt mượn:");
        jPanel10.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        tongluottk.setEditable(false);
        tongluottk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tongluottkActionPerformed(evt);
            }
        });
        jPanel10.add(tongluottk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 110, -1));
        jPanel10.add(from1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, -1));
        jPanel10.add(to1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 140, -1));

        jButton7.setText("Tìm Kiếm");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel2.setText("Từ ngày:");
        jPanel10.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel43.setText("Đến ngày:");
        jPanel10.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 310, 140));

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setText("Số sách chưa trả:");
        jPanel12.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        tongchuatra.setEditable(false);
        jPanel12.add(tongchuatra, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 110, -1));
        jPanel12.add(from5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 140, -1));
        jPanel12.add(to5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 140, -1));

        jButton11.setText("Tìm Kiếm");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        bang3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu", "Mã sách", "Ngày mượn", "Hạn trả", "Mã sinh viên"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(bang3);

        jPanel12.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 400, 260));

        jLabel42.setText("Từ ngày:");
        jPanel12.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel48.setText("Đến ngày:");
        jPanel12.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jPanel4.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 430, 390));

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel13MouseClicked(evt);
            }
        });
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setText("Số sách quá hạn:");
        jPanel13.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        tongquahan.setEditable(false);
        tongquahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tongquahanActionPerformed(evt);
            }
        });
        jPanel13.add(tongquahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 110, -1));
        jPanel13.add(from6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 140, -1));
        jPanel13.add(to6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 140, -1));

        jButton12.setText("Tìm Kiếm");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        bang2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sinh viên", "Mã phiếu", "Ngày mượn", "Hạn trả", "Ngày Trả", "Mã sách"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(bang2);

        jPanel13.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 410, 250));

        jLabel39.setText("Từ ngày:");
        jPanel13.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel47.setText("Đến ngày:");
        jPanel13.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jPanel4.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 430, 390));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/—Pngtree—clouds sky blue aesthetic pastel_2447709.png"))); // NOI18N
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1940, -1));

        jTabbedPane1.addTab("Thống Kê", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1590, 650));

        jButton2.setText("Đăng Xuất");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 680, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/—Pngtree—clouds sky blue aesthetic pastel_2447709.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1630, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        DangNhap dangnhap = new DangNhap();
        dangnhap.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void themmuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themmuonActionPerformed
        try {
            String maP = mapmtmuon.getText();
            String maS = masachmuon.getText();
            String tenS = tensachmuon.getText();
            String maSV = masvmuon.getText();
            String hienTrang = (String) hientrangmuon.getSelectedItem();
            String ngayMuon = ngaymuon.getText();
            LocalDate ngayLapDate = LocalDate.parse(ngayMuon);
            LocalDate ngayHanTra = ngayLapDate.plusMonths(5);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            String hanTra = ngayHanTra.format(formatter);
            if (tenS.isEmpty() || tensvmuon.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) bangmuon.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                if (model.getValueAt(i, 1).equals(maS)) {
                    JOptionPane.showMessageDialog(null, "Sách đã tồn tại trong danh sách mượn.");
                    return;
                }
            }
            int damuon = Pmtcn.Sosachchuatra(maSV);
            if (damuon + model.getRowCount() >= 20) {
                JOptionPane.showMessageDialog(null, "Bạn đã mượn hết 20 quyển sách.");
                return;
            }
            model.addRow(new Object[]{maP, maS, tenS, ngayMuon, hanTra, hienTrang});
            masachmuon.setText("");
            tensachmuon.setText("");
            hientrangmuon.setSelectedItem("1");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_themmuonActionPerformed

    private void themnamxbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themnamxbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_themnamxbActionPerformed

    private void themhientrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themhientrangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_themhientrangActionPerformed

    private void xoasachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoasachActionPerformed
        DefaultTableModel model = (DefaultTableModel) bangsach.getModel();

        int[] selectedRows = bangsach.getSelectedRows();

        if (selectedRows.length == 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn sách để xóa.");
            return;
        }

        int choice = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa các sách đã chọn?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            Sachcn.xoaSach(selectedRows, model);
            Sachcn.loadBooks(model);
        }
    }//GEN-LAST:event_xoasachActionPerformed

    private void timkiemsachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timkiemsachActionPerformed
        String ten = nhapten.getText();
        if (ten.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Hãy nhập tên sách");
        }
        DefaultTableModel model = (DefaultTableModel) bangsach.getModel();
        Sachcn.loadBookByName(ten, model);
    }//GEN-LAST:event_timkiemsachActionPerformed

    private void suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaActionPerformed

    }//GEN-LAST:event_suaActionPerformed

    private void huycapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huycapnhatActionPerformed
        themma.setText("");
        themten.setText("");
        themtg.setText("");
        themtl.setText("");
        themnamxb.setText("");
        themnhaxb.setText("");
        themhientrang.setSelectedItem("1");
        themvitri.setSelectedItem("T1");
    }//GEN-LAST:event_huycapnhatActionPerformed

    private void masachmuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masachmuonActionPerformed
        try {
            String maSach = masachmuon.getText().trim();
            if (!maSach.matches("S\\d{3}")) {
                JOptionPane.showMessageDialog(null, "Mã sách phải theo định dạng S***.");
                return;
            }
            Sach sach = Sachcn.timma(maSach);
            if (sach == null) {
                JOptionPane.showMessageDialog(null, "Không tìm thấy thông tin sách có mã " + maSach);
                return;
            } else if (Sachcn.checktinhtrang(maSach) == false) {
                JOptionPane.showMessageDialog(null, "Sách  đang được mượn.");
                return;
            } else {
                tensachmuon.setText(sach.getTensach());
                String currentStatus = sach.getHientrangtruoc();

                List<String> validStatuses = Sachcn.getHienTrang(currentStatus);

                hientrangmuon.removeAllItems();
                for (String status : validStatuses) {
                    hientrangmuon.addItem(status);
                }

                hientrangmuon.setSelectedItem(currentStatus);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_masachmuonActionPerformed

    private void masvmuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masvmuonActionPerformed
        try {
            String maSV = masvmuon.getText().trim();
            if (!maSV.matches("\\d{7}")) {
                JOptionPane.showMessageDialog(null, "Mã sinh vien phải có 7 số.");
                return;
            }
            Sinhvien sv = Sinhviencn.loadById(maSV);
            if (sv == null) {
                JOptionPane.showMessageDialog(null, "Không tìm thấy thông tin sinh viên có mã " + maSV);
                return;
            }
            if(Pmtcn.checkQuaHan(maSV)){
                Sachquahan bang = new Sachquahan();
                bang.setVisible(true);
                bang.thongKe(maSV);
                return;
            }
            int damuon = Pmtcn.Sosachchuatra(maSV);
            if (damuon > 20) {
                JOptionPane.showMessageDialog(null, "Bạn đã mượn hết 20 quyển sách.");
                return;
            }
            tensvmuon.setText(sv.getTensv());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_masvmuonActionPerformed

    private void themvitriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themvitriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_themvitriActionPerformed

    private void masvlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masvlsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masvlsActionPerformed

    private void huythemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huythemActionPerformed

        masvmuon.setText("");
        tensvmuon.setText("");
        mapmtmuon.setText("");
        masachmuon.setText("");
        tensachmuon.setText("");
        hientrangmuon.setSelectedIndex(0);
    }//GEN-LAST:event_huythemActionPerformed

    private void muonsachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muonsachActionPerformed
        try {
            if (bangmuon.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Hãy thêm sách vào bảng");
                return;
            }
            String maD = masvmuon.getText();
            String tenSV = tensvmuon.getText();
            if (tenSV.equals("")) {
                JOptionPane.showMessageDialog(this, "Hãy nhập chính xác thông tin sinh viên.");
                return;
            }
            int choice = JOptionPane.showConfirmDialog(null, "Hãy xác nhậm sinh viên có mã " + maD 
                    + " mượn số sách này.", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                DefaultTableModel model = (DefaultTableModel) bangmuon.getModel();
                Pmtcn.Muonsach(maD, model);
                JOptionPane.showMessageDialog(this, "Mượn sách thành công.");
                jButton1ActionPerformed(evt);
                timkiemlsActionPerformed(evt);
                model.setRowCount(0);
                masvmuon.setText("");
                tensvmuon.setText("");
                mapmtmuon.setText(Sachcn.incrementCode(Pmtcn.findLastPmtId()));
                masachmuon.setText("");
                tensachmuon.setText("");
                hientrangmuon.setSelectedItem("1");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_muonsachActionPerformed

    private void huymuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huymuonActionPerformed
        DefaultTableModel model = (DefaultTableModel) bangmuon.getModel();
        model.setRowCount(0);
        masvmuon.setText("");
        tensvmuon.setText("");
        mapmtmuon.setText("");
        masachmuon.setText("");
        tensachmuon.setText("");
        hientrangmuon.setSelectedIndex(0);
    }//GEN-LAST:event_huymuonActionPerformed

    private void timtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timtraActionPerformed
        try {
            String maSV = masvtra.getText().trim();
            String tenS = tensachtra.getText().trim();
            if (tenS.equals("") && maSV.equals("")) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin.");
            }
            if (!maSV.matches("\\d{7}")) {
                JOptionPane.showMessageDialog(null, "Hãy nhập mã sinh viên có 7 số.");
                return;
            }
            if (Sinhviencn.loadById(maSV) == null && !maSV.equals("")) {
                JOptionPane.showMessageDialog(null, "Sinh viên không tồn tại.");
                return;
            }
            DefaultTableModel model = (DefaultTableModel) bangtra.getModel();
            Pmtcn.Loadttm(maSV, tenS, model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_timtraActionPerformed

    private void trasachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trasachActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) bangtra.getModel();
            int[] selectedRows = bangtra.getSelectedRows();

            if (selectedRows.length == 0) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn sách để trả.");
                return;
            }

            int choice = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn trả các sách đã chọn?",
                    "Xác nhận trả", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                String ngayTra = ngaytra.getText();
                Pmtcn.Trasach(selectedRows, ngayTra, model);
                Pmtcn.Loadttm(masvtra.getText().trim(), tensachtra.getText().trim(), model);
                jButton1ActionPerformed(evt);
                timkiemlsActionPerformed(evt);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_trasachActionPerformed

    private void timkiemlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timkiemlsActionPerformed
        try {
            String maSV = masvls.getText();
            String tenS = tensachls.getText();
            Date fromDate = fromls.getDate();
            Date toDate = tols.getDate();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            String fromDateStr = "";
            if (fromDate != null) {
                fromDateStr = sdf.format(fromDate);
            }
            String toDateStr = "";
            if (toDate != null) {
                toDateStr = sdf.format(toDate);
            }

            if (Sinhviencn.loadById(maSV) == null && !maSV.equals("")) {
                JOptionPane.showMessageDialog(null, "Sinh viên không tồn tại.");
                return;
            }
            
            DefaultTableModel model = (DefaultTableModel) bangls.getModel();
            Pmtcn.loadAll(maSV, tenS, fromDateStr, toDateStr, model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_timkiemlsActionPerformed

    private void themmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themmaActionPerformed
        try {
            String maSach = themma.getText().trim();
            if (!maSach.matches("S\\d{3}")) {
                JOptionPane.showMessageDialog(null, "Mã sách phải theo định dạng S***.");
                return;
            }
            Sach sach = Sachcn.timma(maSach);
            if (sach == null || Sachcn.checkisdelete(maSach) == false) {
                JOptionPane.showMessageDialog(null, "Không tìm thấy thông tin sách có mã " + maSach + ".");
                return;
            } else {
                themma.setText(sach.getMasach());
                themten.setText(sach.getTensach());
                themtg.setText(sach.getTacgia());
                themtl.setText(sach.getTheloai());
                themnhaxb.setText(sach.getNhaxb());
                themnamxb.setText(sach.getNamxb());
                themhientrang.setSelectedItem(sach.getHientrangtruoc());
                themvitri.setSelectedItem(sach.getVitri());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_themmaActionPerformed

    private void capnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capnhatActionPerformed
        try {
            String ma = themma.getText();
            String ten = themten.getText();
            String tg = themtg.getText();
            String tl = themtl.getText();
            String nhaxb = themnhaxb.getText();
            String namxb = themnamxb.getText();
            String vitri = (String) themvitri.getSelectedItem();
            String hientrang = (String) themhientrang.getSelectedItem();

            if (ma.isEmpty() || ten.isEmpty() || tg.isEmpty() || tl.isEmpty() || nhaxb.isEmpty() || vitri.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin sách");
            } else if (!namxb.matches("\\d{4}")) {
                JOptionPane.showMessageDialog(null, "Năm xuất bản phải là số và có 4 chữ số.");
            } else if (!ma.matches("S\\d{3}")) {
                JOptionPane.showMessageDialog(null, "Mã sách phải theo định dạng S***.");
            } else {
                Sach test = Sachcn.timma(ma);
                if (test == null) {
                    System.out.println("1");
                    Sach sach = new Sach(ma, ten, tg, tl, nhaxb, namxb, vitri, hientrang);
                    DefaultTableModel model = (DefaultTableModel) bangsach.getModel();
                    Sachcn.themSach(sach, model);
                    Sachcn.loadBooks(model);
                } else if (Sachcn.checkisdelete(test.getMasach()) == true) {
                    System.out.println("2");
                    Sach sach = new Sach(ma, ten, tg, tl, nhaxb, namxb, vitri, hientrang);
                    DefaultTableModel model = (DefaultTableModel) bangsach.getModel();
                    Sachcn.suaSach(sach, model);
                    Sachcn.loadBooks(model);
                } else {
                    System.out.println("3");
                    JOptionPane.showMessageDialog(null, "Không được thêm mã sách này. Hãy them sách từ mã " 
                            + Sachcn.incrementCode(Sachcn.findLastBookId()));
                }

                themma.setText("");
                themten.setText("");
                themtg.setText("");
                themtl.setText("");
                themnamxb.setText("");
                themnhaxb.setText("");
                themhientrang.setSelectedItem("1");
                themvitri.setSelectedItem("T1");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_capnhatActionPerformed

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked

    }//GEN-LAST:event_jPanel9MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) bangsach.getModel();
        Sachcn.loadBooks(model);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            Date fromDate = from1.getDate();
            Date toDate = to1.getDate();

            if (fromDate == null || toDate == null) {
                JOptionPane.showMessageDialog(null, "Hãy chọn khoảng thời gian.");
                return;
            }

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            String fromDateStr = sdf.format(fromDate);
            String toDateStr = sdf.format(toDate);

            Connection con = Database.getConnection();

            String sql = "SELECT COUNT(*) AS totalBorrows FROM PMT p "
                    + "WHERE p.ngaylap BETWEEN ? AND ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, fromDateStr);
            statement.setString(2, toDateStr);
            ResultSet rs = statement.executeQuery();
            int totalBorrows = 0;
            if (rs.next()) {
                totalBorrows = rs.getInt("totalBorrows");
            }
            tongluottk.setText(String.valueOf(totalBorrows));

            rs.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        try {
            if (tongluottk.getText().equals("0")) {
                JOptionPane.showMessageDialog(null, "Không có lượt mượn trong khoảng thời gian này.");
                return;
            }
            if (tongluottk.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Hãy nhập khoảng thời gian.");
                return;
            }
            Tongluotmuon bang = new Tongluotmuon();
            bang.setVisible(true);
            Date fromDate = from1.getDate();
            Date toDate = to1.getDate();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            String from = sdf.format(fromDate);
            String to = sdf.format(toDate);
            bang.Thongke(from, to);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {

            Connection con = Database.getConnection();

            LocalDate currentDate = LocalDate.now();
            LocalDate oneMonthFromNow = currentDate.plusMonths(1);
            String oneMonthFromNowStr = oneMonthFromNow.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));

            String sql1 = "SELECT COUNT(*) AS notReturned FROM ChitietMt ct "
                    + "JOIN PMT p ON p.maphieu = ct.maphieu "
                    + "WHERE ct.hientrangsau IS NULL "
                    + "AND p.hantra BETWEEN GETDATE() AND ?";
            PreparedStatement statement1 = con.prepareStatement(sql1);
            statement1.setString(1, oneMonthFromNowStr);
            ResultSet rs1 = statement1.executeQuery();
            int notReturned = 0;
            if (rs1.next()) {
                notReturned = rs1.getInt("notReturned");
            }
            tongdenhan.setText(String.valueOf(notReturned));
            rs1.close();
            statement1.close();

            String sql = "SELECT p.maphieu, ct.masach, p.ngaylap, p.hantra, p.masv "
                    + "FROM PMT p "
                    + "JOIN ChitietMt ct ON p.maphieu = ct.maphieu "
                    + "WHERE ct.hientrangsau IS NULL "
                    + "AND p.hantra BETWEEN GETDATE() AND ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, oneMonthFromNowStr);
            ResultSet rs = statement.executeQuery();
            DefaultTableModel model = (DefaultTableModel) bang1.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("maphieu"),
                    rs.getString("masach"),
                    rs.getString("ngaylap"),
                    rs.getString("hantra"),
                    rs.getString("masv"),});
            }

            rs.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try {
            Date fromDate = from5.getDate();
            Date toDate = to5.getDate();

            if (fromDate == null || toDate == null) {
                JOptionPane.showMessageDialog(null, "Hãy nhập khoảng thời gian.");
                return;
            }

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            String fromDateStr = sdf.format(fromDate);
            String toDateStr = sdf.format(toDate);

            Connection con = Database.getConnection();
            String sql1 = "SELECT COUNT(*) AS notReturned FROM ChitietMt ct "
                    + "JOIN PMT p ON p.maphieu = ct.maphieu "
                    + "WHERE p.ngaylap BETWEEN ? AND ? AND ct.hientrangsau IS NULL";
            PreparedStatement statement1 = con.prepareStatement(sql1);
            statement1.setString(1, fromDateStr);
            statement1.setString(2, toDateStr);
            ResultSet rs1 = statement1.executeQuery();
            int notReturned = 0;
            if (rs1.next()) {
                notReturned = rs1.getInt("notReturned");
            }
            tongchuatra.setText(String.valueOf(notReturned));
            rs1.close();
            statement1.close();
            String sql = "SELECT p.maphieu, ct.masach, p.ngaylap, p.hantra, p.masv  FROM PMT p "
                    + "JOIN ChitietMt ct ON p.maphieu = ct.maphieu "
                    + "WHERE p.ngaylap BETWEEN ? AND ? AND ct.hientrangsau IS NULL";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, fromDateStr);
            statement.setString(2, toDateStr);
            ResultSet rs = statement.executeQuery();
            DefaultTableModel model = (DefaultTableModel) bang3.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("maphieu"),
                    rs.getString("masach"),
                    rs.getString("ngaylap"),
                    rs.getString("hantra"),
                    rs.getString("masv"),});
            }
            rs.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel12MouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        try {
            Date fromDate = from6.getDate();
            Date toDate = to6.getDate();

            if (fromDate == null || toDate == null) {
                JOptionPane.showMessageDialog(null, "Hãy nhập khoảng thời gian.");
                return;
            }

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            String fromDateStr = sdf.format(fromDate);
            String toDateStr = sdf.format(toDate);

            Connection con = Database.getConnection();
            String sql1 = "SELECT COUNT(*) AS quahan FROM PMT p "
                    + "JOIN ChitietMT ct ON p.maphieu = ct.maphieu "
                    + "WHERE p.ngaylap BETWEEN ? AND ? "
                    + "AND ("
                    + "(ct.ngaytra IS NULL AND p.hantra < GETDATE()) "
                    + "OR (ct.ngaytra > p.hantra)"
                    + ")";
            PreparedStatement statement1 = con.prepareStatement(sql1);
            statement1.setString(1, fromDateStr);
            statement1.setString(2, toDateStr);
            ResultSet rs1 = statement1.executeQuery();
            int quahan = 0;
            if (rs1.next()) {
                quahan = rs1.getInt("quahan");
            }
            tongquahan.setText(String.valueOf(quahan));
            rs1.close();
            statement1.close();
            String sql = "SELECT p.masv, p.maphieu, p.ngaylap, p.hantra, ct.ngaytra, ct.masach  FROM PMT p "
                    + "JOIN ChitietMt ct ON p.maphieu = ct.maphieu "
                    + "WHERE p.ngaylap BETWEEN ? AND ? "
                    + "AND ("
                    + "(ct.ngaytra IS NULL AND p.hantra < GETDATE()) "
                    + "OR (ct.ngaytra > p.hantra)"
                    + ")";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, fromDateStr);
            statement.setString(2, toDateStr);
            ResultSet rs = statement.executeQuery();
            DefaultTableModel model = (DefaultTableModel) bang2.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("masv"),
                    rs.getString("maphieu"),
                    rs.getString("ngaylap"),
                    rs.getString("hantra"),
                    rs.getString("ngaytra"),
                    rs.getString("masach"),});
            }
            rs.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel13MouseClicked

    private void mapmtmuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapmtmuonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mapmtmuonActionPerformed

    private void hientrangmuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hientrangmuonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hientrangmuonActionPerformed

    private void tongquahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tongquahanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tongquahanActionPerformed

    private void tongluottkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tongluottkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tongluottkActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TTpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bang1;
    private javax.swing.JTable bang2;
    private javax.swing.JTable bang3;
    private javax.swing.JTable bangls;
    private javax.swing.JTable bangmuon;
    private javax.swing.JTable bangsach;
    private javax.swing.JTable bangtra;
    private javax.swing.JButton capnhat;
    private com.toedter.calendar.JDateChooser from1;
    private com.toedter.calendar.JDateChooser from5;
    private com.toedter.calendar.JDateChooser from6;
    private com.toedter.calendar.JDateChooser fromls;
    private javax.swing.JComboBox hientrangmuon;
    private javax.swing.JButton huycapnhat;
    private javax.swing.JButton huymuon;
    private javax.swing.JButton huythem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField mapmtmuon;
    private javax.swing.JTextField masachmuon;
    private javax.swing.JTextField masvls;
    private javax.swing.JTextField masvmuon;
    private javax.swing.JTextField masvtra;
    private javax.swing.JButton muonsach;
    private javax.swing.JTextField ngaymuon;
    private javax.swing.JTextField ngaytra;
    private javax.swing.JTextField nhapten;
    private javax.swing.JButton sua;
    private javax.swing.JTextField tensachls;
    private javax.swing.JTextField tensachmuon;
    private javax.swing.JTextField tensachtra;
    private javax.swing.JTextField tensvmuon;
    private javax.swing.JComboBox themhientrang;
    private javax.swing.JTextField themma;
    private javax.swing.JButton themmuon;
    private javax.swing.JTextField themnamxb;
    private javax.swing.JTextField themnhaxb;
    private javax.swing.JTextField themten;
    private javax.swing.JTextField themtg;
    private javax.swing.JTextField themtl;
    private javax.swing.JComboBox<String> themvitri;
    private javax.swing.JButton timkiemls;
    private javax.swing.JButton timkiemsach;
    private javax.swing.JButton timtra;
    private com.toedter.calendar.JDateChooser to1;
    private com.toedter.calendar.JDateChooser to5;
    private com.toedter.calendar.JDateChooser to6;
    private com.toedter.calendar.JDateChooser tols;
    private javax.swing.JTextField tongchuatra;
    private javax.swing.JTextField tongdenhan;
    private javax.swing.JTextField tongluottk;
    private javax.swing.JTextField tongquahan;
    private javax.swing.JButton trasach;
    private javax.swing.JButton xoasach;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.FormDAO;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import model.KhachHang;

/**
 *
 * @author MinhNguyenCong
 */
public class ManHinhChinh extends javax.swing.JFrame {

    private static String taiKhoan;
    private static String matKhau;
    private static int manv;
    private static int chucVu;
    public static JDesktopPane jdp;

    /**
     * Creates new form ManHinhChinh
     */
    public ManHinhChinh(String taiKhoan, String matKhau, int manv, int chucVu) {
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.manv = manv;
        this.chucVu = chucVu;

        initComponents();
        setLocationRelativeTo(null);
        if (ManHinhChinh.chucVu == 0) {
            jMenu1.setVisible(false);
            jMenu3.setVisible(false);
        }
    }

    public static int getChucVu() {
        return chucVu;
    }

    public static void setChucVu(int chucVu) {
        ManHinhChinh.chucVu = chucVu;
    }

    public static String getTaiKhoan() {
        return taiKhoan;
    }

    public static void setTaiKhoan(String taiKhoan) {
        ManHinhChinh.taiKhoan = taiKhoan;
    }

    public static String getMatKhau() {
        return matKhau;
    }

    public static void setMatKhau(String matKhau) {
        ManHinhChinh.matKhau = matKhau;
    }

    public static int getManv() {
        return manv;
    }

    public static void setManv(int manv) {
        ManHinhChinh.manv = manv;
    }

    private ManHinhChinh() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnBanHang = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnKhachHang = new javax.swing.JButton();
        btnSanPham = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuNhanVien = new javax.swing.JMenuItem();
        mnuSanPham = new javax.swing.JMenuItem();
        mnuKhachHang = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuHoaDonNhap = new javax.swing.JMenuItem();
        mnuHoaDonBan = new javax.swing.JMenuItem();
        mnuHoaDonChi = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuSanPhamYeuThich = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btnBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-sell-32.png"))); // NOI18N
        btnBanHang.setText("B??n H??ng");
        btnBanHang.setFocusable(false);
        btnBanHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBanHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanHangActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBanHang);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-invoice-32.png"))); // NOI18N
        jButton1.setText("Chi Ti??u");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        btnKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-customer-32.png"))); // NOI18N
        btnKhachHang.setText("Kh??ch H??ng");
        btnKhachHang.setFocusable(false);
        btnKhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhachHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKhachHang);

        btnSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-product-32.png"))); // NOI18N
        btnSanPham.setText("S???n ph???m");
        btnSanPham.setFocusable(false);
        btnSanPham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSanPham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSanPham);

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-32.png"))); // NOI18N
        btnDangXuat.setText("????ng xu???t");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangXuat);

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-export-32.png"))); // NOI18N
        btnThoat.setText("Tho??t");
        btnThoat.setFocusable(false);
        btnThoat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThoat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnThoat);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );

        jMenu1.setText("Qu???n L?? ngu???n l???c");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        mnuNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-staff-32.png"))); // NOI18N
        mnuNhanVien.setText("Qu???n l?? nh??n vi??n");
        mnuNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNhanVienActionPerformed(evt);
            }
        });
        jMenu1.add(mnuNhanVien);

        mnuSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-product-32.png"))); // NOI18N
        mnuSanPham.setText("Qu???n l?? s???n ph???m");
        mnuSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSanPhamActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSanPham);

        mnuKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-customer-32.png"))); // NOI18N
        mnuKhachHang.setText("Qu???n l?? kh??ch h??ng");
        mnuKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKhachHangActionPerformed(evt);
            }
        });
        jMenu1.add(mnuKhachHang);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Qu???n l?? h??a ????n");

        mnuHoaDonNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-bill-32.png"))); // NOI18N
        mnuHoaDonNhap.setText("H??a ????n nh???p");
        mnuHoaDonNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHoaDonNhapActionPerformed(evt);
            }
        });
        jMenu2.add(mnuHoaDonNhap);

        mnuHoaDonBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-paid-bill-32.png"))); // NOI18N
        mnuHoaDonBan.setText("H??a ????n b??n");
        mnuHoaDonBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHoaDonBanActionPerformed(evt);
            }
        });
        jMenu2.add(mnuHoaDonBan);

        mnuHoaDonChi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-invoice-32.png"))); // NOI18N
        mnuHoaDonChi.setText("H??a ????n chi");
        mnuHoaDonChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHoaDonChiActionPerformed(evt);
            }
        });
        jMenu2.add(mnuHoaDonChi);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Th???ng k??");

        mnuSanPhamYeuThich.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-facebook-like-32.png"))); // NOI18N
        mnuSanPhamYeuThich.setText("S???n ph???m y??u th??ch");
        mnuSanPhamYeuThich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSanPhamYeuThichActionPerformed(evt);
            }
        });
        jMenu3.add(mnuSanPhamYeuThich);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("H??? th???ng");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1134, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNhanVienActionPerformed
        // TODO add your handling code here:
        try {
            QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
            this.jDesktopPane1.add(quanLyNhanVien);
            FormDAO.setCenter(jDesktopPane1, quanLyNhanVien);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_mnuNhanVienActionPerformed

    private void mnuSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSanPhamActionPerformed
        // TODO add your handling code here:
        try {
            QuanLySanPham quanLySanPham = new QuanLySanPham();
            this.jDesktopPane1.add(quanLySanPham);
            controller.FormDAO.setCenter(jDesktopPane1, quanLySanPham);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_mnuSanPhamActionPerformed

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        // TODO add your handling code here:
        try {
            QuanLySanPham quanLySanPham = new QuanLySanPham();
            this.jDesktopPane1.add(quanLySanPham);
            controller.FormDAO.setCenter(jDesktopPane1, quanLySanPham);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        try {
            int hoi = JOptionPane.showConfirmDialog(this, "B???n c?? mu???n tho??t kh???i ph???n m???m ?");
            if (hoi != JOptionPane.YES_OPTION) {
                return;
            }
            System.exit(hoi);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        try {
            int hoi = JOptionPane.showConfirmDialog(this, "B???n c?? mu???n ????ng xu???t ?");
            if (hoi != JOptionPane.YES_OPTION) {
                return;
            }
            DangNhap dangNhap = new DangNhap();
            dangNhap.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void mnuHoaDonChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHoaDonChiActionPerformed
        // TODO add your handling code here:
        try {
            QLHoaDonChi hoaDonChi = new QLHoaDonChi();
            this.jDesktopPane1.add(hoaDonChi);
            FormDAO.setCenter(jDesktopPane1, hoaDonChi);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_mnuHoaDonChiActionPerformed

    private void btnBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanHangActionPerformed
        // TODO add your handling code here:
        try {
            BanHang banhang = new BanHang();
            this.jDesktopPane1.add(banhang);
            controller.FormDAO.setCenter(jDesktopPane1, banhang);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBanHangActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        // TODO add your handling code here:
        try {
            QuanLyKhachHang qlkh = new QuanLyKhachHang();
            this.jDesktopPane1.add(qlkh);
            controller.FormDAO.setCenter(jDesktopPane1, qlkh);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void mnuKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKhachHangActionPerformed
        // TODO add your handling code here:
        try {
            QuanLyKhachHang qlkh = new QuanLyKhachHang();
            this.jDesktopPane1.add(qlkh);
            controller.FormDAO.setCenter(jDesktopPane1, qlkh);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_mnuKhachHangActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            QLHoaDonChi hoaDonChi = new QLHoaDonChi();
            this.jDesktopPane1.add(hoaDonChi);
            FormDAO.setCenter(jDesktopPane1, hoaDonChi);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mnuSanPhamYeuThichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSanPhamYeuThichActionPerformed
        // TODO add your handling code here:
        try {
            SanPhamYeuThich spyt = new SanPhamYeuThich();
            this.jDesktopPane1.add(spyt);
            FormDAO.setCenter(jDesktopPane1, spyt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_mnuSanPhamYeuThichActionPerformed

    private void mnuHoaDonBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHoaDonBanActionPerformed
        // TODO add your handling code here:
        try {
            QLHoaDonBan qlhdb = new QLHoaDonBan();
            this.jDesktopPane1.add(qlhdb);
            FormDAO.setCenter(jDesktopPane1, qlhdb);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_mnuHoaDonBanActionPerformed

    private void mnuHoaDonNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHoaDonNhapActionPerformed
        // TODO add your handling code here:
        try {
            QLHoaDonNhap qlhdn = new QLHoaDonNhap();
            this.jDesktopPane1.add(qlhdn);
            FormDAO.setCenter(jDesktopPane1, qlhdn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_mnuHoaDonNhapActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
        try {
            HeThong heThong = new HeThong();
            this.jDesktopPane1.add(heThong);
            FormDAO.setCenter(jDesktopPane1, heThong);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
        try {
            HeThong heThong = new HeThong();
            this.jDesktopPane1.add(heThong);
            FormDAO.setCenter(jDesktopPane1, heThong);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenu4MouseClicked

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
            java.util.logging.Logger.getLogger(ManHinhChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManHinhChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManHinhChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManHinhChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManHinhChinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBanHang;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mnuHoaDonBan;
    private javax.swing.JMenuItem mnuHoaDonChi;
    private javax.swing.JMenuItem mnuHoaDonNhap;
    private javax.swing.JMenuItem mnuKhachHang;
    private javax.swing.JMenuItem mnuNhanVien;
    private javax.swing.JMenuItem mnuSanPham;
    private javax.swing.JMenuItem mnuSanPhamYeuThich;
    // End of variables declaration//GEN-END:variables
}

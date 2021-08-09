/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.FormDAO;
import controller.KetNoi;
import controller.QLHoaDonBanDAO;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HoaDonBan;

/**
 *
 * @author MinhNguyenCong
 */
public class QLHoaDonBan extends javax.swing.JInternalFrame {
    private DefaultTableModel model;
    private String columns [] = {"Mã hóa đơn","Thành tiền","Ngày tạo","Mã khách hàng","Mã nhân viên"};
    private List<HoaDonBan> listHoaDonBan;
    /**
     * Creates new form QLHoaDonBan
     */
    public QLHoaDonBan() {
        initComponents();
        tblQuanLyHoaDonBan.setModel(model = new DefaultTableModel(columns, 0));
        fillDataToTable();
    }
    
    private void fillDataToTable(){
        listHoaDonBan = QLHoaDonBanDAO.getHoaDonBan();
        try {
            model.setRowCount(0);
            for (HoaDonBan o : listHoaDonBan) {
                model.addRow(new Object[]{o.getMaHoaDonBan(), o.getThanhTien(), o.getNgayTao(), o.getMaKhachHang(), o.getMaNhanVien()});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private boolean checkNull(){
        if (txtMaHoaDon.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã hóa đơn không được để trống");
            return true;
        }
        return false;
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblQuanLyHoaDonBan = new javax.swing.JTable();
        txtMaHoaDon = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Quản Lý Hóa Đơn Bán");

        tblQuanLyHoaDonBan.setModel(new javax.swing.table.DefaultTableModel(
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
        tblQuanLyHoaDonBan.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblQuanLyHoaDonBanAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tblQuanLyHoaDonBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuanLyHoaDonBanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblQuanLyHoaDonBan);

        jLabel10.setText("Mã hóa đơn :");

        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesbt/Search.png"))); // NOI18N
        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTimKiem))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimKiem)
                    .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(290, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        try {
            if (checkNull()) {
                return;
            }
            for (HoaDonBan o : listHoaDonBan) {
                if (Integer.parseInt(txtMaHoaDon.getText()) == o.getMaHoaDonBan()) {
                    model.setRowCount(0);
                    model.addRow(new Object[]{o.getMaHoaDonBan(), o.getThanhTien(), o.getNgayTao(), o.getMaKhachHang(), o.getMaNhanVien()});
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "Không tìm thấy hóa đơn này!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void tblQuanLyHoaDonBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuanLyHoaDonBanMouseClicked
        // TODO add your handling code here:
        try {
            int index = tblQuanLyHoaDonBan.getSelectedRow();
            HoaDonBanCT hoaDonBanCT = new HoaDonBanCT(Integer.parseInt(tblQuanLyHoaDonBan.getValueAt(index, 0).toString()));
            this.add(hoaDonBanCT);
            hoaDonBanCT.setVisible(true);
            hoaDonBanCT.setLocation(50, 350);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblQuanLyHoaDonBanMouseClicked

    private void tblQuanLyHoaDonBanAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblQuanLyHoaDonBanAncestorAdded
        // TODO add your handling code here:
        try {
            int index = 0;
            HoaDonBanCT hoaDonBanCT = new HoaDonBanCT(Integer.parseInt(tblQuanLyHoaDonBan.getValueAt(index, 0).toString()));
            this.add(hoaDonBanCT);
            hoaDonBanCT.setVisible(true);
            hoaDonBanCT.setLocation(50, 350);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblQuanLyHoaDonBanAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblQuanLyHoaDonBan;
    private javax.swing.JTextField txtMaHoaDon;
    // End of variables declaration//GEN-END:variables
}
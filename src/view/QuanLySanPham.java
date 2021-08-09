/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.BanHangDAO;
import controller.NhanVienDAO;
import controller.SanPhamDAO;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.LoaiSanPham;
import model.SanPham;
import model.ThuongHieu;

/**
 *
 * @author MinhNguyenCong
 */
public class QuanLySanPham extends javax.swing.JInternalFrame {

    private List<SanPham> listSanPham;
    private List<LoaiSanPham> listLoaiSanPham;
    private List<ThuongHieu> listThuongHieu;
    private DefaultTableModel model;
    private String columns[] = {"Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Giá sản phẩm", "Mô tả", "Ảnh", "Mã loại sản phẩm", "Mã thương hiệu"};
    private String hinhAnh = null;
    private int index = -1;
    private int sua = -1;
    private int maSP = -1;
    private File f = null;
    private String path = null;
    private String tenHinhAnh = null;
    private int width = -1;
    private int height = -1;

    /**
     * Creates new form QuanLySanPham
     */
    public QuanLySanPham() {
        initComponents();
        listLoaiSanPham = new ArrayList<>();
        listThuongHieu = new ArrayList<>();
        listLoaiSanPham = new ArrayList<>();
        tblQuanLySanPham.setModel(model = new DefaultTableModel(columns, 0));
        fillDataToTable();
        loadDataToComboboxLSP();
        loadDataToComboboxTTH();
        setImgToLabel();
    }

    private void setImgToLabel() {
        try {
            String hinhAnh = null;
            if (tblQuanLySanPham.getRowCount() == 0) {
                return;
            }
            hinhAnh = tblQuanLySanPham.getValueAt(0, 5).toString();
            if (hinhAnh == null) {
                return;
            }
            File file = new File("C:\\Users\\MinhNguyenCong\\Documents\\NetBeansProjects\\QLCHBXD\\src\\imagesxd\\" + hinhAnh);
            Image img = ImageIO.read(file);
            int width = 453;
            int height = 214;
            lblHinhAnh.setText(null);
            lblHinhAnh.setIcon(new ImageIcon(img.getScaledInstance(width, height, 0)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void fillDataToTable() {
        listSanPham = SanPhamDAO.getSanPham();
        model.setRowCount(0);
        for (SanPham o : listSanPham) {
            model.addRow(new Object[]{o.getMaSanPham(), o.getTenSanPham(), o.getSoLuong(), o.getGiaSanPham(), o.getMoTa(), o.getAnh(), o.getMaLoaiSanPham(), o.getMaLoaiThuongHieu()});
        }
    }

    private void loadDataToComboboxTTH() {
        try {
            cboThuongHieu.removeAllItems();
            listThuongHieu = BanHangDAO.getThuongHieu();
            for (ThuongHieu o : listThuongHieu) {
                cboThuongHieu.addItem(o.getTenThuongHieu());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadDataToComboboxLSP() {
        try {
            cboLoaiSanPham.removeAllItems();
            listLoaiSanPham = BanHangDAO.getLoaiSanPhams();
            for (LoaiSanPham o : listLoaiSanPham) {
                cboLoaiSanPham.addItem(o.getTenLoaiSanPham());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean checkNullTK() {
        if (txtMaSanPhamTK.getText().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkSo() {
        try {
            int so = Integer.parseInt(txtMaSanPhamTK.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Mã sản phẩm phải là số nguyên!");
            return true;
        }
        return false;
    }

    private boolean checkNull() {
        if (txtTenSanPham.getText().isEmpty() || txtSoLuong.getText().isEmpty() || txtGia.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chỉ có thể để trống phần mô tả");
            return true;
        } else {
            return false;
        }
    }

    private boolean checkSo1() {
        try {
            int sl = Integer.parseInt(txtSoLuong.getText());
            int gia = Integer.parseInt(txtGia.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Số lượng hoặc giá phải là số nguyên");
            return true;
        }
        return false;
    }

    private int getMaLoaiSP() {
        listLoaiSanPham = SanPhamDAO.getLoaiSanPhams();
        int maLoaiSanPham = -1;
        for (LoaiSanPham o : listLoaiSanPham) {
            if (o.getTenLoaiSanPham().equalsIgnoreCase(cboLoaiSanPham.getSelectedItem().toString())) {
                maLoaiSanPham = o.getMaLoaiSanPham();
                return maLoaiSanPham;
            }
        }
        return maLoaiSanPham;
    }

    private int getMaThuongHieu() {
        listThuongHieu = SanPhamDAO.getThuongHieu();
        int maThuongHieu = -1;
        for (ThuongHieu o : listThuongHieu) {
            if (o.getTenThuongHieu().equalsIgnoreCase(cboThuongHieu.getSelectedItem().toString())) {
                maThuongHieu = o.getMaThuongHieu();
                return maThuongHieu;
            }
        }
        return maThuongHieu;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTenSanPham = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        txtMoTa = new javax.swing.JTextField();
        btnXoaForm = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        txtSoLuong = new javax.swing.JTextField();
        cboLoaiSanPham = new javax.swing.JComboBox<>();
        cboThuongHieu = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtMaSanPhamTK = new javax.swing.JTextField();
        btnTimKiemNhanVien = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQuanLySanPham = new javax.swing.JTable();
        lblHinhAnh = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Quản Lý Sản Phẩm");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Tên sản phẩm :");

        jLabel4.setText("Số lượng :");

        jLabel6.setText("Giá :");

        jLabel7.setText("Mô tả :");

        jLabel8.setText("Nhóm loại sản phẩm :");

        jLabel5.setText("Nhóm thương hiệu :");

        btnXoaForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesbt/Delete.png"))); // NOI18N
        btnXoaForm.setText("Xóa Form");
        btnXoaForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaFormActionPerformed(evt);
            }
        });

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesbt/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesbt/refresh.png"))); // NOI18N
        btnLamMoi.setText("Làm Mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesbt/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        cboLoaiSanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboThuongHieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setText("Mã sản Phẩm :");

        btnTimKiemNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesbt/Search.png"))); // NOI18N
        btnTimKiemNhanVien.setText("Tìm kiếm sản phẩm");
        btnTimKiemNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemNhanVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(90, 90, 90))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtMaSanPhamTK, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnTimKiemNhanVien)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaSanPhamTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTimKiemNhanVien)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenSanPham)
                            .addComponent(txtGia)
                            .addComponent(txtMoTa)
                            .addComponent(txtSoLuong)
                            .addComponent(cboLoaiSanPham, 0, 201, Short.MAX_VALUE)
                            .addComponent(cboThuongHieu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLamMoi)
                                    .addComponent(btnXoaForm))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSua)
                                    .addComponent(btnThem))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLamMoi, btnSua, btnThem, btnXoaForm});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaForm)
                    .addComponent(btnThem))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLamMoi)
                    .addComponent(btnSua))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        tblQuanLySanPham.setModel(new javax.swing.table.DefaultTableModel(
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
        tblQuanLySanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuanLySanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQuanLySanPham);

        lblHinhAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinhAnh.setText("Hình ảnh");
        lblHinhAnh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblHinhAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhAnhMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Quản Lý Sản Phẩm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(411, 411, 411)
                .addComponent(jLabel1)
                .addContainerGap(423, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHinhAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaFormActionPerformed
        // TODO add your handling code here:
        try {
            txtTenSanPham.setText(null);
            txtSoLuong.setText(null);
            txtGia.setText(null);
            txtMoTa.setText(null);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnXoaFormActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        try {
            fillDataToTable();
            setImgToLabel();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnTimKiemNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemNhanVienActionPerformed
        // TODO add your handling code here:
        try {
            if (checkNullTK()) {
                return;
            }
            if (checkSo()) {
                return;
            }
            for (SanPham o : listSanPham) {
                if (o.getMaSanPham() == Integer.parseInt(txtMaSanPhamTK.getText())) {
                    model.setRowCount(0);
                    model.addRow(new Object[]{o.getMaSanPham(), o.getTenSanPham(), o.getSoLuong(), o.getGiaSanPham(), o.getMoTa(), o.getAnh(), o.getMaLoaiSanPham(), o.getMaLoaiThuongHieu()});
                    if (o.getAnh() != null) {
                        File file = new File("C:\\Users\\MinhNguyenCong\\Documents\\NetBeansProjects\\QLCHBXD\\src\\imagesxd\\" + o.getAnh());
                        Image img = ImageIO.read(file);
                        int width = 453;
                        int height = 214;
                        lblHinhAnh.setText(null);
                        lblHinhAnh.setIcon(new ImageIcon(img.getScaledInstance(width, height, 0)));
                    } else {
                        File file = new File("C:\\Users\\MinhNguyenCong\\Documents\\NetBeansProjects\\QLCHBXD\\src\\imagesxd\\noimg.jpg");
                        Image img = ImageIO.read(file);
                        int width = 453;
                        int height = 214;
                        lblHinhAnh.setText(null);
                        lblHinhAnh.setIcon(new ImageIcon(img.getScaledInstance(width, height, 0)));
                    }
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "Không tìm thấy");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTimKiemNhanVienActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        try {
            if (checkNull()) {
                return;
            }
            if (checkSo1()) {
                return;
            }
            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn thêm sản phẩm này");
            if (hoi != JOptionPane.YES_OPTION) {
                return;
            }
            int sl = Integer.parseInt(txtSoLuong.getText());
            int gia = Integer.parseInt(txtGia.getText());
            if (tenHinhAnh != null) {
                f = new File(path);
                BufferedImage image = ImageIO.read(f);
                f = new File("C:\\Users\\MinhNguyenCong\\Documents\\NetBeansProjects\\QLCHBXD\\src\\imagesxd\\" + tenHinhAnh);
                ImageIO.write(image, "jpg", f);
            }
            SanPhamDAO.addSanPham(txtTenSanPham.getText(), sl, gia, txtMoTa.getText(), tenHinhAnh, getMaLoaiSP(), getMaThuongHieu());
            JOptionPane.showMessageDialog(this, "Thêm sản phẩm thành công!");
            hinhAnh = null;
            tenHinhAnh = null;
            fillDataToTable();
            setImgToLabel();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void lblHinhAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhAnhMouseClicked
        // TODO add your handling code here:
        try {
            width = lblHinhAnh.getWidth();
            height = lblHinhAnh.getHeight();
            JFileChooser jfc = new JFileChooser();
            int i = jfc.showOpenDialog(this);
            if (i == JFileChooser.APPROVE_OPTION) {
                f = jfc.getSelectedFile();
                path = f.getAbsolutePath();
                tenHinhAnh = f.getName();
                BufferedImage image = ImageIO.read(f);
                lblHinhAnh.setText(null);
                lblHinhAnh.setIcon(new ImageIcon(image.getScaledInstance(width, height, 0)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_lblHinhAnhMouseClicked

    private void tblQuanLySanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuanLySanPhamMouseClicked
        // TODO add your handling code here:
        try {
            sua = tblQuanLySanPham.getSelectedRow();
            index = tblQuanLySanPham.getSelectedRow();
            maSP = (int) tblQuanLySanPham.getValueAt(index, 0);
            if (tblQuanLySanPham.getRowCount() == 0) {
                return;
            }
            if (tblQuanLySanPham.getValueAt(index, 5) == null) {
                File file = new File("C:\\Users\\MinhNguyenCong\\Documents\\NetBeansProjects\\QLCHBXD\\src\\imagesxd\\noimg.png");
                Image img = ImageIO.read(file);
                int width = 453;
                int height = 214;
                lblHinhAnh.setText(null);
                lblHinhAnh.setIcon(new ImageIcon(img.getScaledInstance(width, height, 0)));
                hinhAnh = null;
                return;
            }
            hinhAnh = tblQuanLySanPham.getValueAt(index, 5).toString();
            File file = new File("C:\\Users\\MinhNguyenCong\\Documents\\NetBeansProjects\\QLCHBXD\\src\\imagesxd\\" + hinhAnh);
            Image img = ImageIO.read(file);
            int width = 453;
            int height = 214;
            lblHinhAnh.setText(null);
            lblHinhAnh.setIcon(new ImageIcon(img.getScaledInstance(width, height, 0)));
            hinhAnh = null;
            index = -1;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblQuanLySanPhamMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        try {
            if (checkNull()) {
                return;
            }
            if (checkSo1()) {
                return;
            }
            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn sửa sản phẩm này?");
            if (hoi != JOptionPane.YES_OPTION) {
                return;
            }
            int sl = Integer.parseInt(txtSoLuong.getText());
            int gia = Integer.parseInt(txtGia.getText());
            if (tenHinhAnh != null) {
                f = new File(path);
                BufferedImage image = ImageIO.read(f);
                f = new File("C:\\Users\\MinhNguyenCong\\Documents\\NetBeansProjects\\QLCHBXD\\src\\imagesxd\\" + tenHinhAnh);
                ImageIO.write(image, "jpg", f);
            }
            SanPhamDAO.updateSP(txtTenSanPham.getText(), sl, gia, txtMoTa.getText(), hinhAnh, getMaLoaiSP(), getMaThuongHieu(), maSP);
            JOptionPane.showMessageDialog(this, "Sửa sản phẩm thành công!");
            hinhAnh = null;
            maSP = -1;
            fillDataToTable();
            setImgToLabel();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSuaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiemNhanVien;
    private javax.swing.JButton btnXoaForm;
    private javax.swing.JComboBox<String> cboLoaiSanPham;
    private javax.swing.JComboBox<String> cboThuongHieu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHinhAnh;
    private javax.swing.JTable tblQuanLySanPham;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaSanPhamTK;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSanPham;
    // End of variables declaration//GEN-END:variables
}

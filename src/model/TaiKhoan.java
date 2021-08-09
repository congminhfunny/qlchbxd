/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author MinhNguyenCong
 */
public class TaiKhoan {
    private String tenDangNhap;
    private String matKhau;
    private int maNhanVien;

    public TaiKhoan() {
    }

    public TaiKhoan(String tenDangNhap, String matKhau, int maNhanVien) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.maNhanVien = maNhanVien;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "tenDangNhap=" + tenDangNhap + ", matKhau=" + matKhau + ", maNhanVien=" + maNhanVien + '}';
    }
    
    
}

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
public class HoaDonNhap {
    private int maHoaDonNhap;
    private int thanhTien;
    private String ngayTao;
    private int maNhanVien;

    public HoaDonNhap() {
    }

    public HoaDonNhap(int maHoaDonNhap, int thanhTien, String ngayTao, int maNhanVien) {
        this.maHoaDonNhap = maHoaDonNhap;
        this.thanhTien = thanhTien;
        this.ngayTao = ngayTao;
        this.maNhanVien = maNhanVien;
    }

    public int getMaHoaDonNhap() {
        return maHoaDonNhap;
    }

    public void setMaHoaDonNhap(int maHoaDonNhap) {
        this.maHoaDonNhap = maHoaDonNhap;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    @Override
    public String toString() {
        return "HoaDonNhap{" + "maHoaDonNhap=" + maHoaDonNhap + ", thanhTien=" + thanhTien + ", ngayTao=" + ngayTao + ", maNhanVien=" + maNhanVien + '}';
    }
    
    
}

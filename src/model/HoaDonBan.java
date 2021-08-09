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
public class HoaDonBan {
    private int maHoaDonBan;
    private int thanhTien;
    private String ngayTao;
    private int maKhachHang;
    private int maNhanVien;

    public HoaDonBan() {
    }

    public HoaDonBan(int maHoaDonBan, int thanhTien, String ngayTao, int maKhachHang, int maNhanVien) {
        this.maHoaDonBan = maHoaDonBan;
        this.thanhTien = thanhTien;
        this.ngayTao = ngayTao;
        this.maKhachHang = maKhachHang;
        this.maNhanVien = maNhanVien;
    }

    public int getMaHoaDonBan() {
        return maHoaDonBan;
    }

    public void setMaHoaDonBan(int maHoaDonBan) {
        this.maHoaDonBan = maHoaDonBan;
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

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    @Override
    public String toString() {
        return "HoaDonBan{" + "maHoaDonBan=" + maHoaDonBan + ", thanhTien=" + thanhTien + ", ngayTao=" + ngayTao + ", maKhachHang=" + maKhachHang + ", maNhanVien=" + maNhanVien + '}';
    }
    
    
}

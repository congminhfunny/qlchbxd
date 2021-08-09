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
public class HoaDonChi {
    private int maHoaDonChi;
    private String mucDich;
    private int thanhTien;
    private String ngayTao;
    private int maNhanVien;

    public HoaDonChi() {
    }

    public HoaDonChi(int maHoaDonChi, String mucDich, int thanhTien, String ngayTao, int maNhanVien) {
        this.maHoaDonChi = maHoaDonChi;
        this.mucDich = mucDich;
        this.thanhTien = thanhTien;
        this.ngayTao = ngayTao;
        this.maNhanVien = maNhanVien;
    }

    public int getMaHoaDonChi() {
        return maHoaDonChi;
    }

    public void setMaHoaDonChi(int maHoaDonChi) {
        this.maHoaDonChi = maHoaDonChi;
    }

    public String getMucDich() {
        return mucDich;
    }

    public void setMucDich(String mucDich) {
        this.mucDich = mucDich;
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
        return "HoaDonChi{" + "maHoaDonChi=" + maHoaDonChi + ", mucDich=" + mucDich + ", thanhTien=" + thanhTien + ", ngayTao=" + ngayTao + ", maNhanVien=" + maNhanVien + '}';
    }

    
    
    
}

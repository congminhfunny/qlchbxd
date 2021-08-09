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
public class HoaDonNhapCT {
    private int hoaDonNhap;
    private int maSanPham;
    private String tenSanPham;
    private int giaSp;
    private int soLuong;

    public HoaDonNhapCT() {
    }

    public HoaDonNhapCT(int hoaDonNhap, int maSanPham, String tenSanPham, int giaSp, int soLuong) {
        this.hoaDonNhap = hoaDonNhap;
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaSp = giaSp;
        this.soLuong = soLuong;
    }

    public int getHoaDonNhap() {
        return hoaDonNhap;
    }

    public void setHoaDonNhap(int hoaDonNhap) {
        this.hoaDonNhap = hoaDonNhap;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getGiaSp() {
        return giaSp;
    }

    public void setGiaSp(int giaSp) {
        this.giaSp = giaSp;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "HoaDonNhapCT{" + "hoaDonNhap=" + hoaDonNhap + ", maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", giaSp=" + giaSp + ", soLuong=" + soLuong + '}';
    }

    
    
    
}

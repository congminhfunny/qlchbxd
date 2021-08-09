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
public class HoaDonBanCT {
    private int maHoaDonBan;
    private int maSanPham;
    private String tenSanPham;
    private int giaSanPham;
    private int soLuong;

    public HoaDonBanCT() {
    }

    public HoaDonBanCT(int maHoaDonBan, int maSanPham, String tenSanPham, int giaSanPham, int soLuong) {
        this.maHoaDonBan = maHoaDonBan;
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
        this.soLuong = soLuong;
    }

    public int getMaHoaDonBan() {
        return maHoaDonBan;
    }

    public void setMaHoaDonBan(int maHoaDonBan) {
        this.maHoaDonBan = maHoaDonBan;
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

    public int getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(int giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "HoaDonBanCT{" + "maHoaDonBan=" + maHoaDonBan + ", maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", giaSanPham=" + giaSanPham + ", soLuong=" + soLuong + '}';
    }

    


    
    
}

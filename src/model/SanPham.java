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
public class SanPham {
    private int maSanPham;
    private String tenSanPham;
    private int soLuong;
    private int giaSanPham;
    private String moTa;
    private String anh;
    private int maLoaiSanPham;
    private int maLoaiThuongHieu;

    public SanPham() {
    }

    public SanPham(int maSanPham, String tenSanPham, int soLuong, int giaSanPham, String moTa, String anh, int maLoaiSanPham, int maLoaiThuongHieu) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.giaSanPham = giaSanPham;
        this.moTa = moTa;
        this.anh = anh;
        this.maLoaiSanPham = maLoaiSanPham;
        this.maLoaiThuongHieu = maLoaiThuongHieu;
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(int giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public int getMaLoaiSanPham() {
        return maLoaiSanPham;
    }

    public void setMaLoaiSanPham(int maLoaiSanPham) {
        this.maLoaiSanPham = maLoaiSanPham;
    }

    public int getMaLoaiThuongHieu() {
        return maLoaiThuongHieu;
    }

    public void setMaLoaiThuongHieu(int maLoaiThuongHieu) {
        this.maLoaiThuongHieu = maLoaiThuongHieu;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", soLuong=" + soLuong + ", giaSanPham=" + giaSanPham + ", moTa=" + moTa + ", anh=" + anh + ", maLoaiSanPham=" + maLoaiSanPham + ", maLoaiThuongHieu=" + maLoaiThuongHieu + '}';
    }

    
}

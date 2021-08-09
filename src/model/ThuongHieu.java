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
public class ThuongHieu {
    private int maThuongHieu;
    private String tenThuongHieu;

    public ThuongHieu() {
    }

    public ThuongHieu(int maThuongHieu, String tenThuongHieu) {
        this.maThuongHieu = maThuongHieu;
        this.tenThuongHieu = tenThuongHieu;
    }

    public int getMaThuongHieu() {
        return maThuongHieu;
    }

    public void setMaThuongHieu(int maThuongHieu) {
        this.maThuongHieu = maThuongHieu;
    }

    public String getTenThuongHieu() {
        return tenThuongHieu;
    }

    public void setTenThuongHieu(String tenThuongHieu) {
        this.tenThuongHieu = tenThuongHieu;
    }

    @Override
    public String toString() {
        return "ThuongHieu{" + "maThuongHieu=" + maThuongHieu + ", tenThuongHieu=" + tenThuongHieu + '}';
    }
    
    
}

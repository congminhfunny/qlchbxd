/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.HoaDonChi;
import model.NhanVien;

/**
 *
 * @author MinhNguyenCong
 */
public class HoaDonChiDAO {

    //hàm lấy thông tin hóa đơn chi
    public static List<HoaDonChi> getHDC() {
        List<HoaDonChi> list = new ArrayList<>();
        try {
            String query = "select * from hoadonchi";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new HoaDonChi(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    //hàm lấy thông tin nhân viên
    public static List<NhanVien> getNhanVien() {
        List<NhanVien> list = new ArrayList<>();
        String query = "select * from nhanvien";
        try {
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new NhanVien(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    //hàm thêm hóa đơn chi vào database
    public static void saveHDC(String mucDich, int thanhTien, String ngayTao, int maNV) {
        try {
            String query = "insert into hoadonchi(mucdich, thanhtien, ngaytao, manhanvien) values(?,?,?,?)";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ps.setString(1, mucDich);
            ps.setInt(2, thanhTien);
            ps.setString(3, ngayTao);
            ps.setInt(4, maNV);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //hàm sửa thông tin hóa đơn chi
    public static void updateHDC(String mucDich, int thanhTien, String ngayTao, int maNV, int maHDC) {
        try {
            String query = "update hoadonchi set mucdich = ?, thanhtien = ?, ngaytao = ?, manhanvien = ? where mahoadonchi = ?";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ps.setString(1, mucDich);
            ps.setInt(2, thanhTien);
            ps.setString(3, ngayTao);
            ps.setInt(4, maNV);
            ps.setInt(5, maHDC);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

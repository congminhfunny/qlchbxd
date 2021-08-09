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
import model.HoaDonBanCT;
import model.HoaDonNhap;
import model.HoaDonNhapCT;

/**
 *
 * @author MinhNguyenCong
 */
public class QLHoaDonNhapDAO {

    //hàm lấy thông tin hóa đơn nhập
    public static List<HoaDonNhap> getHoaDonNhap() {
        List<HoaDonNhap> list = new ArrayList<>();
        try {
            String query = "select * from hoadonnhap";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new HoaDonNhap(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<HoaDonNhapCT> getHoaDonNhapCT(int maHD) {
        List<HoaDonNhapCT> list = new ArrayList<>();
        try {
            String query = "select a.mahoadonnhap, a.masanpham, b.tensanpham, b.giasanpham, a.soluong from hoadonnhapct a\n"
                    + "inner join sanpham b on a.masanpham = b.masanpham\n"
                    + "where a.mahoadonnhap = ?";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ps.setInt(1, maHD);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new HoaDonNhapCT(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}

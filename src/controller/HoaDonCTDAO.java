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

/**
 *
 * @author MinhNguyenCong
 */
public class HoaDonCTDAO {

    // hàm lấy hóa đơn chi tiết kèm theo sản phẩm
    public static List<HoaDonBanCT> getHoaDonCT(int maHD) {
        List<HoaDonBanCT> list = new ArrayList<>();
        try {
            String query = "select a.mahoadonban, a.masanpham, b.tensanpham, b.giasanpham, a.soluong from hoadonbanct a\n"
                    + "inner join sanpham b on a.masanpham = b.masanpham\n"
                    + "where a.mahoadonban = ?";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ps.setInt(1, maHD);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                list.add(new HoaDonBanCT(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}

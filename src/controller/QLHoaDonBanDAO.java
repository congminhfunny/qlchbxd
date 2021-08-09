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
import model.HoaDonBan;
import model.HoaDonBanCT;

/**
 *
 * @author MinhNguyenCong
 */
public class QLHoaDonBanDAO {
    
    // hàm lấy thông tin hóa đơn bán
    public static List<HoaDonBan> getHoaDonBan(){
        List<HoaDonBan> list = new ArrayList<>();
        try {
            String query = "select * from hoadonban";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                list.add(new HoaDonBan(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    //hàm lấy thông tin hóa đơn bán ct
    public static List<HoaDonBanCT> getHoaDonBanCT(){
        List<HoaDonBanCT> list = new ArrayList<>();
        try {
            String query = "select * from hoadonbanct";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
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

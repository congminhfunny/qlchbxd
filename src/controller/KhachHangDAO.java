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
import model.KhachHang;

/**
 *
 * @author MinhNguyenCong
 */
public class KhachHangDAO {
    
    
    //hàm lấy thông tin khách hàng
    public static List<KhachHang> getKhachHang(){
        List<KhachHang> list = new ArrayList<>();
        try {
            String query = "select * from khachhang";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                list.add(new KhachHang(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    //hàm thêm khách hàng vào database
    public static void saveKHToDatabase(String hoTen, int gioiTinh, String diaChi, String sdt, String email){
        try {
            String query = "insert into khachhang(hoten, gioitinh, diachi, sodienthoai, email) values(?,?,?,?,?)";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ps.setString(1, hoTen);
            ps.setInt(2, gioiTinh);
            ps.setString(3, diaChi);
            ps.setString(4, sdt);
            ps.setString(5, email);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //hàm sửa thông tin khách hàng trong database
    public static void suaKH(String hoTen, int gT, String diaChi, String sdt, String email, int makh){
        try {
            String query = "update khachhang set hoten = ?, gioitinh = ?, diachi = ?, sodienthoai = ?, email = ? where makhachhang = ?";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ps.setString(1, hoTen);
            ps.setInt(2, gT);
            ps.setString(3, diaChi);
            ps.setString(4, sdt);
            ps.setString(5, email);
            ps.setInt(6, makh);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

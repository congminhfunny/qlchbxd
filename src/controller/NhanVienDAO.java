/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.NhanVien;

/**
 *
 * @author MinhNguyenCong
 */
public class NhanVienDAO {

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

    // hàm xóa nhân viên trong database
    // giàng buộc vs nhiều bảng nên không cho xóa
    public static void deleteFromNV(int nV) {
        try {
            String query = "delete from nhanvien where manhanvien = ?";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ps.setInt(1, nV);
            ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // hàm xóa tài khoản của nhân viên
    public static void deleteFromTK(int nV) {
        try {
            String query = "delete from taikhoan where manhanvien = ?";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ps.setInt(1, nV);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //hàm thêm nhân viên vào database
    public static void insertNV(String hoTen, int gT, String ngaySinh, String queQuan, String sdt, String email, String anh, int cv) {
        try {
            String query = "insert into nhanvien(hoten, gioitinh, ngaysinh, quequan, sodienthoai, email, anh, chucvu) values(?,?,?,?,?,?,?,?)";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ps.setString(1, hoTen);
            ps.setInt(2, gT);
            ps.setString(3, ngaySinh);
            ps.setString(4, queQuan);
            ps.setString(5, sdt);
            ps.setString(6, email);
            ps.setString(7, anh);
            ps.setInt(8, cv);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //hàm lấy mã nhân viên vừa thêm
    public static int getMaNV(){
        int manv = -1;
        try {
            String query = "select max(manhanvien) from nhanvien";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                manv = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return manv;
    }
    
    
    //hàm thêm tài khoản của nhân viên mới tạo
    public static void setTK(String tk, String mk, int maNV){
        try {
            String query = "insert into taikhoan values(?,?,?)";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ps.setString(1, tk);
            ps.setString(2, mk);
            ps.setInt(3, maNV);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    //hàm sửa thông tin tài khoản
    public static void suaTK(String tk, String mk, int maNV){
        try {
            String query = "update taikhoan set tendangnhap = ?, matkhau = ? where manhanvien = ?";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ps.setString(1, tk);
            ps.setString(2, mk);
            ps.setInt(3, maNV);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //hàm sửa thông tin nhân viên
    public static void suaNV(String hoTen, int gT, String ngaySinh, String queQuan, String sdt, String email, String anh, int cv, int manv) {
        try {
            String query = "update nhanvien set hoten = ?, gioitinh = ?, ngaysinh = ?, quequan = ?, sodienthoai = ?, email = ?, anh = ?, chucvu = ? where manhanvien = ?";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ps.setString(1, hoTen);
            ps.setInt(2, gT);
            ps.setString(3, ngaySinh);
            ps.setString(4, queQuan);
            ps.setString(5, sdt);
            ps.setString(6, email);
            ps.setString(7, anh);
            ps.setInt(8, cv);
            ps.setInt(9, manv);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

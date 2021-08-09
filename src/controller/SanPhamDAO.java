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
import model.LoaiSanPham;
import model.SanPham;
import model.ThuongHieu;

/**
 *
 * @author MinhNguyenCong
 */
public class SanPhamDAO {
    
    
    //hàm lấy thông tin sản phẩm
    public static List<SanPham> getSanPham(){
        List<SanPham> list = new ArrayList<>();
        try {
            String query = "select * from sanpham";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                list.add(new SanPham(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    //lấy thông tin thương hiệu
    public static List<ThuongHieu> getThuongHieu(){
        List<ThuongHieu> list = new ArrayList<>();
        String query = "select * from thuonghieu";
        try {
            PreparedStatement ps = KetNoi.moKetNoi().prepareCall(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                list.add(new ThuongHieu(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    //lấy thông tin loại sản phẩm
    public static List<LoaiSanPham> getLoaiSanPhams(){
        List<LoaiSanPham> list = new ArrayList<>();
        String query = "select * from loaisanpham";
        try {
            PreparedStatement ps = KetNoi.moKetNoi().prepareCall(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                list.add(new LoaiSanPham(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    //hàm thêm sản phẩm vào database
    public static void addSanPham(String tenSP, int soLuong, int giaSp, String moTa, String anh, int mlsp, int mlth){
        try {
            String query = "insert into sanpham(tensanpham, soluong, giasanpham, mota, anh, maloaisanpham, mathuonghieu) values(?,?,?,?,?,?,?)";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ps.setString(1, tenSP);
            ps.setInt(2, soLuong);
            ps.setInt(3, giaSp);
            ps.setString(4, moTa);
            ps.setString(5, anh);
            ps.setInt(6, mlsp);
            ps.setInt(7, mlth);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //hàm thay đổi thông tin sản phẩm trong đatabase
    public static void updateSP(String ten, int soluong, int giaSP, String moTa, String anh, int maloaiSP, int maThuongHieu, int maSP){
        try {
            String query = "update sanpham set tensanpham = ?, soluong = ?, giasanpham = ?, mota = ?, anh = ?, maloaisanpham = ?, mathuonghieu = ? where masanpham = ?";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ps.setString(1, ten);
            ps.setInt(2, soluong);
            ps.setInt(3, giaSP);
            ps.setString(4, moTa);
            ps.setString(5, anh);
            ps.setInt(6, maloaiSP);
            ps.setInt(7, maThuongHieu);
            ps.setInt(8, maSP);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

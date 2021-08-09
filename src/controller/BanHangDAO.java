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
import model.KhachHang;
import model.LoaiSanPham;
import model.SanPham;
import model.ThuongHieu;

/**
 *
 * @author MinhNguyenCong
 */
public class BanHangDAO {
    
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
    
    //lấy thông tin sản phẩm
    public static List<SanPham> getSanPham() {
        List<SanPham> list = new ArrayList<>();
        String query = "select * from sanpham";
        try {
            PreparedStatement ps = KetNoi.moKetNoi().prepareCall(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                list.add(new SanPham(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    //lấy thông tin khách hàng
    public static List<KhachHang> getKhachHang(){
        List<KhachHang> list = new ArrayList<>();
        String query = "select * from khachhang";
        try {
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
    
    //hàm lưu hóa đơn vào database
    public static void saveHDToDatabase(int tongTien, int makh, int manv){
        try {
            String query = "insert into hoadonban(thanhtien, makhachhang, manhanvien) values(?, ?, ?)";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ps.setInt(1, tongTien);
            ps.setInt(2, makh);
            ps.setInt(3, manv);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // hàm lưu hóa đơn chi tiết vào database
    public static void saveHDCTToDatabase(int mahd, int masp, int sl){
        try {
            String query = "insert into hoadonbanct values(?, ?, ?)";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ps.setInt(1, mahd);
            ps.setInt(2, masp);
            ps.setInt(3, sl);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //hàm lấy hóa đơn bán
    public static List<HoaDonBan> getHoaDonBan(){
        List<HoaDonBan> list = new ArrayList<>();
        try {
            String query = "select * from hoadonban";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    //hàm lấy hóa đơn giá trị cao nhất
    public static int getHoaDonBanCN(){
        int mahd = -1;
        try {
            String query = "select max(mahoadonban) from hoadonban";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                mahd = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mahd;
    }
}

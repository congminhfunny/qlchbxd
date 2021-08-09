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
import model.TaiKhoan;

/**
 *
 * @author MinhNguyenCong
 */
public class DangNhapDAO {
    
    // hàm lấy thông tin tài khoản của nhân viên
    public static List<TaiKhoan> getTaiKhoan(){
        List<TaiKhoan> list = new ArrayList<>();
        try {
            String query = "select * from taikhoan";
            PreparedStatement ps = KetNoi.moKetNoi().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                list.add(new TaiKhoan(rs.getString(1), rs.getString(2), rs.getInt(3)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}

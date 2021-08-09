/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author MinhNguyenCong
 */
public class KetNoi {
    private static Connection connetion;
    
    public static Connection moKetNoi(){
        String url = "jdbc:sqlserver://localhost;database=qlchbxd";
        String username = "admin";
        String password = "123";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connetion = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connetion;
    }
    
    public static void dongKetNoi(){
        try {
            connetion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

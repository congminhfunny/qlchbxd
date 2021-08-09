/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;

/**
 *
 * @author MinhNguyenCong
 */
public class FormDAO {
    
    public static void setCenter(JDesktopPane jdp, JComponent jc){
        Dimension d = jdp.getSize();
        Dimension d1 = jc.getSize();
        int x = (int) ((d.getWidth() - d1.getWidth())) / 2;
        int y = (int) ((d.getHeight() - d1.getHeight()) / 2);
        jc.setLocation(x, y);
        jc.setVisible(true);
    }
    
    public static void setCenter1(JDesktopPane jdp, JComponent jc){
        Dimension d = jdp.getSize();
        Dimension d1 = jc.getSize();
        int x = (int) ((d.getWidth() - d1.getWidth())) / 2;
        int y = (int) ((d.getHeight() - d1.getHeight()) / 2);
        jc.setLocation(x, y);
        jc.setVisible(true);
    }
}

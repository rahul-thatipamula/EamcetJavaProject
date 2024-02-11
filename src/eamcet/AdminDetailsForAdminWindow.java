/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eamcet;
import java.awt.*;
/**
 *
 * @author Rahul
 */
public class AdminDetailsForAdminWindow {
    
    
    public AdminDetailsForAdminWindow(SetGetAdmin sga) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminWindow  aw = new AdminWindow();
                aw.setVisible(true);
                aw.accessAdminDetails(sga);
            }
        });
    }
    
    
    
    
}

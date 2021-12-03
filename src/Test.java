
import Controller.dao.DBConnector;
import Model.model.SanPham;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */
public class Test {
    public static void main(String[] args) throws Exception {
        DBConnector dBConnector = DBConnector.getInstance(); 
        Connection conn = (Connection) DBConnector.conn;
        String sql = "SELECT * FROM `sanpham`"; 
        PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql); 
        ResultSet rs = pstmt.executeQuery(sql);
        SanPham sp = new SanPham(); 
        
        
    }
}

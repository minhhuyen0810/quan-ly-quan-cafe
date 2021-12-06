/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.dao;

import Model.model.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows 10
 */
public class SanPhamDAO {
    private Connection conn; 
    private DBConnector dBConnector; 
    
    public SanPhamDAO() throws Exception {
        this.dBConnector = DBConnector.getInstance(); 
        this.conn= dBConnector.getConnection();         
    }
    
    public SanPham findById(String id) throws SQLException {
        String sql = "SELECT * FROM `sanpham` WHERE id =?"; 
        PreparedStatement pstmt = conn.prepareStatement(sql); 
        
        pstmt.setString(1,id);
        
        ResultSet rs = pstmt.executeQuery(); 
        
        SanPham sanpham = new SanPham(); 
        if(rs.next()){
            sanpham.setId(rs.getString("id"));
            sanpham.setTen(rs.getString("ten"));
            sanpham.setGiaTien(rs.getDouble("giatien"));
            sanpham.setMoTa(rs.getString("mota"));
            sanpham.setIsHot(rs.getBoolean("isHot"));
            sanpham.setLoaiSanPhamid(rs.getString("loaisanphamid"));
        }
        return sanpham;
    }
    
    public List<SanPham> getlistHotSanPham() throws SQLException {
        List<SanPham> listsanphamHot = new ArrayList<>(); 
        
        String sql = "SELECT * FROM `sanpham`WHERE isHot = 1"; 
        PreparedStatement pstmt = conn.prepareStatement(sql); 
        
        ResultSet rs = pstmt.executeQuery(); 
        
        if(rs.next()){
            SanPham sanpham = new SanPham();
            sanpham.setId(rs.getString("id"));
            sanpham.setTen(rs.getString("ten"));
            sanpham.setGiaTien(rs.getDouble("giatien"));
            sanpham.setMoTa(rs.getString("mota"));
            sanpham.setIsHot(rs.getBoolean("isHot"));
            sanpham.setLoaiSanPhamid(rs.getString("loaisanphamid"));
            
            listsanphamHot.add(sanpham);
        }
        
        return listsanphamHot;
    }
    
    
    
}

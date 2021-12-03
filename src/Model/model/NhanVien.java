/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.model;

import java.util.Date;

/**
 *
 * @author Windows 10
 */
public class NhanVien {
    private int id; 
    private String IDcard; 
    private String Ten; 
    private Date NgaySinh; 
    private String GioiTinh; 
    private String Email;
    private  String Password; 
    private int LoaiNVid; 

    public NhanVien(int id, String IDcard, String Ten, Date NgaySinh, String GioiTinh, String Email, String Password, int LoaiNVid) {
        this.id = id;
        this.IDcard = IDcard;
        this.Ten = Ten;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.Email = Email;
        this.Password = Password;
        this.LoaiNVid = LoaiNVid;
    }

    public NhanVien() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIDcard() {
        return IDcard;
    }

    public void setIDcard(String IDcard) {
        this.IDcard = IDcard;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getLoaiNVid() {
        return LoaiNVid;
    }

    public void setLoaiNVid(int LoaiNVid) {
        this.LoaiNVid = LoaiNVid;
    }
    
    
    
    
    
}

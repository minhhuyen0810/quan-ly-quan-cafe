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
public class NguyenLieu {
    private int id; 
    private String Ten; 
    private double Gia;
    private int SoLuong; 
    private Date NgayHetHan; 
    private int LoaiNguyenLieuid; 

    public NguyenLieu() {
    }

    public NguyenLieu(int id, String Ten, double Gia, int SoLuong, Date NgayHetHan, int LoaiNguyenLieuid) {
        this.id = id;
        this.Ten = Ten;
        this.Gia = Gia;
        this.SoLuong = SoLuong;
        this.NgayHetHan = NgayHetHan;
        this.LoaiNguyenLieuid = LoaiNguyenLieuid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Date getNgayHetHan() {
        return NgayHetHan;
    }

    public void setNgayHetHan(Date NgayHetHan) {
        this.NgayHetHan = NgayHetHan;
    }

    public int getLoaiNguyenLieuid() {
        return LoaiNguyenLieuid;
    }

    public void setLoaiNguyenLieuid(int LoaiNguyenLieuid) {
        this.LoaiNguyenLieuid = LoaiNguyenLieuid;
    }
    
    
}

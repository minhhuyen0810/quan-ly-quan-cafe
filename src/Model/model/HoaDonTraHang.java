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
public class HoaDonTraHang {
    private int Id; 
    private Date NgayTao; 
    private double TongTien; 
    private double ThanhTien; 
    private int HoaDonBanHangid; 

    public HoaDonTraHang() {
    }

    public HoaDonTraHang(int Id, Date NgayTao, double TongTien, double ThanhTien, int HoaDonBanHangid) {
        this.Id = Id;
        this.NgayTao = NgayTao;
        this.TongTien = TongTien;
        this.ThanhTien = ThanhTien;
        this.HoaDonBanHangid = HoaDonBanHangid;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public int getHoaDonBanHangid() {
        return HoaDonBanHangid;
    }

    public void setHoaDonBanHangid(int HoaDonBanHangid) {
        this.HoaDonBanHangid = HoaDonBanHangid;
    }
    
    
}

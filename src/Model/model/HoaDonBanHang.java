/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author Windows 10
 */
public class HoaDonBanHang {
    private int Id; 
    private Date NgayTao;
    private double TongTien; 
    private double ThanhTien; 
    private int KhachHangid; 
    private ArrayList<ChiTietHoaDonBanHang> listCTHDBH;

    public HoaDonBanHang() {
    }

    public HoaDonBanHang(int Id, Date NgayTao, double TongTien, double ThanhTien, int KhachHangid, ArrayList<ChiTietHoaDonBanHang> listCTHDBH) {
        this.Id = Id;
        this.NgayTao = NgayTao;
        this.TongTien = TongTien;
        this.ThanhTien = ThanhTien;
        this.KhachHangid = KhachHangid;
        this.listCTHDBH = listCTHDBH;
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

    public int getKhachHangid() {
        return KhachHangid;
    }

    public void setKhachHangid(int KhachHangid) {
        this.KhachHangid = KhachHangid;
    }

    public ArrayList<ChiTietHoaDonBanHang> getListCTHDBH() {
        return listCTHDBH;
    }

    public void setListCTHDBH(ArrayList<ChiTietHoaDonBanHang> listCTHDBH) {
        this.listCTHDBH = listCTHDBH;
    }
  
    
    
}

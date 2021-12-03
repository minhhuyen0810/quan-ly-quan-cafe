/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.model;

/**
 *
 * @author Windows 10
 */
public class ChiTietHoaDonTraHang {
    private int Id; 
    private String TenSanPham; 
    private  int SoLuong; 
    private float DonGia; 
    private float TongTien; 
    private int HoaDonTraHangId; 

    public ChiTietHoaDonTraHang() {
    }

    public ChiTietHoaDonTraHang(int Id, String TenSanPham, int SoLuong, float DonGia, float TongTien, int HoaDonTraHangId) {
        this.Id = Id;
        this.TenSanPham = TenSanPham;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.TongTien = TongTien;
        this.HoaDonTraHangId = HoaDonTraHangId;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

    public float getTongTien() {
        return TongTien;
    }

    public void setTongTien(float TongTien) {
        this.TongTien = TongTien;
    }

    public int getHoaDonTraHangId() {
        return HoaDonTraHangId;
    }

    public void setHoaDonTraHangId(int HoaDonTraHangId) {
        this.HoaDonTraHangId = HoaDonTraHangId;
    }
    
    
    
}

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
public class ChiTietHoaDonBanHang {
    private int Id; 
    private String TenSanPham; 
    private int SoLuong; 
    private float DonGia; 
    private  float TongTien; 
    private  int HoaDonBanHangId;

    public ChiTietHoaDonBanHang() {
    }

    public ChiTietHoaDonBanHang(int Id, String TenSanPham, int SoLuong, float DonGia, float TongTien, int HoaDonBanHangId) {
        this.Id = Id;
        this.TenSanPham = TenSanPham;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.TongTien = TongTien;
        this.HoaDonBanHangId = HoaDonBanHangId;
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

    public int getHoaDonBanHangId() {
        return HoaDonBanHangId;
    }

    public void setHoaDonBanHangId(int HoaDonBanHangId) {
        this.HoaDonBanHangId = HoaDonBanHangId;
    }
    
    
    
    
    
}

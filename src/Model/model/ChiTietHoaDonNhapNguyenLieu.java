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
public class ChiTietHoaDonNhapNguyenLieu {
    private  int Id; 
    private String TenNguyenLieu; 
    private int SoLuong; 
    private float DonGia; 
    private  double TongTien; 
    private int HoaDOnNhapNguyenLieuid; 

    public ChiTietHoaDonNhapNguyenLieu(int Id, String TenNguyenLieu, int SoLuong, float DonGia, double TongTien, int HoaDOnNhapNguyenLieuid) {
        this.Id = Id;
        this.TenNguyenLieu = TenNguyenLieu;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.TongTien = TongTien;
        this.HoaDOnNhapNguyenLieuid = HoaDOnNhapNguyenLieuid;
    }

    public ChiTietHoaDonNhapNguyenLieu() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTenNguyenLieu() {
        return TenNguyenLieu;
    }

    public void setTenNguyenLieu(String TenNguyenLieu) {
        this.TenNguyenLieu = TenNguyenLieu;
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

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

    public int getHoaDOnNhapNguyenLieuid() {
        return HoaDOnNhapNguyenLieuid;
    }

    public void setHoaDOnNhapNguyenLieuid(int HoaDOnNhapNguyenLieuid) {
        this.HoaDOnNhapNguyenLieuid = HoaDOnNhapNguyenLieuid;
    }
    
    
}

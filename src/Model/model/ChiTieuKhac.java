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
public class ChiTieuKhac {
    private int STT; 
    private String Ten; 
    private int SoLuong; 
    private float DonGia; 
    private double TongTien; 
    private String Note; 

    public ChiTieuKhac(int STT, String Ten, int SoLuong, float DonGia, double TongTien, String Note) {
        this.STT = STT;
        this.Ten = Ten;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.TongTien = TongTien;
        this.Note = Note;
    }

    public ChiTieuKhac() {
    }

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
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

    public String getNote() {
        return Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }
    
    
}

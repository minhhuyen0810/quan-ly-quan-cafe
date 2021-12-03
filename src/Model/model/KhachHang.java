/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.model;

import java.util.ArrayList;

/**
 *
 * @author Windows 10
 */
public class KhachHang {

    private int id;
    private String Ten;
    private String DiaChi;
    private String SoDienThoai;
    private int DiemThuong;
    private int LoaiKHid;
    private ArrayList<HoaDonBanHang> listHoaDonBanHang; 

    public KhachHang(int id, String Ten, String DiaChi, String SoDienThoai, int DiemThuong, int LoaiKHid, ArrayList<HoaDonBanHang> listHoaDonBanHang) {
        this.id = id;
        this.Ten = Ten;
        this.DiaChi = DiaChi;
        this.SoDienThoai = SoDienThoai;
        this.DiemThuong = DiemThuong;
        this.LoaiKHid = LoaiKHid;
        this.listHoaDonBanHang = listHoaDonBanHang;
    }

    public KhachHang() {
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

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public int getDiemThuong() {
        return DiemThuong;
    }

    public void setDiemThuong(int DiemThuong) {
        this.DiemThuong = DiemThuong;
    }

    public int getLoaiKHid() {
        return LoaiKHid;
    }

    public void setLoaiKHid(int LoaiKHid) {
        this.LoaiKHid = LoaiKHid;
    }

    public ArrayList<HoaDonBanHang> getListHoaDonBanHang() {
        return listHoaDonBanHang;
    }

    public void setListHoaDonBanHang(ArrayList<HoaDonBanHang> listHoaDonBanHang) {
        this.listHoaDonBanHang = listHoaDonBanHang;
    }
    
    

}

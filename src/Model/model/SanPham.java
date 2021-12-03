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
public class SanPham {
    private String id; 
    private String Ten; 
    private double GiaTien; 
    private String MoTa; 
    private boolean isHot; 
    private String LoaiSanPhamid; 

    public SanPham() {
    }

    public SanPham(String id, String Ten, double GiaTien, String MoTa, boolean isHot, String LoaiSanPhamid) {
        this.id = id;
        this.Ten = Ten;
        this.GiaTien = GiaTien;
        this.MoTa = MoTa;
        this.isHot = isHot;
        this.LoaiSanPhamid = LoaiSanPhamid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public double getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(double GiaTien) {
        this.GiaTien = GiaTien;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public boolean isIsHot() {
        return isHot;
    }

    public void setIsHot(boolean isHot) {
        this.isHot = isHot;
    }

    public String getLoaiSanPhamid() {
        return LoaiSanPhamid;
    }

    public void setLoaiSanPhamid(String LoaiSanPhamid) {
        this.LoaiSanPhamid = LoaiSanPhamid;
    }
    
    
}

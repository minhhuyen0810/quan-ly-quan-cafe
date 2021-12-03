/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Windows 10
 */
public class HoaDonNhapNguyenLieu {
    private int id; 
    private Date NgayTao; 
    private double TongTien; 
    private ArrayList<ChiTietHoaDonNhapNguyenLieu> listCTHDNNL; 

    public HoaDonNhapNguyenLieu() {
    }

    public HoaDonNhapNguyenLieu(int id, Date NgayTao, double TongTien, ArrayList<ChiTietHoaDonNhapNguyenLieu> listCTHDNNL) {
        this.id = id;
        this.NgayTao = NgayTao;
        this.TongTien = TongTien;
        this.listCTHDNNL = listCTHDNNL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ArrayList<ChiTietHoaDonNhapNguyenLieu> getListCTHDNNL() {
        return listCTHDNNL;
    }

    public void setListCTHDNNL(ArrayList<ChiTietHoaDonNhapNguyenLieu> listCTHDNNL) {
        this.listCTHDNNL = listCTHDNNL;
    }

    
}

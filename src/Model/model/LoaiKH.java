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
public class LoaiKH {
    private int id; 
    private String Ten; 
    private float GiamGia; 
    private ArrayList<KhachHang> listKH; 

    public LoaiKH() {
    }

    public LoaiKH(int id, String Ten, float GiamGia, ArrayList<KhachHang> listKH) {
        this.id = id;
        this.Ten = Ten;
        this.GiamGia = GiamGia;
        this.listKH = listKH;
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

    public float getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(float GiamGia) {
        this.GiamGia = GiamGia;
    }

    public ArrayList<KhachHang> getListKH() {
        return listKH;
    }

    public void setListKH(ArrayList<KhachHang> listKH) {
        this.listKH = listKH;
    }

   
    
    
}

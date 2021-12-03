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
public class LoaiNV {
    private int id; 
    private String ten; 
    private ArrayList<NhanVien> listNhanVien; 

    public LoaiNV() {
    }

    public LoaiNV(int id, String ten, ArrayList<NhanVien> listNhanVien) {
        this.id = id;
        this.ten = ten;
        this.listNhanVien = listNhanVien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public ArrayList<NhanVien> getListNhanVien() {
        return listNhanVien;
    }

    public void setListNhanVien(ArrayList<NhanVien> listNhanVien) {
        this.listNhanVien = listNhanVien;
    }
    
    
}

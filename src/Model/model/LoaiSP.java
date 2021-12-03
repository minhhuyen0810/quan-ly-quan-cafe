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
public class LoaiSP {
    private String id; 
    private String Ten; 
    private ArrayList<SanPham> listSanPham; 

    public LoaiSP() {
    }

    public LoaiSP(String id, String Ten, ArrayList<SanPham> listSanPham) {
        this.id = id;
        this.Ten = Ten;
        this.listSanPham = listSanPham;
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

    public ArrayList<SanPham> getListSanPham() {
        return listSanPham;
    }

    public void setListSanPham(ArrayList<SanPham> listSanPham) {
        this.listSanPham = listSanPham;
    }
    
    
}

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
public class LoaiNL {
    private int id; 
    private String Ten; 
    private ArrayList<NguyenLieu> listNL;
    
    public LoaiNL() {
    }

    public LoaiNL(int id, String Ten, ArrayList<NguyenLieu> listNL) {
        this.id = id;
        this.Ten = Ten;
        this.listNL = listNL;
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

    public ArrayList<NguyenLieu> getListNL() {
        return listNL;
    }

    public void setListNL(ArrayList<NguyenLieu> listNL) {
        this.listNL = listNL;
    }
    
  
    
}

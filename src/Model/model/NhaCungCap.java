/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.model;

import java.util.Date;

/**
 *
 * @author Windows 10
 */
public class NhaCungCap {
    private int id; 
    private String Ten; 

    public NhaCungCap() {
    }

    public NhaCungCap(int id, String Ten) {
        this.id = id;
        this.Ten = Ten;
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
    
    
    
    
}

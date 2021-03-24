/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.carrollu.pperera.cp.ecomapp.model;

import java.util.Date;
import java.util.Objects;


public class Handbag {

    private Integer handbagId;
    private String handbagName;
    private Double handbagPrice;
    private String image;
    private Date dateAdded;
    private String handbagBrand;

    public Handbag() {
    }

    public Handbag(Integer handbagId) {
        this.handbagId = handbagId;
    }

    Handbag(int i, String handbagName, Date date) {
        this.handbagId = handbagId;
        this.handbagName = handbagName;
        this.dateAdded = date;
//To change body of generated methods, choose Tools | Templates.
    }

    public Integer getHandbagId() {
        return handbagId;
    }

    public void setHandbagId(Integer handbagId) {
        this.handbagId = handbagId;
    }

    public String getHandbagName() {
        return handbagName;
    }

    public void setHandbagName(String handbagName) {
        this.handbagName = handbagName;
    }

    public Double getHandbagPrice() {
        return handbagPrice;
    }

    public void setHandbagPrice(Double handbagPrice) {
        this.handbagPrice = handbagPrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getHandbagBrand() {
        return handbagBrand;
    }

    public void setHandbagBrand(String handbagBrand) {
        this.handbagBrand = handbagBrand;
    }

     @Override
    public int hashCode() {
        int hash = 0;
        hash += (handbagId != null ? handbagId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Handbag)) {
            return false;
        }
        Handbag other = (Handbag) object;
        if ((this.handbagId == null && other.handbagId != null) || (this.handbagId != null && !this.handbagId.equals(other.handbagId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.carrollu.pperera.cp.ecomapp.model.Handbag[ handbagId=" + handbagId + " ]";
    }
    
}

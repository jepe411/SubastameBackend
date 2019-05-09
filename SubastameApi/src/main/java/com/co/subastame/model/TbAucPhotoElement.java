/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.subastame.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Fegiti Innovacion y tecnologia
 */
@Entity
@Table(name = "tb_auc_photo_element")
@XmlRootElement
public class TbAucPhotoElement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_pho_elem_id")
    private Integer pkPhoElemId;
    @Column(name = "pho_elem_name")
    private String phoElemName;
    @Column(name = "pho_elem_photo")
    private String phoElemPhoto;
    @Column(name = "pho_elem_description")
    private String phoElemDescription;
    @Column(name = "pho_elem_user")
    private String phoElemUser;
    @Column(name = "pho_elem_date_modification")
    @Temporal(TemporalType.TIMESTAMP)
    private Date phoElemDateModification;
    @JoinColumn(name = "fk_elem_id", referencedColumnName = "pk_elem_id")
    @ManyToOne(optional = false)
    private TbAucElement fkElemId;

    public TbAucPhotoElement() {
    }

    public TbAucPhotoElement(Integer pkPhoElemId) {
        this.pkPhoElemId = pkPhoElemId;
    }

    public Integer getPkPhoElemId() {
        return pkPhoElemId;
    }

    public void setPkPhoElemId(Integer pkPhoElemId) {
        this.pkPhoElemId = pkPhoElemId;
    }

    public String getPhoElemName() {
        return phoElemName;
    }

    public void setPhoElemName(String phoElemName) {
        this.phoElemName = phoElemName;
    }

    public String getPhoElemPhoto() {
        return phoElemPhoto;
    }

    public void setPhoElemPhoto(String phoElemPhoto) {
        this.phoElemPhoto = phoElemPhoto;
    }

    public String getPhoElemDescription() {
        return phoElemDescription;
    }

    public void setPhoElemDescription(String phoElemDescription) {
        this.phoElemDescription = phoElemDescription;
    }

    public String getPhoElemUser() {
        return phoElemUser;
    }

    public void setPhoElemUser(String phoElemUser) {
        this.phoElemUser = phoElemUser;
    }

    public Date getPhoElemDateModification() {
        return phoElemDateModification;
    }

    public void setPhoElemDateModification(Date phoElemDateModification) {
        this.phoElemDateModification = phoElemDateModification;
    }

    public TbAucElement getFkElemId() {
        return fkElemId;
    }

    public void setFkElemId(TbAucElement fkElemId) {
        this.fkElemId = fkElemId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkPhoElemId != null ? pkPhoElemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAucPhotoElement)) {
            return false;
        }
        TbAucPhotoElement other = (TbAucPhotoElement) object;
        if ((this.pkPhoElemId == null && other.pkPhoElemId != null) || (this.pkPhoElemId != null && !this.pkPhoElemId.equals(other.pkPhoElemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.co.subasta.model.TbAucPhotoElement[ pkPhoElemId=" + pkPhoElemId + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.subastame.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Fegiti Innovacion y tecnologia
 */
@Entity
@Table(name = "tb_auc_category")
@XmlRootElement
public class TbAucCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_cate_id")
    private Integer pkCateId;
    @Column(name = "cate_name")
    private String cateName;
    @Column(name = "cate_photo")
    private String catePhoto;
    @Column(name = "cate_description")
    private String cateDescription;
    @Column(name = "cate_user")
    private String cateUser;
    @Column(name = "cate_date_modification")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cateDateModification;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkCateId")
    private List<TbAucSubCategory> tbAucSubCategoryList;

    public TbAucCategory() {
    }

    public TbAucCategory(Integer pkCateId) {
        this.pkCateId = pkCateId;
    }

    public Integer getPkCateId() {
        return pkCateId;
    }

    public void setPkCateId(Integer pkCateId) {
        this.pkCateId = pkCateId;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public String getCatePhoto() {
        return catePhoto;
    }

    public void setCatePhoto(String catePhoto) {
        this.catePhoto = catePhoto;
    }

    public String getCateDescription() {
        return cateDescription;
    }

    public void setCateDescription(String cateDescription) {
        this.cateDescription = cateDescription;
    }

    public String getCateUser() {
        return cateUser;
    }

    public void setCateUser(String cateUser) {
        this.cateUser = cateUser;
    }

    public Date getCateDateModification() {
        return cateDateModification;
    }

    public void setCateDateModification(Date cateDateModification) {
        this.cateDateModification = cateDateModification;
    }

    @XmlTransient
    public List<TbAucSubCategory> getTbAucSubCategoryList() {
        return tbAucSubCategoryList;
    }

    public void setTbAucSubCategoryList(List<TbAucSubCategory> tbAucSubCategoryList) {
        this.tbAucSubCategoryList = tbAucSubCategoryList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkCateId != null ? pkCateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAucCategory)) {
            return false;
        }
        TbAucCategory other = (TbAucCategory) object;
        if ((this.pkCateId == null && other.pkCateId != null) || (this.pkCateId != null && !this.pkCateId.equals(other.pkCateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.co.subasta.model.TbAucCategory[ pkCateId=" + pkCateId + " ]";
    }
    
}

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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tb_auc_sub_category")
@XmlRootElement
public class TbAucSubCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_sub_cate_id")
    private Integer pkSubCateId;
    @Column(name = "sub_cate_name")
    private String subCateName;
    @Column(name = "sub_cate_photo")
    private String subCatePhoto;
    @Column(name = "sub_cate_description")
    private String subCateDescription;
    @Column(name = "sub_cate_user")
    private String subCateUser;
    @Column(name = "sub_cate_date_modification")
    @Temporal(TemporalType.TIMESTAMP)
    private Date subCateDateModification;
    @JoinColumn(name = "fk_cate_id", referencedColumnName = "pk_cate_id")
    @ManyToOne(optional = false)
    private TbAucCategory fkCateId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkSubCateId")
    private List<TbAucElement> tbAucElementList;

    public TbAucSubCategory() {
    }

    public TbAucSubCategory(Integer pkSubCateId) {
        this.pkSubCateId = pkSubCateId;
    }

    public Integer getPkSubCateId() {
        return pkSubCateId;
    }

    public void setPkSubCateId(Integer pkSubCateId) {
        this.pkSubCateId = pkSubCateId;
    }

    public String getSubCateName() {
        return subCateName;
    }

    public void setSubCateName(String subCateName) {
        this.subCateName = subCateName;
    }

    public String getSubCatePhoto() {
        return subCatePhoto;
    }

    public void setSubCatePhoto(String subCatePhoto) {
        this.subCatePhoto = subCatePhoto;
    }

    public String getSubCateDescription() {
        return subCateDescription;
    }

    public void setSubCateDescription(String subCateDescription) {
        this.subCateDescription = subCateDescription;
    }

    public String getSubCateUser() {
        return subCateUser;
    }

    public void setSubCateUser(String subCateUser) {
        this.subCateUser = subCateUser;
    }

    public Date getSubCateDateModification() {
        return subCateDateModification;
    }

    public void setSubCateDateModification(Date subCateDateModification) {
        this.subCateDateModification = subCateDateModification;
    }

    public TbAucCategory getFkCateId() {
        return fkCateId;
    }

    public void setFkCateId(TbAucCategory fkCateId) {
        this.fkCateId = fkCateId;
    }

    @XmlTransient
    public List<TbAucElement> getTbAucElementList() {
        return tbAucElementList;
    }

    public void setTbAucElementList(List<TbAucElement> tbAucElementList) {
        this.tbAucElementList = tbAucElementList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkSubCateId != null ? pkSubCateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAucSubCategory)) {
            return false;
        }
        TbAucSubCategory other = (TbAucSubCategory) object;
        if ((this.pkSubCateId == null && other.pkSubCateId != null) || (this.pkSubCateId != null && !this.pkSubCateId.equals(other.pkSubCateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.co.subasta.model.TbAucSubCategory[ pkSubCateId=" + pkSubCateId + " ]";
    }
    
}

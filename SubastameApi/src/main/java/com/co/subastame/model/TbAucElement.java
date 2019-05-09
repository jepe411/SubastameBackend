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
@Table(name = "tb_auc_element")
@XmlRootElement
public class TbAucElement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_elem_id")
    private Integer pkElemId;
    @Column(name = "elem_name")
    private String elemName;
    @Column(name = "elem_description")
    private String elemDescription;
    @Basic(optional = false)
    @Column(name = "elem_value")
    private int elemValue;
    @Column(name = "elem_user")
    private String elemUser;
    @Column(name = "elem_date_modification")
    @Temporal(TemporalType.TIMESTAMP)
    private Date elemDateModification;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkElemId")
    private List<TbAucPhotoElement> tbAucPhotoElementList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkElemId")
    private List<TbAucAuction> tbAucAuctionList;
    @JoinColumn(name = "fk_sta_elem_id", referencedColumnName = "pk_sta_elem_id")
    @ManyToOne(optional = false)
    private TbAucStateElement fkStaElemId;
    @JoinColumn(name = "fk_sub_cate_id", referencedColumnName = "pk_sub_cate_id")
    @ManyToOne(optional = false)
    private TbAucSubCategory fkSubCateId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkElemId")
    private List<TbAucOffer> tbAucOfferList;

    public TbAucElement() {
    }

    public TbAucElement(Integer pkElemId) {
        this.pkElemId = pkElemId;
    }

    public TbAucElement(Integer pkElemId, int elemValue) {
        this.pkElemId = pkElemId;
        this.elemValue = elemValue;
    }

    public Integer getPkElemId() {
        return pkElemId;
    }

    public void setPkElemId(Integer pkElemId) {
        this.pkElemId = pkElemId;
    }

    public String getElemName() {
        return elemName;
    }

    public void setElemName(String elemName) {
        this.elemName = elemName;
    }

    public String getElemDescription() {
        return elemDescription;
    }

    public void setElemDescription(String elemDescription) {
        this.elemDescription = elemDescription;
    }

    public int getElemValue() {
        return elemValue;
    }

    public void setElemValue(int elemValue) {
        this.elemValue = elemValue;
    }

    public String getElemUser() {
        return elemUser;
    }

    public void setElemUser(String elemUser) {
        this.elemUser = elemUser;
    }

    public Date getElemDateModification() {
        return elemDateModification;
    }

    public void setElemDateModification(Date elemDateModification) {
        this.elemDateModification = elemDateModification;
    }

    @XmlTransient
    public List<TbAucPhotoElement> getTbAucPhotoElementList() {
        return tbAucPhotoElementList;
    }

    public void setTbAucPhotoElementList(List<TbAucPhotoElement> tbAucPhotoElementList) {
        this.tbAucPhotoElementList = tbAucPhotoElementList;
    }

    @XmlTransient
    public List<TbAucAuction> getTbAucAuctionList() {
        return tbAucAuctionList;
    }

    public void setTbAucAuctionList(List<TbAucAuction> tbAucAuctionList) {
        this.tbAucAuctionList = tbAucAuctionList;
    }

    public TbAucStateElement getFkStaElemId() {
        return fkStaElemId;
    }

    public void setFkStaElemId(TbAucStateElement fkStaElemId) {
        this.fkStaElemId = fkStaElemId;
    }

    public TbAucSubCategory getFkSubCateId() {
        return fkSubCateId;
    }

    public void setFkSubCateId(TbAucSubCategory fkSubCateId) {
        this.fkSubCateId = fkSubCateId;
    }

    @XmlTransient
    public List<TbAucOffer> getTbAucOfferList() {
        return tbAucOfferList;
    }

    public void setTbAucOfferList(List<TbAucOffer> tbAucOfferList) {
        this.tbAucOfferList = tbAucOfferList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkElemId != null ? pkElemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAucElement)) {
            return false;
        }
        TbAucElement other = (TbAucElement) object;
        if ((this.pkElemId == null && other.pkElemId != null) || (this.pkElemId != null && !this.pkElemId.equals(other.pkElemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.co.subasta.model.TbAucElement[ pkElemId=" + pkElemId + " ]";
    }
    
}

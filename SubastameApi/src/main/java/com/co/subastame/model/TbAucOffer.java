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
@Table(name = "tb_auc_offer")
@XmlRootElement
public class TbAucOffer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_offer_id")
    private Integer pkOfferId;
    @Basic(optional = false)
    @Column(name = "offer_value")
    private int offerValue;
    @Column(name = "offer_user")
    private String offerUser;
    @Column(name = "offer_date_modification")
    @Temporal(TemporalType.TIMESTAMP)
    private Date offerDateModification;
    @JoinColumn(name = "fk_elem_id", referencedColumnName = "pk_elem_id")
    @ManyToOne(optional = false)
    private TbAucElement fkElemId;
    @JoinColumn(name = "fk_user_id", referencedColumnName = "pk_user_id")
    @ManyToOne(optional = false)
    private TbAucUser fkUserId;

    public TbAucOffer() {
    }

    public TbAucOffer(Integer pkOfferId) {
        this.pkOfferId = pkOfferId;
    }

    public TbAucOffer(Integer pkOfferId, int offerValue) {
        this.pkOfferId = pkOfferId;
        this.offerValue = offerValue;
    }

    public Integer getPkOfferId() {
        return pkOfferId;
    }

    public void setPkOfferId(Integer pkOfferId) {
        this.pkOfferId = pkOfferId;
    }

    public int getOfferValue() {
        return offerValue;
    }

    public void setOfferValue(int offerValue) {
        this.offerValue = offerValue;
    }

    public String getOfferUser() {
        return offerUser;
    }

    public void setOfferUser(String offerUser) {
        this.offerUser = offerUser;
    }

    public Date getOfferDateModification() {
        return offerDateModification;
    }

    public void setOfferDateModification(Date offerDateModification) {
        this.offerDateModification = offerDateModification;
    }

    public TbAucElement getFkElemId() {
        return fkElemId;
    }

    public void setFkElemId(TbAucElement fkElemId) {
        this.fkElemId = fkElemId;
    }

    public TbAucUser getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(TbAucUser fkUserId) {
        this.fkUserId = fkUserId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkOfferId != null ? pkOfferId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAucOffer)) {
            return false;
        }
        TbAucOffer other = (TbAucOffer) object;
        if ((this.pkOfferId == null && other.pkOfferId != null) || (this.pkOfferId != null && !this.pkOfferId.equals(other.pkOfferId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.co.subasta.model.TbAucOffer[ pkOfferId=" + pkOfferId + " ]";
    }
    
}

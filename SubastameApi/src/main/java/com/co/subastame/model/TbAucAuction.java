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
@Table(name = "tb_auc_auction")
@XmlRootElement
public class TbAucAuction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_auct_id")
    private Integer pkAuctId;
    @Column(name = "auct_date_init")
    @Temporal(TemporalType.TIMESTAMP)
    private Date auctDateInit;
    @Column(name = "auct_date_finish")
    @Temporal(TemporalType.TIMESTAMP)
    private Date auctDateFinish;
    @Column(name = "auct_user")
    private String auctUser;
    @Column(name = "auct_date_modification")
    @Temporal(TemporalType.TIMESTAMP)
    private Date auctDateModification;
    @JoinColumn(name = "fk_elem_id", referencedColumnName = "pk_elem_id")
    @ManyToOne(optional = false)
    private TbAucElement fkElemId;
    @JoinColumn(name = "fk_user_id", referencedColumnName = "pk_user_id")
    @ManyToOne(optional = false)
    private TbAucUser fkUserId;

    public TbAucAuction() {
    }

    public TbAucAuction(Integer pkAuctId) {
        this.pkAuctId = pkAuctId;
    }

    public Integer getPkAuctId() {
        return pkAuctId;
    }

    public void setPkAuctId(Integer pkAuctId) {
        this.pkAuctId = pkAuctId;
    }

    public Date getAuctDateInit() {
        return auctDateInit;
    }

    public void setAuctDateInit(Date auctDateInit) {
        this.auctDateInit = auctDateInit;
    }

    public Date getAuctDateFinish() {
        return auctDateFinish;
    }

    public void setAuctDateFinish(Date auctDateFinish) {
        this.auctDateFinish = auctDateFinish;
    }

    public String getAuctUser() {
        return auctUser;
    }

    public void setAuctUser(String auctUser) {
        this.auctUser = auctUser;
    }

    public Date getAuctDateModification() {
        return auctDateModification;
    }

    public void setAuctDateModification(Date auctDateModification) {
        this.auctDateModification = auctDateModification;
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
        hash += (pkAuctId != null ? pkAuctId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAucAuction)) {
            return false;
        }
        TbAucAuction other = (TbAucAuction) object;
        if ((this.pkAuctId == null && other.pkAuctId != null) || (this.pkAuctId != null && !this.pkAuctId.equals(other.pkAuctId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.co.subasta.model.TbAucAuction[ pkAuctId=" + pkAuctId + " ]";
    }
    
}

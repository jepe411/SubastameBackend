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
@Table(name = "tb_auc_user")
@XmlRootElement
public class TbAucUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_user_id")
    private Integer pkUserId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_nick")
    private String userNick;
    @Column(name = "user_mail")
    private String userMail;
    @Column(name = "user_password")
    private String userPassword;
    @Column(name = "user_photo")
    private String userPhoto;
    @Column(name = "user_date_birthday")
    @Temporal(TemporalType.TIMESTAMP)
    private Date userDateBirthday;
    @Column(name = "user_user")
    private String userUser;
    @Column(name = "user_date_modification")
    @Temporal(TemporalType.TIMESTAMP)
    private Date userDateModification;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkUserId")
    private List<TbAucAuction> tbAucAuctionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkUserId")
    private List<TbAucOffer> tbAucOfferList;

    public TbAucUser() {
    }

    public TbAucUser(Integer pkUserId) {
        this.pkUserId = pkUserId;
    }

    public Integer getPkUserId() {
        return pkUserId;
    }

    public void setPkUserId(Integer pkUserId) {
        this.pkUserId = pkUserId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public Date getUserDateBirthday() {
        return userDateBirthday;
    }

    public void setUserDateBirthday(Date userDateBirthday) {
        this.userDateBirthday = userDateBirthday;
    }

    public String getUserUser() {
        return userUser;
    }

    public void setUserUser(String userUser) {
        this.userUser = userUser;
    }

    public Date getUserDateModification() {
        return userDateModification;
    }

    public void setUserDateModification(Date userDateModification) {
        this.userDateModification = userDateModification;
    }

    @XmlTransient
    public List<TbAucAuction> getTbAucAuctionList() {
        return tbAucAuctionList;
    }

    public void setTbAucAuctionList(List<TbAucAuction> tbAucAuctionList) {
        this.tbAucAuctionList = tbAucAuctionList;
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
        hash += (pkUserId != null ? pkUserId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAucUser)) {
            return false;
        }
        TbAucUser other = (TbAucUser) object;
        if ((this.pkUserId == null && other.pkUserId != null) || (this.pkUserId != null && !this.pkUserId.equals(other.pkUserId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.co.subasta.model.TbAucUser[ pkUserId=" + pkUserId + " ]";
    }
    
}

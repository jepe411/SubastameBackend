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
@Table(name = "tb_auc_state_element")
@XmlRootElement
public class TbAucStateElement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_sta_elem_id")
    private Integer pkStaElemId;
    @Column(name = "sta_elem_name")
    private String staElemName;
    @Column(name = "sta_elem_state")
    private String staElemState;
    @Column(name = "sta_elem_description")
    private String staElemDescription;
    @Column(name = "sta_elem_user")
    private String staElemUser;
    @Column(name = "sta_elem_date_modification")
    @Temporal(TemporalType.TIMESTAMP)
    private Date staElemDateModification;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkStaElemId")
    private List<TbAucElement> tbAucElementList;

    public TbAucStateElement() {
    }

    public TbAucStateElement(Integer pkStaElemId) {
        this.pkStaElemId = pkStaElemId;
    }

    public Integer getPkStaElemId() {
        return pkStaElemId;
    }

    public void setPkStaElemId(Integer pkStaElemId) {
        this.pkStaElemId = pkStaElemId;
    }

    public String getStaElemName() {
        return staElemName;
    }

    public void setStaElemName(String staElemName) {
        this.staElemName = staElemName;
    }

    public String getStaElemState() {
        return staElemState;
    }

    public void setStaElemState(String staElemState) {
        this.staElemState = staElemState;
    }

    public String getStaElemDescription() {
        return staElemDescription;
    }

    public void setStaElemDescription(String staElemDescription) {
        this.staElemDescription = staElemDescription;
    }

    public String getStaElemUser() {
        return staElemUser;
    }

    public void setStaElemUser(String staElemUser) {
        this.staElemUser = staElemUser;
    }

    public Date getStaElemDateModification() {
        return staElemDateModification;
    }

    public void setStaElemDateModification(Date staElemDateModification) {
        this.staElemDateModification = staElemDateModification;
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
        hash += (pkStaElemId != null ? pkStaElemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAucStateElement)) {
            return false;
        }
        TbAucStateElement other = (TbAucStateElement) object;
        if ((this.pkStaElemId == null && other.pkStaElemId != null) || (this.pkStaElemId != null && !this.pkStaElemId.equals(other.pkStaElemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.co.subasta.model.TbAucStateElement[ pkStaElemId=" + pkStaElemId + " ]";
    }
    
}

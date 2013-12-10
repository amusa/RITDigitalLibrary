/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rit.edu.ritdl.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "publication_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PublicationType.findAll", query = "SELECT p FROM PublicationType p"),
    @NamedQuery(name = "PublicationType.findByPubTypeCode", query = "SELECT p FROM PublicationType p WHERE p.pubTypeCode = :pubTypeCode"),
    @NamedQuery(name = "PublicationType.findByPubTypeDesc", query = "SELECT p FROM PublicationType p WHERE p.pubTypeDesc = :pubTypeDesc")})
public class PublicationType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "pub_type_code")
    private String pubTypeCode;
    @Size(max = 45)
    @Column(name = "pub_type_desc")
    private String pubTypeDesc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pubTypeCode")
    private List<Publication> publicationList;

    public PublicationType() {
    }

    public PublicationType(String pubTypeCode) {
        this.pubTypeCode = pubTypeCode;
    }

    public String getPubTypeCode() {
        return pubTypeCode;
    }

    public void setPubTypeCode(String pubTypeCode) {
        this.pubTypeCode = pubTypeCode;
    }

    public String getPubTypeDesc() {
        return pubTypeDesc;
    }

    public void setPubTypeDesc(String pubTypeDesc) {
        this.pubTypeDesc = pubTypeDesc;
    }

    @XmlTransient
    public List<Publication> getPublicationList() {
        return publicationList;
    }

    public void setPublicationList(List<Publication> publicationList) {
        this.publicationList = publicationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pubTypeCode != null ? pubTypeCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PublicationType)) {
            return false;
        }
        PublicationType other = (PublicationType) object;
        if ((this.pubTypeCode == null && other.pubTypeCode != null) || (this.pubTypeCode != null && !this.pubTypeCode.equals(other.pubTypeCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return pubTypeDesc;
    }
    
}

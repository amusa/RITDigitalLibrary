/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rit.edu.ritdl.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "publication")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Publication.findAll", query = "SELECT p FROM Publication p"),
    @NamedQuery(name = "Publication.findByPubId", query = "SELECT p FROM Publication p WHERE p.pubId = :pubId"),
    @NamedQuery(name = "Publication.findByTitle", query = "SELECT p FROM Publication p WHERE p.title = :title")})
public class Publication implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pub_id")
    private Integer pubId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "abstract")
    private String abstract1;
    @ManyToMany(mappedBy = "publicationList")
    private List<User> userList;
    @ManyToMany(mappedBy = "publicationList1")
    private List<User> userList1;
    @JoinColumn(name = "pub_type_code", referencedColumnName = "pub_type_code")
    @ManyToOne(optional = false)
    private PublicationType pubTypeCode;

    public Publication() {
    }

    public Publication(Integer pubId) {
        this.pubId = pubId;
    }

    public Publication(Integer pubId, String title, String abstract1) {
        this.pubId = pubId;
        this.title = title;
        this.abstract1 = abstract1;
    }

    public Integer getPubId() {
        return pubId;
    }

    public void setPubId(Integer pubId) {
        this.pubId = pubId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstract1() {
        return abstract1;
    }

    public void setAbstract1(String abstract1) {
        this.abstract1 = abstract1;
    }

    @XmlTransient
    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @XmlTransient
    public List<User> getUserList1() {
        return userList1;
    }

    public void setUserList1(List<User> userList1) {
        this.userList1 = userList1;
    }

    public PublicationType getPubTypeCode() {
        return pubTypeCode;
    }

    public void setPubTypeCode(PublicationType pubTypeCode) {
        this.pubTypeCode = pubTypeCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pubId != null ? pubId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Publication)) {
            return false;
        }
        Publication other = (Publication) object;
        if ((this.pubId == null && other.pubId != null) || (this.pubId != null && !this.pubId.equals(other.pubId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return title;
    }
    
}

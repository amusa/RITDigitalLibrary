/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rit.edu.ritdl.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "user_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserType.findAll", query = "SELECT u FROM UserType u"),
    @NamedQuery(name = "UserType.findByTypeCode", query = "SELECT u FROM UserType u WHERE u.typeCode = :typeCode"),
    @NamedQuery(name = "UserType.findByTypeDesc", query = "SELECT u FROM UserType u WHERE u.typeDesc = :typeDesc")})
public class UserType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "type_code")
    private String typeCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "type_desc")
    private String typeDesc;

    public UserType() {
    }

    public UserType(String typeCode) {
        this.typeCode = typeCode;
    }

    public UserType(String typeCode, String typeDesc) {
        this.typeCode = typeCode;
        this.typeDesc = typeDesc;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (typeCode != null ? typeCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserType)) {
            return false;
        }
        UserType other = (UserType) object;
        if ((this.typeCode == null && other.typeCode != null) || (this.typeCode != null && !this.typeCode.equals(other.typeCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return typeDesc;
    }
    
}

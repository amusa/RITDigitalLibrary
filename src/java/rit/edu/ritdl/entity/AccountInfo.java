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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "account_info")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccountInfo.findAll", query = "SELECT a FROM AccountInfo a"),
    @NamedQuery(name = "AccountInfo.findByAccountInfoId", query = "SELECT a FROM AccountInfo a WHERE a.accountInfoId = :accountInfoId"),
    @NamedQuery(name = "AccountInfo.findBySecAns", query = "SELECT a FROM AccountInfo a WHERE a.secAns = :secAns"),
    @NamedQuery(name = "AccountInfo.findByPassword", query = "SELECT a FROM AccountInfo a WHERE a.password = :password")})
public class AccountInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "account_info_id")
    private Integer accountInfoId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "sec_ans")
    private String secAns;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "password")
    private String password;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private User userId;
    @JoinColumn(name = "sec_question_id", referencedColumnName = "sec_question_id")
    @ManyToOne(optional = false)
    private SecurityQuestion secQuestionId;

    public AccountInfo() {
    }

    public AccountInfo(Integer accountInfoId) {
        this.accountInfoId = accountInfoId;
    }

    public AccountInfo(Integer accountInfoId, String secAns, String password) {
        this.accountInfoId = accountInfoId;
        this.secAns = secAns;
        this.password = password;
    }

    public Integer getAccountInfoId() {
        return accountInfoId;
    }

    public void setAccountInfoId(Integer accountInfoId) {
        this.accountInfoId = accountInfoId;
    }

    public String getSecAns() {
        return secAns;
    }

    public void setSecAns(String secAns) {
        this.secAns = secAns;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public SecurityQuestion getSecQuestionId() {
        return secQuestionId;
    }

    public void setSecQuestionId(SecurityQuestion secQuestionId) {
        this.secQuestionId = secQuestionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountInfoId != null ? accountInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccountInfo)) {
            return false;
        }
        AccountInfo other = (AccountInfo) object;
        if ((this.accountInfoId == null && other.accountInfoId != null) || (this.accountInfoId != null && !this.accountInfoId.equals(other.accountInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rit.edu.ritdl.AccountInfo[ accountInfoId=" + accountInfoId + " ]";
    }
    
}

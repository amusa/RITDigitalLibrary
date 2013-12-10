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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "security_question")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SecurityQuestion.findAll", query = "SELECT s FROM SecurityQuestion s"),
    @NamedQuery(name = "SecurityQuestion.findBySecQuestionId", query = "SELECT s FROM SecurityQuestion s WHERE s.secQuestionId = :secQuestionId"),
    @NamedQuery(name = "SecurityQuestion.findByQuestion", query = "SELECT s FROM SecurityQuestion s WHERE s.question = :question")})
public class SecurityQuestion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sec_question_id")
    private Integer secQuestionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "question")
    private String question;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "secQuestionId")
    private List<AccountInfo> accountInfoList;

    public SecurityQuestion() {
    }

    public SecurityQuestion(Integer secQuestionId) {
        this.secQuestionId = secQuestionId;
    }

    public SecurityQuestion(Integer secQuestionId, String question) {
        this.secQuestionId = secQuestionId;
        this.question = question;
    }

    public Integer getSecQuestionId() {
        return secQuestionId;
    }

    public void setSecQuestionId(Integer secQuestionId) {
        this.secQuestionId = secQuestionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @XmlTransient
    public List<AccountInfo> getAccountInfoList() {
        return accountInfoList;
    }

    public void setAccountInfoList(List<AccountInfo> accountInfoList) {
        this.accountInfoList = accountInfoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secQuestionId != null ? secQuestionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecurityQuestion)) {
            return false;
        }
        SecurityQuestion other = (SecurityQuestion) object;
        if ((this.secQuestionId == null && other.secQuestionId != null) || (this.secQuestionId != null && !this.secQuestionId.equals(other.secQuestionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return question;
    }
    
}

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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "pub_comment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PubComment.findAll", query = "SELECT p FROM PubComment p"),
    @NamedQuery(name = "PubComment.findByCommentSn", query = "SELECT p FROM PubComment p WHERE p.commentSn = :commentSn")})
public class PubComment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "comment_sn")
    private Integer commentSn;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "comment")
    private String comment;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne
    private User userId;

    public PubComment() {
    }

    public PubComment(Integer commentSn) {
        this.commentSn = commentSn;
    }

    public Integer getCommentSn() {
        return commentSn;
    }

    public void setCommentSn(Integer commentSn) {
        this.commentSn = commentSn;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (commentSn != null ? commentSn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PubComment)) {
            return false;
        }
        PubComment other = (PubComment) object;
        if ((this.commentSn == null && other.commentSn != null) || (this.commentSn != null && !this.commentSn.equals(other.commentSn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rit.edu.ritdl.PubComment[ commentSn=" + commentSn + " ]";
    }
    
}

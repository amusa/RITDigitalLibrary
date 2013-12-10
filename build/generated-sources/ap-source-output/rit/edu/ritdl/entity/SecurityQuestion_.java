package rit.edu.ritdl.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rit.edu.ritdl.entity.AccountInfo;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-12-09T18:47:16")
@StaticMetamodel(SecurityQuestion.class)
public class SecurityQuestion_ { 

    public static volatile ListAttribute<SecurityQuestion, AccountInfo> accountInfoList;
    public static volatile SingularAttribute<SecurityQuestion, Integer> secQuestionId;
    public static volatile SingularAttribute<SecurityQuestion, String> question;

}
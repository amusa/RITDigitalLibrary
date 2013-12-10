package rit.edu.ritdl.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rit.edu.ritdl.entity.SecurityQuestion;
import rit.edu.ritdl.entity.User;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-12-09T18:47:16")
@StaticMetamodel(AccountInfo.class)
public class AccountInfo_ { 

    public static volatile SingularAttribute<AccountInfo, String> secAns;
    public static volatile SingularAttribute<AccountInfo, User> userId;
    public static volatile SingularAttribute<AccountInfo, SecurityQuestion> secQuestionId;
    public static volatile SingularAttribute<AccountInfo, Integer> accountInfoId;
    public static volatile SingularAttribute<AccountInfo, String> password;

}
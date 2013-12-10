package rit.edu.ritdl.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rit.edu.ritdl.entity.AccountInfo;
import rit.edu.ritdl.entity.Department;
import rit.edu.ritdl.entity.PubComment;
import rit.edu.ritdl.entity.Publication;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-12-09T18:47:16")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile ListAttribute<User, Publication> publicationList;
    public static volatile ListAttribute<User, AccountInfo> accountInfoList;
    public static volatile SingularAttribute<User, String> lastName;
    public static volatile SingularAttribute<User, String> userTypeCode;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, Integer> userId;
    public static volatile ListAttribute<User, PubComment> pubCommentList;
    public static volatile SingularAttribute<User, String> gender;
    public static volatile SingularAttribute<User, Date> birthDate;
    public static volatile SingularAttribute<User, String> firstName;
    public static volatile ListAttribute<User, Publication> publicationList1;
    public static volatile SingularAttribute<User, Department> deptId;

}
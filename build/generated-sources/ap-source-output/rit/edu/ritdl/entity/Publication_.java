package rit.edu.ritdl.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rit.edu.ritdl.entity.PublicationType;
import rit.edu.ritdl.entity.User;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-12-09T18:47:16")
@StaticMetamodel(Publication.class)
public class Publication_ { 

    public static volatile SingularAttribute<Publication, String> title;
    public static volatile SingularAttribute<Publication, Integer> pubId;
    public static volatile SingularAttribute<Publication, String> abstract1;
    public static volatile ListAttribute<Publication, User> userList1;
    public static volatile ListAttribute<Publication, User> userList;
    public static volatile SingularAttribute<Publication, PublicationType> pubTypeCode;

}
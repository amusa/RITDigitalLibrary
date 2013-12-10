package rit.edu.ritdl.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rit.edu.ritdl.entity.Publication;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-12-09T18:47:16")
@StaticMetamodel(PublicationType.class)
public class PublicationType_ { 

    public static volatile ListAttribute<PublicationType, Publication> publicationList;
    public static volatile SingularAttribute<PublicationType, String> pubTypeCode;
    public static volatile SingularAttribute<PublicationType, String> pubTypeDesc;

}
package rit.edu.ritdl.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rit.edu.ritdl.entity.User;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-12-09T18:47:16")
@StaticMetamodel(PubComment.class)
public class PubComment_ { 

    public static volatile SingularAttribute<PubComment, User> userId;
    public static volatile SingularAttribute<PubComment, String> comment;
    public static volatile SingularAttribute<PubComment, Integer> commentSn;

}
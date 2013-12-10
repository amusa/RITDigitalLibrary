package rit.edu.ritdl.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rit.edu.ritdl.entity.Department;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-12-09T18:47:16")
@StaticMetamodel(College.class)
public class College_ { 

    public static volatile ListAttribute<College, Department> departmentList;
    public static volatile SingularAttribute<College, String> description;
    public static volatile SingularAttribute<College, String> collegeCode;

}
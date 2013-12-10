package rit.edu.ritdl.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rit.edu.ritdl.entity.College;
import rit.edu.ritdl.entity.User;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-12-09T18:47:16")
@StaticMetamodel(Department.class)
public class Department_ { 

    public static volatile SingularAttribute<Department, String> description;
    public static volatile SingularAttribute<Department, College> collegeCode;
    public static volatile ListAttribute<Department, User> userList;
    public static volatile SingularAttribute<Department, Integer> deptId;

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rit.edu.ritdl.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import rit.edu.ritdl.entity.Department;

/**
 *
 * @author Administrator
 */
@Stateless
public class DepartmentFacade extends AbstractFacade<Department> {
    @PersistenceContext(unitName = "RITDigitalLibraryPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DepartmentFacade() {
        super(Department.class);
    }
    
}

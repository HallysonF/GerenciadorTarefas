/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esig.gerenciatar.Controller;

import com.esig.gerenciatar.entity.Responsavel;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hally
 */
@Stateless
public class ResponsavelFacade extends AbstractFacade<Responsavel> {

    @PersistenceContext(unitName = "com.esig_gerenciatar_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ResponsavelFacade() {
        super(Responsavel.class);
    }
    
}

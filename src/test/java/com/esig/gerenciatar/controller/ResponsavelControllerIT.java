/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esig.gerenciatar.controller;

import com.esig.gerenciatar.entity.Responsavel;
import java.util.List;
import org.eclipse.persistence.sessions.factories.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hally
 */
public class ResponsavelControllerIT {
    
    private static SessionFactory sessionFactory;
    
    
    
    public ResponsavelControllerIT() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        sessionFactory.acquireSession();
    }
    
    @AfterClass
    public static void tearDownClass() throws Exception {
        
    }
    
    @Before
    public void setUp() throws Exception {
    }
    
    @After
    public void tearDown() {
    }
    /**
     * Test of create method, of class ResponsavelController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        ResponsavelController instance = new ResponsavelController();
        instance.create();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ResponsavelController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        ResponsavelController instance = new ResponsavelController();
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class ResponsavelController.
     */
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        ResponsavelController instance = new ResponsavelController();
        instance.destroy();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItems method, of class ResponsavelController.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        ResponsavelController instance = new ResponsavelController();
        List<Responsavel> expResult = null;
        List<Responsavel> result = instance.getItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilteritens method, of class ResponsavelController.
     */
    @Test
    public void testGetFilteritens() {
        System.out.println("getFilteritens");
        ResponsavelController instance = new ResponsavelController();
        List<Responsavel> expResult = null;
        List<Responsavel> result = instance.getFilteritens();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilteritens method, of class ResponsavelController.
     */
    @Test
    public void testSetFilteritens() {
        System.out.println("setFilteritens");
        List<Responsavel> filtroResponsavel = null;
        ResponsavelController instance = new ResponsavelController();
        instance.setFilteritens(filtroResponsavel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResponsavel method, of class ResponsavelController.
     */
    @Test
    public void testGetResponsavel() {
        System.out.println("getResponsavel");
        Long id = null;
        ResponsavelController instance = new ResponsavelController();
        Responsavel expResult = null;
        Responsavel result = instance.getResponsavel(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

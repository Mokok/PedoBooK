/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenika.supbook.jpa;

import com.zenika.supbook.model.Utilisateur;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



/**
 *
 * @author xavier_ng
 */
@Stateless
public class UtilisateurJPA implements UtilisateurImpl {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Utilisateur add(Utilisateur u) {
        em.persist(u);
        return u;
    }

    @Override
    public Utilisateur getUtilisateur(Long id) {
        return em.find(Utilisateur.class, id);
    }  
}

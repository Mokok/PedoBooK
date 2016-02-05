/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenika.supbook.service;

import javax.ejb.EJB;
import com.zenika.supbook.jpa.UtilisateurImpl;
import com.zenika.supbook.model.Utilisateur;

/**
 *
 * @author xavier_ng
 */
public class UtilisateurService {
    @EJB
    private UtilisateurImpl uEJB;
    
    public Utilisateur AddUser(Utilisateur u){
        uEJB.add(u);
        return u;
    }
    
    public Utilisateur AffichUser(Utilisateur u){
        uEJB.getUtilisateur(u.getId());
        return u;
    }
}

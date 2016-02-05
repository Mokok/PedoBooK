/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenika.supbook.jpa;

import com.zenika.supbook.model.Utilisateur;
import javax.ejb.Local;

/**
 *
 * @author xavier_ng
 */
@Local
public interface UtilisateurImpl {
    public Utilisateur add(Utilisateur u);
    public Utilisateur getUtilisateur(Long id);
    public Utilisateur getUtilisateur(Utilisateur u);
}

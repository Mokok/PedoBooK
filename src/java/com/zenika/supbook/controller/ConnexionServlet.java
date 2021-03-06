/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenika.supbook.controller;

import com.zenika.supbook.model.Utilisateur;
import com.zenika.supbook.service.UtilisateurService;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author xavier_ng
 */
public class ConnexionServlet extends HttpServlet {
    @EJB
    private UtilisateurService userS;
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String login = request.getParameter("login");
        String pwd = request.getParameter("pwd");
        
        Utilisateur user = new Utilisateur();
        user.setLogin(login);
        user.setPwd(pwd);
        
        user = userS.ChercherUser(user);
        
        HttpSession session = request.getSession();
        
        if(user != null){
            session.setAttribute( "utilisateur", user);
            request.getRequestDispatcher( "" ).forward( request, response );
        }else{
            request.setAttribute("msg", "error");
            request.getRequestDispatcher("").forward(request, response);
        }  
    }
}

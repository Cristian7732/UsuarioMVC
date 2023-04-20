/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristian.controller;

import com.cristian.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author P3R3Z1T0
 */
@WebServlet (urlPatterns = "/UsuarioServlet")
public class UsuarioServlet extends HttpServlet{
    Usuario user = new Usuario();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        req.setAttribute("nombre", user.getNombre());
        req.setAttribute("email", user.getEmail());
        req.getServletContext().getRequestDispatcher("/usuarioDatos.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        user.setNombre(req.getParameter("nombre"));
        user.setEmail(req.getParameter("email"));
        
        resp.sendRedirect(req.getContextPath()+"/UsuarioServlet");
        
    }
}

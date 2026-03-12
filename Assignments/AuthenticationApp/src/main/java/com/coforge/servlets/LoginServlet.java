package com.coforge.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VALID_USER = "admin";
    private static final String VALID_PASS = "password";

    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute("user") != null) {
            response.sendRedirect(request.getContextPath() + "/home");
            return;
        }
        request.getRequestDispatcher("login.jsp").forward(request, response);
	}
    
    @Override
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        if (VALID_USER.equals(username) && VALID_PASS.equals(password)) {
            HttpSession session = request.getSession(true);
            session.setAttribute("user", username);
            session.setMaxInactiveInterval(30 * 60);
            response.sendRedirect(request.getContextPath() + "/home");
        } else {
            request.setAttribute("error", "Invalid username or password");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
	}
}